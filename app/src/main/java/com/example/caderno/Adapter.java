package com.example.caderno;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class Adapter extends RecyclerView.ViewHolder implements View.OnClickListener {

    public Itemclicklistener listener;
    private final Context context;
    public TextView pdftitle;
    public ImageView downlaod;


    public Adapter(@NonNull View itemView) {
        super(itemView);
        context= itemView.getContext();
        pdftitle = itemView.findViewById(R.id.pdftv);
        downlaod=itemView.findViewById(R.id.pdfimg2);
    }

    @Override
    public void onClick(View view) {

        listener.onClick(view, getAdapterPosition(), false);

    }
}
