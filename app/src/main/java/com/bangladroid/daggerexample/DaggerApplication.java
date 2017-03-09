package com.bangladroid.daggerexample;

import android.app.Application;

import com.bangladroid.daggerexample.rest.ApiServiceComponent;
import com.bangladroid.daggerexample.rest.ApiServiceModule;
import com.bangladroid.daggerexample.rest.DaggerApiServiceComponent;
import com.bangladroid.daggerexample.rest.DaggerRestComponent;
import com.bangladroid.daggerexample.rest.RestComponent;
import com.bangladroid.daggerexample.rest.RestModule;

/**
 * Created by najmussadat on 8/3/17.
 */

public class DaggerApplication extends Application {
    private static ApiServiceComponent component;

    @Override
    public void onCreate() {
        super.onCreate();
        component = init();
    }

    public static ApiServiceComponent component() {
        return component;
    }

    public static ApiServiceComponent init() {
        RestComponent daggerRestComponent = DaggerRestComponent.builder().restModule(new RestModule()).build();
        return DaggerApiServiceComponent.builder().restComponent(daggerRestComponent).apiServiceModule(new ApiServiceModule()).build();
    }
}
