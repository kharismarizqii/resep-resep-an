package com.kharismarizqii.resep_resep_an

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Recipe(
    val name: String,
    val image: String,
    val rating: Double,
    val ingredients: String,
    val guide: String
):Parcelable