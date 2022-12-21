class Poles {
    public int maxContainerArea(int[] height) {
        int maximumArea = 0;
        for (int i = 0; i < height.length - 1; i++) {
            for (int j = i + 1; j < height.length; j++) {
                int smallerPoleHeight = height[i];
                if (height[j] < height[i]) {
                    smallerPoleHeight = height[j];
                }
                int area = smallerPoleHeight * (j - i);
                if (maximumArea < area) {
                    maximumArea = area;
                }
            }
        }
        return maximumArea;
    }
}
