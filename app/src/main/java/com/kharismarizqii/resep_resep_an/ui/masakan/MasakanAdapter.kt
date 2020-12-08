package com.kharismarizqii.resep_resep_an.ui.masakan

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.kharismarizqii.resep_resep_an.databinding.ItemMasakanBinding
import com.kharismarizqii.resep_resep_an.model.Masakan
import com.squareup.picasso.Picasso

class MasakanAdapter(private val list: ArrayList<Masakan>) :
    RecyclerView.Adapter<MasakanAdapter.RecipeViewHolder>() {

    private lateinit var onItemClickCallback: OnItemClickCallback

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

    inner class RecipeViewHolder(private val itemBinding: ItemMasakanBinding) :
        RecyclerView.ViewHolder(itemBinding.root) {
        fun bind(masakan: Masakan) {
            Picasso.get().load(masakan.image).fit().centerCrop().into(itemBinding.ivJenisMasakan)
            itemBinding.tvJenisMasakan.text = masakan.nama

            itemBinding.root.setOnClickListener {
                onItemClickCallback.onItemClick(masakan)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecipeViewHolder {
        val binding = ItemMasakanBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return RecipeViewHolder(binding)
    }

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: RecipeViewHolder, position: Int) {
        holder.bind(list[position])
    }

    interface OnItemClickCallback {
        fun onItemClick(masakan: Masakan)
    }

}