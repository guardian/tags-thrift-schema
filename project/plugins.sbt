// Plugin to actually build the thrift
addSbtPlugin("com.twitter" %% "scrooge-sbt-plugin" % "23.11.0")
addSbtPlugin("ch.epfl.scala" % "sbt-version-policy" % "3.2.0")
addSbtPlugin("org.xerial.sbt" % "sbt-sonatype" % "3.9.4")
addSbtPlugin("com.github.gseitz" % "sbt-release" % "1.0.13")

// Patch the build tool graph without changing published library dependencies.
dependencyOverrides += "org.apache.httpcomponents" % "httpclient" % "4.5.13"
