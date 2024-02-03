package com.finder.location.presentation.di

import com.finder.location.presentation.screens.LocationFeatureApi
import com.finder.location.presentation.screens.LocationFeatureApiImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@InstallIn(SingletonComponent::class)
@Module
object PresentationModule {

    @Provides
    fun provideLocationFeatureApi(): LocationFeatureApi {
        return LocationFeatureApiImpl()
    }
}