package com.bangladroid.daggerexample.rest;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by najmussadat on 8/3/17.
 */

public class RestClient {
    Retrofit retrofit;

    public RestClient() {
        retrofit = new Retrofit.Builder()
                .baseUrl("http://demo2821545.mockable.io/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    public RestClient(String baseUrl) {
        retrofit = new Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    public Retrofit getRetrofit() {
        return retrofit;
    }
}
