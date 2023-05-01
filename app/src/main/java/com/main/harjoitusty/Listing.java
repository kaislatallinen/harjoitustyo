package com.main.harjoitusty;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Listing extends AppCompatActivity {

    private Storage storage;

    private RecyclerView rView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listing);

        storage = Storage.getInstance();

        rView = findViewById(R.id.recyclerview);
        rView.setLayoutManager(new LinearLayoutManager(this));

        rView.setAdapter(new MyAdapter(getApplicationContext(), storage.getLutemons()));

    }

}
