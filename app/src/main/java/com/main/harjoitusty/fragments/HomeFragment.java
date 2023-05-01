package com.main.harjoitusty.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.main.harjoitusty.AdapterFragment;

import com.main.harjoitusty.Lutemon;
import com.main.harjoitusty.MyAdapter;
import com.main.harjoitusty.R;
import com.main.harjoitusty.Storage;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment implements AdapterFragment.ILutemonCheckedChangeListener {
    private RecyclerView rView;
    private AdapterFragment adapter;

    private ArrayList<Lutemon> lutemon;

    private ArrayList<String> lutemons = new ArrayList<>();

    private Storage storage;

    public ArrayList <HomeFragment> DedLutemon = new ArrayList<>();
    public ArrayList <HomeFragment> TrainingLutemon = new ArrayList<>();
    public ArrayList <HomeFragment> BattleLutemon = new ArrayList<>();
    private RadioGroup radioGroup;




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        return view;
    }

    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState, Lutemon lutemon) {
        super.onViewCreated(view, savedInstanceState);
        this.rView = view.findViewById(R.id.recyclerview);
        rView.setLayoutManager(new LinearLayoutManager(getActivity()));

        adapter = new AdapterFragment(requireContext(), Storage.getInstance().getLutemons(), this);
        rView.setAdapter(adapter);

    }

    public void checkButtons (View view, Lutemon lutemon){

        radioGroup = view.findViewById(R.id.radioGroup1);
        int selected = radioGroup.getCheckedRadioButtonId();

        if(selected!= -1){
            RadioButton rBID = view.findViewById(R.id.radioButton2);
            CheckBox checkBox = view.findViewById(R.id.checkbox);

            checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {


                public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                    if(isChecked){
                        int number = lutemon.getKokemus();
                        number += 1;
                        String numberString = Integer.toString(number);
                        lutemons.add(4, numberString);
                    }

                }
            });
        }
    }

    @Override
    public void lutemonCheckedChanged(Lutemon lutemon1, boolean isChecked) {
        System.out.println(lutemon1.getName());
        System.out.println(isChecked);
    }
}