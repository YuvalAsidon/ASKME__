package com.example.askme__;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import java.util.List;

public class Search extends AppCompatActivity{
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
    }

    public void search(View view){
        Intent intent = new Intent(this, SearchOption.class);
        startActivity(intent);
    }
    public void add(View view){
        Intent intent = new Intent(this, Add.class);
        startActivity(intent);
    }
    public void history(View view){
        Intent intent = new Intent(this, History.class);
        startActivity(intent);
    }

}
