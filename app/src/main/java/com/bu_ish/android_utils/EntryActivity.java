package com.bu_ish.android_utils;

import android.os.Bundle;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class EntryActivity extends AppCompatActivity {
    private ImageView iv1, iv2;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entry);
        findViews();
        initViews();
    }

    private void findViews() {
        iv1 = findViewById(R.id.iv1);
        iv2 = findViewById(R.id.iv2);
    }

    private void initViews() {
        ImageUtils.loadInto(this,
                "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1574446805439&di=cbe92cf849c9052b57106bae4742d8d8&imgtype=0&src=http%3A%2F%2Fphotocdn.sohu.com%2F20121223%2FImg361292279.jpg",
                iv1);
        ImageUtils.loadInto(this,
                "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1574446927098&di=c2653bf7f6bf5a8403b67c75c62921fa&imgtype=0&src=http%3A%2F%2Fd.hiphotos.baidu.com%2Fzhidao%2Fwh%253D680%252C800%2Fsign%3Df651af6b3201213fcf6646da6cd71ae9%2F503d269759ee3d6d2eba1c7948166d224f4ade00.jpg",
                iv2,
                R.mipmap.ic_placeholder);
    }
}
