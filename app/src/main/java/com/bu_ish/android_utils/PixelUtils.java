package com.bu_ish.android_utils;

import android.content.Context;
import android.util.DisplayMetrics;

public class PixelUtils {
    public static int dpToPx(Context context, float dp) {
        DisplayMetrics metrics = context.getResources().getDisplayMetrics();
        return (int) (dp * metrics.density + 0.5f);
    }

    public static int pxToDp(Context context, float px) {
        DisplayMetrics metrics = context.getResources().getDisplayMetrics();
        return (int) (px / metrics.density + 0.5);
    }
}
