package com.example.navcomponent

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.example.navcomponent.databinding.FragmentUserPreviewBinding

class UserPreviewFragment : Fragment() {

    private lateinit var binding: FragmentUserPreviewBinding
    private val args: UserPreviewFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentUserPreviewBinding.inflate(inflater, container, false).apply {
            userName.text = args.userName
        }
        return binding.root
    }
}