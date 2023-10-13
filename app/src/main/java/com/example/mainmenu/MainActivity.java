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
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    LinearLayout LL;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LL = findViewById(R.id.LL);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main,menu);
        return super.onCreateOptionsMenu(menu);
    }



    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        String st = item.getTitle().toString();
        if (st.equals("Black")) {
            LL.setBackgroundColor(Color.BLACK);
        } else if (st.equals("Green")) {
            LL.setBackgroundColor(Color.GREEN);
        } else if (st.equals("White")) {
            LL.setBackgroundColor(Color.WHITE);
        }
        return super.onOptionsItemSelected(item);
    }

    public void go(View view) {
        Intent Si = new Intent(this, MainOp2.class);
        startActivity(Si);
    }
}