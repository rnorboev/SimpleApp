package com.example.rav.simpleapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.example.rav.simpleapp.utilities.MyTextUtil;

public class MainActivity extends AppCompatActivity {

    private static final int MYCONST = 405;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyTextUtil util = new MyTextUtil();

        Intent intent = new Intent();

        Toast.makeText(this, "My message", Toast.LENGTH_SHORT).show();
    }
}
