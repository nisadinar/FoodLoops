package com.tegarap.foodloops

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        btn_login.setOnClickListener { login() }
    }

    fun login(){
        if(isValid(et_email.text.toString(),et_password.text.toString())){
            Snackbar.make(btn_login,"Login Berhasil",Snackbar.LENGTH_LONG)
                .setAction("Action",null).show()
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }else{
            Snackbar.make(btn_login,"Login Gagal",Snackbar.LENGTH_LONG)
                .setAction("Action",null).show()
        }
    }
    fun isValid(email: String, password:String): Boolean{
        return (email == "tegar@pos.com" && password == "aditia")
    }
}
