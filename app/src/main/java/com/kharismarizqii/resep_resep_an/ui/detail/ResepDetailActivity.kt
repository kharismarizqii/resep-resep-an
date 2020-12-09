package com.kharismarizqii.resep_resep_an.ui.detail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.kharismarizqii.resep_resep_an.databinding.ActivityResepDetailBinding
import com.kharismarizqii.resep_resep_an.model.Resep
import com.squareup.picasso.Picasso

class ResepDetailActivity : AppCompatActivity() {

    companion object{
        const val EXTRA_RESEP ="extra_recipe"
    }

    private lateinit var binding : ActivityResepDetailBinding
    private lateinit var adapter : LangkahAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResepDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.hide()

        val resep = intent.getParcelableExtra<Resep>(
            EXTRA_RESEP
        )
        adapter = LangkahAdapter(resep.cara)
        setData(resep)
        binding.btnBack.setOnClickListener {
            finish()
        }
    }

    private fun setData(resep: Resep?) {
        val gizi = resep?.gizi
        binding.apply {
            tvName.text = resep?.nama
            tvWaktu.text = resep?.waktu
            tvRating.text = resep?.rating.toString()
            tvKarbo.text = "${gizi?.karbo.toString()} gram"
            tvKalori.text = "${gizi?.kalori} kkal"
            tvProtein.text = "${gizi?.protein} gram"
            tvLemak.text = "${gizi?.lemak} gram"
            tvSerat.text = if(gizi?.serat == 0) "-" else "${gizi?.serat} gram"
            tvDesc.text = resep?.desc
            tvBahan.text = resep?.bahan
            setCaraMembuat()
            Picasso.get().load(resep?.image).fit().centerCrop().into(ivRecipe)
        }
    }

    private fun setCaraMembuat() {
        binding.apply {
            rvLangkah.setHasFixedSize(true)
            rvLangkah.layoutManager = LinearLayoutManager(this@ResepDetailActivity, LinearLayoutManager.HORIZONTAL, false)
            rvLangkah.adapter = adapter
        }
    }
}