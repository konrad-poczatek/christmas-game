class SantaHouse {
    public int visit(int[] houses) {
        int number1=0;
        int number2=0;

        for (int i = 0; i < houses.length; i=i+2) {
            number1+= houses[i];
            if (i+1 >= houses.length) break;
            number2+= houses[i+1];
        }
        return Math.max(number1, number2);
    }
}
