package com.example.simplechatapp;

import android.app.Application;

import com.parse.Parse;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;

public class ChatApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        //Use for monitering parse network traffick
        OkHttpClient.Builder builder = new OkHttpClient.Builder();

        HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor();

        //Can be leve.Basic Level.Headers or Level Body
        httpLoggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        builder.networkInterceptors().add(httpLoggingInterceptor);

        //set application Id and server based on the values on the Heroku settings
        //anyNetwork interceptors must be added with the configuration builder given in this syntaxt

        Parse.initialize(new Parse.Configuration.Builder(this)
            .applicationId("simplechat-client")
        .clientBuilder(builder)
        .server("https://codepath-chat-lab.herokuapp.com/parse/").build());




    }
}
