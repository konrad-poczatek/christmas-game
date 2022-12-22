import java.util.HashMap;
import java.util.Map;

class MajorElement {
    public int findMajorElement(int[] array) {
        int moreThanHalfCount = 0;
        int moreThanHalfCountInteger = 0;
        Map<Integer, Integer> groups = new HashMap<>();
        int halfLength = array.length / 2;
        for (int ele : array) {
            if (!groups.containsKey(ele)) {
                groups.put(ele, 1);
            } else {
                int value = groups.get(ele);
                groups.put(ele, ++value);
            }
        }
        for (int key : groups.keySet()) {
            int val = groups.get(key);
            if (val > halfLength && val > moreThanHalfCount) {
                moreThanHalfCount = val;
                moreThanHalfCountInteger = key;
            }
        }
        return moreThanHalfCountInteger;
    }
}
