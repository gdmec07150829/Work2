package cn.edu.gdmec.s07150829.work1;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by admin on 2016/9/18.
 */
    public class MyActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        log.v("MyActivity","onCreate方法被执行");
    }

    @Override
    protected void onStart() {
        log.v("MyActivity","onStart方法被执行");
    }

    @Override
    protected void onResume() {
        log.v("MyActivity","onResume方法被执行");
    }

    @Override
    protected void onPause() {
        log.v("MyActivity","onPause方法被执行");
    }

    @Override
    protected void onStop() {
        log.v("MyActivity","onStop方法被执行");
    }

    @Override
    protected void onRestart() {
        log.v("MyActivity","onRestart方法被执行");
    }

    @Override
    protected void onDestroy() {
        log.v("MyActivity","onDestroy方法被执行");
    }
}
