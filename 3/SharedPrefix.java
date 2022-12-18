class SharedPrefix {
  public String biggestSharedPrefix(String[] gifts) {
    int numOfGifts = gifts.length;

    if (numOfGifts == 0)
      return "";

    int shortestGift = 99999999;

    for (int i = 0; i < numOfGifts; ++i)
      shortestGift = Math.min(shortestGift, gifts[i].length());

    for (int j = 0; j < shortestGift; ++j)
    {
      for (int i = 1; i < numOfGifts; ++i)
      {
        if (!(gifts[0].charAt(j) == gifts[i].charAt(j)))
          return gifts[0].substring(0, j);
      }
    }

    return gifts[0].substring(0, shortestGift);
  }
}
