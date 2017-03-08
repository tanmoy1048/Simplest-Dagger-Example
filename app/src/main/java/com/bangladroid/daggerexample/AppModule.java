package com.bangladroid.daggerexample;

import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {

    private Context context;

    public AppModule(Context context) {
        this.context = context;
    }

    @Singleton
    @Provides
    MySharedPreferenceManager providePreference() {
        return new MySharedPreferenceManager(context);
    }
}
