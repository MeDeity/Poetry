package com.deity.poetry;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.deity.poetry.annotations.DebugLog;

@DebugLog
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
