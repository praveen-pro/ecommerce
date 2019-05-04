package com.praveen.ecommerce.ui.home

import androidx.lifecycle.ViewModelProvider
import com.praveen.ecommerce.core.ViewModelProviderFactory
import dagger.Module
import dagger.Provides


/**
 * Created by praveen on 03/05/19.
 **/
@Module
class HomeActivityModule {
    @Provides
    fun provideViewModel() = HomeViewModel()

    @Provides
    fun provideViewModelProvider(viewModel: HomeViewModel): ViewModelProvider.Factory =
        ViewModelProviderFactory(viewModel)
}