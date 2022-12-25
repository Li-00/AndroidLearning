package com.example.day_1;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

/**
 * @param
 * @author zy
 * @description First Android
 * @return View Test
 * @time 12点29分 12.4
 */
public class FirstActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
//        Log.d("FirstActivity", this.toString());
//        setContentView(R.layout.first_layout);
//        Button button1 = (Button) findViewById(R.id.button1);
//        button1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
////                显式跳转到第二个活动
//                Intent intent = new Intent(FirstActivity.this, SecondActivity.class);
//                String data = "Intent Data Transmission";
////                数据传输  key value
//                intent.putExtra("extra_data", data);
////                隐式跳转
////                Intent intent = new Intent("com.example.android_demo.ACTION_START");
////                intent.addCategory("com.example.android_demo.MY_CATEGORY");
////                启动外部的隐式
////                Intent intent = new Intent(Intent.ACTION_VIEW);
////                intent.setData(Uri.parse("http://www.baidu.coom"));
////                打电话
////                Intent intent = new Intent(Intent.ACTION_DIAL);
////                intent.setData(Uri.parse("tel:10086"));
//                startActivity(intent);
//            }
//        });
        Log.d("FirstActivity", "Task id is" + getTaskId());
        setContentView(R.layout.first_layout);
        Button button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SecondActivity.actionStart(FirstActivity.this, "data1", "data2");
                Intent intent = new Intent(FirstActivity.this, SecondActivity.class);
                startActivity(intent);
            }
        });

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("FirstActivity", "OnRestart");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.add_item:
                Toast.makeText(this, "You clicked Add method", Toast.LENGTH_SHORT).show();
                break;
            case R.id.remove_item:
                Toast.makeText(this, "You clicked Remove method", Toast.LENGTH_LONG).show();
                break;
            default:
        }
        return true;
    }
}
