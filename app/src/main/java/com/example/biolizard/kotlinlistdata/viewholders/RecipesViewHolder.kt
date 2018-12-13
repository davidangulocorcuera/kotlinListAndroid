package com.example.biolizard.kotlinlistdata.viewholders

import android.os.Bundle
import android.support.v7.widget.RecyclerView
import android.view.View
import butterknife.BindView;
import butterknife.ButterKnife;
import android.widget.EditText
import android.widget.TextView
import com.example.biolizard.kotlinlistdata.R


class RecipesViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    init {
        ButterKnife.bind(this, itemView)
    }

        @BindView(R.id.recipe_name) lateinit var tv_name: TextView
        @BindView(R.id.recipe_address) lateinit var tv_address: TextView
        @BindView(R.id.recipe_description) lateinit var tv_description: TextView





}