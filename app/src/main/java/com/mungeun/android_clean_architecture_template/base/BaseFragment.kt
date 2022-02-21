package com.mungeun.android_clean_architecture_template.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.annotation.LayoutRes
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModel

abstract class BaseFragment<B : ViewDataBinding, VM : ViewModel>(layoutRes: Int) : Fragment(layoutRes) {

    abstract val viewModel: VM

    private lateinit var _binding: B
    val binding get() = _binding

    abstract fun onViewCreated(binding: B, savedInstanceState: Bundle?)

    abstract fun initBinding(binding: B)

    abstract fun subscribeViewModel(viewModel: VM)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = DataBindingUtil.bind(view) ?: return
        onViewCreated(binding, savedInstanceState)
        initBinding(binding)
        subscribeViewModel(viewModel)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    protected fun shortShowToast(msg: String) =
        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show()

    protected fun longShowToast(msg: String) =
        Toast.makeText(context, msg, Toast.LENGTH_LONG).show()


}