package com.kramers.janus.models

import gremlin.scala._

@label("car")
final case class Car(@id id: Option[Long],
                     name: String,
                     company: String,
                     yearOfManufacture: Option[Int])
