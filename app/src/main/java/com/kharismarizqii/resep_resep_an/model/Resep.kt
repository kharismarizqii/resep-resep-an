package com.kharismarizqii.resep_resep_an.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Resep(
    val id: String,
    val nama: String,
    val waktu: String,
    val image: String,
    val porsi: Int,
    val gizi: Gizi,
    val rating: Double,
    val desc: String,
    val bahan: String,
    val cara: ArrayList<Langkah>
): Parcelable {
    @Parcelize
    data class Gizi(
        val kalori: Int,
        val protein: Int,
        val karbo: Int,
        val lemak: Int,
        val serat: Int
    ): Parcelable

    @Parcelize
    data class Langkah(
        val langkah: Int,
        val deskripsi: String
    ): Parcelable
}