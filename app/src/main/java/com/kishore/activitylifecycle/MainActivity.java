package com.kishore.activitylifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
TextView mtextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mtextView=findViewById(R.id.tv);
        mtextView.append("onCreate()");
        Log.i("MainAcivity","onCreate()");
        Toast.makeText(this,"App Created",Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onStart() {
        super.onStart();
        mtextView.append("\n onStart()");
        Log.i("MainAcivity","onStart()");
        Toast.makeText(this,"App is Started",Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onResume() {
        super.onResume();
        mtextView.append("\n onResume()");
        Log.i("MainAcivity","onResume()");
        Toast.makeText(this,"App is Resumed",Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onPause() {
        super.onPause();
        mtextView.append("onPause()\n");
        Log.i("MainAcivity","onPause()");
        Toast.makeText(this,"App is Paused",Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onStop() {
        super.onStop();
        mtextView.append("onStop()\n");
        Log.i("MainAcivity","onStop()");
        Toast.makeText(this,"App is Stopped",Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mtextView.append("onDestroy()\n");
        Log.i("MainAcivity","onDestroy()");
        Toast.makeText(this,"App is Destroyed",Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        mtextView.append("onReStart()\n");
        Log.i("MainAcivity","onReStart()");
        Toast.makeText(this,"App is ReStarted",Toast.LENGTH_SHORT).show();

    }
}