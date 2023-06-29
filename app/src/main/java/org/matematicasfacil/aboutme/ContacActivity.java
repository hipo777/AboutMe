package org.matematicasfacil.aboutme;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import org.matematicasfacil.aboutme.databinding.ActivityContacBinding;

public class ContacActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityContacBinding binding = ActivityContacBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}