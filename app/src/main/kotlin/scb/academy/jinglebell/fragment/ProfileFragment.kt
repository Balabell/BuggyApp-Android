package scb.academy.jinglebell.fragment

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_welcome_profile.*
import kotlinx.android.synthetic.main.fragment_profile.*
import kotlinx.android.synthetic.main.fragment_profile.view.*
import scb.academy.jinglebell.R
import scb.academy.jinglebell.activity.WelcomeProfileActivity
import android.R.id.message







class ProfileFragment : Fragment() {

     var KEY_NAME :String = ""

    private val name: String? = null
//
//    fun newInstance(message: String, number: Int): ProfileFragment {
//        val fragment = MyFragment()
//        val bundle = Bundle()
//        bundle.putString(KEY_NAME, message)
//        fragment.setArguments(bundle)
//        return fragment
//    }
//
//    fun MyFragment():  {}




    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val _view = inflater.inflate(scb.academy.jinglebell.R.layout.fragment_profile, container, false)


        _view.submitButton.setOnClickListener {

            //KEY_NAME = usernameEditText.text.toString()
            Log.d("ssss", "ddddd")


            val intent = Intent (getActivity(), WelcomeProfileActivity::class.java)

            intent.putExtra("KEY_NAME", usernameEditText.text.toString())

            startActivity(intent)
        }

        return _view

    }
}
