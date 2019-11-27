package com.bu_ish.android_utils;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;
import com.bumptech.glide.request.target.Target;

public class ImageUtils {
    public static void loadInto(Context context, String url, ImageView view) {
        loadInto(context, url, view, 0);
    }

    @SuppressLint("CheckResult")
    public static void loadInto(Context context, String url, ImageView view, int placeholderResId) {
        RequestBuilder<Drawable> builder = Glide.with(context.getApplicationContext()).load(url).override(Target.SIZE_ORIGINAL, Target.SIZE_ORIGINAL);
        if (placeholderResId != 0) {
            builder.placeholder(placeholderResId);
        }
        builder.into(view);
    }
}
