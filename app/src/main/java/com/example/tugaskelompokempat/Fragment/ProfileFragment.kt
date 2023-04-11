package com.example.tugaskelompokempat.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.tugaskelompokempat.R
import com.example.tugaskelompokempat.databinding.FragmentProfileBinding

class ProfileFragment : Fragment() {
     lateinit var binding : FragmentProfileBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentProfileBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val getName = arguments?.getString("Username")
        binding.tvTampilUsername.text = getName

            binding.btnLogout.setOnClickListener{
                findNavController().navigate(R.id.action_profileFragment_to_login)
            }
        }
    }