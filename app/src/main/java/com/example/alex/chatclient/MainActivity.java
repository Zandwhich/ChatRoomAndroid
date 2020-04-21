/*
 * Author: Alex Zdanowicz
 */

package com.example.alex.chatclient;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

/**
 * Starting page for activity that will display chat
 */
public class MainActivity extends AppCompatActivity {

    /**
     * Method called when activity is created
     * @param savedInstanceState Passed in saved instances
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }//end onCreate()
}//end MainActivity
