package com.example.dagger2.di;

import com.example.dagger2.AuthActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * Here we can only put activity declarations
 * so the contributes android injector
 * It means that this module class is
 * for inject activity only*/
@Module
public abstract class ActivityBuilderModule {

    @ContributesAndroidInjector
    abstract AuthActivity contributeAuthActivity();
}
