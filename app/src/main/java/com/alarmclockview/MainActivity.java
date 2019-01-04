package com.alarmclockview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    private AlarmClockView mClock;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mClock = findViewById(R.id.clock);
        //运行闹钟
        mClock.start(new TimeChangeListener() {
            @Override
            public void onTimeChange(Calendar calendar) {
                //根据calendar获取当前时间

            }
        });
    }
}