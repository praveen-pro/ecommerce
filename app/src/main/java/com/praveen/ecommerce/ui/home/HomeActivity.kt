package com.praveen.ecommerce.ui.home

import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import com.praveen.ecommerce.R
import com.praveen.ecommerce.core.base.BaseActivity
import com.praveen.ecommerce.databinding.ActivityHomeBinding
import javax.inject.Inject


/**
 * Created by praveen on 03/05/19.
 **/
class HomeActivity : BaseActivity<ActivityHomeBinding, HomeViewModel>() {

    @Inject
    lateinit var factory: ViewModelProvider.Factory

    override fun getViewModel(): HomeViewModel = ViewModelProviders.of(this, factory).get(HomeViewModel::class.java)

    override fun getLayoutId() = R.layout.activity_home
}