package com.permissionx.limlibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.permissionx.molibrary.MODataManager;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MODataManager manager = new MODataManager();
    }
}