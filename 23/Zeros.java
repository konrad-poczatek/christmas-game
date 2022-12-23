class Zeros {
    public void shiftZeroes(int[] array) {
        int length = array.length-1;
        for (int i = 0; i < array.length; i++) {
            if(array[i] == 0){
                moveLeft(array, i);
                array[length] = 0;
            }
        }
    }

    private void moveLeft(int[] array, int start){
        for (int i = start; i < array.length-1; i++) {
            array[i] = array[i+1];
        }
    }
}
