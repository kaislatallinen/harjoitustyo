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

import com.main.harjoitusty.AdapterFragment;

import com.main.harjoitusty.Lutemon;
import com.main.harjoitusty.R;
import com.main.harjoitusty.Storage;

import java.util.ArrayList;

public class TrainingFragment extends Fragment implements AdapterFragment.ILutemonCheckedChangeListener {
    private RecyclerView rView;
    private AdapterFragment adapter;

    private ArrayList<TrainingFragment>Lutemon2;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_training, container, false);

        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        this.rView = view.findViewById(R.id.recyclerview);
        rView.setLayoutManager(new LinearLayoutManager(getActivity()));

        adapter = new AdapterFragment(requireContext(), Storage.getInstance().getLutemons(), this);
        rView.setAdapter(adapter);
    }

    @Override
    public void lutemonCheckedChanged(Lutemon lutemon2, boolean isChecked) {
        System.out.println(lutemon2.getName());
        System.out.println(isChecked);
    }
}