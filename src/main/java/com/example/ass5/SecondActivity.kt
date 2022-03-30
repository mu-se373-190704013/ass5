package com.example.ass5

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val button = findViewById<Button>(R.id.button) //we define the page that will be opened by pressing the button
        button.setOnClickListener {


            val intent = Intent(this, MainActivity::class.java) // we define first page
            startActivity(intent)
        }
    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean { //we define option menu
        menuInflater.inflate(R.menu.menu,menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId){
            R.id.about -> Toast.makeText(this,"About Selected", Toast.LENGTH_SHORT).show()  // define selected button
            R.id.settings -> Toast.makeText(this,"Settings Selected", Toast.LENGTH_SHORT).show() // define settings button
            R.id.exit -> Toast.makeText(this,"Exit Selected", Toast.LENGTH_SHORT).show() // define exit button
        }
        return super.onOptionsItemSelected(item)
    }
}