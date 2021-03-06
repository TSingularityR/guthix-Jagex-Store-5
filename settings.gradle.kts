pluginManagement {
    val kotlinVersion by extra("1.3.71")
    val dokkaVersion by extra("0.10.0")

    plugins {
        id("org.jetbrains.kotlin.jvm") version kotlinVersion
        id("org.jetbrains.dokka") version dokkaVersion
    }

    repositories {
        maven("https://dl.bintray.com/kotlin/kotlin-eap")
        mavenCentral()
        maven("https://plugins.gradle.org/m2/")
    }
}

rootProject.name = "jagex-store-5"

include("toolbox")
include("toolbox:downloader")
include("toolbox:versionstripper")