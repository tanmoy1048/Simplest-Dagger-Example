package com.bangladroid.daggerexample.rest;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by najmussadat on 9/3/17.
 */

public interface ApiService {
    @GET("dagger_test")
    Call<List<String>> listString();
}
