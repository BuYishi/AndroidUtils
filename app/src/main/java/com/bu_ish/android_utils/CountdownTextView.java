package com.bu_ish.android_utils;

import android.content.Context;
import android.os.CountDownTimer;
import android.util.AttributeSet;

import androidx.appcompat.widget.AppCompatTextView;

public class CountdownTextView extends AppCompatTextView {
    private CountDownTimer countDownTimer;

    public CountdownTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        stop();
    }

    public void start(long seconds, final CountdownCallback callback) {
        setEnabled(false);
        callback.onStart();
        if (countDownTimer == null) {
            countDownTimer = new CountDownTimer(seconds * 1000, 1000) {
                @Override
                public void onTick(long millisUntilFinished) {
                    callback.onTick(millisUntilFinished / 1000);
                }

                @Override
                public void onFinish() {
                    setEnabled(true);
                    callback.onFinish();
                }
            };
        }
        countDownTimer.start();
    }

    private void stop() {
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
    }

    public interface CountdownCallback {
        void onStart();

        void onTick(long secondsUntilFinished);

        void onFinish();
    }
}
