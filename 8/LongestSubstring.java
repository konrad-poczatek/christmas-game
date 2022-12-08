class LongestSubstring {
    public int lengthOfLongestSubstring(String str) {
        char[] chars = str.toCharArray();
        int largestSeq = 0;


        for (int i = 0; i < chars.length; i++) {
            int firstSimbol = chars[i];
            int firstIdx = i;
            int seqPerSymb=0;
            for (int j = i + 1; j < chars.length; j++) {
                if (chars[j] != firstSimbol && !isRepeated(chars, firstIdx, j)) {
                    seqPerSymb++;
                } else if(chars[j] == firstSimbol) {
                    int size = j - firstIdx;
                    if (!isRepeated(chars, firstSimbol, j) && size > seqPerSymb) {
                        seqPerSymb = size;
                        break;
                    }
                }
            }
            if(seqPerSymb == chars.length-1){
                return chars.length;
            }
            if(seqPerSymb>largestSeq){
                largestSeq = seqPerSymb;
            }
        }

        return largestSeq;
    }

    private boolean isRepeated(char[] chars, int startIdx, int finishIdx) {
        for (int i = finishIdx - 1; i >= startIdx; i--) {
            if (chars[i] == chars[finishIdx]) {
                return true;
            }

        }
        return false;
    }
}
