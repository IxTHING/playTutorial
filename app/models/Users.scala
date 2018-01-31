package models

class Users (var name: String, var email: String, var password: String){

  def getName():String={this.name}
  def getEmail():String={this.email}
  def getPassword():String={this.password}

  def setName(value: String):Unit={this.name = value}
  def setEmail(value: String):Unit={this.email = value}
  def setPassword(value: String):Unit={this.password = value}

}
