package com.praveen.ecommerce.core.dagger.builders

import com.praveen.ecommerce.ui.home.HomeActivity
import com.praveen.ecommerce.ui.home.HomeActivityModule
import dagger.Module
import dagger.android.ContributesAndroidInjector


/**
 * Created by praveen on 03/05/19.
 **/
@Module
abstract class ActivityBuilder {
    @ContributesAndroidInjector(modules = [HomeActivityModule::class])
    internal abstract fun contributeHomeActivity(): HomeActivity
}