package com.bangladroid.daggerexample;

import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by najmussadat on 8/3/17.
 */

public class MainActivity extends BaseActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sharedPreferences.edit().putString("key_label", "test").apply();

        if(sharedPreferences.contains("key_label")){
            ((TextView)findViewById(R.id.text)).setText("It worked");
        }
    }
}
