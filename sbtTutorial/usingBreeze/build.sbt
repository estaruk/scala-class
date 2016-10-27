   // libraryDependencies += "org.scalanlp" % "breeze_2.11" % "0.13-d8f39f658cbc49f81c7a4f0c27e048af916262a7",
    //libraryDependencies += "org.scalanlp" % "breeze-viz_2.11" % "0.13-d8f39f658cbc49f81c7a4f0c27e048af916262a7",
    //libraryDependencies += "org.scalanlp" % "breeze-natives_2.11" % "0.13-d8f39f658cbc49f81c7a4f0c27e048af916262a7"

// Read here for dependencies
// https://github.com/scalanlp/breeze#sbt

// Set sub-project on SBT start: http://stackoverflow.com/a/22240142/1007926
//     onLoad in Global := { Command.process("project distributions", _: State) } compose (onLoad in Global).value



// formatting of dependencies
// http://www.scala-sbt.org/0.13/docs/Library-Dependencies.html#The++key
// Task 4d

lazy val commonSettings = Seq(
  scalaVersion := "2.11.8"
)

//[Def.Setting[_]] = ???

// Task 4c
// lazy val root: Project = ???
lazy val root = (project in file(".")).
  settings(
    name := "hello",
    version := "1.0",
    scalaVersion := "2.11.8",
    libraryDependencies ++= Seq(
      "org.scalanlp" %% "breeze" % "0.12",
      "org.scalanlp" %% "breeze-natives" % "0.12",
      "org.scalanlp" %% "breeze-viz" % "0.12"
    )
  )

// Task 4a
lazy val distributions = (project in file("distributions")).
  settings(
    name := "distributions",
    version := "1.0"
  ).settings(commonSettings:_*)


// Task 4b
//lazy val plotting = (project in file("plotting")).
//  settings(
//    name := "plotting",
//    version := "1.0"
//  ).settings(commonSettings:_*).dependsOn(distributions)




