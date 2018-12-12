package com.example.biolizard.kotlinlistdata.lists

import com.example.biolizard.kotlinlistdata.viewholders.RecipesViewHolder

interface RecipesListAdapterListener {
     fun modulesListAdapterCellClicked(recipesViewHolder: RecipesViewHolder)
    }