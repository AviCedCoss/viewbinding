package com.example.viewbinding.fragment

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.viewbinding.R
import com.example.viewbinding.databinding.FragmentBindBinding

class BindFragment : Fragment(R.layout.fragment_bind) {

    // Scoped to the lifecycle of the fragment's view (between onCreateView and onDestroyView)
    private var fragmentBlankBinding: FragmentBindBinding? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val binding = FragmentBindBinding.bind(view)
        fragmentBlankBinding = binding
        binding.textViewFragment.text = "Hello from bind !!"
    }

    override fun onDestroyView() {
        // Consider not storing the binding instance in a field, if not needed.
        fragmentBlankBinding = null
        super.onDestroyView()
    }

}