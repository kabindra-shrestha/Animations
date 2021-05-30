package com.kabindra.animations

import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val animTopToBottom = AnimationUtils.loadAnimation(this, R.anim.anim_top_to_bottom)
        val animScaleToBit = AnimationUtils.loadAnimation(this, R.anim.anim_scale_to_bit)
        val animBottomToTop = AnimationUtils.loadAnimation(this, R.anim.anim_bottom_to_top)
        val animBottomToTop1000 = AnimationUtils.loadAnimation(this, R.anim.anim_bottom_to_top_1000)
        val animBottomToTop1200 = AnimationUtils.loadAnimation(this, R.anim.anim_bottom_to_top_1200)
        val animBottomToTop1500 = AnimationUtils.loadAnimation(this, R.anim.anim_bottom_to_top_1500)

        val tvHeaderTitle = findViewById<TextView>(R.id.tv_header_title)
        val tvSubTitle = findViewById<TextView>(R.id.tv_sub_title)
        val ivMainLogo = findViewById<ImageView>(R.id.iv_main_logo)
        val containerMainResultOne = findViewById<LinearLayout>(R.id.container_main_result_one)
        val containerMainResultTwo = findViewById<LinearLayout>(R.id.container_main_result_two)
        val containerMainResultThree = findViewById<LinearLayout>(R.id.container_main_result_three)
        val buttonNext = findViewById<Button>(R.id.button_next)

        tvHeaderTitle.startAnimation(animTopToBottom)
        tvSubTitle.startAnimation(animTopToBottom)
        ivMainLogo.startAnimation(animScaleToBit)
        containerMainResultOne.startAnimation(animBottomToTop)
        containerMainResultTwo.startAnimation(animBottomToTop1000)
        containerMainResultThree.startAnimation(animBottomToTop1200)
        buttonNext.startAnimation(animBottomToTop1500)
    }
}