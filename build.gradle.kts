plugins {
  id("org.jetbrains.kotlin.js") version "1.3.40-eap-105"
}


repositories {
  mavenLocal()
  jcenter()
  maven(url = "https://dl.bintray.com/kotlin/kotlin-eap")
}

kotlin {
  target {
    browser {
      webpackTask {
      }
    }
  }

  sourceSets["main"].dependencies {
    implementation(kotlin("stdlib-js"))
    implementation(npm("react", "16.8.3"))
  }
}
