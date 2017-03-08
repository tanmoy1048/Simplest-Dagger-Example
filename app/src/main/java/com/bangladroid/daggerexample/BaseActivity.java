package com.bangladroid.daggerexample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.bangladroid.daggerexample.pref.MySharedPreferenceManager;
import com.bangladroid.daggerexample.rest.RestClient;

import java.util.List;

import javax.inject.Inject;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class BaseActivity extends AppCompatActivity {

    @Inject
    RestClient restClient;

    @Inject
    MySharedPreferenceManager sharedPreferenceManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DaggerApplication.component().inject(this);

        final TextView textView = (TextView) findViewById(R.id.text);
        Call<List<String>> repos = restClient.getService().listString();
        repos.enqueue(new Callback<List<String>>() {
            @Override
            public void onResponse(Call<List<String>> call, Response<List<String>> response) {
                if (response.isSuccessful()) {
                    for (String string : response.body())
                        textView.append(string + " ");
                    textView.append("and it worked");
                } else {
                    textView.setText("Not Successfull");
                }
            }

            @Override
            public void onFailure(Call<List<String>> call, Throwable t) {
                textView.setText("Not Successfull");
            }
        });

    }
}
