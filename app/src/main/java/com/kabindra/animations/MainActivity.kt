package com.kabindra.animations

import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val animTopToBottom = AnimationUtils.loadAnimation(this, R.anim.anim_top_to_bottom)
        val animScaleToBit = AnimationUtils.loadAnimation(this, R.anim.anim_scale_to_bit)

        val tvHeaderTitle = findViewById<TextView>(R.id.tv_header_title)
        val tvSubTitle = findViewById<TextView>(R.id.tv_sub_title)
        val ivMainLogo = findViewById<ImageView>(R.id.iv_main_logo)

        tvHeaderTitle.startAnimation(animTopToBottom)
        tvSubTitle.startAnimation(animTopToBottom)
        ivMainLogo.startAnimation(animScaleToBit)
    }
}