plugins {
    kotlin("jvm") version "2.2.21"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    implementation("org.jsoup:jsoup:1.21.2")
}

kotlin {
    jvmToolchain(23)
}

tasks.test {
    useJUnitPlatform()
}