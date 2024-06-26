package com.example.empresaalimentos.screens

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.google.firebase.Firebase
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.auth
import kotlinx.coroutines.launch

class LoginScreenViewModel: ViewModel() {
    private val auth: FirebaseAuth = Firebase.auth

    fun signInWithEmailAndPassword(email: String, password: String, home: ()-> Unit)
    =viewModelScope.launch {
        try {
            auth.signInWithEmailAndPassword(email, password)
                .addOnCompleteListener {task ->
                    if (task.isSuccessful){
                        Log.d("EmpresaAlimentos", "signInWithEmailAndPassword logueado")
                        home()
                    }
                    else{
                        Log.d("EmpresaAlimentos", "signInWithEmailAndPassword: ${task.result.toString()}")
                    }

                }
        }
        catch (ex:Exception){
            Log.d("EmpresaAlimentos", "signInWithEmailAndPassword: ${ex.message}")
        }
    }
}