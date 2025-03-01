package com.example.foodiexpress;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class FirstLayout  extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.firstlayout);
    }
    @Override
    protected  void onStart(){
        super.onStart();
    }
    @Override
    protected void onResume() {
        super.onResume();

        Button loginbtn = findViewById(R.id.loginbtn);

        loginbtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent loginPage = new Intent(FirstLayout.this, LoginActivity.class);
                startActivity(loginPage);
            }
        });
    }
}
