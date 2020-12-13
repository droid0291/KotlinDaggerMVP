package com.droid.android.imageloadermvp.di

import android.app.Application
import com.droid.android.imageloadermvp.ImageLoaderApplication
import dagger.BindsInstance
import dagger.Component
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        AndroidSupportInjectionModule::class,
        AndroidInjectorModule::class,
        AppGlobalModule::class
    ]
)
interface AppComponent {

    fun inject(imageLoaderApplication: ImageLoaderApplication)

    @Component.Builder
    interface Builder {

        fun build(): AppComponent

        @BindsInstance
        fun application(application: Application): Builder
    }
}