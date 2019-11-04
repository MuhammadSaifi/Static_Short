package com.example.static_short

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // this is nothing but just our xml code
        //go to res xml folder where app_shortcut located this is responsible for out static shortuct
        // but remember it will work only in Android Nought 7.1 API Level 25 and above
        //below 25 it will not working
        // also see values/strings.xml
    }
}
