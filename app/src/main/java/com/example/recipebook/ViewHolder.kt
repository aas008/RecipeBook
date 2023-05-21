package com.example.recipebook

import android.app.LauncherActivity
import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

abstract class BaseViewHolder (
    containerView: View
) : RecyclerView.ViewHolder(containerView){

    abstract fun bindData(listItem: LauncherActivity.ListItem)
}

class TitleViewHolder (containerView: View): BaseViewHolder (containerView) {
    private val titleView: TextView
            by lazy { containerView.findViewById(R.id.title_label) }

    override fun bindData(listItem: Listitem) {
        titleView.text = (listItem as TitleUiModel).title
    }
}
class RecipeViewHolder (
    containerView: View,
    private val onClickListener: OnClickListener) :
    BaseViewHolder (containerView) {
    private val titleView: TextView
            by lazy { containerView.findViewById(R.id.main_recipe_title) }

    override fun bindData(listItem: LauncherActivity.ListItem) {
        titleView.text = (listItem as RecipeUiModel).title
        titleView.setOnClickListener {
            onClickListener.onClick(listItem)
        }
    }

    interface OnClickListener{
    fun onClick(recipe: RecipeUiModel)
    }
}