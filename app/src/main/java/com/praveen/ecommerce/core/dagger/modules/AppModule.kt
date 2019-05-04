package com.praveen.ecommerce.core.dagger.modules

import com.praveen.ecommerce.EcommerceApp
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by praveen on 03/05/19.
 **/
@Module
class AppModule {

    @Singleton
    @Provides
    fun provideContext(application: EcommerceApp) = application
}