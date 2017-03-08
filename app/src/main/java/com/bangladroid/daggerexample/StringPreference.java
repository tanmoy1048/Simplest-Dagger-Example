package com.bangladroid.daggerexample;

import android.content.SharedPreferences;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

/**
 * Created by najmussadat on 8/3/17.
 */

public class StringPreference {
    private final SharedPreferences preferences;

    public StringPreference(@NonNull SharedPreferences preferences) {
        this.preferences = preferences;
    }

    public boolean isSet(String key) {
        return preferences.contains(key);
    }
    public void set(String key, @Nullable String value) {
        preferences.edit().putString(key, value).apply();
    }
    public void delete(String key) {
        preferences.edit().remove(key).apply();
    }
}
