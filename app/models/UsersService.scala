package models

class UsersService {
  var usersMap: Map[String, Users] = Map()//.withDefaultValue("")

  def addUser(name: String, email: String, password: String): Unit ={
    //usersMap += (email -> (name, email, password))
  }

  def isUser(email: String): Boolean = {usersMap.contains(email)}

  def getUser(email: String): Users ={
    usersMap(email)
  }

  def isValid(email: String, password: String):Boolean={
    ((email != null)) &&
      (password != null) &&
      isUser(email) &&
      getUser(email).getPassword().equals(password)
  }
}
