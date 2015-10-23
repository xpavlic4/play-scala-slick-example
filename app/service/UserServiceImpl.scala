package service

import javax.inject.Inject
import dao.UserDAO
import model.User
import scala.concurrent.Future

/**
 * Created by Bhavya on 23-10-2015.
 */
class UserServiceImpl @Inject()(userDAO: UserDAO) extends UserService {
  override def addUser(user: User): Future[String] = {
    userDAO.add(user)
  }

  override def deleteUser(id: Long): Future[Int] = {
    userDAO.delete(id)
  }

  override def getUser(id: Long): Future[Option[User]] = {
    userDAO.get(id)
  }

  override def listAllUsers: Future[Seq[User]] = {
    userDAO.listAll
  }
}
