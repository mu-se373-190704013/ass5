package com.example.ass5

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ImageView
import android.widget.ListView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var oroPic = findViewById<View>(R.id.imageView) as ImageView // we define imageview
        val button1 = findViewById<Button>(R.id.button4)// we define the button for adding an image
        button1.setOnClickListener () {
            oroPic.setBackgroundResource(R.mipmap.ic_launcher_round); //we define the image we add with the button
        }


        val button = findViewById<Button>(R.id.button2) //we define the page that will be opened by pressing the button
        button.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java) // we define second page
            startActivity(intent)
        }


       // use arrayadapter and define an array
        val arrayAdapter: ArrayAdapter<*>
        val users = arrayOf(
            "Mehmet", "Tunahan", "Değirmenci"
        )

        // access the listView from xml file
        var mListView = findViewById<ListView>(R.id.userlist) // we define the list
        arrayAdapter = ArrayAdapter(this,
            android.R.layout.simple_list_item_1, users)
        mListView.adapter = arrayAdapter
    }

}