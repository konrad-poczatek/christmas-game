class MergeSortedArrays {
    public void merge(int[] numbers1, int length1, int[] numbers2, int length2) {
        int x = 0;
        for (int i = length1; i < numbers1.length; i++) {
            numbers1[i] = numbers2[x];
            x++;
        }

        for (int i = 0; i < numbers1.length; i++) {
            for (int j = 0; j < numbers1.length; j++) {
                if (numbers1[i] < numbers1[j]) {
                    int temp = numbers1[i];
                    numbers1[i] = numbers1[j];
                    numbers1[j] = temp;
                }
            }
        }
    }
}
