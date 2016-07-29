package com.library.ashish.testlibrary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.library.ashish.myfirstlibrary.TestLibraryClass;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText ed=(EditText)findViewById(R.id.editText);
        final EditText ed1=(EditText)findViewById(R.id.editText1);
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TestLibraryClass.sumNumber(Integer.parseInt(ed.getText().toString()),Integer.parseInt(ed1.getText().toString()));
                 Toast.makeText(getApplicationContext(),TestLibraryClass.getNumber()+"", Toast.LENGTH_LONG).show();
            }
        });
    }
}
