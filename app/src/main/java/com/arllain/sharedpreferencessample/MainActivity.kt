package com.arllain.sharedpreferencessample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.preference.PreferenceManager

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val sp = PreferenceManager.getDefaultSharedPreferences(this)
        sp.edit().clear().apply()

        supportFragmentManager.beginTransaction()
                .replace(R.id.root, SettingsFragment())
                .commit()

//        findViewById<Button>(R.id.btnWrite).setOnClickListener {
//            writeOnSharedPreferences()
//        }
//
//        findViewById<Button>(R.id.btnRead).setOnClickListener {
//            readOnSharedPreferences()
//        }

    }

//    private fun writeOnSharedPreferences() {
//        val sp = getSharedPreferences("my_share_prefs", Context.MODE_PRIVATE)
//
//        sp.edit()
//            .putString("key_last_user_name", "Arllain")
//            .putBoolean("night_mode", true)
//            .apply()
//    }
//
//    private fun readOnSharedPreferences() {
//        val sp = getSharedPreferences("my_share_prefs", Context.MODE_PRIVATE)
//        val nightMode = sp.getBoolean("night_mode", false)
//        val last_user_name = sp.getString("key_last_user_name", "")
//
//        findViewById<TextView>(R.id.tvResult).text = "Night mode: $nightMode - last user name: $last_user_name"
//    }

}

