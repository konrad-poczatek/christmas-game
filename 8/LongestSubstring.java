class LongestSubstring {
    public int lengthOfLongestSubstring(String str) {
        String[] split = str.split("");
        List<String> letters = new ArrayList<>();

        int i = 0;
        while(i < split.length && !letters.contains(split[i])) {
            letters.add(split[i++]);
        }

        int restOfStrLongestString = (i >= str.length() ? 0 : lengthOfLongestSubstring(str.substring(1)));
        return (Math.max(letters.size(), restOfStrLongestString));
    }
}
