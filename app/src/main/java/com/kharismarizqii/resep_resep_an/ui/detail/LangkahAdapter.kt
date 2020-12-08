package com.kharismarizqii.resep_resep_an.ui.detail

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.kharismarizqii.resep_resep_an.databinding.ItemLangkahBinding
import com.kharismarizqii.resep_resep_an.model.Resep

class LangkahAdapter(private val list: ArrayList<Resep.Langkah>) :
    RecyclerView.Adapter<LangkahAdapter.RecipeViewHolder>() {

    inner class RecipeViewHolder(private val itemBinding: ItemLangkahBinding) :
        RecyclerView.ViewHolder(itemBinding.root) {
        fun bind(langkah: Resep.Langkah) {
            itemBinding.tvLangkah.text = "Langkah ${langkah.langkah}"
            itemBinding.tvDesc.text = langkah.deskripsi
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecipeViewHolder {
        val binding = ItemLangkahBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return RecipeViewHolder(binding)
    }

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: RecipeViewHolder, position: Int) {
        holder.bind(list[position])
    }

}