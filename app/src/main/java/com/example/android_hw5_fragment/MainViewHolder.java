package com.example.android_hw5_fragment;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

public class MainViewHolder extends RecyclerView.ViewHolder {
    TextView textView;
    TextView textView1;
    ConstraintLayout colyanka;



    public MainViewHolder(@NonNull View itemView) {
        super(itemView);
        textView = itemView.findViewById(R.id.textcolyanka);
        textView1 = itemView.findViewById(R.id.cena);
        colyanka = itemView.findViewById(R.id.cons_item1);
    }


    public void onBind(ItemModel data) {
        textView.setText(data.textcolyanka);
        textView1.setText(data.cena);
        colyanka.setBackgroundResource(data.colyanka);
    }
}
