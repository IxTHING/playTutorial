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
    hockeySticksMap += ("Nexus_7000" -> new HockeySticks("Nexus_7000", "Bouer", "72", 90))
    hockeySticksMap += ("Nexus_6000" -> new HockeySticks("Nexus_6000", "Bouer", "90", 80))
    hockeySticksMap += ("Supreme_L1" -> new HockeySticks("Supreme_L1", "Bouer", "85", 85))
  }
}
