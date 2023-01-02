package com.example.viewpager_2_sa

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.viewpager_2_sa.databinding.FragmentNumberBinding

const val ARG = "arg"

class NumberFragment : Fragment(R.layout.fragment_number) {

    private val binding by viewBinding(FragmentNumberBinding::bind)

//    override fun onCreateView(
//        inflater: LayoutInflater, container: ViewGroup?,
//        savedInstanceState: Bundle?
//    ): View? {
//        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.fragment_number, container, false)
//    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        arguments?.takeIf { it.containsKey(ARG) }?.apply {
            
        }

    }


}