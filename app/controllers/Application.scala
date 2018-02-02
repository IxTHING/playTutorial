package controllers

import javax.inject.Inject

import play.api.mvc._
import models._
import play.api.i18n.{I18nSupport, MessagesApi}


class Application @Inject()(val messagesApi: MessagesApi) extends Controller with I18nSupport {

  def home = Action {
    Ok(views.html.homepage())
  }

  def createAccount = Action {
    Ok(views.html.createAccount(Users.createUsersForm))
  }

  def hockeyHelmets = Action {
    Ok(views.html.hockeyhelmets())
  }

  def hockeySticks = Action {
    Ok(views.html.hockeysticks())
  }

  def createAccountPost = Action { implicit request: Request[AnyContent] =>
    Users.createUsersForm.bindFromRequest.fold(
      { formWithErrors =>
        BadRequest(views.html.createAccount(formWithErrors))
      },
      { aUser =>
        UsersService.addUser(aUser.name, aUser.email, aUser.password)
        Redirect(controllers.routes.Application.home())
      }
    )
  }

  def createHelmet = Action {
    Ok(views.html.createHelmet(HockeyHelmets.createHelmetsForm))
  }

  def createStick = Action {
    Ok(views.html.createStick(HockeySticks.createSticksForm))
  }

  def createHelmetPost = Action { implicit request: Request[AnyContent] =>
    HockeyHelmets.createHelmetsForm.bindFromRequest.fold(
      { formWithErrors =>
        BadRequest(views.html.createHelmet(formWithErrors))
      },
      { aHelmet =>
        HockeyHelmetsService.addHockeyHelmet(aHelmet.name, aHelmet.size, aHelmet.colour)
        Redirect(controllers.routes.Application.home())
      }
    )
  }

  def addToBasketPost = Action { implicit request: Request[AnyContent] =>
    ShoppingBasket.addToBasketForm.bindFromRequest.fold(
      { formWithErrors =>
        BadRequest("Failed")
      },
      { aItem =>
        ShoppingBasketService.addTOBasket(aItem.name)
        Redirect(controllers.routes.Application.hockeySticks())
      }
    )
  }

  def createStickPost = Action { implicit request: Request[AnyContent] =>
    HockeySticks.createSticksForm.bindFromRequest.fold(
      { formWithErrors =>
        BadRequest(views.html.createStick(formWithErrors))
      },
      { aStick =>
        HockeySticksService.addHockeyStick(aStick.name, aStick.make, aStick.curve, aStick.length)
        Redirect(controllers.routes.Application.home())
      }
    )
  }

  def loginPost = Action { implicit request: Request[AnyContent] =>
    Users.loginForm.bindFromRequest.fold(
      { formWithErrors =>
        BadRequest(views.html.login(formWithErrors))
      },
      { aUser =>

        Redirect(controllers.routes.Application.home())
      }
    )
  }

  def about = Action {
    Ok(views.html.about())
  }

  def figureSkating = Action {
    Ok(views.html.figureskating())
  }

  def extra = Action {
    Ok(views.html.extra())
  }

  def singleItem(name: String) = Action {
    Ok(views.html.singleItem(HockeySticksService.hockeySticksMap(name), ShoppingBasket.addToBasketForm.fill(ShoppingBasket(name))))
  }

  def login = Action {
    Ok(views.html.login(Users.loginForm))
  }
}