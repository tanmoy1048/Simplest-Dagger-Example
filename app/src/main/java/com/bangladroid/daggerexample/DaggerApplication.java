package com.bangladroid.daggerexample;

import android.app.Application;
import android.content.Context;

/**
 * Created by najmussadat on 8/3/17.
 */

public class DaggerApplication extends Application {
    private static AppComponent component;

    @Override
    public void onCreate() {
        super.onCreate();
        component = init(this);
    }

    public static AppComponent component() {
        return component;
    }

    public static AppComponent init(Context context) {
        return DaggerAppComponent.builder().appModule(new AppModule(context)).build();
    }
}
