package com.bangladroid.daggerexample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import javax.inject.Inject;

public class BaseActivity extends AppCompatActivity {

    @Inject
    MySharedPreferenceManager sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DaggerApplication.component().inject(this);

        int currentValue = sharedPreferences.getMyInteger();
        ((TextView) findViewById(R.id.text)).setText(String.valueOf(currentValue));
        sharedPreferences.setMyInteger(++currentValue);
    }
}
