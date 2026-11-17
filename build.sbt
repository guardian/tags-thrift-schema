import ReleaseTransformations._
import sbtversionpolicy.withsbtrelease.ReleaseVersion.fromAggregatedAssessedCompatibilityWithLatestRelease

name := "tags-thrift-schema"
organization := "com.gu"

libraryDependencies ++= Seq(
  "org.apache.thrift" % "libthrift" % "0.25.0",
  // Preserve Thrift HTTP transport; this client selects patched core5/core5-h2 5.4.3.
  "org.apache.httpcomponents.client5" % "httpclient5" % "5.6.3",
  "com.twitter" %% "scrooge-core" % "23.11.0"
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
  commitReleaseVersion,
  tagRelease,
  setNextVersion,
  commitNextVersion
)
