package com.xiaozeng.demo;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;

public class HorseDemo extends View {
    //设置两个变量
    public float horseX,horseY;
//创建构造方法
    public HorseDemo(Context context) {
        super(context);
        horseX = 200;
        horseY = 300;
    }
    //第二步：重写onDraw方法 Ctrl+o

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        //实例化画图对象
        Paint paint = new Paint();
        //位图对象
        Bitmap bitmap = BitmapFactory.decodeResource(this.getResources(),R.mipmap.pic2);
       //回收
        canvas.drawBitmap(bitmap,horseX,horseY,paint);
        if(bitmap.isRecycled()){
            bitmap.recycle();

        }
    }
}
