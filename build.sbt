import ReleaseTransformations._

name := "tags-thrift-schema"
organization := "com.gu"

scmInfo := Some(ScmInfo(url("https://github.com/guardian/tags-thrift-schema"), "scm:git@github.com:guardian/tags-thrift-schema"))
homepage := scmInfo.value.map(_.browseUrl)
developers := List(Developer(id = "guardian", name = "Guardian", email = null, url = url("https://github.com/guardian")))


libraryDependencies ++= Seq(
  "org.apache.thrift" % "libthrift" % "0.13.0",
  "com.twitter" %% "scrooge-core" % "19.11.0"
)

// Might cross compile more scala versions here depending on who needs this!
scalaVersion := "2.13.1"
crossScalaVersions := Seq("2.11.12", "2.12.10", scalaVersion.value)
releaseCrossBuild := true

resolvers += Resolver.jcenterRepo

licenses += ("Apache-2.0", url("https://github.com/guardian/tags-thrift-schema/blob/master/LICENSE"))

releasePublishArtifactsAction := PgpKeys.publishSigned.value
publishTo := sonatypePublishTo.value

releaseProcess := Seq[ReleaseStep](
  checkSnapshotDependencies,
  inquireVersions,
  runClean,
  runTest,
  setReleaseVersion,
  publishArtifacts,
  releaseStepCommand("sonatypeReleaseAll"),
  commitReleaseVersion,
  tagRelease,
  setNextVersion,
  commitNextVersion,
  pushChanges
)
