package com.example.mmd_v1.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.Toast
import androidx.activity.addCallback
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.ViewModelProvider
import com.example.mmd_v1.R
import com.example.mmd_v1.databinding.FragmentHomeBinding
import com.example.mmd_v1.ui.ListEquitment.ListEquitmentFragment


class HomeFragment : Fragment() {
    private var _binding: FragmentHomeBinding? = null
    private var backPressedCount = 0
    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val homeViewModel =
            ViewModelProvider(this).get(HomeViewModel::class.java)

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root

        binding.itemListDevice.setOnClickListener(){
            homeViewModel.setonclick()
        }
        homeViewModel.itemListdevice.observe(viewLifecycleOwner){
            if (it){
                val fragmentB = ListEquitmentFragment()
                val fragmentManager = requireActivity().supportFragmentManager
                val Transaction = fragmentManager.beginTransaction()
                Transaction.replace(R.id.conteainer1, fragmentB)
                Transaction.addToBackStack(null)
                Transaction.commit()
            }
        }
        setBackPressed()

        return root
    }
    private fun setBackPressed(){
        requireActivity().onBackPressedDispatcher.addCallback(viewLifecycleOwner) {
            if (backPressedCount == 1){
                requireActivity().finishAffinity()
            } else {
                backPressedCount++
                Toast.makeText(requireContext(), "Nhấn hai lần để thoát ứng dụng", Toast.LENGTH_SHORT).show()
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}