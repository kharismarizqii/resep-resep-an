package com.kharismarizqii.resep_resep_an.data

import android.content.Context
import android.util.Log
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.kharismarizqii.resep_resep_an.model.RecipeResponse
import com.kharismarizqii.resep_resep_an.utils.getJsonDataFromAsset

class RecipeRepository{

    fun getRecipeResults(mCtx: Context) : RecipeResponse{
        val jsonFileString = getJsonDataFromAsset(mCtx, "bezkoder.json")
        Log.i("data", jsonFileString)

        val gson = Gson()
        val listMasakanType = object : TypeToken<RecipeResponse>() {}.type

        val recipeResponse : RecipeResponse = gson.fromJson(jsonFileString, listMasakanType)
        return recipeResponse
    }
}