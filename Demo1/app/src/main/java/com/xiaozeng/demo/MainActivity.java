package com.xiaozeng.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ViewAnimator;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //获取布局管理器
        FrameLayout frameLayout = findViewById(R.id.horse);
        //实例化
        HorseDemo horseDemo = new HorseDemo(this);
        //触摸事件监听器
        horseDemo.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                //坐标
                horseDemo.horseX = event.getX();
                horseDemo.horseY = event.getY();
                //重绘
                horseDemo.invalidate();

                return true;
            }
        });
        frameLayout.addView(horseDemo);

    }
}