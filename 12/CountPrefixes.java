class CountPrefixes {
    public int countPrefixes(String[] strings, String word) {
        int counter=0;
        for (String string : strings) if (word.startsWith(string)) counter++;
        return counter;
    }
}
