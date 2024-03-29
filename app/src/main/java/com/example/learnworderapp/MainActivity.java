package com.example.learnworderapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    public void OnClickLearnWords(View view) {
        Intent intent = new Intent(this, TranslateWordsActivity.class);
        startActivity(intent);
    }

    public void openDictionary(View view) {

        Intent intent = new Intent(this, DictionaryActivity.class);
        intent.putExtra("num_page", 0);
        startActivity(intent);
    }
}
