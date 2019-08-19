package scb.academy.jinglebell.activity

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import scb.academy.jinglebell.R
import scb.academy.jinglebell.fragment.CountryListFragment
import scb.academy.jinglebell.fragment.ProfileFragment
import scb.academy.jinglebell.fragment.SongListFragment

class WelcomeProfileActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome_profile)

        //var userWallet = intent?.getStringExtra(KEY_NAME).toString()

//        val name = intent.getStringExtra("name")

        Log.d("ttt", "name is :")

        // Creating the new Fragment with the name passed in.
        //val fragment = ProfileFragment.newInstance(name)

    }

}
