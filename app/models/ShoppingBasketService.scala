package models

object ShoppingBasketService {
  var basketMap: Map[Int, String] = Map()
  var key: Int = 0

  def addTOBasket(name:String): Unit ={
    basketMap += (key -> name)
    key += 1
  }
}
