libraryDependencies <+= (sbtBinaryVersion in update, scalaBinaryVersion in update) { (sbtVersion, scalaVersion) => 
  Defaults.sbtPluginExtra("org.netbeans.nbsbt" % "nbsbt-plugin" % (if (sbtVersion startsWith "0.13") "1.1.2" else "1.0.2"), sbtVersion, scalaVersion) }
