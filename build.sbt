enablePlugins(ScalaJSPlugin)

val scala3Version = "3.1.3"

lazy val root = project
  .in(file("."))
  .settings(
    name := "Bookman",
    version := "0.1.0-SNAPSHOT",

    scalaVersion := scala3Version,
    
    scalaJSUseMainModuleInitializer := true,

    libraryDependencies += "org.scala-js" %%% "scalajs-dom" % "2.2.0",
    libraryDependencies += "org.scalameta" %%% "munit" % "1.0.0-M6" % Test 
  )
  
  
jsEnv := new org.scalajs.jsenv.jsdomnodejs.JSDOMNodeJSEnv()
