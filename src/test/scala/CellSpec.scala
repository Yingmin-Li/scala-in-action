import org.scalactic.TypeCheckedTripleEquals
import org.scalatest.{ Matchers, WordSpec }

class CellSpec
    extends WordSpec
    with Matchers
    with TypeCheckedTripleEquals {

  "Calling neighbors" should {
    "return the surrounding Cells" in {
      val expectedNeighbours =
        Set(
          Cell(-1, -1), Cell(0, -1), Cell(1, -1),
          Cell(-1, 0), Cell(1, 0),
          Cell(-1, 1), Cell(0, 1), Cell(1, 1)
        )
      Cell(0, 0).neighbors should ===(expectedNeighbours)
    }
  }
}
