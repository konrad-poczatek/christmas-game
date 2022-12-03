class SharedPrefix {
  public String biggestSharedPrefix(String[] gifts) {
    int counterOrder = 0;
    boolean flag = true;
    StringBuilder firstLetters = new StringBuilder(list[0].charAt(counterOrder));
    while (flag) {
      for (String s : list) {
        if (!s.startsWith(firstLetters.toString())) flag = false;
        if (!flag) break;
      }
      if (flag){
        counterOrder++;
        firstLetters.append(list[0].charAt(counterOrder));
      }else break;
    }
    return (counterOrder==0)? "" : firstLetters.toString();
  }
}
