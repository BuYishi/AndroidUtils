package com.bu_ish.android_utils;

import android.content.Context;
import android.text.InputFilter;
import android.text.method.DigitsKeyListener;
import android.util.AttributeSet;

import androidx.appcompat.widget.AppCompatEditText;

public class MobilePhoneEditText extends AppCompatEditText {
    public MobilePhoneEditText(Context context, AttributeSet attrs) {
        super(context, attrs);
        setBackground(null);
        setKeyListener(DigitsKeyListener.getInstance("0123456789"));
        setFilters(new InputFilter[]{new InputFilter.LengthFilter(11)});
    }
}
