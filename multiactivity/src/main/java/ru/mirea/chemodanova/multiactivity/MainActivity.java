package ru.mirea.chemodanova.multiactivity;

import static android.content.ContentValues.TAG;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    protected  void onStart(){
        super.onStart();
        Log.i(TAG,"onStart() 1");
    }

    @Override
    public void onPostCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistableBundle){
        super.onPostCreate(savedInstanceState,persistableBundle);
        Log.i(TAG,"onPostCreate() 1");
    }
    @Override
    protected  void onRestoreInstanceState(Bundle outState){
        super.onRestoreInstanceState(outState);
        Log.i(TAG,"onRestoreInstanceState() 1");
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.i(TAG, "onResume() 1");
    }

    @Override
    protected void onPostResume(){
        super.onPostResume();
        Log.i(TAG,"onPostResume() 1");
    }

    @Override
    public void onAttachedToWindow(){
        super.onAttachedToWindow();
        Log.i(TAG,"onAttachedToWindow() 1");
    }
    @Override
    protected void onPause(){
        super.onPause();
        Log.i(TAG,"onPause() 1");
    }
    @Override
    protected void onSaveInstanceState(Bundle outState){
        super.onSaveInstanceState(outState);
        Log.i(TAG,"onSaveInstanceState() 1");
    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.i(TAG,"onStop() 1");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.i(TAG,"onDestroy() 1");
    }

    @Override
    public void onDetachedFromWindow(){
        super.onDetachedFromWindow();
        Log.i(TAG,"onDetachedFromWindow() 1");
    }

    @Override
    protected void onRestart(){
        super.onRestart();
        Log.i(TAG,"onRestart");
    }

    public void onClickNewActivity(View view){
        Intent intent= new Intent(this,SecondActivity.class);
        intent.putExtra("key","MIREA - ФАМИЛИЯ ИМЯ ОТЧЕТСВО СТУДЕНТА");
        startActivity(intent);

        String text=(String) getIntent().getSerializableExtra("key");
    }
}