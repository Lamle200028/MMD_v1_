package com.example.mmd_v1.ui.ListEquitment

import android.content.Intent
import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.mmd_v1.MainActivity
import com.example.mmd_v1.R
import com.example.mmd_v1.databinding.FragmentListEquitmentBinding
import com.example.mmd_v1.ui.ImforEquitment.ImforEquitmentFragment
import com.example.mmd_v1.ui.home.HomeFragment

class ListEquitmentFragment : Fragment() {

    lateinit var linearLayout: LinearLayout
    lateinit var linearLayoutManager : LinearLayoutManager
    lateinit var adapterEquitment: AdapterEquitment

    var _binding : FragmentListEquitmentBinding? = null
    private val binding get() = _binding!!
    companion object {
        fun newInstance() = ListEquitmentFragment()
    }

    private lateinit var viewModel: ListEquitmentViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentListEquitmentBinding.inflate(inflater, container, false)
        viewModel = ViewModelProvider(this).get(ListEquitmentViewModel::class.java)
        viewModel.getdata()
        val ryc: RecyclerView = binding.rcvListDevice
        ryc?.setHasFixedSize(true)
        linearLayoutManager = LinearLayoutManager(requireContext())
        ryc?.layoutManager = linearLayoutManager

        viewModel.equitment.observe(viewLifecycleOwner){
            adapterEquitment = AdapterEquitment(requireContext(), it.data?.data!!)
            adapterEquitment!!.notifyDataSetChanged()
            ryc?.adapter = adapterEquitment
            adapterEquitment.setitemonclicklistner(object : onclicklist {
                override fun onclickitem(position: Int) {
                    viewModel.setclickitem()

                }
            })
            viewModel.clickitem.observe(viewLifecycleOwner){
                if (it){
                    val fragmentB = ImforEquitmentFragment()
                    val fragmentManager = requireActivity().supportFragmentManager
                    val Transaction = fragmentManager.beginTransaction()
                    Transaction.replace(R.id.conteainer1, fragmentB)
                    Transaction.addToBackStack(null)
                    Transaction.commit()
                }

            }
        }
        binding.backlistDevice.setOnClickListener(){
            viewModel.setclickback()
        }
        viewModel.backstact.observe(viewLifecycleOwner){
            if(it){
                var intent = Intent(requireContext(), MainActivity::class.java)
                startActivity(intent)
            }
        }

        return _binding!!.root
    }




}