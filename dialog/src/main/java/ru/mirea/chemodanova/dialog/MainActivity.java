package ru.mirea.chemodanova.dialog;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

import java.sql.Time;
import java.text.DateFormat;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity implements TimePickerDialog.OnTimeSetListener,
        DatePickerDialog.OnDateSetListener {

    TextView tvTime;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button= (Button) findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DialogFragment timePicker= new TimePickerFragment();
                timePicker.show(getSupportFragmentManager(),"time picker");
            }
        });

        Button buutonDate= (Button) findViewById(R.id.button3);
        buutonDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DialogFragment datePicker=new DatePickerFragment();
                datePicker.show(getSupportFragmentManager(),"date picker");
            }
        });


    }
    @Override
    public void onDateSet(DatePicker view,int year,int month,int dayOfMonth){
        Calendar c= Calendar.getInstance();
        c.set(Calendar.YEAR,year);
        c.set(Calendar.MONTH,month);
        c.set(Calendar.DAY_OF_MONTH,dayOfMonth);
        String currentDateString= DateFormat.getDateInstance(DateFormat.FULL).format(c.getTime());

        TextView textView =(TextView) findViewById(R.id.textView2);
        textView.setText(currentDateString);
    }
    @Override
    public void onTimeSet(TimePicker view,int houfOfDay,int minute){
        TextView textView=(TextView) findViewById(R.id.textView);
        textView.setText("Hour: "+ houfOfDay+" Minute: "+minute);
    }



    public void onClickShowDialog(View view){
        MyDialogFragment dialogFragment=new MyDialogFragment();
        dialogFragment.show(getSupportFragmentManager(),"mirea");
    }

    public void onOkClicked(){
        Toast.makeText(getApplicationContext(),"Вы выбрали кнопку\"Иду дальше\"!",
                Toast.LENGTH_LONG).show();
    }
    public void onCancelClicked(){
        Toast.makeText(getApplicationContext(),"Вы выбрали кнопку \"Нет \"!",
                Toast.LENGTH_LONG).show();
    }
    public void onNeutralClicked(){
        Toast.makeText(getApplicationContext(),"Вы выбрали кнопку \"На паузе\"!",
                Toast.LENGTH_LONG).show();
    }


    public void progress(View view) {
        DialogFragment progress = new MyProgressDialog();
        progress.show(getSupportFragmentManager(), "progress");
    }
}