plugins {
    id("java-library")
    alias(libs.plugins.jetbrains.kotlin.jvm)
    id("maven-publish")
}

java {
    sourceCompatibility = JavaVersion.VERSION_11
    targetCompatibility = JavaVersion.VERSION_11
}

kotlin {
    compilerOptions {
        jvmTarget = org.jetbrains.kotlin.gradle.dsl.JvmTarget.JVM_11
    }
}


afterEvaluate {
    publishing {
        publications {
            create<MavenPublication>("release") {
                groupId = "com.github.devharikrishna"
                artifactId = "cryptoutils"
                version = "1.0.0"

                //from(components["release"]) // Assuming "release" is your component name

                // Configure POM metadata (optional but recommended)
                pom {
                    name.set("cryptoutils")
                    description.set("Your library description")
                    url.set("https://github.com/devharikrishna/cryptoutils") // Replace with your project URL
                    licenses {
                        license {
                            name.set("The Apache License, Version 2.0")
                            url.set("http://www.apache.org/licenses/LICENSE-2.0.txt")
                        }
                    }
                    developers {
                        developer {
                            id.set("devharikrishna") // Replace with your developer ID
                            name.set("Harikrishna K") // Replace with your name
                            email.set("harikrishnaktkl619@gmail.com") // Replace with your email
                        }
                    }
                    scm {
                        connection.set("scm:git:github.com/devharikrishna/cryptoutils.git") // Replace with your Git URL
                        developerConnection.set("scm:git:ssh://github.com/devharikrishna/cryptoutils.git") // Replace with your SSH Git URL
                        url.set("https://github.com/devharikrishna/cryptoutils") // Replace with your project URL
                    }
                }



            }
        }
    }
}