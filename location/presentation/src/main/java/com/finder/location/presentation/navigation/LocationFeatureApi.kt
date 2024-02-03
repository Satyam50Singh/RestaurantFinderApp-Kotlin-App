package com.finder.location.presentation.screens

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import com.finder.common.utils.navigation.FeatureApi
import com.finder.location.presentation.navigation.InternalLocationFeatureApi

interface LocationFeatureApi : FeatureApi {
}

class LocationFeatureApiImpl : LocationFeatureApi {
    override fun registerGraph(
        navHostController: NavHostController,
        navGraphBuilder: NavGraphBuilder
    ) {
        InternalLocationFeatureApi.registerGraph(navHostController, navGraphBuilder)
    }

}