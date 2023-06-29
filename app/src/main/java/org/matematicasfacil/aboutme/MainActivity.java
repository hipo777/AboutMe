package org.matematicasfacil.aboutme;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import org.matematicasfacil.aboutme.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}