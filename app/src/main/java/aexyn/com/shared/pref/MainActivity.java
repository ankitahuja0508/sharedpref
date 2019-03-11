package aexyn.com.shared.pref;

import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import aexyn.com.shared.pref.model.User;
import aexyn.shared.pref.ReadPref;
import aexyn.shared.pref.SavePref;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<User> list = new ArrayList<>();


        User user = new User(1, "Ankit", 0.0, 0.0, 349873894, BitmapFactory.decodeResource(getResources(), R.mipmap.ic_launcher));

        list.add(user);

        user = new User(2, "Ankit 1", 0.0, 0.0, 349873894, BitmapFactory.decodeResource(getResources(), R.mipmap.ic_launcher));
        list.add(user);

        user = new User(3, "Ankit 2", 0.0, 0.0, 349873894, BitmapFactory.decodeResource(getResources(), R.mipmap.ic_launcher));
        list.add(user);

        user = new User(4, "Ankit 3", 0.0, 0.0, 349873894, BitmapFactory.decodeResource(getResources(), R.mipmap.ic_launcher));
        list.add(user);

        new SavePref(this).saveArrayList("list", list);
        //new SavePref(this).saveObject("object", list);

        ArrayList<User> listRead = new ReadPref(this).getArrayList("list", User.class);

        //User userRead = listRead.get(0);
        //User userRead = new ReadPref(this).getObject("object", User.class);

        Log.i("TAG", "onCreate: " + listRead.size());

    }
}
