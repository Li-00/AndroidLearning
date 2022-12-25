package com.example.day_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class ThirdActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("ThirdActivity", "Task id is" + getTaskId());
        setContentView(R.layout.activity_third);
        Button button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                销毁移除 Activity
                ActivityController.finishAll();
//                杀掉进程(killProcess 只能杀掉当前进程）
                android.os.Process.killProcess(android.os.Process.myPid());
            }
        });
    }

}