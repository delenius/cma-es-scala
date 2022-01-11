name := "cma-es-scala"

organization := "com.sungevity"

scalaVersion := "2.12.6"

//version := "1.0.2"

//crossScalaVersions := Seq("2.10.6", "2.11.8")
//
//scalacOptions += "-target:jvm-1.7"
//
//javacOptions ++= Seq("-source", "1.7", "-target", "1.7")

libraryDependencies ++= Seq(
  // "com.typesafe" % "config" % "1.2.1",
  // "joda-time" % "joda-time" % "2.8.1",
  "org.scalanlp" %% "breeze" % "2.0-RC3",
  //  "org.scalanlp" %% "breeze" % "0.12",
  //  "org.scalanlp" %% "breeze-natives" % "0.12",
  //"org.scalanlp" %% "breeze-viz" % "0.12",
  // "org.apache.commons" % "commons-lang3" % "3.4",
  //  "org.scalatest" %% "scalatest" % "2.2.4" % "test"
  "org.scalatest" %% "scalatest" % "3.0.8" % "test"
)

licenses += ("Apache-2.0", url("http://www.apache.org/licenses/LICENSE-2.0.html"))
