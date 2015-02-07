package com.example.mario.androidlifecycle;

import android.os.Bundle;

/**
 * Created by Mario on 07/02/2015.
 */
public class SecondActivity extends TracerActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

}
