package com.kramers.janus.crud

import com.kramers.janus.Connection
import com.kramers.janus.models.User
import gremlin.scala._

object Crud extends App {

  def createUser: User = {
    val user = User(None, "kramer", "cosmo@kramers.com", None)
    implicit val graph: ScalaGraph = Connection.graph.asScala()

    val userVertex = graph + user

    graph.tx().commit()
    userVertex.toCC[User]
  }

  createUser

}
