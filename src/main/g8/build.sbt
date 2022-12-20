name := "$name$"

version := "$version$"

scalaVersion := "$scalaVersion$"

resolvers ++= Seq(
  "apache-snapshots" at "https://repository.apache.org/snapshots/"
)

libraryDependencies ++= Seq(
  "com.github.scopt"    %% "scopt"              % "4.1.0",
  "com.chuusai"         %% "shapeless"          % "2.3.10",
  "org.scalatest"       %% "scalatest"          % "3.2.14" % Test
)

assembly / assemblyMergeStrategy := {
  case PathList("META-INF", xs @ _*) => MergeStrategy.discard
  case x => MergeStrategy.first
}


// test suite settings
fork in Test := true
javaOptions ++= Seq("-Xms512M", "-Xmx2048M", "-XX:+CMSClassUnloadingEnabled")
// Show runtime of tests
testOptions in Test += Tests.Argument(TestFrameworks.ScalaTest, "-oD")
