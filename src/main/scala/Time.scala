case class Time(hours: Int, minutes: Int) {

  val asMinutes: Int =
    hours * 60 + minutes

  def minus(that: Time): Int =
    this.asMinutes - that.asMinutes
}
