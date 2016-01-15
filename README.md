# tags-thrift-schema

This repository contains the Thrift schema required for interaction with [guardian/tagmanager](https://github.com/guardian/tagmanager).

#Downloading
To download you should be able to simply add a dependency similar to the following (with your desired version):

`"com.gu" %% "tags-thrift-schema" % "0.3.2"`

### Note!
Some people seem to have issues getting the BinTray jcenter repository. In order to get around this you can add the following line to your sbt build.

`resolvers += "Guardian Bintray" at "https://dl.bintray.com/guardian/editorial-tools"`

# Publishing
## You will need a Bintray account!
In order to publish a new version of this schema you'll need a Bintray account.

1. Go to `bintray.com` and login with your GitHub account.
2. Someone will need to invite you to The Guardian Bintray org. Ask super nicely and they just might do it. They should also make you an admin.
3. You will need an API key.
  1. Go to your profile
  2. Click the Edit button near your profile name (top left).
  3. At the bottom of the list on the left will be the API key section containing your key. Keep this key handy for the next step.
4. Setup your username/API key locally.
  1. In this project run `sbt bintrayChangeCredentials`
  2. Enter your username and API key as prompted.
  3. This will save your creds locally and you shouldn't need to change them unless you refresh your API key.

## How to publish a new version
So you've made some edits and you want to publish a new version of this schema as a package to Bintray jcenter...

1. Make your changes
2. Bump the version in `version.sbt` (Remember to follow the SemVer guidelines)
3. Ensure the project still builds.
4. Run `sbt publish`
5. If you setup your Bintray account correctly then this should publish your new version to Bintray!
6. If for some reason you want to remove your package from Bintray you can run `sbt bintrayUnpublish` which will remove the package *at the current version*.

