class Santonacci {
    public int fibonacci(int n) {
        int sum = 0;
        int n1=0;
        int n2=1;
        if(n == 0){
            return 0;
        } else if(n == 1){
            return n1+n2;
        } else {
            for(int j=1;j<n;++j){
                sum= n1+n2;
                n1=n2;
                n2=sum;
            }
        }
        return sum;
    }
}
