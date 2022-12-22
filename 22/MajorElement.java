class MajorElement {
    public int findMajorElement(int[] array) {
        Map<Integer, Integer> values = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            if (values.containsKey(array[i])) {
                values.put(array[i], values.get(array[i]) + 1);
            } else {
                values.put(array[i], 1);
            }
        }

        final int halfLength = array.length / 2;
        for (Integer key : values.keySet()) {
            if (values.get(key) > halfLength) {
                return key;
            }
        }
        return 0;
    }


    //This one should be faster. It's a realization of Boyer–Moore algorithm
    public int findMajorElementFaster(int[] array) {
        int grouped = 0;
        int maxRepElem = 0;
        for (int i = 0; i < array.length; i++) {
            if (grouped == 0) {
                maxRepElem = array[i];
                grouped++;
            } else if (maxRepElem == array[i]) {
                grouped++;
            } else {
                grouped--;
            }
        }
        return grouped > 0 ? maxRepElem : 0;
    }
}
