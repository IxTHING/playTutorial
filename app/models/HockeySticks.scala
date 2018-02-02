package models

import play.api.data.Form
import play.api.data.Forms._

case class HockeySticks(var name: String, var make: String, var curve: String, var length: Int)

object HockeySticks{

  val createSticksForm = Form(
    mapping(
      "name" -> nonEmptyText,
      "make" -> nonEmptyText,
      "curve" -> nonEmptyText,
      "length" -> number
    )(HockeySticks.apply)(HockeySticks.unapply)
  )
}
