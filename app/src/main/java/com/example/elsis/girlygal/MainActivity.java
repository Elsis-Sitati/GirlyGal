package com.example.elsis.girlygal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void goToDiamonds(View view) {
        Intent intent =new Intent(getApplicationContext(),Diamond.class);
        startActivity(intent);
    }
    public void goToGold(View view) {
        Intent intent =new Intent(getApplicationContext(),Gold.class);
        startActivity(intent);
    }

    public void goToGirls(View view) {
        Intent intent =new Intent(getApplicationContext(),Girls.class);
        startActivity(intent);
    }
}
