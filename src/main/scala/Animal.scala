class Bird {
  def fly = "I'm flying!"
}

trait Swimmer {
  def swim = "I'm swimming!"
}

class Fish extends Swimmer

class Duck extends Bird with Swimmer

trait MichaelBuble extends Bird {
  override def fly = s"I feel good and ${super.fly}"
}
