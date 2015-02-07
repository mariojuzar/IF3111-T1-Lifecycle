package com.example.mario.androidintent;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by Mario on 07/02/2015.
 */
public class ResultActivity extends Activity {

    @Override
    public void onCreate(Bundle bundle){
        super.onCreate(bundle);
        setContentView(R.layout.activity_result);
        TextView text;
        text = (TextView) findViewById(R.id.displayintentextra);
        text.setText(getIntent().getExtras().getString("returnValue"));
    }

    @Override
    public void finish(){
        Intent intent = new Intent();
        EditText text = (EditText) findViewById(R.id.returnValue);
        String string = text.getText().toString();
        intent.putExtra("returnkey", string);
        setResult(RESULT_OK, intent);
        super.finish();
    }

}
