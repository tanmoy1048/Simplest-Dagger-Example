package com.bangladroid.daggerexample.rest;

import dagger.Module;
import dagger.Provides;

/**
 * Created by najmussadat on 8/3/17.
 */
@Module
public class ApiServiceModule {
    @Provides
    @UserScope
    public ApiService providesApiService(RestClient restClient) {
        return restClient.getRetrofit().create(ApiService.class);
    }
}
