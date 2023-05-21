package com.example.recipebook.model;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.recipebook.R;

public class FlavorTitleViewHolder extends RecyclerView.ViewHolder {
    private ImageView flavorIcon;
    private TextView flavorTitle;

    public FlavorTitleViewHolder(View itemView) {
        super(itemView);
        flavorTitle = itemView.findViewById(R.id.flavorTitle);
    }

    public void bind(FlavorTitle flavorTitleItem) {
        flavorTitle.setText(flavorTitleItem.getTitle());
    }
}
