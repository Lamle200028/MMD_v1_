package com.example.mmd_v1.ui.ImforEquitment

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.mmd_v1.R
import com.example.mmd_v1.databinding.FragmentImforEquitmentBinding

class ImforEquitmentFragment : Fragment() {

    companion object {
        fun newInstance() = ImforEquitmentFragment()
    }

    var _binding : FragmentImforEquitmentBinding? = null
    private val binding get() = _binding!!

    private lateinit var viewModel: ImforEquitmentViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentImforEquitmentBinding.inflate(inflater, container, false)


        return _binding!!.root
    }


}