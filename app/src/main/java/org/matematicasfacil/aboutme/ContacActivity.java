package org.matematicasfacil.aboutme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import org.matematicasfacil.aboutme.databinding.ActivityContacBinding;

public class ContacActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityContacBinding binding = ActivityContacBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        binding.btnLinkedin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.linkedin.com";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });
        binding.btnWhatsapp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String phoneNumber = "+56993858464"; // Número de teléfono al que deseas llamar por WhatsApp

                // Comprueba si WhatsApp está instalado en el dispositivo
                if (isWhatsAppInstalled()) {
                    // Abre WhatsApp con el número de teléfono proporcionado
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse("https://wa.me/$phoneNumber"));
                    startActivity(intent);
                } else {
                    // WhatsApp no está instalado, puedes mostrar un mensaje de error o redirigir a la Play Store
                    Toast.makeText(getBaseContext(), "HOla", Toast.LENGTH_LONG).show();

                }
            }
        });

    }
    private boolean isWhatsAppInstalled() {
        PackageManager packageManager = getPackageManager();
        try {
            packageManager.getPackageInfo("com.whatsapp", PackageManager.GET_ACTIVITIES);
            return true;
        } catch (PackageManager.NameNotFoundException e) {
            return false;
        }
    }
}