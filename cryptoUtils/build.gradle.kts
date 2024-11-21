plugins {
    id("java-library")
    alias(libs.plugins.jetbrains.kotlin.jvm)
    id("maven-publish")
}

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}

kotlin {
    compilerOptions {
        jvmTarget = org.jetbrains.kotlin.gradle.dsl.JvmTarget.JVM_17
    }
}


publishing {
    publications {
        create<MavenPublication>("release") {
            groupId = "com.github.devharikrishna"
            artifactId = "cryptoutils"
            version = "1.0.0"
        }
    }
}