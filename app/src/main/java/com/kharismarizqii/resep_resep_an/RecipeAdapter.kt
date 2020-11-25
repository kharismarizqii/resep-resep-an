package com.kharismarizqii.resep_resep_an

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.kharismarizqii.resep_resep_an.databinding.ItemRecipeBinding
import com.squareup.picasso.Picasso

class RecipeAdapter(private val list: ArrayList<Recipe>) : RecyclerView.Adapter<RecipeAdapter.RecipeViewHolder>() {

    private lateinit var onItemClickCallback: OnItemClickCallback

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

    inner class RecipeViewHolder(private val itemBinding: ItemRecipeBinding) :
        RecyclerView.ViewHolder(itemBinding.root) {
        fun bind(recipe: Recipe) {
            Picasso.get().load(recipe.image).fit().centerCrop().into(itemBinding.ivRecipe)
            itemBinding.tvRating.text = recipe.rating.toString()
            itemBinding.tvRecipeName.text = recipe.name

            itemBinding.root.setOnClickListener {
                onItemClickCallback.onItemClick(recipe)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecipeViewHolder {
        val binding = ItemRecipeBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return RecipeViewHolder(binding)
    }

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: RecipeViewHolder, position: Int) {
        holder.bind(list[position])
    }

    interface OnItemClickCallback{
        fun onItemClick(recipe: Recipe)
    }

}