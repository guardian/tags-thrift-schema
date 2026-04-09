# tags-thrift-schema
[![tags-thrift-schema Scala version support](https://index.scala-lang.org/guardian/tags-thrift-schema/tags-thrift-schema/latest-by-scala-version.svg?platform=jvm)](https://index.scala-lang.org/guardian/tags-thrift-schema/tags-thrift-schema)
[![Release](https://github.com/guardian/tags-thrift-schema/actions/workflows/release.yml/badge.svg)](https://github.com/guardian/tags-thrift-schema/actions/workflows/release.yml)

This repository contains the Thrift schema required for interaction with [guardian/tagmanager](https://github.com/guardian/tagmanager).

### Downloading
To download you should be able to simply add a dependency similar to the following (with your desired version):

`"com.gu" %% "tags-thrift-schema" % "0.6.3"`

### Testing Locally

If you need to try out your changes with consumer applications (e.g. `tagmanager`) then...

- Run `+publishLocal` in sbt (note the `+` makes it cross-compile, e.g. `tagmanager` consumes the 2.11 version)
- Update the version in the consumer application(s) (e.g. https://github.com/guardian/tagmanager/blob/e47465cbbcdf9e3d3312c5c779eb52fe0676ce4a/build.sbt#L29) using the `-SNAPSHOT` version.

The terminal feedback from `+publishLocal` will include a line confirming the version of the library it has created in your ~/.ivy2/local folder. EG, the local version is "2.8.7-SNAPSHOT":

```
[info] :: delivering :: com.gu#tags-thrift-schema_2.13;2.8.7-SNAPSHOT :: 2.8.7-SNAPSHOT :: integration :: Thu Apr 09 14:06:23 BST 2026
```

So the updated dependency in version in the consumer application could be:
`"com.gu" %% "tags-thrift-schema" % "2.8.7-SNAPSHOT"`

# Publishing a new release

This repo uses [`gha-scala-library-release-workflow`](https://github.com/guardian/gha-scala-library-release-workflow)
to automate publishing releases (both full & preview releases) - see
[**Making a Release**](https://github.com/guardian/gha-scala-library-release-workflow/blob/main/docs/making-a-release.md).
