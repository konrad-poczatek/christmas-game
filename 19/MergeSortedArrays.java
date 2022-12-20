class MergeSortedArrays {
    public void merge(int[] numbers1, int length1, int[] numbers2, int length2) {
        int cicle = numbers1.length-length1;

        if (cicle>0){
            for (int i = length1, counter=0; i < numbers1.length; i++, counter++) {
                numbers1[i] = numbers2[counter];
            }
        }

        for (int i=0;i<numbers1.length;++i){
            for(int j=0;j<numbers1.length-i-1; ++j){
                if(numbers1[j+1]<numbers1[j]){
                    int swap = numbers1[j];
                    numbers1[j] = numbers1[j+1];
                    numbers1[j+1] = swap;
                }
            }
        }
    }
}
