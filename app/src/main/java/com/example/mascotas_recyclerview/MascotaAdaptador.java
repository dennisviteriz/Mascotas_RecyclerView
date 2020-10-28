package com.example.mascotas_recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MascotaAdaptador extends RecyclerView.Adapter<MascotaAdaptador.MascotaViewholder> {

    ArrayList<Mascota> mascotas;

    public MascotaAdaptador(ArrayList<Mascota> mascotas){

        this.mascotas = mascotas;

    }


    @NonNull
    @Override
    public MascotaViewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v  = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_mascota, parent, false);

        return new MascotaViewholder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MascotaViewholder mascotaViewholder, int position) {

        Mascota mascota = mascotas.get(position);

        mascotaViewholder.imgFoto.setImageResource(mascota.getFoto());
        mascotaViewholder.tvNombreCV.setText(mascota.getNombre());
        mascotaViewholder.tvTelefonoCV.setText(mascota.getNumero());



    }



    @Override
    public int getItemCount() {
        return mascotas.size();
    }

    public static class MascotaViewholder extends RecyclerView.ViewHolder{

        private ImageView imgFoto;
        private TextView tvNombreCV;
        private TextView tvTelefonoCV;

        public MascotaViewholder(View itemView){
            super(itemView);
            imgFoto = (ImageView) itemView.findViewById(R.id.imgFoto);
            tvNombreCV = (TextView) itemView.findViewById(R.id.tvNombreCV);
            tvTelefonoCV = (TextView) itemView.findViewById(R.id.tvTelefonoCV);

        }
    }
}
