package com.example.mychatroom;

import android.annotation.SuppressLint;
import android.app.Application;

import com.example.mychatroom.models.User;


@SuppressLint("Registered")
public class UserClient extends Application {

    private User user = null;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

}
