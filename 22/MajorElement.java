class MajorElement {
    public int findMajorElement(int[] array) {
        int halfLengthPlusOne = array.length / 2 + 1;
        int counter = 0;
        int number=0;
        boolean flag = false;
        for (int i = 0; i < array.length; i++) {
            number = array[i];
            for (int j = 0; j < array.length; j++) {
                if (number == array[j]) counter++;
                if (counter == halfLengthPlusOne){
                    flag = true;
                    break;
                }
            }
            if (flag) break;
            counter = 0;
        }
        return number;
    }
}
