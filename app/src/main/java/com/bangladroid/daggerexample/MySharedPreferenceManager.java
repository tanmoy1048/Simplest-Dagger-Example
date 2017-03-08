package com.bangladroid.daggerexample;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

/**
 * Created by najmussadat on 8/3/17.
 */

public class MySharedPreferenceManager {
    private SharedPreferences sharedPreferences;

    public MySharedPreferenceManager(Context context){
        this.sharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
    }

    public int getMyInteger(){
        return sharedPreferences.getInt("MY_INTEGER", 0);
    }

    public void setMyInteger(int i){
        SharedPreferences.Editor prefsEditor = sharedPreferences.edit();
        prefsEditor.putInt("MY_INTEGER", i).apply();
    }
}
