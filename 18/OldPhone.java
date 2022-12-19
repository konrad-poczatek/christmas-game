class OldPhone {
    public List<String> combinations(String digits) {
        if (digits == null || digits.length() == 0) {
            return List.of("\"\"");
        }
        List<List<Character>> keypad = List.of(
                List.of(),
                List.of(),
                List.of('a', 'b', 'c'),
                List.of('d', 'e', 'f'),
                List.of('g', 'h', 'i'),
                List.of('j', 'k', 'l'),
                List.of('m', 'n', 'o'),
                List.of('p', 'q', 'r', 's'),
                List.of('t', 'u', 'v'),
                List.of('w', 'x', 'y', 'z')
        );
        char[] keys = digits.toCharArray();

        List<String> comb = new ArrayList<>();
        for (char ch : keypad.get(Character.getNumericValue(keys[0]))) {
            comb.add(String.valueOf(ch));
        }

        for (int i = 1; i < keys.length; i++) {
            List<String> prevList = new ArrayList<>(comb);
            comb.clear();
            for (Character ch : keypad.get(Character.getNumericValue(keys[i]))) {
                for (String s : prevList) {
                    comb.add(s + ch);
                }
            }
        }
        return comb;
    }
}
