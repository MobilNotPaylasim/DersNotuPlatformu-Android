package com.dersnotu.myapplication

import org.junit.Test
import org.junit.Assert.*

class LoginUnitTest {

    @Test
    fun email_ve_sifre_dogruysa_true_donmeli() {
        // Doğru formatta veri gönderiyoruz, sonucun TRUE olmasını bekliyoruz
        val sonuc = InputValidator.isLoginInputValid("test@gmail.com", "123456")
        assertTrue(sonuc)
    }

    @Test
    fun sifre_kisa_ise_false_donmeli() {
        // Şifre 6 karakterden kısa, sonucun FALSE olmasını bekliyoruz
        val sonuc = InputValidator.isLoginInputValid("test@gmail.com", "123")
        assertFalse(sonuc)
    }

    @Test
    fun email_bos_ise_false_donmeli() {
        // Email boş, sonucun FALSE olmasını bekliyoruz
        val sonuc = InputValidator.isLoginInputValid("", "123456")
        assertFalse(sonuc)
    }
}