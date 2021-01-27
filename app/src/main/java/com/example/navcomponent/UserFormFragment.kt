package com.example.navcomponent

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.navcomponent.databinding.FragmentUserFormBinding

class UserFormFragment : Fragment() {

    private lateinit var binding: FragmentUserFormBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentUserFormBinding.inflate(inflater, container, false).apply {
            btEntryNow.setOnClickListener {
                val userName = etUserName.text.toString()
                val action =
                    UserFormFragmentDirections.actionUserFormFragmentToUserPreviewFragment(userName)
                findNavController().navigate(action)
            }
        }
        return binding.root
    }
}