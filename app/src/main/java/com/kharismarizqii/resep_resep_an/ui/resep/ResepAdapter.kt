package com.kharismarizqii.resep_resep_an.ui.resep

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.kharismarizqii.resep_resep_an.databinding.ItemResepBinding
import com.kharismarizqii.resep_resep_an.model.Resep

class ResepAdapter(private val list: ArrayList<Resep>) :
    RecyclerView.Adapter<ResepAdapter.RecipeViewHolder>() {

    private lateinit var onItemClickCallback: OnItemClickCallback

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

    inner class RecipeViewHolder(private val itemBinding: ItemResepBinding) :
        RecyclerView.ViewHolder(itemBinding.root) {
        fun bind(resep: Resep) {
            itemBinding.tvNamaResep.text = resep.nama

            itemBinding.root.setOnClickListener {
                onItemClickCallback.onItemClick(resep)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecipeViewHolder {
        val binding = ItemResepBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return RecipeViewHolder(binding)
    }

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: RecipeViewHolder, position: Int) {
        holder.bind(list[position])
    }

    interface OnItemClickCallback {
        fun onItemClick(resep: Resep)
    }

}