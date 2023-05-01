package com.main.harjoitusty;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyViewHolder>{

    private Context context;
    private ArrayList<Lutemon> lutemons;



    public MyAdapter(Context context, ArrayList<Lutemon> lutemons) {
        this.context = context;
        this.lutemons = lutemons;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(context).inflate(R.layout.item_view,parent,false));
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.nameView.setText(lutemons.get(position).getName() + " (" + lutemons.get(position).getVari() + ")");
        holder.hyokkaysView.setText(String.valueOf("Hyökkäys: " + lutemons.get(position).getHyokkays()));
        holder.puolustusView.setText(String.valueOf("Puolustus: " + lutemons.get(position).getPuolustus()));
        holder.kokemusView.setText(String.valueOf("Kokemus: " + lutemons.get(position).getKokemus()));
        holder.elamatView.setText(String.valueOf("Elämä:  " + lutemons.get(position).getElamat() +"/ " + lutemons.get(position).getElamat() ));
        holder.LutemonImage.setImageResource(lutemons.get(position).getImage());
    }

    @Override
    public int getItemCount() {

        return lutemons.size();
    }
    public void addNewItem(String name){
        Lutemon newName = new Lutemon(name, "", 0,0,0,0);
        newName.setName(name);
        lutemons.add(newName);
        notifyDataSetChanged();
    }

    public void updateItem(int position, Lutemon updatedItem){
        lutemons.set(position, updatedItem);
        notifyItemChanged(position);
    }


}