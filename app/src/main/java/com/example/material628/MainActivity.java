package com.example.material628;





import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

private static final String TAG = MainActivity.class.getSimpleName();

    //declare: our variables
    Button butt_0, butt_1, butt_2, butt_3, butt_4, butt_5, butt_6, butt_7, butt_8, butt_9, butt_dot, butt_equal, butt_add, butt_sub, butt_multiply, butt_negate, butt_clear, butt_percent, butt_divide;
    TextView display;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //initialize our variables
        butt_0 = findViewById(R.id.butt_0);
        butt_1 = findViewById(R.id.butt_1);
        butt_2 = findViewById(R.id.butt_2);
        butt_3 = findViewById(R.id.butt_3);
        butt_4 = findViewById(R.id.butt_4);
        butt_5 = findViewById(R.id.butt_5);
        butt_6 = findViewById(R.id.butt_6);
        butt_7 = findViewById(R.id.butt_7);
        butt_8 = findViewById(R.id.butt_8);
        butt_9 = findViewById(R.id.butt_9);
        butt_dot = findViewById(R.id.butt_dot);
        butt_equal = findViewById(R.id.butt_equal);
        butt_sub = findViewById(R.id.butt_sub);
        butt_add = findViewById(R.id.butt_add);
        butt_multiply = findViewById(R.id.butt_multiply);
        butt_clear = findViewById(R.id.butt_clear);
        butt_negate = findViewById(R.id.butt_negate);
        butt_percent = findViewById(R.id.butt_percent);
        butt_divide = findViewById(R.id.butt_divide);

        display = findViewById(R.id.display);


        //creating onlicklistener, click and show toast of click


        butt_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickNumber("0");
                Toast.makeText(MainActivity.this, "Zero", Toast.LENGTH_SHORT).show();
            }
        });

        butt_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickNumber("1");
                Toast.makeText(MainActivity.this, "One", Toast.LENGTH_SHORT).show();
            }
        });

        butt_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickNumber("2");
                Toast.makeText(MainActivity.this, "Two", Toast.LENGTH_SHORT).show();
            }
        });

        butt_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickNumber("3");
                Toast.makeText(MainActivity.this, "Three", Toast.LENGTH_SHORT).show();
            }
        });

        butt_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickNumber("4");
                Toast.makeText(MainActivity.this, "Four", Toast.LENGTH_SHORT).show();
            }
        });

        butt_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickNumber("5");
                Toast.makeText(MainActivity.this, "Five", Toast.LENGTH_SHORT).show();
            }
        });

        butt_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickNumber("6");
                Toast.makeText(MainActivity.this, "Six", Toast.LENGTH_SHORT).show();
            }
        });

        butt_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickNumber("7");
                Toast.makeText(MainActivity.this, "Seven", Toast.LENGTH_SHORT).show();
            }
        });

        butt_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickNumber("8");
                Toast.makeText(MainActivity.this, "Eight", Toast.LENGTH_SHORT).show();
            }
        });

        butt_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickNumber("9");
                Toast.makeText(MainActivity.this, "Nine", Toast.LENGTH_SHORT).show();
            }
        });

        butt_dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.append(".");
                Toast.makeText(MainActivity.this, "Dot", Toast.LENGTH_SHORT).show();
            }
        });

        butt_equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.append("=");
                Toast.makeText(MainActivity.this, "Equal", Toast.LENGTH_SHORT).show();
            }
        });

        butt_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.append("+");
                Toast.makeText(MainActivity.this, "Add", Toast.LENGTH_SHORT).show();
            }
        });

        butt_sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.append("-");
                Toast.makeText(MainActivity.this, "Sub", Toast.LENGTH_SHORT).show();
            }
        });

        butt_multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.append("X");
                Toast.makeText(MainActivity.this, "multiply", Toast.LENGTH_SHORT).show();
            }
        });

        butt_clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                display.append(""); //no need to show "AC"
                display.setText("0");
                Toast.makeText(MainActivity.this, "Clear", Toast.LENGTH_SHORT).show();
            }
        });

        butt_negate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.append("+/-");
                Toast.makeText(MainActivity.this, "Negate", Toast.LENGTH_SHORT).show();
            }
        });

        butt_percent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.append("%");
                Toast.makeText(MainActivity.this, "Percent", Toast.LENGTH_SHORT).show();
            }
        });

        butt_divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.append("/");
                Toast.makeText(MainActivity.this, "Divide", Toast.LENGTH_SHORT).show();
            }
        });


    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "OnStart");
        Toast.makeText(MainActivity.this, "onStart", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume");
        Toast.makeText(MainActivity.this, "onResume", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause");
        Toast.makeText(MainActivity.this, "onPause", Toast.LENGTH_SHORT).show();
    }


    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart");
        Toast.makeText(MainActivity.this, "onRestart", Toast.LENGTH_SHORT).show();
    }


    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop");
        Toast.makeText(MainActivity.this, "onStop", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "OnDestroy");
        Toast.makeText(MainActivity.this, "onDestroy", Toast.LENGTH_SHORT).show();
    }


    public void clickNumber(String num){
        if(display.getText().toString().equals("0")){
            display.setText(num);
        }else{
            display.append(num);
        }
    }


}



