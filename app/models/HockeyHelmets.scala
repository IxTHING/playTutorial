package models

import play.api.data.Form
import play.api.data.Forms._

case class HockeyHelmets (var name: String, var size: Int, var colour: String)

object HockeyHelmets{

  val createHelmetsForm = Form(
    mapping(
      "name" -> nonEmptyText,
      "size" -> number,
      "colour" -> nonEmptyText
    )(HockeyHelmets.apply)(HockeyHelmets.unapply)
  )
}
