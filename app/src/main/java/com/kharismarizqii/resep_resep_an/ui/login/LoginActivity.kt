package com.kharismarizqii.resep_resep_an.ui.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kharismarizqii.resep_resep_an.R
import com.kharismarizqii.resep_resep_an.databinding.ActivityLoginBinding
import com.kharismarizqii.resep_resep_an.ui.masakan.MasakanActivity
import com.kharismarizqii.resep_resep_an.utils.Helper.formError

class LoginActivity : AppCompatActivity() {

    private lateinit var binding : ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.hide()

        binding.btnLogin.setOnClickListener {
            val username = binding.etUsername.text.toString().trim()
            val password = binding.etPassword.text.toString().trim()

            val userEmail = getString(R.string.username)
            val userPassword = getString(R.string.password)
            if (username==userEmail && password==userPassword){
                login()
            }else{
                binding.etUsername.formError("username/password salah")
                binding.etPassword.formError("username/password salah")
            }
        }
    }

    private fun login() {
        Intent(this@LoginActivity, MasakanActivity::class.java).also {intent ->
            intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_NEW_TASK
            startActivity(intent)
        }
    }
}