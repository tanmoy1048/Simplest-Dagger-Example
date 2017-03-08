package com.bangladroid.daggerexample.rest;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by najmussadat on 8/3/17.
 */

@Module
public class RestModule {
    @Singleton
    @Provides
    RestClient getRestClient() {
        return new RestClient();
    }
}
