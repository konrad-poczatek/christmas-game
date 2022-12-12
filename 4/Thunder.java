class Thunder {
    public String solve(String phrase, int height) {
        int columns = phrase.length() / 2;
        if ((columns % 2) != 0) columns += 1;
        int counter = 1;
        StringBuilder finalPhrase = new StringBuilder();
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < columns; j++) {
                if (j == 0) finalPhrase.append(phrase.substring(i));
                else finalPhrase.append(phrase.substring(i + (columns * counter)));
                counter++;
            }
            counter = 1;
        }
        return finalPhrase.toString();
    }
}
