package com.example.activitylifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.widget.Toast;

public class secondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Toast toast = Toast.makeText(this , "Second Activity start", Toast.LENGTH_SHORT );
        toast.setGravity(Gravity.CENTER , 50,50);
        toast.show();
    }
    protected void onStart(){
        super.onStart();  Toast toast = Toast.makeText(this , "Second Activity start", Toast.LENGTH_SHORT );
        toast.setGravity(Gravity.CENTER , 50,50);
        toast.show();


    }

    protected void onResume(){
        super.onResume();  Toast toast = Toast.makeText(this , "Second Activity resume", Toast.LENGTH_SHORT );
        toast.setGravity(Gravity.CENTER ,50 ,70);
        toast.show();



    }

    protected void onPouse(){
        super.onPause();  Toast toast = Toast.makeText(this , "Second Activity pouse", Toast.LENGTH_SHORT );
        toast.setGravity(Gravity.CENTER , 50,10);
        toast.show();


    }
    protected void onStop(){
        super.onStop();  Toast toast = Toast.makeText(this , "Second Activity stop", Toast.LENGTH_SHORT );
        toast.setGravity(Gravity.CENTER , 50,20);
        toast.show();


    }

    protected void onRestart(){
        super.onRestart();  Toast toast = Toast.makeText(this , "Second Activity restart", Toast.LENGTH_SHORT );
        toast.setGravity(Gravity.CENTER , 50,30);
        toast.show();


    }
    protected void onDestroy(){
        super.onDestroy();  Toast toast = Toast.makeText(this , "Second Activity destroy", Toast.LENGTH_SHORT );
        toast.setGravity(Gravity.CENTER , 50,40);
        toast.show();


    }

}

