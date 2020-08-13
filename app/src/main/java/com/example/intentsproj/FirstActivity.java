package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class FirstActivity extends AppCompatActivity {

    Button btn01;
    private EditText number2;
    private EditText number3;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_first );

        btn01 = findViewById( R.id.btn1 );
        number2 = findViewById( R.id.editTextNumber1 );
        number3 = findViewById( R.id.editTextNumber2 );

    }

    @Override
    protected void onResume(){
        super.onResume();
        btn01.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (number2.getText().toString().equals( "" )|| number3.getText().toString().equals( "" )){
                    Toast.makeText( FirstActivity.this, "Please Insert Numbers", Toast.LENGTH_SHORT ).show();
                }
                else {

                    int numb1 = Integer.parseInt( number2.getText().toString() );
                    int numb2 = Integer.parseInt( number3.getText().toString() );

                    Intent okBtn = new Intent( FirstActivity.this, SecondActivity.class );
                    okBtn.putExtra( "number1",numb1 );
                    okBtn.putExtra( "number2",numb2 );
                    startActivity( okBtn );
                    Toast.makeText( FirstActivity.this,"Sending Message" , Toast.LENGTH_SHORT).show();
                }
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