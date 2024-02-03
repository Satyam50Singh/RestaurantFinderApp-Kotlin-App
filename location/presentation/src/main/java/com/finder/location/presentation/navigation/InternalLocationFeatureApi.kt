package com.finder.location.presentation.navigation

import android.location.Location
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.finder.common.utils.navigation.FeatureApi
import com.finder.common.utils.navigation.LocationRoute
import com.finder.common.utils.navigation.NestedNavigationRoute
import com.finder.location.presentation.screens.google_maps.GoogleMapScreen
import com.finder.location.presentation.screens.places.RestaurantFinderScreen

object InternalLocationFeatureApi : FeatureApi {
    override fun registerGraph(
        navHostController: NavHostController,
        navGraphBuilder: NavGraphBuilder
    ) {
        navGraphBuilder.navigation(
            startDestination = LocationRoute.PLACES_SEARCH.route,
            route = NestedNavigationRoute.LOCATION.route
        ) {
            composable(route = LocationRoute.PLACES_SEARCH.route) {
                RestaurantFinderScreen()
            }
            composable(route = LocationRoute.GOOGLE_MAPS.route) {
                GoogleMapScreen()
            }
        }
    }
}