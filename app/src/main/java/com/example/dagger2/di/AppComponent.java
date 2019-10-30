package com.example.dagger2.di;

import android.app.Application;

import com.example.dagger2.BaseApplication;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;

/**
 * This annotation means that appComponent is enter in singleton scope
 * and all of dependencies that annotated with singleton will be in the same
 * scope with appComponent class
 * that means when the appComponent is fall all that dependencies will fall with it*/
@Singleton
@Component( modules = {
        AndroidSupportInjectionModule.class,
        ActivityBuilderModule.class,
        AppModule.class
})
public interface AppComponent extends AndroidInjector<BaseApplication> {

    @Component.Builder
    interface Builder{

        @BindsInstance
        Builder application(Application application);

        AppComponent build();
    }
}
