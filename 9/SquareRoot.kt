class SquareRoot {
  fun findSquareRoot(number: Int): Int {
    var tmp1 = number / 2 // divide input
    var tmp2: Int

    do {
      tmp2 = tmp1 // asign second var
      tmp1 = (tmp2 + (number / tmp2)) / 2 // divide original number by divided original number, then sum up with original number and divide by 2

    } while((tmp2 - tmp1) != 0) // as long as we dont have the original number, continue

    return tmp1

    // not allowed function result:
    //return Math.sqrt(number.toDouble()).toInt()
  }
}
