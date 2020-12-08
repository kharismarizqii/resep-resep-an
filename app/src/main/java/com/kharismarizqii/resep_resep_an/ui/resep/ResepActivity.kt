package com.kharismarizqii.resep_resep_an.ui.resep

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.kharismarizqii.resep_resep_an.databinding.ActivityResepBinding
import com.kharismarizqii.resep_resep_an.model.Masakan
import com.kharismarizqii.resep_resep_an.model.Resep
import com.kharismarizqii.resep_resep_an.ui.detail.ResepDetailActivity

class ResepActivity : AppCompatActivity() {
    
    companion object{
        const val EXTRA_RESEP = "extra_resep"
    }

    private lateinit var binding : ActivityResepBinding
    private lateinit var list: ArrayList<Resep>
    private lateinit var adapter : ResepAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResepBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.hide()

        val masakan = intent.getParcelableExtra<Masakan>(EXTRA_RESEP)
        binding.tvMasakanTitle.text = "Resep ${masakan.nama}"
        list = masakan.list_resep
        adapter = ResepAdapter(list)
        adapter.setOnItemClickCallback(object : ResepAdapter.OnItemClickCallback{
            override fun onItemClick(resep: Resep) {
                Intent(this@ResepActivity, ResepDetailActivity::class.java).also {
                    it.putExtra(ResepDetailActivity.EXTRA_RESEP, resep)
                    startActivity(it)
                }
            }

        })

        setRecyclerView()
    }

    private fun setRecyclerView() {
         binding.apply {
            rvRecipe.setHasFixedSize(true)
            rvRecipe.layoutManager = LinearLayoutManager(this@ResepActivity)
            rvRecipe.adapter = adapter
        }
    }
}