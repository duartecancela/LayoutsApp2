package com.example.layoutsapp2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickConstrainToGuideline(View view) {
        Intent intent = new Intent(this, ConstrainToGuidelineActivity.class);
        startActivity(intent);
    }

    public void onClickConstrainToBarrier(View view) {
        Intent intent = new Intent(this, ConstrainToBarrierActivity.class);
        startActivity(intent);
    }

    public void onClickAdjustConstrainBias(View view) {
        Intent intent = new Intent(this, AdjustConstraintBiasActivity.class);
        startActivity(intent);
    }

    public void onClickLinearGroups(View view) {
        Intent intent = new Intent(this, ControlLinearGroupsActivity.class);
        startActivity(intent);
    }
}