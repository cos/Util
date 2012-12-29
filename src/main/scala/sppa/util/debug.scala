package sppa.util

object debug {
  var active = true
  def activate = active = true

  private var detailedContexts = false
  //  def activateDetailedContexts = detailedContexts = true
  def detailContexts = detailedContexts && active

  def apply(note: Any) = { display(note) }

  def display(note: Any) {
    if (active)
      println(note)
  }
}