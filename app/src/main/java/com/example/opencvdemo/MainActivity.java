package com.example.opencvdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import org.opencv.android.OpenCVLoader;

public class MainActivity extends AppCompatActivity {

    private static String TAG="MainActivity";
    static {
        System.loadLibrary("native-lib");
        System.loadLibrary("opencv_java4");//opencv4版本
        //System.loadLibrary("opencv_java3");opencv3版本

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView=(TextView) findViewById(R.id.sample_text);
        textView.setText(stringFromJNI());

        // Example of a call to a native method
        TextView tv = findViewById(R.id.sample_text);
        tv.setText(stringFromJNI());

        if (OpenCVLoader.initDebug()) {
            textView.setText(textView.getText()+"\n OPENCV LOADED SUCCESSFULLY");
            textView.setText(textView.getText()+"\n"+opencvTest(500,500));

        } else {
            Log.d(TAG, "OPENCV DİD NOT LOAD");

        }
    }
    public native String stringFromJNI();
    public native String opencvTest(long madAddrGr,long matAddrRgba);
}
