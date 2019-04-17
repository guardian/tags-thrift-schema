import com.twitter.scrooge.ScroogeSBT

name := "tags-thrift-schema"
organization := "com.gu"

libraryDependencies ++= Seq(
  "org.apache.thrift" % "libthrift" % "0.10.0",
  "com.twitter" %% "scrooge-core" % "19.3.0"
)

// Might cross compile more scala versions here depending on who needs this!
scalaVersion := "2.12.8"
crossScalaVersions := Seq("2.11.12", "2.12.8")

publishMavenStyle := true
bintrayOrganization := Some("guardian")
bintrayRepository := "editorial-tools"
licenses += ("Apache-2.0", url("https://github.com/guardian/tags-thrift-schema/blob/master/LICENSE"))
