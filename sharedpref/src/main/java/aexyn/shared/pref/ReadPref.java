package aexyn.shared.pref;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class ReadPref {
    boolean result = false;
    String TAG = "ReadPref";
    Context ctx;
    String res = "";
    private SharedPreferences prefs;

    public ReadPref(Context ctx) {
        this.ctx = ctx;
        prefs = PreferenceManager.getDefaultSharedPreferences(ctx);
    }

    public boolean getBooleanValue(String key) {
        return prefs.getBoolean(key, false);
    }

    public boolean getBooleanValueTrue(String key) {
        return prefs.getBoolean(key, true);
    }

    public String getStringValue(String key) {
        return prefs.getString(key, "");
    }

    
    public float getDoubleValue(String key) {
        return prefs.getFloat(key, 0);
    }

    public int getIntValue(String key) {
        return prefs.getInt(key, -1);
    }

    public boolean keyExixst(String key) {
        return prefs.contains(key);
    }

    public <T> ArrayList<T> getArrayList(String key, Type classType) {
        Type type = new TypeToken<List<T>>(){}.getType();

        type = TypeToken.getParameterized(List.class, classType).getType();

        ArrayList<T> arrayList = new Gson().fromJson(prefs.getString(key, ""), type);
        return arrayList;
    }

    public <T> T getObject(String key, Type classType) {
        return new Gson().fromJson(prefs.getString(key, ""), classType);
    }
}
