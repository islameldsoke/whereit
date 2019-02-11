package com.nursery.islam.whereit

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.Toast

import com.github.pwittchen.reactivenetwork.library.rx2.ReactiveNetwork
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {

    lateinit var search:FloatingActionButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        AppUtils.changeStatusBarColor(this)

        search = findViewById(R.id.floatingActionButton)
        ReactiveNetwork
                .observeNetworkConnectivity(this)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe { connectivity -> }
    }

    override fun onResume() {
        super.onResume()

        search.setOnClickListener { startActivity(Intent(this,SearchActivity::class.java)) }
    }


}
