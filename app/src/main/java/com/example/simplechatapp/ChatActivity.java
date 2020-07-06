package com.example.simplechatapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class ChatActivity extends AppCompatActivity {

    static final String TAG = ChatActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}