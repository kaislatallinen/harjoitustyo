package com.main.harjoitusty;

import android.view.View;

import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyViewHolder extends RecyclerView.ViewHolder {

    public Lutemon myOperator;


    ImageView LutemonImage;

    public TextView nameView, hyokkaysView, puolustusView, kokemusView, elamatView;

    public MyViewHolder(@NonNull View itemView) {
        super(itemView);
        LutemonImage = itemView.findViewById(R.id.image_view);
        nameView = itemView.findViewById(R.id.name);
        hyokkaysView = itemView.findViewById(R.id.hyokkays);
        puolustusView = itemView.findViewById(R.id.puolustus);
        kokemusView = itemView.findViewById(R.id.kokemus);
        elamatView = itemView.findViewById(R.id.elamat);

        myOperator = new Lutemon("name", "vari", 0, 0, 0, 0);

    }
}
