package com.example.mario.androidlifecycle;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by Mario on 07/02/2015.
 */

public class MainActivity extends TracerActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }

}
