package com.example.intentsproj;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class SecondActivity extends AppCompatActivity {

    private TextView result;
    private TextView lResult;
    private EditText number1;
    private EditText number2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_second );

        Log.i( "Lifecycle", "onCreate() invoked" );

        setTitle( "Activity 2" );

        Intent okBtn = getIntent();
        final int numb1 = okBtn.getIntExtra( "number1",0 );
        final int numb2 = okBtn.getIntExtra( "number2", 0);


        result = findViewById( R.id.textView3 );
        result.setText( "Choose an Operation" );
        number1 = findViewById( R.id.editTextNumber );
        number1.setText( ""+numb1 );
        number2 = findViewById( R.id.editTextNumber3 );
        number2.setText( ""+numb2 );


        Button bAdd = findViewById( R.id.button );
        Button bSub = findViewById( R.id.button2 );
        Button bMulti = findViewById( R.id.button3 );
        Button bDevi = findViewById( R.id.button5 );

        bAdd.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int resultN = numb1 + numb2;

                lResult = findViewById( R.id.textView3 );
                lResult.setText( numb1+"+"+numb2+"="+resultN );


            }
        } );

        bSub.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int resultN = numb1 - numb2;

                lResult = findViewById( R.id.textView3 );
                lResult.setText( numb1+"-"+numb2+"="+resultN );
            }
        } );

        bMulti.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int resultN = numb1 * numb2;

                lResult = findViewById( R.id.textView3 );
                lResult.setText( numb1+"*"+numb2+"="+resultN );
            }
        } );

        bDevi.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int resultN = numb1 / numb2;

                lResult = findViewById( R.id.textView3 );
                lResult.setText( numb1+"/"+numb2+"="+resultN );
            }
        } );


    }

    public void onStart(){
        super.onStart();
        Log.i( "Lifecycle", "onStart() invoked" );
    }
    public void onRestart(){
        super.onRestart();
        Log.i( "Lifecycle", "onRestart() invoked" );
    }
    public void onResume(){
        super.onResume();
        Log.i( "Lifecycle", "onResume() invoked" );
    }
    public void onPause(){
        super.onPause();
        Log.i( "Lifecycle", "onPause() invoked" );
    }
    public void onStop(){
        super.onStop();
        Log.i( "Lifecycle", "onStop() Lifecycle" );
    }
    public void onDestroy(){
        super.onDestroy();
        Log.i( "Lifecycle", "onDestroy() invoked" );
    }

}