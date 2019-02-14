package aexyn.com.shared.pref.model;

import android.graphics.Bitmap;

public class User {

    int id;
    String name;
    double lat;
    double lng;
    long phone;
    Bitmap image;

    public User(int id, String name, double lat, double lng, long phone, Bitmap image) {
        this.id = id;
        this.name = name;
        this.lat = lat;
        this.lng = lng;
        this.phone = phone;
        this.image = image;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLng() {
        return lng;
    }

    public void setLng(double lng) {
        this.lng = lng;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public Bitmap getImage() {
        return image;
    }

    public void setImage(Bitmap image) {
        this.image = image;
    }
}
