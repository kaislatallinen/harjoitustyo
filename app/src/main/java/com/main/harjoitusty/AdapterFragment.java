package com.main.harjoitusty;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.CheckBox;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


public class AdapterFragment extends RecyclerView.Adapter<AdapterFragment.MyViewHolder> {
    private final Context context;
    private final ArrayList<Lutemon> lutemons;

    private final ILutemonCheckedChangeListener listener;

    private Lutemon selectedLutemon;
    public interface ILutemonCheckedChangeListener{
        void lutemonCheckedChanged (Lutemon lutemon, boolean isChecked);
    }

    public void checkButtons(){

    }


    public static class MyViewHolder extends RecyclerView.ViewHolder {
        CheckBox checkBox;

        public MyViewHolder(View view) {
            super(view);
            checkBox = view.findViewById(R.id.checkbox);
        }
    }
    public AdapterFragment(Context context, ArrayList<Lutemon> lutemons, ILutemonCheckedChangeListener listener) {
        this.context = context;
        this.lutemons = lutemons;
        this.listener = listener;
    }

    public Lutemon getSelectedLutemon() {
        return selectedLutemon;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(parent.getContext())
                .inflate(R.layout.checkbox_view, parent, false));
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.checkBox.setText(lutemons.get(position).getName());
        holder.checkBox.setOnCheckedChangeListener((btn, isChecked) -> listener.lutemonCheckedChanged(lutemons.get(position), isChecked));
    }

    @Override
    public int getItemCount() {

        return lutemons.size();
    }
}
