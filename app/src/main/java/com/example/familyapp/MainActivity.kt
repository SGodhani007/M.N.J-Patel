package com.example.familyapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        var bottomBar = findViewById<BottomNavigationView>(R.id.bottom_bar)
        bottomBar.setOnItemSelectedListener {it->



            if(it.itemId==R.id.nav_guard){
                inflatefragment(GuardFragment.newInstance())
            }
            else if(it.itemId==R.id.nav_home){
                inflatefragment(HomeFragment.newInstance())
            }
            else if(it.itemId==R.id.nav_dashboard) {
                inflatefragment(DashboardFragment.newInstance())
            }
            else if(it.itemId==R.id.nav_profile){
                inflatefragment(ProfileFragment.newInstance())
            }
            true

        }



//    fun openscreen(view: View) {
//        val intent = Intent(this,GuardActivity::class.java)
//        startActivity(intent)
//
//    }

//    fun add(view: View) {
//
//        var numa = findViewById<EditText>(R.id.num1)
//        var numb = findViewById<EditText>(R.id.num2)
//        var tv = findViewById<TextView>(R.id.tv)
//        var valueA = numa.text.toString().toInt()
//        var valueB = numb.text.toString().toInt()
//        var sum = valueA+valueB
//        Toast.makeText(this, "Button Clicked Sum is : $sum", Toast.LENGTH_SHORT).show()
//        tv.setText("Sum is : $sum")
//    }


    }






    private fun inflatefragment(newInstance: Fragment) {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.container_frag,newInstance)
        transaction.commit()
    }


}