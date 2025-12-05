package com.dersnotu.myapplication

object InputValidator {
    // Bu fonksiyon, girilen email ve şifrenin geçerli olup olmadığını kontrol eder
    fun isLoginInputValid(email: String, pass: String): Boolean {
        return email.isNotEmpty() && pass.length >= 6
    }
}