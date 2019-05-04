package com.praveen.ecommerce.core.base

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModel
import dagger.android.support.AndroidSupportInjection


/**
 * Created by praveen on 03/05/19.
 **/
abstract class BaseFragment<T : ViewModel> : Fragment() {
    abstract var viewModel: T?


    override fun onCreate(savedInstanceState: Bundle?) {
        performDependencyInjection()
        super.onCreate(savedInstanceState)
//        mViewModel = getViewModel()
        setHasOptionsMenu(false)
    }

    private fun performDependencyInjection() {
        AndroidSupportInjection.inject(this)
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
//        viewModel = getViewModel()
    }


    override fun onDetach() {
        super.onDetach()
    }
}