class SquareRoot {
    public int findSquareRoot(int number) {
        Long leftBorder = 0L;
        Long rightBorder = (long) number;
        Long temp = (long) number;
        Long middle;

        while (true) {
            middle = (leftBorder + rightBorder) / 2;
            if (middle.equals(temp) || middle * middle == number) {
                return middle.intValue();
            }
            if (middle * middle < number) {
                leftBorder = middle;
            } else {
                rightBorder = middle;
            }
            temp = middle;
        }
    }
}
