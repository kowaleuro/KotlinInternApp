package com.example.kotlininternapp.view

import android.R.attr.defaultValue
import android.R.attr.key
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.findNavController
import com.example.kotlininternapp.R
import com.example.kotlininternapp.databinding.FragmentFinalDestinationBinding
import com.example.kotlininternapp.viewModel.MainViewModel
import java.nio.channels.Selector


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [FinalDestination.newInstance] factory method to
 * create an instance of this fragment.
 */

class FinalDestination : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null
    private val sharedViewModel:MainViewModel by activityViewModels()
    private lateinit var binding: FragmentFinalDestinationBinding
    private lateinit var itemSelector: Selector

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = FragmentFinalDestinationBinding.inflate(layoutInflater)

        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }

        val bundle = this.arguments
        if (bundle != null) {
            val myInt = bundle.getInt(key.toString(), defaultValue)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = binding.root
        sharedViewModel.liveData.observe(viewLifecycleOwner,{liveData ->

            binding.tvMisfit.setText(liveData)

        })

        val button = binding.backButton
        button.setOnClickListener{
            view.findNavController().navigate(R.id.navigateToMain)
        }

        return view
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment FinalDestination.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            FinalDestination().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}