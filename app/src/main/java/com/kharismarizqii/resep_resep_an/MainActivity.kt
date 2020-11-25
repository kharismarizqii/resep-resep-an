package com.kharismarizqii.resep_resep_an

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.kharismarizqii.resep_resep_an.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding
    private lateinit var adapter : RecipeAdapter
    private var list : ArrayList<Recipe> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.hide()

        getData()

    }

    private fun getData() {
        list.addAll(RecipeData.listData)
        adapter = RecipeAdapter(list)
        adapter.setOnItemClickCallback(object : RecipeAdapter.OnItemClickCallback{
            override fun onItemClick(recipe: Recipe) {
                Intent(this@MainActivity, RecipeDetailActivity::class.java).also {
                    it.putExtra(RecipeDetailActivity.EXTRA_RECIPE, recipe)
                    startActivity(it)
                }
            }

        })
        setRecyclerView()

    }

    private fun setRecyclerView() {
        binding.apply {
            rvRecipe.setHasFixedSize(true)
            rvRecipe.layoutManager = LinearLayoutManager(this@MainActivity)
            rvRecipe.adapter = adapter
        }
    }
}