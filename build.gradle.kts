plugins {
  kotlin("js") version "1.3.50"
}

kotlin {
  target {
    nodejs()
  }

  sourceSets["main"].dependencies {
    implementation(kotlin("stdlib-js"))

    implementation(npm("left-pad", "1.3.0"))
  }
}

repositories {
  mavenLocal()
}



































/// hidden part
repositories {
  maven(url = "https://dl.bintray.com/kotlin/kotlin-eap")
  maven(url = "https://dl.bintray.com/kotlin/kotlin-dev")
}
