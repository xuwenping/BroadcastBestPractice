package com.example.administrator.broadcastbestpractice;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

/**
 * Created by Administrator on 2016/12/27.
 */
public class BaseActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityCollector.addActivity(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("XXX", "finish");
        ActivityCollector.removeActivity(this);
    }
}
