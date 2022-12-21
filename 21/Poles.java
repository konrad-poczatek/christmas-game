class Poles {
    public int maxContainerArea(int[] height) {
        int maxHaight= 0;
        int currentHight=0;
        int min=0;
        for (int i = 0; i < height.length-1; i++) {
            for (int j = i+1, l=1; j < height.length; j++, l++) {
                currentHight=Math.min(height[i], height[j])*l;
                if (currentHight>maxHaight) maxHaight = currentHight;
            }
        }
        return maxHaight;
    }
}
