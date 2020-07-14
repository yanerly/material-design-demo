package com.ly.firstcode;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import com.google.android.material.snackbar.Snackbar;

public class SnackBarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_snack_bar);
    }

    public void normalUse(View view){
        Snackbar.make(view,"一般用法", Snackbar.LENGTH_SHORT)
                .setAction("undo", new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(SnackBarActivity.this,"撤销",Toast.LENGTH_SHORT).show();
                    }
                })
                .show();

    }

    public void changeBg(View view){
        // 创建Snackbar
        Snackbar mSnackbar = Snackbar.make(view, "已加入行程", Snackbar.LENGTH_INDEFINITE);

        //设置Snackbar的背景颜色
        mSnackbar.getView().setBackgroundColor(ContextCompat.getColor(SnackBarActivity.this, R.color.colorPrimary));

        //设置Action文字的背景颜色
        mSnackbar.setActionTextColor(Color.WHITE);

        //添加操作
        mSnackbar.setAction("知道了", new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(SnackBarActivity.this,"完成",Toast.LENGTH_SHORT).show();
            }
        });
        //显示
        mSnackbar.show();
    }
}
