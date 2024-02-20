import ReleaseTransformations._
import sbtversionpolicy.withsbtrelease.ReleaseVersion.fromAggregatedAssessedCompatibilityWithLatestRelease

name := "tags-thrift-schema"
organization := "com.gu"

libraryDependencies ++= Seq(
  "org.apache.thrift" % "libthrift" % "0.13.0",
  "com.twitter" %% "scrooge-core" % "19.11.0"
)

// Might cross compile more scala versions here depending on who needs this!
scalaVersion := "2.13.11"
crossScalaVersions := Seq("2.12.18", scalaVersion.value)
scalacOptions := Seq(
  "-release:11"
)
releaseCrossBuild := true

licenses := Seq(License.Apache2)

releaseVersion := fromAggregatedAssessedCompatibilityWithLatestRelease().value

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
