class SharedPrefix {
  public String biggestSharedPrefix(String[] gifts) {
    Map<String, Integer> possiblePrefixes = new HashMap<>();

        for(int i=1;i<=gifts[0].length();i++) {
            possiblePrefixes.put(gifts[0].substring(0,i), 1);
        }
        
        for(int i=1;i<gifts.length;i++) {
            for(String prefix : possiblePrefixes.keySet()) {
                if(gifts[i].startsWith(prefix)){
                    possiblePrefixes.put(prefix, possiblePrefixes.get(prefix) + 1);
                }
            }
        }

        int count = 0;
        String biggestPrefix = "";
        for(String prefix : possiblePrefixes.keySet()) {
            int value = possiblePrefixes.get(prefix);
            if (value >= count & biggestPrefix.length() < prefix.length() && value > 1) {
                count = value;
                biggestPrefix = prefix;
            }
        }

        return biggestPrefix;
  }
}
