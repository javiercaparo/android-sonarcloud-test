// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.kotlin.android) apply false
    alias(libs.plugins.kotlin.compose) apply false
    id("org.sonarqube") version "6.0.1.5171"
    alias(libs.plugins.ktlint)
}

repositories {
  // Required to download KtLint
  mavenCentral()
}

version = "1.0-SNAPSHOT"
