package com.ly.firstcode;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

public class FloatActionActivity extends AppCompatActivity {
    private FloatingActionButton mFloatBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_float_action);

        initView();
    }

    public void initView(){
        mFloatBtn = findViewById(R.id.btn_float_action);
        mFloatBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(FloatActionActivity.this,"点击悬浮按钮",Toast.LENGTH_SHORT).show();

                Snackbar.make(view,"一般用法", Snackbar.LENGTH_SHORT)
                        .setAction("undo", new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Toast.makeText(FloatActionActivity.this,"撤销",Toast.LENGTH_SHORT).show();
                            }
                        })
                        .show();
            }
        });
    }
}
