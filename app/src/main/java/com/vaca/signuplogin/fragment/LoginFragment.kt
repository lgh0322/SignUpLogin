package com.vaca.signuplogin.fragment

import android.content.ComponentName
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.inputmethod.InputMethodManager
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.widget.doAfterTextChanged
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.vaca.signuplogin.R
import com.vaca.signuplogin.databinding.FragmentLoginBinding

import com.vaca.signuplogin.databinding.FragmentSignupBinding
import com.vaca.signuplogin.server.BigBoy.mSocket

import java.util.*


class LoginFragment : Fragment() {


    lateinit var binding: FragmentLoginBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding= FragmentLoginBinding.inflate(inflater,container,false)


        binding.login.setOnClickListener {
            mSocket.emit("login",binding.x1.text.toString(),binding.x2.text.toString())
        }

        binding.signup.setOnClickListener {
            findNavController().navigate(R.id.action_loginFragment_to_signup_fragment)
        }



        setDrawable()
        return binding.root
    }









    private fun setDrawable() {
        val drawable = ContextCompat.getDrawable(requireContext(), R.drawable.login_a1)
        drawable?.setBounds(5, 0, 100, 100)
        binding.x1.setCompoundDrawables(drawable, null, null, null)

        val drawable2 = ContextCompat.getDrawable(requireContext(), R.drawable.login_a2)
        drawable2?.setBounds(5, 0, 100, 100)
        binding.x2.setCompoundDrawables(drawable2, null, null, null)
    }
}