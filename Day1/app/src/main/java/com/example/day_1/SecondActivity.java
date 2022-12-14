package com.example.day_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends BaseActivity {

//    启动方法，方便知晓当前类参数列表
    public static void actionStart(Context context, String data1, String data2) {
        Intent intent = new Intent(context, SecondActivity.class);
        intent.putExtra("param1", data1);
        intent.putExtra("param2", data2);
        context.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("SecondActivity", "Task id is" + getTaskId());
        setContentView(R.layout.activity_second);
        Button button1 = (Button) findViewById(R.id.button2);
//        button1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(SecondActivity.this, FirstActivity.class);
//                startActivity(intent);
////              finish();
//            }
//        });
//        Intent intent = getIntent();
////        通过key 获取Intent 发送的数据
//        String data = intent.getStringExtra("extra_data");
//        Log.d("SecondActivity accept intent", data);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SecondActivity.this, ThirdActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("SecondActivity", "OnDestroy");
    }
}