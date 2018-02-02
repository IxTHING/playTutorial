package models

import play.api.data.Form
import play.api.data.Forms._

case class ShoppingBasket(var name: String)

object ShoppingBasket{

  val addToBasketForm = Form{
    mapping(
      "name" -> nonEmptyText
    )(ShoppingBasket.apply)(ShoppingBasket.unapply)
  }
}
