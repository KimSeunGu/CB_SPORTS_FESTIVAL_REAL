package com.example.mh.cb_sports_festival;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;

/**
 * Created by MH on 2017-07-06.
 */

public class SplashActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {

            @Override
            public void run() {
                finish();
            }
        }, 3000);// 3 초
    }
    //출처: http://nahosung.tistory.com/33 [nahos]*/
}
