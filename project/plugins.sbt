// Plugin to actually build the thrift
resolvers += "twitter-repo" at "https://maven.twttr.com"
addSbtPlugin("com.twitter" %% "scrooge-sbt-plugin" % "4.1.0")

// Used to upload to bintray
addSbtPlugin("me.lessis" % "bintray-sbt" % "0.3.0")
