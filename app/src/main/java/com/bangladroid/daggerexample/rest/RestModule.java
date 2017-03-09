package com.bangladroid.daggerexample.rest;

import javax.inject.Named;
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
    @Named("production")
    ApiService getProductionApiService() {
        RestClient restClient = new RestClient();
        return restClient.getRetrofit().create(ApiService.class);
    }

    @Singleton
    @Provides
    @Named("debug")
    ApiService getDebugApiService() {
        RestClient restClient = new RestClient("http://demo2821545.mockable.io/");
        return restClient.getRetrofit().create(ApiService.class);
    }
}
