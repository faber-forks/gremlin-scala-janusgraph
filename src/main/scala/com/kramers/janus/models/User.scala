package com.kramers.janus.models

import gremlin.scala._

@label("user")
final case class User(@id id: Option[Long],
                      name: String,
                      email: String,
                      age: Option[Int])
