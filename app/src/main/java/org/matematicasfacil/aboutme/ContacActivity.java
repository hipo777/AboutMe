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

                Intent sendIntent = new Intent(Intent.ACTION_DIAL);
                sendIntent.setData(Uri.parse("tel:123456789"));
                startActivity(sendIntent);
            }
        });
        binding.btnContacto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String message = binding.editTextMensaje.getText().toString();

                // Crear una intención de enviar un correo electrónico
                Intent emailIntent = new Intent(Intent.ACTION_SEND);
                emailIntent.setType("text/plain");

                // Establecer la dirección de correo electrónico y el asunto
                emailIntent.putExtra(Intent.EXTRA_EMAIL, "email@address.com");
                emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Asunto del mensaje");

                // Establecer el cuerpo del mensaje
                emailIntent.putExtra(Intent.EXTRA_TEXT, message);

                //Iniciar la actividad
                startActivity(Intent.createChooser(emailIntent, "Enviar correo electrónico a través de: "));
            }
        });

    }

}