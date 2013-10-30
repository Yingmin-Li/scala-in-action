case class Generation(aliveCells: Set[Cell] = Set.empty) {

  def next: Generation =
    new Generation(stayingAlive ++ born)

  def stayingAlive: Set[Cell] =
    aliveCells.filter(canStayAlive)

  def born: Set[Cell] =
    aliveCells.flatMap(deadNeighbors).filter(canBeBorn)

  def canStayAlive(cell: Cell): Boolean =
    Set(2, 3).contains(aliveNeighbors(cell).size)

  def canBeBorn(cell: Cell): Boolean =
    aliveNeighbors(cell).size == 3

  def aliveNeighbors(cell: Cell): Set[Cell] =
    cell.neighbors.intersect(aliveCells)

  def deadNeighbors(cell: Cell): Set[Cell] =
    cell.neighbors.diff(aliveCells)
}
