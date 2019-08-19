package scb.academy.jinglebell.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_welcome_profile.*
import scb.academy.jinglebell.R

class WelcomeProfileActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome_profile)

        var userWallet = intent?.getStringExtra("KEY_NAME").toString()

        profileName.text = userWallet

    }

}
