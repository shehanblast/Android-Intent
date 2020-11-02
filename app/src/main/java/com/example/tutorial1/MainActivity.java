package com.example.tutorial1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static final String Extra_Message = "com.example.tutorial1";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendMessage(View view){

        Intent intent = new Intent(this,DisplayMessageActivity.class);
        EditText editText = (EditText)findViewById(R.id.editText);
        String message = editText.getText().toString();
        intent.putExtra(Extra_Message,message);
        startActivity(intent);

    }
}
