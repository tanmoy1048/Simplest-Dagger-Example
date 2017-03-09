package com.bangladroid.daggerexample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.bangladroid.daggerexample.rest.ApiService;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class BaseActivity extends AppCompatActivity {

    //@Inject @Named("production")
    //ApiService apiService;

    @Inject @Named("debug")
    ApiService apiService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DaggerApplication.component().inject(this);

        final TextView textView = (TextView) findViewById(R.id.text);
        Call<List<String>> repos = apiService.listString();
        repos.enqueue(new Callback<List<String>>() {
            @Override
            public void onResponse(Call<List<String>> call, Response<List<String>> response) {
                if (response.isSuccessful()) {
                    for (String string : response.body())
                        textView.append(string + " ");
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
