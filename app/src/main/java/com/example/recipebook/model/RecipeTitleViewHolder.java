package com.example.recipebook.model;

import android.view.View;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.recipebook.R;

public class RecipeTitleViewHolder extends RecyclerView.ViewHolder {
    private TextView recipeTitle;

    public RecipeTitleViewHolder(View itemView) {
        super(itemView);
        recipeTitle = itemView.findViewById(R.id.recipeTitle);
    }

    public void bind(RecipeTitle recipeTitleItem) {
        recipeTitle.setText((CharSequence) recipeTitleItem.getFlavorTitles());
    }
}
