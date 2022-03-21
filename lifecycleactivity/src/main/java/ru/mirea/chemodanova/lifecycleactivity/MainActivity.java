package ru.mirea.chemodanova.lifecycleactivity;

import static android.content.ContentValues.TAG;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.nfc.Tag;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected  void onStart(){
        super.onStart();
        Log.i(TAG,"onStart()");
    }

    @Override
    public void onPostCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistableBundle){
       super.onPostCreate(savedInstanceState,persistableBundle);
       Log.i(TAG,"onPostCreate");
    }
    @Override
    protected  void onRestoreInstanceState(Bundle outState){
        super.onRestoreInstanceState(outState);
        Log.i(TAG,"onRestoreInstanceState");
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.i(TAG, "onResume()");
    }

    @Override
    protected void onPostResume(){
        super.onPostResume();
        Log.i(TAG,"onPostResume()");
    }

    @Override
    public void onAttachedToWindow(){
        super.onAttachedToWindow();
        Log.i(TAG,"onAttachedToWindow");
    }
    @Override
    protected void onPause(){
        super.onPause();
        Log.i(TAG,"onPause()");
    }
    @Override
    protected void onSaveInstanceState(Bundle outState){
        super.onSaveInstanceState(outState);
        Log.i(TAG,"onSaveInstanceState()");
    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.i(TAG,"onStop()");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.i(TAG,"onDestroy()");
    }

    @Override
    public void onDetachedFromWindow(){
        super.onDetachedFromWindow();
        Log.i(TAG,"onDetachedFromWindow");
    }

    @Override
    protected void onRestart(){
        super.onRestart();
        Log.i(TAG,"onRestart");
    }

}