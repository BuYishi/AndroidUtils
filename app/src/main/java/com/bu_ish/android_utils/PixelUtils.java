package com.bu_ish.android_utils;

import android.content.Context;
import android.util.DisplayMetrics;

public class PixelUtils {
    public static int dpToPx(Context context, float dp) {
        DisplayMetrics metrics = context.getResources().getDisplayMetrics();
        return (int) (dp * metrics.density + 0.5);
    }

    public static int pxToDp(Context context, float px) {
        DisplayMetrics metrics = context.getResources().getDisplayMetrics();
        return (int) (px / metrics.density + 0.5);
    }

    public static int spToPx(Context context, float sp) {
        DisplayMetrics metrics = context.getResources().getDisplayMetrics();
        return (int) (sp * metrics.scaledDensity + 0.5);
    }

    public static int pxToSp(Context context, float px) {
        DisplayMetrics metrics = context.getResources().getDisplayMetrics();
        return (int) (px / metrics.scaledDensity + 0.5);
    }

    public static int getDisplayWidth(Context context) {
        DisplayMetrics metrics = context.getResources().getDisplayMetrics();
        return metrics.widthPixels;
    }

    public static int getDisplayHeight(Context context) {
        DisplayMetrics metrics = context.getResources().getDisplayMetrics();
        return metrics.heightPixels;
    }
}
