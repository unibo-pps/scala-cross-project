name := "scala-crossproject-config"
ThisBuild / scalaVersion := "3.3.3"

lazy val pure = crossProject(JSPlatform, NativePlatform, JVMPlatform)
  .crossType(CrossType.Pure) // flavour
  // NB! crossproject libs MUST use %%% to define dependencies
  .settings( // common settings
    libraryDependencies ++= Seq(
      "com.lihaoyi" %%% "upickle" % "3.3.1",
      "org.scalatest" %%% "scalatest" % "3.2.18"
    )) // Common settings ..
  .jsSettings(scalaJSUseMainModuleInitializer := true) // js additional settings..
lazy val full = crossProject(JSPlatform, NativePlatform, JVMPlatform)
  .crossType(CrossType.Full)
  .settings(
    libraryDependencies ++= Seq(
      "org.scalatest" %%% "scalatest" % "3.2.18"
    )
  )
  .jvmSettings(libraryDependencies += "org.scala-lang.modules" %% "scala-swing" % "3.0.0") // additional settings for JVM platform
  .nativeSettings() // native settings
  .jsSettings(
    scalaJSUseMainModuleInitializer := true,
    libraryDependencies += "org.scala-js" %%% "scalajs-dom" % "2.2.0"
  ) // js additional settings..