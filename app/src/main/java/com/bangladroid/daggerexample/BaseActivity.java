package com.bangladroid.daggerexample;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import javax.inject.Inject;

public class BaseActivity extends AppCompatActivity {

    @Inject
    SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DaggerApplication.component().inject(this);

        sharedPreferences.edit().putString("key_label", "test").apply();

        if(sharedPreferences.contains("key_label")){
            ((TextView)findViewById(R.id.text)).setText("It worked");
        }
    }
}
