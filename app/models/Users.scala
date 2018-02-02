package models

import play.api.data.Form
import play.api.data.Forms._

case class Users (var name: String, var email: String, var password: String)

object Users {

  val createUsersForm = Form(
    mapping(
      "name" -> nonEmptyText,
      "email" -> email,
      "password" -> nonEmptyText
    )(Users.apply)(Users.unapply)
    )

  val loginForm = Form(
    mapping(
      "name" -> text,
      "email" -> email,
      "password" -> nonEmptyText
    )(Users.apply)(Users.unapply)
  )
}


