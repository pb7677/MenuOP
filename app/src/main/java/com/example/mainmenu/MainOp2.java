package com.example.mainmenu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;

public class MainOp2 extends AppCompatActivity {
    LinearLayout RL;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_op2); 
        RL = findViewById(R.id.RL2);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add("Black");
        menu.add("Green");
        menu.add("Yellow");
        menu.add("White");
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        String st = item.getTitle().toString();
        if (st.equals("Black")) {
            RL.setBackgroundColor(Color.BLACK);
        } else if (st.equals("Green")) {
            RL.setBackgroundColor(Color.GREEN);
        } else if (st.equals("Yellow")) {
            RL.setBackgroundColor(Color.YELLOW);
        } else if (st.equals("White")) {
            RL.setBackgroundColor(Color.WHITE);
        }
        return super.onOptionsItemSelected(item);
    }

    public void go2(View view) {
        Intent Fi = new Intent(this,MainActivity.class);
        startActivity(Fi);
    }
}