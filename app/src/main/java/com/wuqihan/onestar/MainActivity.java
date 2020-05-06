package com.wuqihan.onestar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.wuqihan.utils.Change;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Change change = new Change();
        Log.e("oneStart","oneStart---"+change.getChange());
    }
}
