package com.kharismarizqii.resep_resep_an.utils

import android.util.Patterns
import android.widget.EditText

object Helper {

    fun EditText.formError(message: String){
        error = message
        requestFocus()
    }
}