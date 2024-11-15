package br.com.etecia.controle_de_estoque;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.textfield.TextInputEditText;

import java.util.Objects;

public class TelaLogin extends AppCompatActivity {

    Button btnentra;
    TextInputEditText texto_tela_entrar_login, texto_tela_entrar_senha;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.tela_login_activity);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        btnentra = findViewById(R.id.bottao_tela_entrar);

        btnentra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email, senha;

                email = Objects.requireNonNull(texto_tela_entrar_login.getText()).toString().trim();
                senha = Objects.requireNonNull(texto_tela_entrar_senha.getText()).toString().trim();

                if (email.equals("Lula") && senha.equals("lindo")){
                    startActivity(new Intent(getApplicationContext(), TelaInicial.class));
                    finish();
                }else {
                    Toast.makeText(getApplicationContext(), "usuario invalido",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });




        }
    }
