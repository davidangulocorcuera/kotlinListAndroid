package com.example.biolizard.kotlinlistdata.lists

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.biolizard.kotlinlistdata.R
import com.example.biolizard.kotlinlistdata.model.Recipe
import com.example.biolizard.kotlinlistdata.viewholders.RecipesViewHolder

class RecipesListAdapter (val items : ArrayList<Recipe>, val context: Context/*, val recipesListAdapterListener: RecipesListAdapterListener*/) : RecyclerView.Adapter<RecipesViewHolder>() {

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): RecipesViewHolder {
        return RecipesViewHolder(LayoutInflater.from(p0.context).inflate(R.layout.recipes_viewholder, p0,false))
    }



    override fun onBindViewHolder(recipesViewHolder: RecipesViewHolder, position: Int) {

        recipesViewHolder.tv_name.setText(items.get(position).name)
        recipesViewHolder.tv_address.setText(items.get(position).place.city)
        recipesViewHolder.tv_description.setText(items.get(position).description)

        /*recipesViewHolder.itemView.setOnClickListener {
            recipesListAdapterListener.modulesListAdapterCellClicked(recipesViewHolder)
        }*/
    }

    override fun getItemCount(): Int {
      return items.size
    }
}