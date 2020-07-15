package com.manoj.menus;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText e1,e2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1 = (EditText)findViewById(R.id.edit1);
        e2 = (EditText)findViewById(R.id.editText2);
        registerForContextMenu(e1);
        registerForContextMenu(e2);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.option_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.m1:
                Toast.makeText(this, "You clicked Settings", Toast.LENGTH_SHORT).show();
                break;
            case R.id.m2:
                    Toast.makeText(this, "You click MIC", Toast.LENGTH_SHORT).show();
                    break;
            case R.id.m3:
                Toast.makeText(this, "You clicked Status", Toast.LENGTH_SHORT).show();
                break;
        }
        return true;
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        switch (v.getId()){
            case R.id.edit1:
                getMenuInflater().inflate(R.menu.name_menu,menu);
                break;
            case R.id.editText2:
                getMenuInflater().inflate(R.menu.surname_menu,menu);
                break;
        }
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.i1:
                Toast.makeText(this, "You clicked item1", Toast.LENGTH_SHORT).show();
                break;
            case R.id.i2:
                Toast.makeText(this, "You clicked item2", Toast.LENGTH_SHORT).show();
                break;
            case R.id.s1:
                Toast.makeText(this, "You clicked one", Toast.LENGTH_SHORT).show();
                break;
            case R.id.s2:
                Toast.makeText(this, "You clicked Two", Toast.LENGTH_SHORT).show();
                break;
        }
        return true;
    }
}
