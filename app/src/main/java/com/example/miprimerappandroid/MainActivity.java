package com.example.miprimerappandroid;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    private String add(String values){
        if(values.isEmpty()) {
            return "0";
        } else if(values.equals("1")){
            return "1";
        }
        return "";
    }
}