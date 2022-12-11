class SearchInsert {
    public int searchInsert(int[] integers, int target) {
        for (int i = 0; i < integers.length; i++) {
            if (integers[i] >= target) {
                return i;
            }
        }
        return integers.length;
        
    }
}
