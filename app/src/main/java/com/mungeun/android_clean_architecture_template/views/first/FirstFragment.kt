package com.mungeun.android_clean_architecture_template.views.first

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.mungeun.android_clean_architecture_template.R
import com.mungeun.android_clean_architecture_template.base.BaseFragment
import com.mungeun.android_clean_architecture_template.databinding.FragmentFirstBinding


/**
 *
 */
class FirstFragment : BaseFragment<FragmentFirstBinding,FirstViewModel>(R.layout.fragment_first) {
    override val viewModel : FirstViewModel by viewModels()

    override fun onViewCreated(binding: FragmentFirstBinding, savedInstanceState: Bundle?) {

    }
    override fun initBinding(binding: FragmentFirstBinding) {
        binding.run {
            lifecycleOwner = viewLifecycleOwner
        }
    }

    override fun subscribeViewModel(viewModel: FirstViewModel) {
    }

}