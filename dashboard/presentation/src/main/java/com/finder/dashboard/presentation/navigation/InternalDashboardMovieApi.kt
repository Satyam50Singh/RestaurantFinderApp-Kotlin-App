package com.finder.dashboard.presentation.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.finder.common.utils.navigation.DashboardRoute
import com.finder.common.utils.navigation.FeatureApi
import com.finder.common.utils.navigation.NestedNavigationRoute
import com.finder.dashboard.presentation.screen.home.HomeScreen

object InternalDashboardMovieApi : FeatureApi {
    override fun registerGraph(
        navHostController: NavHostController,
        navGraphBuilder: NavGraphBuilder
    ) {
        navGraphBuilder.navigation(
            startDestination = DashboardRoute.HOME_SCREEN.route,
            route = NestedNavigationRoute.DASHBOARD.route
        ) {
            composable(route = DashboardRoute.HOME_SCREEN.route) {
                HomeScreen()
            }
        }
    }
}