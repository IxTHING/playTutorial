package models

object HockeyHelmetsService {
  var hockeyHelmetsMap: Map[String, HockeyHelmets] = Map()

  def addHockeyHelmet(name: String, size: Int, colour: String): Unit ={
    hockeyHelmetsMap += (name -> new HockeyHelmets(name, size, colour))
  }

  def getHockeyHelmet(name: String): HockeyHelmets ={
    hockeyHelmetsMap(name)
  }

  def addTestHockeyHelmets(): Unit ={
    hockeyHelmetsMap += ("Bour Helmet" -> new HockeyHelmets("Bour Helmet", 21, "Red"))
    hockeyHelmetsMap += ("Supreme Helmet" -> new HockeyHelmets("Supreme Helmet", 30, "Black"))
    hockeyHelmetsMap += ("Vapour Helmet" -> new HockeyHelmets("Vapour Helmet", 20, "White"))
    hockeyHelmetsMap += ("Bour 1Helmet" -> new HockeyHelmets("Bour Helmet", 21, "Red"))
    hockeyHelmetsMap += ("Supreme 1Helmet" -> new HockeyHelmets("Supreme Helmet", 30, "Black"))
    hockeyHelmetsMap += ("Vapour 1Helmet" -> new HockeyHelmets("Vapour Helmet", 20, "White"))
    hockeyHelmetsMap += ("Bour 2Helmet" -> new HockeyHelmets("Bour Helmet", 21, "Red"))
    hockeyHelmetsMap += ("Supreme 2Helmet" -> new HockeyHelmets("Supreme Helmet", 30, "Black"))
    hockeyHelmetsMap += ("Vapour 2Helmet" -> new HockeyHelmets("Vapour Helmet", 20, "White"))
  }
}
