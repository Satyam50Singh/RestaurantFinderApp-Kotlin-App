package com.finder.restaurantfinderapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.finder.common.utils.navigation.NestedNavigationRoute

@Composable
fun MainNavigation(navHostController: NavHostController, navigationProvider: NavigationProvider) {
    NavHost(
        navController = navHostController,
        startDestination = NestedNavigationRoute.DASHBOARD.route
    ) {
        navigationProvider.dashboardApi.registerGraph(
            navHostController, this
        )
        navigationProvider.locationFeatureApi.registerGraph(
            navHostController, this
        )
    }
}