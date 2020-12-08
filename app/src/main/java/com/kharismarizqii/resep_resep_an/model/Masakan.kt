package com.kharismarizqii.resep_resep_an.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Masakan(
    val id: String,
    val nama: String,
    val image: String,
    val list_resep: ArrayList<Resep>
): Parcelable