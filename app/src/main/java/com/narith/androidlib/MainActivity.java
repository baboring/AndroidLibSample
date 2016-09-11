package com.narith.androidlib;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.narith.testlib.Test;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Check function
        Test.HelloWorld();
    }
}
