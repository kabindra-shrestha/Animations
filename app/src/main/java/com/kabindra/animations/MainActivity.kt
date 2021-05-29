package com.kabindra.animations

import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val animTopToBottom = AnimationUtils.loadAnimation(this, R.anim.anim_top_to_bottom)

        val tvHeaderTitle = findViewById<TextView>(R.id.tv_header_title)
        val tvSubTitle = findViewById<TextView>(R.id.tv_sub_title)

        tvHeaderTitle.startAnimation(animTopToBottom)
        tvSubTitle.startAnimation(animTopToBottom)
    }
}