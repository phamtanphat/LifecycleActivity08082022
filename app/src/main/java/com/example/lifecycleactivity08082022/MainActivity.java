package com.example.lifecycleactivity08082022;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnNavigateScreen2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("BBB", "1: onCreate");

        btnNavigateScreen2 = findViewById(R.id.button_navigate_screen2);

        btnNavigateScreen2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("BBB", "1: onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("BBB", "1: onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("BBB", "1: onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("BBB", "1: onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("BBB", "1: onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("BBB", "1: onRestart");
    }
}
