package com.bu_ish.android_utils;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private CountdownTextView ctv;
    private static MainActivity instance;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        instance = this;
        setContentView(R.layout.activity_main);
        ctv = findViewById(R.id.ctv);
        ctv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ctv.start(10, new CountdownTextView.CountdownCallback() {
                    @Override
                    public void onStart() {
                        ctv.setAlpha(0.3f);
                    }

                    @Override
                    public void onTick(long secondsUntilFinished) {
                        ctv.setText(secondsUntilFinished + "");
                    }

                    @Override
                    public void onFinish() {
                        ctv.setAlpha(1);
                        ctv.setText("获取验证码");
                    }
                });
            }
        });
        testLeakCanary();
    }

    private void testLeakCanary() {  //test LeakCanary
        new CountDownTimer(60000, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                Toast.makeText(instance, "测试LeakCanary", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFinish() {
            }
        }.start();
    }
}
