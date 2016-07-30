package com.xiang.titleprogressbarproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Button show,conceal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //启用窗口特征  显示进度的进度条
        requestWindowFeature(Window.FEATURE_PROGRESS);
        //设置窗口特征  不带进度的进度条
        requestWindowFeature(Window.FEATURE_INDETERMINATE_PROGRESS);

        show= (Button) findViewById(R.id.show);
        conceal= (Button) findViewById(R.id.conceal);
        show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //显示不带进度条的
               setProgressBarIndeterminateVisibility(true);
                //显示带进度条的
                setProgressBarVisibility(true);
                //设置进度条的进度
                setProgress(4500);

            }
        });
        conceal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //隐藏不带进度条的
                setProgressBarIndeterminateVisibility(false);
                //影藏带进度条的
                setProgressBarVisibility(false);
                //设置进度条的进度
            }
        });

    }
}
