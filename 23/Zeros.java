
class Zeros {
    public void shiftZeroes(int[] array) {
        int length = array.length;
        int indexToBeSwapped = -1;
        int continuousZeroCount = 0;
        for (int i = 1; i < length; i++) {
            if (array[i - 1] == 0) {
                if (indexToBeSwapped == -1) {
                    indexToBeSwapped = i - 1;
                }
                if (array[i] != 0) {
                    int temp = array[i];
                    array[i] = array[indexToBeSwapped];
                    array[indexToBeSwapped] = temp;
                    indexToBeSwapped = i - continuousZeroCount;
                } else {
                    continuousZeroCount++;
                }
            }
        }
    }
}
