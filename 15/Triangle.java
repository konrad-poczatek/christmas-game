class Triangle {
    public List<List<Integer>> createGoodConstruction(int levels) {
        List<Integer> arraylevel = new ArrayList<>();
        List<Integer> previousArraylevel = new ArrayList<>();
        List<List<Integer>> finalList = new ArrayList<>();
        int number=1;
        for (int i = 0; i < levels ; i++) {
            arraylevel.clear();
            previousArraylevel.clear();
            if (i>0){
                previousArraylevel = finalList.get(i-1);
                for (int j = 0; j <= previousArraylevel.size()+1; j++) {
                    if (j==0 || j==previousArraylevel.size()+1 ){
                        number=previousArraylevel.get(0);
                        arraylevel.add(number);
                    } else{
                        number=previousArraylevel.get(j)+previousArraylevel.get(j-1);
                        arraylevel.add(number);
                    }
                }
            }else arraylevel.add(number);
            finalList.add(arraylevel);
        }
        return finalList;
    }
}
