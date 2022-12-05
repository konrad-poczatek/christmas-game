class AncientRome {
    public int convertToArabicNumber(String romanNumber) {
        char[] digits = romanNumber.toCharArray();
        List<Integer> arra = new ArrayList<>();

        int output = 0;
        for(int i=0; i<digits.length; i++){
            if(digits[i] == 'M'){
                arra.add(1000);
            } else if(digits[i] == 'D'){
                arra.add(500);
            } else if(digits[i]=='C'){
                arra.add(100);
            } else if (digits[i] == 'L'){
                arra.add(50);
            } else if (digits[i] == 'X'){
                arra.add(10);
            } else if (digits[i] == 'V'){
                arra.add(5);
            } else if(digits[i]=='I'){
                arra.add(1);
            }
        }
        int size = arra.size()-1;
        int i;

        for(i = 0; i<size; i++){
            if(arra.get(i)>= arra.get(i+1)){
                output = output + arra.get(i);
            } else {
                output = output + arra.get(i+1)-arra.get(i);
                i++;
            }

        }
        if (i == size) {
            output= output+arra.get(size);
        }

        return output;
    }
}
