pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "RestaurantFinderApp"
include(":app")
include(":dashboard:presentation")
include(":dashboard:data")
include(":common:utils")
include(":location:data")
include(":location:presentation")
include(":location:domain")
