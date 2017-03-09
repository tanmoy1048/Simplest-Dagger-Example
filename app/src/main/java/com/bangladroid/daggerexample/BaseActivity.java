package com.bangladroid.daggerexample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.bangladroid.daggerexample.rest.ApiService;
import com.bangladroid.daggerexample.rest.ApiServiceModule;
import com.bangladroid.daggerexample.rest.RestClient;

import java.util.List;

import javax.inject.Inject;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class BaseActivity extends AppCompatActivity {

    //just for testing, both instance are okay to test with sub-component.

    @Inject
    ApiService apiService;

    @Inject
    RestClient restClient;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DaggerApplication.component().newApiServiceComponent(new ApiServiceModule()).inject(this);

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
