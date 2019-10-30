package com.example.dagger2.di;

import android.app.Application;
import android.graphics.drawable.Drawable;

import androidx.core.content.ContextCompat;

import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestManager;
import com.bumptech.glide.request.RequestOptions;
import com.example.dagger2.R;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * This Module has all of provides methods that
 * aren't related to activities
 * It means that this Module class is
 * for inject methods */
@Module
public class AppModule {

    /**
     * provide an instance of glide request options
     * @return new instance of requestOptions
     */
    @Singleton
    @Provides
    static RequestOptions provideRequestOptions(){
        return RequestOptions
                .placeholderOf(R.drawable.white_background)
                .error(R.drawable.white_background);
    }

    /**
     * Provide an instance of glide
     * @param application reference that bind in {@link AppComponent}
     * @param requestOptions reference that provide by previous dependence method
     * @return an instance of glide
     */
    @Singleton
    @Provides
    static RequestManager provideGlideInstance(Application application, RequestOptions requestOptions){
        return Glide.with(application)
                .setDefaultRequestOptions(requestOptions);
    }

    /**
     * Provide and instance of getting the drawable logo
     * @param application reference of context of the app
     * @return drawable logo file
     */
    @Singleton
    @Provides
    static Drawable provideAppDrawable(Application application){
        return ContextCompat.getDrawable(application, R.drawable.logo);
    }

}
