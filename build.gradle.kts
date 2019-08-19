plugins {
  kotlin("js") version "1.3.50"
}

kotlin {
  target {
    useCommonJs()
    nodejs()
  }

  sourceSets["main"].dependencies {
    implementation(kotlin("stdlib-js"))


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
