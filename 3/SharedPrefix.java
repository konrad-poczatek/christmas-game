class SharedPrefix {
    public String biggestSharedPrefix(String[] gifts) {
        String highestOccurancePrefix = "";
        int characterIndex = 0;
        boolean prefixMatched = true;
        while (characterIndex < gifts[0].length() && prefixMatched) {
            for (String gift : gifts) {
                if (!gift.startsWith(gifts[0].substring(0, characterIndex + 1))) {
                    prefixMatched = false;
                    break;
                }
            }
            if (prefixMatched) {
                highestOccurancePrefix = gifts[0].substring(0, characterIndex + 1);
                characterIndex++;
            }
        }
        return highestOccurancePrefix;
    }
}
