ThisBuild / version := "0.1.0-SNAPSHOT"
ThisBuild / scalaVersion := "2.13.11"

lazy val root = (project in file("."))
  .settings(
    name := "Data Visualisation",
    libraryDependencies += "org.plotly-scala" %% "plotly-almond" % "0.8.5"
  )
