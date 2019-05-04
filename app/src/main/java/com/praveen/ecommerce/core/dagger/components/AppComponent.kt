package com.praveen.ecommerce.core.dagger.components

import android.app.Application
import com.praveen.ecommerce.EcommerceApp
import com.praveen.ecommerce.core.dagger.builders.ActivityBuilder
import com.praveen.ecommerce.core.dagger.modules.AppModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import javax.inject.Singleton

/**
 * Created by praveen on 03/05/19.
 **/
@Singleton
@Component(
    modules = [AndroidInjectionModule::class, AppModule::class, ActivityBuilder::class]
)
interface AppComponent {
    fun inject(app: EcommerceApp)

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun application(application: Application): Builder

        fun build(): AppComponent
    }
}