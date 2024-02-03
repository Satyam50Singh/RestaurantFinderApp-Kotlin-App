package com.finder.restaurantfinderapp.di

import com.finder.dashboard.presentation.navigation.DashboardApi
import com.finder.location.presentation.screens.LocationFeatureApi
import com.finder.restaurantfinderapp.navigation.NavigationProvider
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
object AppModule {
    @Singleton
    @Provides
    fun provideNavigationProvider(
        dashboardApi: DashboardApi,
        locationFeatureApi: LocationFeatureApi
    ): NavigationProvider {
        return NavigationProvider(dashboardApi, locationFeatureApi)
    }
}