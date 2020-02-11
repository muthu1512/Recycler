package com.example.recycler;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class adapter extends RecyclerView.Adapter<adapter.cardViewHolder> {
    ArrayList<constr> c1;

    public adapter(ArrayList<constr> c1) {
        this.c1 = c1;
    }

    @NonNull
    @Override
    public cardViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview,parent,false);
       cardViewHolder ch=new cardViewHolder(v);
       return ch;
    }

    @Override
    public void onBindViewHolder(@NonNull cardViewHolder holder, int position) {
    holder.img.setImageResource(c1.get(position).getImg());
    holder.txt2.setText(c1.get(position).getT1());
    }

    @Override
    public int getItemCount() {
        return c1.size();
    }

    public class cardViewHolder extends RecyclerView.ViewHolder{
        ImageView img;
        TextView txt2;
        public cardViewHolder(@NonNull View itemView) {
            super(itemView);
            img=itemView.findViewById(R.id.img1);
            txt2=itemView.findViewById(R.id.txtv);

        }
    }
}
