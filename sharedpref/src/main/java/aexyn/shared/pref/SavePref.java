package aexyn.shared.pref;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import com.google.gson.Gson;

import java.io.IOException;
import java.util.ArrayList;

public class SavePref {

    String TAG = "SavePref";
    Context ctx;
    private SharedPreferences prefs;

    public SavePref(Context ctx) {
        this.ctx = ctx;
        prefs = PreferenceManager.getDefaultSharedPreferences(ctx);
    }

    public void saveBoolean(String key, Boolean value) {
        SharedPreferences.Editor editor = prefs.edit();
        editor.putBoolean(key, value);
        editor.commit();
    }

    public void saveString(String key, String value) {
        SharedPreferences.Editor editor = prefs.edit();
        editor.putString(key, value);
        editor.commit();
    }

    public void saveFloat(String key, double value) {
        SharedPreferences.Editor editor = prefs.edit();
        editor.putFloat(key, (float) value);
        editor.commit();
    }


    public <T> void saveArrayList(String key,  ArrayList<T> arrayList) {
        SharedPreferences.Editor editor = prefs.edit();
        editor.putString(key, new Gson().toJson(arrayList));
        editor.commit();
    }

    public <T> void saveObject(String key,  T t) {
        SharedPreferences.Editor editor = prefs.edit();
        editor.putString(key, new Gson().toJson(t));
        editor.commit();
    }

    public void saveInt(String key, int value) {
        SharedPreferences.Editor editor = prefs.edit();
        editor.putInt(key, value);
        editor.commit();
    }

    public void remove(String key) {
        SharedPreferences.Editor editor = prefs.edit();
        editor.remove(key);
        editor.commit();
    }

    public void removeAll() {
        SharedPreferences.Editor editor = prefs.edit();
        editor.clear();
        editor.commit();
    }
}
