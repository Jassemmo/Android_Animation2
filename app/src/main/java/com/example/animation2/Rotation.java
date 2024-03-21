package com.example.animation2;

import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;

public class Rotation {
    public static void rotateImage(int fromDegrees, int toDegrees, int duration, ImageView image) {
        RotateAnimation rotation = new RotateAnimation(fromDegrees, toDegrees, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
        rotation.setDuration(duration);
        rotation.setInterpolator(new LinearInterpolator());
        image.startAnimation(rotation);
    }
}