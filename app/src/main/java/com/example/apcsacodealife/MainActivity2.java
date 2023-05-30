package com.example.apcsacodealife;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class MainActivity2 extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        EditText luckynumloop;
        EditText styleratingloop;
        EditText favoriteyrloop;

        TextView luckynumanswer = (TextView) findViewById(R.id.luckynumanswer);
        TextView styleratinganswer = (TextView) findViewById(R.id.styleratinganswer);
        TextView favoriteyranswer = (TextView) findViewById(R.id.favoriteyranswer);
        TextView idealsalaryanswer = (TextView) findViewById(R.id.idealsalaryanswer);

        MaterialButton startbtn = (MaterialButton) findViewById(R.id.startbtn);
        luckynumloop = (EditText) findViewById(R.id.luckynumloop);
        styleratingloop = (EditText) findViewById(R.id.styleratingloop);
        favoriteyrloop = (EditText) findViewById(R.id.favoriteyrloop);
        MaterialButton nextbtn1 = (MaterialButton) findViewById(R.id.nextbtn1);

        startbtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                String num = "";
                for (int i = 0; i < 6; i++)
                {
                    if (i < 5)
                    {
                        num += i + ", ";
                    } //end if statement
                    else
                    {
                        num += i + " 🍀";
                    } //end else statement
                    ((EditText)findViewById(R.id.luckynumloop)).setText(num + "");
                } //end for loop

                String num2 = "";
                for (int i = 1; i < 11; i++)
                {
                    if (i < 10)
                    {
                        num2 += i + ", ";
                    } //end if statement
                    else
                    {
                        num2 += i + " 🥼";
                    } //end else statement
                    ((EditText)findViewById(R.id.styleratingloop)).setText(num2 + "");
                } //end for loop

                String num3 = "";
                for (int i = 2020; i < 2023; i++)
                {
                    if (i == 2020 || i == 2022)
                    {
                        num3 += i + " 🥳";
                    } //end if statement
                    else
                    {
                        num3 += i + " 😖";
                    } //end else statement
                    ((EditText)findViewById(R.id.favoriteyrloop)).setText(num3 + "");
                } //end for loop
                ((EditText)findViewById(R.id.idealsalaryideas)).setText("10,000💲100,000");
            } //end method onClick
        }); //end event handler startbtn.setOnClickListener

         nextbtn1.setOnClickListener(new View.OnClickListener()
         {
             @Override
             public void onClick(View view)
             {
                 if((luckynumanswer.getText().toString().equals("0") ||
                         luckynumanswer.getText().toString().equals("1") ||
                         luckynumanswer.getText().toString().equals("2") ||
                         luckynumanswer.getText().toString().equals("3") ||
                         luckynumanswer.getText().toString().equals("4") ||
                         luckynumanswer.getText().toString().equals("5")) &&
                         (styleratinganswer.getText().toString().equals("1") ||
                                 styleratinganswer.getText().toString().equals("2") ||
                                 styleratinganswer.getText().toString().equals("3") ||
                                 styleratinganswer.getText().toString().equals("4") ||
                                 styleratinganswer.getText().toString().equals("5") ||
                         styleratinganswer.getText().toString().equals("6") ||
                         styleratinganswer.getText().toString().equals("7") ||
                         styleratinganswer.getText().toString().equals("8") ||
                         styleratinganswer.getText().toString().equals("9") ||
                         styleratinganswer.getText().toString().equals("10")) &&
                         (favoriteyranswer.getText().toString().equals("2020") ||
                                 favoriteyranswer.getText().toString().equals("2021") ||
                                 favoriteyranswer.getText().toString().equals("2022")) &&
                         (idealsalaryanswer.getText().toString().equals("10,000") ||
                                 idealsalaryanswer.getText().toString().equals("100,000")))
                 {
                     Intent intent = new Intent(MainActivity2.this, MainActivity3.class);
                     startActivity(intent);
                 } //end if statement
                 else
                 {
                     Toast.makeText(MainActivity2.this, "Try Again", Toast.LENGTH_SHORT).show();
                 } //end else statement
             } //end method onClick
         }); //end event handler nextbtn1.setOnClickListener
    } //end method onCreate
} //end class MainActivity2