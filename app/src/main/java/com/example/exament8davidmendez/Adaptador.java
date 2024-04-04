package com.example.exament8davidmendez;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adaptador extends RecyclerView.Adapter<Adaptador.ViewHolder> {

    ArrayList<Tutor> dataSet;
    public Adaptador(ArrayList<Tutor> dataSet){ this.dataSet = dataSet;}

    public Adaptador.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.materialcardview, parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Adaptador.ViewHolder holder, int position) {
        holder.txtNombre.setText(dataSet.get(position).getNombre());
        holder.txtApellidos.setText(dataSet.get(position).getApellidos());
        holder.txtMail.setText(dataSet.get(position).getMail());
        holder.txtClase.setText(dataSet.get(position).getClase());
    }

    @Override
    public int getItemCount() {
        return dataSet.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView txtNombre, txtApellidos, txtMail, txtClase;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            txtNombre = itemView.findViewById(R.id.txtNombre);
            txtApellidos = itemView.findViewById(R.id.txtApellidos);
            txtMail = itemView.findViewById(R.id.txtMail);
            txtClase = itemView.findViewById(R.id.txtClase);


        }
    }
}
