package com.example.daggerpractice.di;

import com.example.daggerpractice.di.auth.AuthModel;
import com.example.daggerpractice.di.auth.AuthScope;
import com.example.daggerpractice.di.auth.AuthViewModelsModule;
import com.example.daggerpractice.di.main.MainFragmentsBuildersModule;
import com.example.daggerpractice.di.main.MainModule;
import com.example.daggerpractice.di.main.MainScope;
import com.example.daggerpractice.di.main.MainViewModelsModule;
import com.example.daggerpractice.ui.main.MainActivity;
import com.example.daggerpractice.ui.auth.AuthActivity;


import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ActivityBuildersModule {
        @AuthScope
        @ContributesAndroidInjector(
                modules = {
                        AuthViewModelsModule.class,
                        AuthModel.class
                }
        )
        abstract AuthActivity contributeAuthActivity();

        @MainScope
        @ContributesAndroidInjector(
                modules = {
                        MainFragmentsBuildersModule.class,
                        MainViewModelsModule.class,
                        MainModule.class
                }
        )
        abstract MainActivity contributeMainActivity();


}
