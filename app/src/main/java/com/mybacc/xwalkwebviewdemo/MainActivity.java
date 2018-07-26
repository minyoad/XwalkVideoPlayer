package com.mybacc.xwalkwebviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.mybacc.xwalkvideoplayer.XwalkWebViewActivity;

public class MainActivity extends XwalkWebViewActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);

        play("http://www.dgua.xyz/webcloud/?url=http://v.youku.com/v_show/id_XMzA4OTA4OTQyMA==.html");

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
