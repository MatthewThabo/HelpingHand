package com.example.helpinghand;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CheckList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_list);

        Button button = findViewById(R.id.gbutton);
        button.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
              Intent intent = new Intent(view.getContext(), Welcome.class);
//               intent.putExtra("string", "hello world data");
               startActivity(intent);
          }
     });

//        TextView textView = findViewById(R.id.textView);
//
//        String string = getIntent().getStringExtra("string");
//
//        textView.setText(string);
    }
}