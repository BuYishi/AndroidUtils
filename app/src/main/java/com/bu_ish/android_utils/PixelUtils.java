package com.bu_ish.android_utils;

import android.content.Context;
import android.util.DisplayMetrics;

public class PixelUtils {
    public static int dpToPx(Context context, float dp) {
        return round(dp * getDisplayMetrics(context).density);
    }

    public static int pxToDp(Context context, float px) {
        return round(px / getDisplayMetrics(context).density);
    }

    public static int spToPx(Context context, float sp) {
        return round(sp * getDisplayMetrics(context).scaledDensity);
    }

    public static int pxToSp(Context context, float px) {
        return round(px / getDisplayMetrics(context).scaledDensity);
    }

    public static int getDisplayWidth(Context context) {
        return getDisplayMetrics(context).widthPixels;
    }

    public static int getDisplayHeight(Context context) {
        return getDisplayMetrics(context).heightPixels;
    }

    private static DisplayMetrics getDisplayMetrics(Context context) {
        return context.getResources().getDisplayMetrics();
    }

    private static int round(float f) {
        return (int) (f + 0.5f);
    }
}
