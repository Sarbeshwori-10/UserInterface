package com.example.ui_toaster;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private int count=0;
    private TextView ShowCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ShowCount = (TextView) findViewById(R.id.textView_hello);
    }

    public void showToast(View view){
        count = 0;
        Toast toast = Toast.makeText(this, R.string.ToastMessage, Toast.LENGTH_SHORT);
        ShowCount.setText("Hello World!");
        toast.show();
    }

    public void countUp(View view){
        count++;
        ShowCount.setText(Integer.toString(count));
    }
}
