class MergeSortedArrays {
    public void merge(int[] numbers1, int length1, int[] numbers2, int length2) {
        if (length1 == 0) {
            numbers1 = numbers2;
            return;
        }
        int i = 0;
        for (int j = i; j < numbers1.length && i < length2; j++) {
            if (numbers2[i] <= numbers1[j] || (j > length1 - 1 && numbers1[j] == 0)) {
                moveRight(numbers1, j);
                numbers1[j] = numbers2[i];
                i++;
            }
        }
    }

    private void moveRight(int[] numbers1, int start) {
        for (int i = numbers1.length - 1; i > start; i--) {
            numbers1[i] = numbers1[i - 1];
        }
    }
    }

}
