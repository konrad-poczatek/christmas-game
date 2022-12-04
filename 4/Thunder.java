class Thunder {
    public String solve(String phrase, int height) {
        if (phrase.length() == 0 || height == 0) {
            return "";
        }
        if (height == 1) {
            return phrase;
        }
        final int groups = phrase.length() / (height + height - 2);
        final char[] chars = phrase.toCharArray();
        StringBuilder thunderString = new StringBuilder();
        int groupCounter = 1;


        for (int i = 0; i < height; i++) {
            int groupCounter2 = 1;
            for (int j = 0, k = 1; j < groups * height; j++, k++) {
                if (k == height) {
                    k = 1;
                }
                if (j == 0) {
                    thunderString.append(chars[i]);
                } else if (j == (height - 1) * groupCounter && (height + height - 2) * groupCounter + i < phrase.length()) {
                    thunderString.append(chars[(height + height - 2) * groupCounter + i]);
                    groupCounter++;
                } else if (i != 0 && i != height - 1 && (i + k == height)) {
                    thunderString.append("1");
                } else {
                    thunderString.append(" ");
                }
            }
            groupCounter = 1;
            thunderString.append("\n");

        }
        return thunderString.toString();
    }
}
}
