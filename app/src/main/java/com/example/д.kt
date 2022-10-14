package com.example

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication26657.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanseState: Bundle?) {
        super.onCreate(savedInstanseState)
        setContentView(R.layout.activity_main)
        val commit = supportFragmentManager
            .beginTransaction()
            .replace(R.layout.activity_main)
    }
}

private fun Any.replace(activityMain: Int) {

}












