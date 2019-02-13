package aexyn.shared.pref;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;


import java.io.IOException;
import java.util.ArrayList;

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

    public ArrayList<Object> getModelArrayList(String key) {
        ArrayList<Object> arrayList = new ArrayList<>();
        try {
            arrayList = (ArrayList<Object>)
                    ObjectSerializer.deserialize(prefs.getString(key,
                            ObjectSerializer.serialize(new ArrayList<Object>())));
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return arrayList;
    }
}
