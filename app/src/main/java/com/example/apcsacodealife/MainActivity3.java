package com.example.apcsacodealife;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class MainActivity3 extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        MaterialButton nextbtn2 = (MaterialButton) findViewById(R.id.nextbtn2);

        nextbtn2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(MainActivity3.this, MainActivity4.class);
                startActivity(intent);
            } //end method onClick
        }); //end event handler nextbtn1.setOnClickListener
    } //end method onCreate
} //end class MainActivity3