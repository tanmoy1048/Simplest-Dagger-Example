package com.bangladroid.daggerexample.pref;

import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class PrefModule {

    private Context context;

    public PrefModule(Context context) {
        this.context = context;
    }

    @Singleton
    @Provides
    MySharedPreferenceManager providePreference() {
        return new MySharedPreferenceManager(context);
    }
}