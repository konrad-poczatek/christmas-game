import java.util.*;
import java.util.stream.Collectors;

class SharedPrefix {
    public String biggestSharedPrefix(String[] gifts) {
        Map<String, Integer> words = new HashMap<>();
        int j=0;
        while (j< gifts.length) {
            int i = 0;
            while (i < gifts.length) {
                final String prefix = gifts[i].substring(0, j);
                int count = 0;
                for (String gift : gifts) {
                    if (gift.substring(0, j).equals(prefix)) {
                        count++;
                    }
                }
                words.put(gifts[i].substring(0,j), count);
                i++;
            }
            j++;
        }
        final List<Map.Entry<String, Integer>> collect = words.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .filter(stringIntegerEntry -> !stringIntegerEntry.getKey().isBlank() && stringIntegerEntry.getKey().length() != 1)
                .collect(Collectors.toUnmodifiableList());
        return collect.get(0).getKey();
    }

}
