package com.cpr.scalebutton;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.animation.AnimationUtils;

public class CustomButton extends androidx.appcompat.widget.AppCompatButton {
    public CustomButton(Context context) {
        super(context);
    }

    public CustomButton(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        if (event.getAction() == MotionEvent.ACTION_DOWN){
            startAnimation(AnimationUtils.loadAnimation(getContext(),R.anim.scale_up));

        }else if (event.getAction()==MotionEvent.ACTION_UP){
            startAnimation(AnimationUtils.loadAnimation(getContext(), R.anim.scale_down));
        }

        return super.onTouchEvent(event);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

    }
}
