package com.bangladroid.daggerexample;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by najmussadat on 8/3/17.
 */

@Singleton
@Component(modules = {AppModule.class})
public interface AppComponent {
    void inject(BaseActivity activity);
}
