package com.example.apps_skripsi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.apps_skripsi.fragments.ChatFragment
import com.example.apps_skripsi.fragments.HomeFragment
import com.example.apps_skripsi.fragments.LayananFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val homeFragment = HomeFragment()
        val layananFragment = LayananFragment()
        val chatFragment = ChatFragment()

        makeCurrentFragmant(homeFragment)
        btn_nav.setOnNavigationItemSelectedListener {
            when(it.itemId){
                R.id.ic_home -> makeCurrentFragmant(homeFragment)
                R.id.ic_layanan -> makeCurrentFragmant(layananFragment)
                R.id.ic_chat -> makeCurrentFragmant(chatFragment)
            }
            true
        }
    }

    private fun makeCurrentFragmant(fragment: Fragment) =
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fl_wrapper, fragment)
            commit()
        }
}
