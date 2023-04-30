package com.example.activitylifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(this, "On create", Toast.LENGTH_SHORT).show();
        TextView textView = findViewById(R.id.ftextview);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this , secondActivity.class);
                startActivity(intent);

            }
        });
    }

    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "On Start", Toast.LENGTH_SHORT).show();
    }
        protected void onResume(){
            super.onResume();
            Toast.makeText(this, "On resume", Toast.LENGTH_SHORT).show();

        }
    protected void onPause(){
        super.onPause();
        Toast.makeText(this, "On pause", Toast.LENGTH_SHORT).show();

    }

    protected void onStop(){
        super.onStop();
        Toast.makeText(this, "On stop", Toast.LENGTH_SHORT).show();

    }
    protected void onRestart(){
        super.onRestart();
        Toast.makeText(this, "On restart", Toast.LENGTH_SHORT).show();

    }
    protected void onDestroy(){
        super.onDestroy();
        Toast.makeText(this, "On Destroy", Toast.LENGTH_SHORT).show();

    }


}