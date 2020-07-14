package com.ly.firstcode;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickFLoatActionButton(View view){
        Intent intent = new Intent(this, FloatActionActivity.class);
        startActivity(intent);
    }

    public void clickSnackBar(View view){
        Intent intent = new Intent(this, SnackBarActivity.class);
        startActivity(intent);
    }

    public void clickCoordinator(View view){
        Intent intent = new Intent(this, CoordinatorActivity.class);
        startActivity(intent);
    }

}
