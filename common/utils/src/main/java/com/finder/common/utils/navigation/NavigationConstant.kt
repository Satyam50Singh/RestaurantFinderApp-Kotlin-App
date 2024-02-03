package com.finder.common.utils.navigation

enum class NestedNavigationRoute(val route: String) {
    DASHBOARD("dashboard"),
    LOCATION("location")
}

enum class DashboardRoute(val route: String) {
    HOME_SCREEN("home")
}

enum class LocationRoute(val route: String) {
    PLACES_SEARCH("places"),
    GOOGLE_MAPS("google_maps")
}