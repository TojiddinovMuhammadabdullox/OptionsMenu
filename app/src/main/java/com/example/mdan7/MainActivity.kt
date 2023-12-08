package com.example.mdan7

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?. setDisplayHomeAsUpEnabled(true) //orqaga qaytish knopkasi
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        when(item.itemId){
            R.id.setid->{
                Toast.makeText(this, "Settings clicked", Toast.LENGTH_SHORT).show()
                return true
            }
            android.R.id.home->{
                onBackPressed()//ortga tugmasi bosilgan ilovadan chiqib ketadi
            }
        }

        return super.onOptionsItemSelected(item)
    }
}