package com.example.week2sum;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


        public void displaySum(View view){
        //initialize interger variables to store more numbers
        int num1, num2, sum;
        EditText objNum1 = (EditText) findViewById(R.id.num1);
        num1 = Integer.parseInt(objNum1.getText().toString());
        EditText objNum2 = (EditText) findViewById(R.id.num2);
        num2 = Integer.parseInt(objNum2.getText().toString());

        sum = num1+num2;
        //display the results
        TextView res = (TextView)findViewById(R.id.result);
        res.setText(Integer.toString(sum));

    }


    }








