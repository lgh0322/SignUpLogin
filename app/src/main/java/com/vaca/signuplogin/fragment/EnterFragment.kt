package com.vaca.signuplogin.fragment

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat
import androidx.core.widget.doAfterTextChanged
import androidx.fragment.app.Fragment


class EnterFragment : Fragment() {

    lateinit var bind: FeedbackFragmentBinding


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        bind = FeedbackFragmentBinding.inflate(inflater, container, false)


        return bind.root
    }

    override fun onStart() {
        super.onStart()
    }

}