package com.bangladroid.daggerexample;

import android.app.Application;

import com.bangladroid.daggerexample.rest.DaggerRestComponent;
import com.bangladroid.daggerexample.rest.RestComponent;
import com.bangladroid.daggerexample.rest.RestModule;

/**
 * Created by najmussadat on 8/3/17.
 */

public class DaggerApplication extends Application {
    private static RestComponent component;

    @Override
    public void onCreate() {
        super.onCreate();
        component = init();
    }

    public static RestComponent component() {
        return component;
    }

    public static RestComponent init() {
        return DaggerRestComponent.builder().restModule(new RestModule()).build();
    }
}
