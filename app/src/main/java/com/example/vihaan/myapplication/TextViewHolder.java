package com.example.vihaan.myapplication;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by vihaan on 30/6/15.
 */
public class TextViewHolder  extends RecyclerView.ViewHolder{

    public TextView textView;
    public TextViewHolder(View itemView) {
        super(itemView);
        textView = (TextView)itemView.findViewById(R.id.text);
    }
}
