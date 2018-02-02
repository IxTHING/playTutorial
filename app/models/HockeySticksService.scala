package models



object HockeySticksService {
  var hockeySticksMap: Map[String, HockeySticks] = Map()

  def addHockeyStick(name: String, make: String, curve: String, length: Int): Unit ={
    hockeySticksMap += (name -> new HockeySticks(name, make, curve, length))
  }

  def getHockeyStick(name: String): HockeySticks ={
    hockeySticksMap(name)
  }

  def addTestHockeySticks(): Unit ={
    hockeySticksMap += ("Nexus 7000" -> new HockeySticks("Nexus 7000", "Bouer", "72", 90))
    hockeySticksMap += ("Nexus 6000" -> new HockeySticks("Nexus 6000", "Bouer", "90", 80))
    hockeySticksMap += ("Supreme L1" -> new HockeySticks("Supreme L1", "Bouer", "85", 85))
  }
}
