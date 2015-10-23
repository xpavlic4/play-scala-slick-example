package model

import play.api.data.Form
import play.api.data.Forms._

/**
 * Created by Bhavya on 14-10-2015.
 **/

case class User(id : Long,firstName : String, lastName : String , mobile : Long , email : String)

case class UserFormData(firstName : String, lastName : String , mobile : Long , email : String )

object UserForm {

  val form = Form(
    mapping(
      "firstName" -> nonEmptyText,
      "lastName" -> nonEmptyText,
      "mobile" -> longNumber,
      "email" -> email
    )(UserFormData.apply)(UserFormData.unapply)
  )
}