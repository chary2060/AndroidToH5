package com.example.androidtoh5;

import android.os.Bundle;

import org.apache.cordova.CordovaActivity;

/**
 * @author czp
 * @date 2019/08/02
 * @desc 测试H5的页面
 */
public class TestCordovaActivity extends CordovaActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // enable Cordova apps to be started in the background
        Bundle extras = getIntent().getExtras();
        if (extras != null
                && extras.getBoolean("cdvStartInBackground", false)) {
            moveTaskToBack(true);
        }

        // Set by <content src="index.html" /> in config.xml
        // 加载H5首页
        loadUrl(launchUrl);
    }
}