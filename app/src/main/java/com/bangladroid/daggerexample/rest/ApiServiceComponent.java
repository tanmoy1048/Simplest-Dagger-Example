package com.bangladroid.daggerexample.rest;

import com.bangladroid.daggerexample.BaseActivity;

import dagger.Subcomponent;

/**
 * Created by najmussadat on 9/3/17.
 */
@UserScope // using the previously defined scope, note that @Singleton will not work
@Subcomponent(modules = ApiServiceModule.class)
public interface ApiServiceComponent {
    void inject(BaseActivity activity);
}
