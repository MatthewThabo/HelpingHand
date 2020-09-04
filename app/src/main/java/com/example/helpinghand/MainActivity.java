package com.example.helpinghand;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;
import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
    }

    @Override
    protected void onResume() {
        super.onResume();
        try {
            Thread.sleep(10000);
            startActivity(new Intent(getApplicationContext(), CheckList.class));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

//    private String TAG = "MTN-thabo";
//    private ImageView imageView;
//
////    private String[] modules = {"module 1", "module 2", "module 3", "module 4"};
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);

//        Button button = findViewById(R.id.button);
//        imageView = findViewById(R.id.imageView);
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//               captureImage();
//            }
//        });

//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(view.getContext(), CheckList.class);
//                intent.putExtra("string", "hello world data");
//                startActivity(intent);
//            }
//        });

//        ListView listView = findViewById(R.id.listView);
//        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, R.layout.modules_item_listview, R.id.textView, modules);
//
//        listView.setAdapter(arrayAdapter);

//        Button button = findViewById(R.id.button);
//
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Toast.makeText(view.getContext(), "Button clicked", Toast.LENGTH_SHORT).show();
//            }
//        });

//        Log.d(TAG, "Hello world");
//    }
//    public void captureImage() {
//        Intent photo = new Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
//        startActivityForResult(photo, 1);
//    }

//    @Override
//    protected  void onActivityResult(int requestCode, int resultCode, Intent data) {
//        super.onActivityResult(requestCode, resultCode, data);
//        if (requestCode == 1){
//            if (resultCode == RESULT_OK && data != null){
//                Bitmap capturedImage = (Bitmap) data.getExtras().get("data");
//                imageView.setImageBitmap(capturedImage);
//            }
//        }
//        }
//    }
