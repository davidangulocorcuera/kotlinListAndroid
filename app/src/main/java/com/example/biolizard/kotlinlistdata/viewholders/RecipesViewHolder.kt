package com.example.biolizard.kotlinlistdata.viewholders

import android.support.v7.widget.RecyclerView
import android.view.View
import butterknife.BindView;
import butterknife.ButterKnife;
import android.widget.EditText
import com.example.biolizard.kotlinlistdata.R



class RecipesViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        @BindView(R.id.recipe_name) lateinit var et_name: EditText
        @BindView(R.id.recipe_address) lateinit var et_address: EditText
        @BindView(R.id.recipe_description) lateinit var et_description: EditText

    init {
        ButterKnife.bind(this, itemView)
    }

}