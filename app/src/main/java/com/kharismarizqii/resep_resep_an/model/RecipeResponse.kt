package com.kharismarizqii.resep_resep_an.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

data class RecipeResponse (
    val jenis_masakan : ArrayList<Masakan>
)