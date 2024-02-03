package com.finder.dashboard.presentation.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import com.finder.common.utils.navigation.FeatureApi

interface DashboardApi : FeatureApi

class DashboardApiImpl : DashboardApi {
    override fun registerGraph(
        navHostController: NavHostController,
        navGraphBuilder: NavGraphBuilder
    ) {
        InternalDashboardMovieApi.registerGraph(navHostController, navGraphBuilder)
    }

}