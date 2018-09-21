organization := "kramers"
name := "gremlin-scala-janusgraph"
version := "1.0"
scalaVersion := "2.12.4"

licenses += "Apache-2.0" -> url(
  "http://www.apache.org/licenses/LICENSE-2.0.html")

libraryDependencies += "org.janusgraph" % "janusgraph-core" % "0.3.0"
libraryDependencies += "org.janusgraph" % "janusgraph-cassandra" % "0.3.0"
libraryDependencies += "org.janusgraph" % "janusgraph-es" % "0.3.0"
libraryDependencies += "org.apache.tinkerpop" % "gremlin-driver" % "3.3.3"
libraryDependencies += "com.michaelpollmeier" %% "gremlin-scala" % "3.3.3.4"
libraryDependencies += "org.slf4j" % "slf4j-simple" % "1.7.12"
