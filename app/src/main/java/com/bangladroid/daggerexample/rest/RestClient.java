package com.bangladroid.daggerexample.rest;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by najmussadat on 8/3/17.
 */

public class RestClient {
    private ApiService service;

    public RestClient(){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://demo2821545.mockable.io/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        service = retrofit.create(ApiService.class);
    }

    public ApiService getService() {
        return service;
    }
}
