package com.benli.testdagger2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.benli.coffee.CoffeeApp;
import com.benli.coffee.DaggerCoffeeApp_Coffee;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CoffeeApp.Coffee coffee = DaggerCoffeeApp_Coffee.builder().build();
        coffee.maker().brew();
    }
}
