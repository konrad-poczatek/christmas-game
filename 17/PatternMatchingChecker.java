class PatternMatchingChecker {
    public boolean isMatch(String str, String pat) {
        if(pat.equals(str)){
            return true;
        }
        if (pat.equals(".*")){
            return true;
        }
        if (pat.contains("*") && str.length() != 0) {
            return true;
        }
        if(pat.contains(".")){

        }
        return false;
    }
}
