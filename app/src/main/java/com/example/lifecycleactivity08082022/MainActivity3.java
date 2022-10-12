package com.example.lifecycleactivity08082022;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity3 extends AppCompatActivity {

    Button btnNavigateScreen3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        // Nếu đứng ở đỉnh  của stack
        // a -> b -> c
        // Đang để là single top thì không bị tạo mới màn hình

        Log.d("BBB", "3: onCreate");

        btnNavigateScreen3 = findViewById(R.id.button_navigate_screen3);
        btnNavigateScreen3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity3.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("BBB", "3: onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("BBB", "3: onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("BBB", "3: onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("BBB", "3: onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("BBB", "3: onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("BBB", "3: onRestart");
    }
}
