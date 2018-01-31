package controllers

import play.api.mvc._


class Application extends Controller {

  def home = Action {
    Ok(views.html.homepage())
  }

  def createAccount= Action {
    Ok(views.html.createAccount())
  }

  def about= Action {
    Ok(views.html.about())
  }

  def iceHockey= Action {
    Ok(views.html.icehockey())
  }

  def figureSkating= Action {
    Ok(views.html.figureskating())
  }

  def extra= Action {
    Ok(views.html.extra())
  }

}