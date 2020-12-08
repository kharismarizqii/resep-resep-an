package com.kharismarizqii.resep_resep_an.ui.masakan

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.kharismarizqii.resep_resep_an.databinding.ActivityMasakanBinding
import com.kharismarizqii.resep_resep_an.model.Masakan
import com.kharismarizqii.resep_resep_an.model.RecipeResponse
import com.kharismarizqii.resep_resep_an.ui.resep.ResepActivity
import com.kharismarizqii.resep_resep_an.utils.getJsonDataFromAsset

class MasakanActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMasakanBinding
    private lateinit var adapter : MasakanAdapter
    private var list : ArrayList<Masakan> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMasakanBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.hide()

        getData()

    }

    private fun getData() {
        val listMasakan = getRecipeResults(applicationContext)
        list.addAll(listMasakan.jenis_masakan)
        adapter = MasakanAdapter(list)
        adapter.setOnItemClickCallback(object : MasakanAdapter.OnItemClickCallback{
            override fun onItemClick(masakan: Masakan) {
                Intent(this@MasakanActivity, ResepActivity::class.java).also {
                    it.putExtra(ResepActivity.EXTRA_RESEP, masakan)
                    startActivity(it)
                }
            }

        })
        setRecyclerView()

    }

    private fun setRecyclerView() {
        binding.apply {
            rvMasakan.setHasFixedSize(true)
            rvMasakan.layoutManager = LinearLayoutManager(this@MasakanActivity)
            rvMasakan.adapter = adapter
        }
    }

    private fun getRecipeResults(mCtx: Context) : RecipeResponse {
        val jsonFileString = getJsonDataFromAsset(mCtx, "resep.json")
        Log.i("data", jsonFileString)

        val gson = Gson()
        val listMasakanType = object : TypeToken<RecipeResponse>() {}.type

        val recipeResponse : RecipeResponse = gson.fromJson(jsonFileString, listMasakanType)
        return recipeResponse
    }
}