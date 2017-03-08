package com.bangladroid.daggerexample.rest;

import com.bangladroid.daggerexample.BaseActivity;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by najmussadat on 8/3/17.
 */
@Singleton
@Component(modules = {RestModule.class})
public interface RestComponent {
    void inject(BaseActivity activity);
}
