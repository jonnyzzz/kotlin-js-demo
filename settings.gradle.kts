pluginManagement {
  repositories {
    gradlePluginPortal()
    maven(url = "https://dl.bintray.com/kotlin/kotlin-dev")
    maven(url = "https://dl.bintray.com/kotlin/kotlin-eap")

    resolutionStrategy {
      eachPlugin {
        if (requested.version == "1.3.50") {
          useVersion("1.3.50-release-105")
        }
      }
    }
  }
}


