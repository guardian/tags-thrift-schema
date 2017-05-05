import com.twitter.scrooge.ScroogeSBT

name := "tags-thrift-schema"
organization := "com.gu"

libraryDependencies ++= Seq(
  "org.apache.thrift" % "libthrift" % "0.9.3",
  "com.twitter" %% "scrooge-core" % "4.12.0"
)

// Might cross compile more scala versions here depending on who needs this!
scalaVersion := "2.11.8"

publishMavenStyle := true
bintrayOrganization := Some("guardian")
bintrayRepository := "editorial-tools"
licenses += ("Apache-2.0", url("https://github.com/guardian/tags-thrift-schema/blob/master/LICENSE"))
