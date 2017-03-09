package com.bangladroid.daggerexample.rest;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by najmussadat on 8/3/17.
 */
@Singleton
@Component(modules = {RestModule.class})
public interface RestComponent {
    RestClient restClient();
}
