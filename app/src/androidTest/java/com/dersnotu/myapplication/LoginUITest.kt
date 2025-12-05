package com.dersnotu.myapplication

import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class LoginUITest {

    // Bu kural, test başladığında otomatik olarak LoginActivity'yi açar
    @get:Rule
    val activityRule = ActivityScenarioRule(LoginActivity::class.java)

    @Test
    fun giris_ekrani_elemanlari_gorunuyor_mu() {
        // 1. Email kutusu ekranda görünüyor mu kontrol et
        onView(withId(R.id.emailInput)).check(matches(isDisplayed()))

        // 2. Şifre kutusu ekranda görünüyor mu kontrol et
        onView(withId(R.id.passwordInput)).check(matches(isDisplayed()))

        // 3. Giriş butonu ekranda görünüyor mu kontrol et
        onView(withId(R.id.loginButton)).check(matches(isDisplayed()))
    }
}