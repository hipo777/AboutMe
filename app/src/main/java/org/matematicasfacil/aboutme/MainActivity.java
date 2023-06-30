package org.matematicasfacil.aboutme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import org.matematicasfacil.aboutme.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        binding.floatingCompartir.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, ContacActivity.class);
            startActivity(intent);
        });
    }
}