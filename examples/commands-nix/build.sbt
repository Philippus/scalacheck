name := "commands-nix"

scalaVersion := "2.12.5"

libraryDependencies ++= Seq(
  "org.scalacheck" %% "scalacheck" % "1.13.5",
  "net.java.dev.jna" % "jna" % "4.0.0"
)

javacOptions ++= Seq("-Xmx1024M")
