class Program {
  public boolean areBracketsValid(String brackets) {
    Map<String, String> matches = new HashMap<>();
        matches.put("[", "]");
        matches.put("{", "}");
        matches.put("(", ")");

        List<String> split = Arrays.stream(brackets.split("")).toList();

        if (matches.containsValue(split.get(0)) || split.size() % 2 != 0) return false;

        for(int i=0; i<split.size(); i++) {
            int indexOfMatch = split.indexOf(matches.get(split.get(i)));
            if (indexOfMatch-(i+1)>0 && (indexOfMatch-(i+1)) % 2 == 0) {
                if(!areBracketsValid(brackets.substring(i + 1, indexOfMatch))) {
                    return false;
                }
            }
        }
        return true;
  }
}
