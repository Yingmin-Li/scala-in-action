object IntReverse {

  implicit class IntReverse(n: Int) {
    def reverse: Int =
      n.toString.reverse.toInt
  }
}
