class ChristmasDinner {
    public int findSingle(int[] numbers) {
        int counter = 0;
        int number=0;
        boolean flag;
        for (int i = 0; i < numbers.length; i++) {
            number = numbers[i];
            flag=true;
            for (int j = 0; j < numbers.length; j++) {
                if (number == numbers[j]) counter++;
                if (counter == 2){
                    flag = false;
                    break;
                }
            }
            if (flag){
                break;
            }
            counter = 0;
        }
        return number;
    }
}
