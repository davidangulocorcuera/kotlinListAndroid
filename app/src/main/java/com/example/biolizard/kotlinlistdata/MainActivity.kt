package com.example.biolizard.kotlinlistdata

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.LinearLayoutManager
import com.example.biolizard.kotlinlistdata.lists.RecipesListAdapterListener
import com.example.biolizard.kotlinlistdata.model.Geo
import com.example.biolizard.kotlinlistdata.model.Place
import com.example.biolizard.kotlinlistdata.model.Recipe
import com.example.biolizard.kotlinlistdata.viewholders.RecipesViewHolder
import android.support.v7.widget.RecyclerView
import com.example.biolizard.kotlinlistdata.lists.RecipesListAdapter


class MainActivity : AppCompatActivity(),RecipesListAdapterListener {
   lateinit var recyclerView: RecyclerView
  // lateinit var recipesListAdapterListener: RecipesListAdapterListener

    //E/RecyclerView: No adapter attached; skipping layout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = RecyclerView(this)
        var recipesList: ArrayList<Recipe> = addRecipes()
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = RecipesListAdapter(recipesList, this)
        /*recyclerView = RecyclerView(this)

        var recipesListAdapter = RecipesListAdapter(recipesList,this/*,recipesListAdapterListener*/)
        recyclerView.adapter = recipesListAdapter
        recyclerView.layoutManager = GridLayoutManager(this,1)*/
    }

    fun addRecipes(): ArrayList<Recipe> {
        var recipesList: ArrayList<Recipe> = ArrayList()
        var recipe1 = Recipe("Tarta de queso", Place(Geo(22.7,23.5),"Madrid","Spain"),"Bonita tarta")
        var recipe2 = Recipe("Tarta de cebolla", Place(Geo(26.7,21.5),"León","Spain"),"Bonita tarta")
        recipesList.add(recipe1)
        recipesList.add(recipe2)
        return recipesList
    }
    override fun modulesListAdapterCellClicked(recipesViewHolder: RecipesViewHolder) {
        // Mostrar dialog fragment
    }
}
