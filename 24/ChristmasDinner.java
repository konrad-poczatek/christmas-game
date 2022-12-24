import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class ChristmasDinner {
    public int findSingle(int[] numbers) {
        Set<Integer> numberSet = new HashSet<>();
        Map<Integer, Boolean> numberMap = new HashMap<>();
        for (int num : numbers) {
            numberMap.put(num, numberSet.add(num));
        }
        for (Map.Entry<Integer, Boolean> num : numberMap.entrySet()) {
            if (num.getValue()) {
                return num.getKey();
            }
        }
        return 0;
    }
}