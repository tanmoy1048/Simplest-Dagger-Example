package com.bangladroid.daggerexample;

import com.bangladroid.daggerexample.pref.PrefModule;
import com.bangladroid.daggerexample.rest.RestModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by najmussadat on 8/3/17.
 */

@Singleton
@Component(modules = {PrefModule.class, RestModule.class})
public interface AppComponent {
    void inject(BaseActivity activity);
}
