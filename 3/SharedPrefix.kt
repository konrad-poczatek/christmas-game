class SharedPrefix {
  fun biggestSharedPrefix(gifts: Array<String>): String {
    var biggestSharedPrefix = ""

    var currentCharacter = ""
    var currentIndex = 0

    while(true) {
      for(element in gifts) {
        var giftName = element

        if(giftName.length < currentIndex) {
          return biggestSharedPrefix
        }

        var giftNameCharacter = giftName.toCharArray()[currentIndex].toString()
        if(currentCharacter.isBlank()) {
          currentCharacter = giftNameCharacter
        } else if(currentCharacter != giftNameCharacter) {
          return biggestSharedPrefix
        }
      }

      biggestSharedPrefix += currentCharacter
      currentCharacter = ""
      currentIndex++
    }

    return biggestSharedPrefix
  }
}
