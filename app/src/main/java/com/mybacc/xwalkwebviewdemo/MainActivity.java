package com.mybacc.xwalkwebviewdemo;

import android.os.Bundle;

import com.mybacc.xwalkvideoplayer.XwalkWebViewActivity;

public class MainActivity extends XwalkWebViewActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);

        play("https://api.147g.cc/m3u8.php?url=https://v.qq.com/x/cover/mzc00200vx37bvf.html");

//        play("https://www.baidu.com");
    }

    @Override
    public void onPlayingEventChanged(String event) {

    }

    @Override
    public void onProgressUpdated(double position) {

    }

    @Override
    public void onPlayingProperties(String propertiesJson) {

    }
}
