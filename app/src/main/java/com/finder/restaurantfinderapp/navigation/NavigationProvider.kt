package com.finder.restaurantfinderapp.navigation

import com.finder.dashboard.presentation.navigation.DashboardApi
import com.finder.location.presentation.screens.LocationFeatureApi

data class NavigationProvider(
    val dashboardApi: DashboardApi,
    val locationFeatureApi: LocationFeatureApi
)
