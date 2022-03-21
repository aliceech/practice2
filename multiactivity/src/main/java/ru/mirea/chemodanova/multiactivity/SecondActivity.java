package ru.mirea.chemodanova.multiactivity;

import static android.content.ContentValues.TAG;

import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.PersistableBundle;
import android.util.Log;
import android.view.View;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import ru.mirea.chemodanova.multiactivity.databinding.ActivitySecondBinding;

public class SecondActivity extends AppCompatActivity {

    private AppBarConfiguration appBarConfiguration;
    private ActivitySecondBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivitySecondBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setSupportActionBar(binding.toolbar);

        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_second);
        appBarConfiguration = new AppBarConfiguration.Builder(navController.getGraph()).build();
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);

        binding.fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
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
        Log.i(TAG,"onRestoreInstanceState() 2");
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.i(TAG, "onResume() 2");
    }

    @Override
    protected void onPostResume(){
        super.onPostResume();
        Log.i(TAG,"onPostResume() 2");
    }

    @Override
    public void onAttachedToWindow(){
        super.onAttachedToWindow();
        Log.i(TAG,"onAttachedToWindow() 2");
    }
    @Override
    protected void onPause(){
        super.onPause();
        Log.i(TAG,"onPause() 2");
    }
    @Override
    protected void onSaveInstanceState(Bundle outState){
        super.onSaveInstanceState(outState);
        Log.i(TAG,"onSaveInstanceState() 2");
    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.i(TAG,"onStop() 2");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.i(TAG,"onDestroy() 2");
    }

    @Override
    public void onDetachedFromWindow(){
        super.onDetachedFromWindow();
        Log.i(TAG,"onDetachedFromWindow() 2");
    }

    @Override
    protected void onRestart(){
        super.onRestart();
        Log.i(TAG,"onRestart() 2");
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_second);
        return NavigationUI.navigateUp(navController, appBarConfiguration)
                || super.onSupportNavigateUp();
    }
}