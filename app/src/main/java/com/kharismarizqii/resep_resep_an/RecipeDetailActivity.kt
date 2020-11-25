package com.kharismarizqii.resep_resep_an

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kharismarizqii.resep_resep_an.databinding.ActivityRecipeDetailBinding
import com.squareup.picasso.Picasso

class RecipeDetailActivity : AppCompatActivity() {

    companion object{
        const val EXTRA_RECIPE ="extra_recipe"
    }

    private lateinit var binding : ActivityRecipeDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRecipeDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.hide()

        val recipe = intent.getParcelableExtra<Recipe>(EXTRA_RECIPE)

        setData(recipe)

        binding.btnBack.setOnClickListener {
            finish()
        }
    }

    private fun setData(recipe: Recipe?) {
        binding.apply {
            tvName.text = recipe?.name
            tvGuide.text = recipe?.guide
            tvIngredients.text = recipe?.ingredients
            tvRating.text = recipe?.rating.toString()
            Picasso.get().load(recipe?.image).fit().centerCrop().into(ivRecipe)
        }
    }
}