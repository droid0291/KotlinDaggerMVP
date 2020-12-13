package com.droid.android.imageloadermvp.di

import com.droid.android.imageloadermvp.ui.activity.MainActivity
import com.droid.android.imageloadermvp.ui.fragment.ImageListFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class AndroidInjectorModule {

    @ContributesAndroidInjector(modules = [])
    abstract fun contributesMainActivity(): MainActivity

    @ContributesAndroidInjector
    abstract fun contributeImageListFragment(): ImageListFragment
}