package com.example.mmd_v1.ui.dashboard

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.mmd_v1.databinding.FragmentDashboardBinding
import com.example.mmd_v1.ui.ListEquitment.AdapterEquitment

class DashboardFragment : Fragment() {

    private var _binding: FragmentDashboardBinding? = null
    var linearLayoutManager : LinearLayoutManager? = null
    var adapterDevice : AdapterEquitment? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val dashboardViewModel =
            ViewModelProvider(this).get(DashboardViewModel::class.java)

        _binding = FragmentDashboardBinding.inflate(inflater, container, false)
        val root: View = binding.root

        dashboardViewModel.getdata()

        val ryc: RecyclerView = binding.lcyEquitment
        ryc?.setHasFixedSize(true)
        linearLayoutManager = LinearLayoutManager(requireContext())
        ryc?.layoutManager = linearLayoutManager



        dashboardViewModel.equitment.observe(viewLifecycleOwner) {
            adapterDevice = AdapterEquitment(requireContext(), it.data?.data!!)
            adapterDevice!!.notifyDataSetChanged()
            ryc?.adapter = adapterDevice
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}