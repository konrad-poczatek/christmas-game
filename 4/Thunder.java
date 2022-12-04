class Thunder {
    public String solve(String phrase, int height) {
        if(phrase.isEmpty() || height <= 0) {
            return "";
        }
        int phraseIndex = 0;
        Character[][] arrayStructure = new Character[getArrayCount(phrase.length(), height)][];
        while(phraseIndex < phrase.length()) {
            phraseIndex = createVerticalArray(arrayStructure, phrase, height, phraseIndex);
            if(phraseIndex < phrase.length() && height - 2 > 0) {
                phraseIndex = createDiagonalArray(arrayStructure, phrase, height, phraseIndex);
            }
        }
        return createStringOutOfHorizontalThunderPattern(arrayStructure, height, phrase.length());
    }

    private int createVerticalArray(Character[][] arrayStructure, String phrase, int height, int phraseIndex) {
        int count =0;
        Character[] newArray = new Character[height];
        while(phraseIndex < phrase.length() && count < height) {
            newArray[count] = phrase.charAt(phraseIndex);
            phraseIndex++;
            count++;
        }
        arrayStructure[getArrayCount(phraseIndex, height) - 1] = newArray;
        return phraseIndex;
    }

    private int createDiagonalArray(Character[][] arrayStructure, String phrase, int height, int phraseIndex) {
        int count = 1;
        Character[] newArray = new Character[height];
        newArray[0] = null;
        newArray[height-1] = null;
        while(phraseIndex < phrase.length() && count < height - 1) {
            newArray[count] = phrase.charAt(phraseIndex);
            phraseIndex++;
            count++;
        }
        arrayStructure[getArrayCount(phraseIndex, height) - 1] = reverseArray(newArray);
        return phraseIndex;
    }

    private Character[] reverseArray(Character[] charArray) {
        Character[] newArray = new Character[charArray.length];
        int index = charArray.length - 1;
        for(Character ch:charArray) {
            newArray[index] = ch;
            index--;
        }
        return newArray;
    }

    private int getArrayCount(int totalLength, int height) {
        int count = 0;
        do {
            count++;
            totalLength = totalLength - height;
            if(height > 2 & totalLength - height + 2 >= 0) {
                count++;
                totalLength = totalLength - height + 2;
            }
        } while(totalLength > 0);
        return  count;
    }

    private String createStringOutOfHorizontalThunderPattern(Character[][] arrayStructure, int height, int phraseLength) {
        int position = 0;
        int ind = 0;
        Character[] resultArray = new Character[phraseLength];
        while(position < height) {
            for(int i=0; i < arrayStructure.length; i++) {
                if(arrayStructure[i][position] != null) {
                    resultArray[ind] = arrayStructure[i][position];
                    ind++;
                }
            }
            position++;
        }
        return getStringValueOutOfCharacters(resultArray);
    }

    private String getStringValueOutOfCharacters(Character[] characters) {
        StringBuffer stringBuffer = new StringBuffer();
        for(Character charc : characters) {
            if(charc != null) {
                stringBuffer.append(charc);
            }
        }
        return stringBuffer.toString();
    }
}
