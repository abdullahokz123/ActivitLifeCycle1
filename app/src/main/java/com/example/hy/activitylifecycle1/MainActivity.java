package com.example.hy.activitylifecycle1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Log.d("ActivityLifeCycle" , "onCreat() was called");

        Toast.makeText(MainActivity.this, "onCreate() is called", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        //Log.d("ActivityLifeCycle", "onStart() was called");

        Toast t= Toast.makeText(getApplicationContext(), "onStart() is called", Toast.LENGTH_SHORT);
        t.show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        //Log.d("ActivityLifeCycle", "onResume() was called");

        Toast.makeText(MainActivity.this, "onResume() method is called", Toast.LENGTH_LONG).show();
    }

   /* @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("counter", counter);

        Toast.makeText(MainActivity.this, counter+": information is saved", Toast.LENGTH_LONG).show();
    }*/

    @Override
    protected void onPause() {
        super.onPause();
        //Log.d("ActivityLifeCycle", "onPause() was called");

        Toast.makeText(MainActivity.this, "onPause() is called", Toast.LENGTH_LONG).show();
    }

   /* @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

        counter=savedInstanceState.getInt("counter");
        Toast.makeText(MainActivity.this, counter+": information is Restored", Toast.LENGTH_LONG).show();
    }*/

    @Override
    protected void onStop() {
        super.onStop();
        //Log.d("ActivityLifeCycle", "onStop() was called");

        Toast.makeText(MainActivity.this, "onStop() is called", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        //Log.d("ActivityLifeCycle", "onRestart() was called");

        Toast.makeText(MainActivity.this, "onRestart() is called", Toast.LENGTH_LONG).show();

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        //Log.d("ActivityLifeCycle", "onDestroy() was called");

        Toast.makeText(MainActivity.this, "onDestroy() is called", Toast.LENGTH_LONG).show();
    }
/*

    public void process(View view) {


      */
/*  switch (view.getId()) {
            case R.id.btn1:
                Toast.makeText(this, "Button is clicked", Toast.LENGTH_SHORT).show();
        }*//*

      if(view.getId()==R.id.btn1)
      {
          Toast.makeText(this, "Working", Toast.LENGTH_SHORT).show();
      }
    }
*/

    public void ckickme(View view) {
        Toast.makeText(this, "working", Toast.LENGTH_SHORT).show();
    }
}
