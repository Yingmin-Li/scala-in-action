class Time(val hours: Int, val minutes: Int) {

  val asMinutes: Int =
    hours * 60 + minutes
}
