plugins {
  kotlin("js") version "1.3.50"
}

repositories {
  mavenLocal()
}

kotlin {
  target {
    nodejs()
  }

  sourceSets["main"].dependencies {
    implementation(kotlin("stdlib-js"))

  }
}




































/// hidden part
repositories {
  maven(url = "https://dl.bintray.com/kotlin/kotlin-eap")
  maven(url = "https://dl.bintray.com/kotlin/kotlin-dev")
}
