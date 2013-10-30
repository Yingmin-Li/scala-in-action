case class Cell(x: Int, y: Int) {

  def neighbors: Set[Cell] = {
    val neighbors =
      for {
        xx <- x - 1 to x + 1
        yy <- y - 1 to y + 1
        if xx != x || yy != y
      } yield Cell(xx, yy)
    neighbors.toSet
  }
}
