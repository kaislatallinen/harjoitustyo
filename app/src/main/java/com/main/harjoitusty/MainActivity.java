package com.main.harjoitusty;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Storage s = Storage.getInstance();

    }

    public void switchToAddLutemon(View view){
        Intent intent = new Intent(this, Adding.class);
        startActivity(intent);
    }
    public void switchToListLutemons(View view){
        Intent intent = new Intent(this, Listing.class);
        startActivity(intent);
    }
    public void switchToTransferLutemon(View view){
        Intent intent = new Intent(this, Transfer.class);
        startActivity(intent);
    }
    public void switchToFightLutemon(View view){
        Intent intent = new Intent(this, Fight.class);
        startActivity(intent);
    }
}
