package amigoool.hamilton.com.amigoool;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TelaPrincipal extends AppCompatActivity {

    Button BotaoCadastrarAmigos, BotaoGerarRodada;
    final int Tela_Cadastrar_Amigos = 1;
    final int Tela_Gerar_Rodada = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_principal);

        binding();

        BotaoCadastrarAmigos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent itn = new Intent(getApplicationContext(),Cadastrar_Amigos.class);
                startActivityForResult(itn, Tela_Cadastrar_Amigos);
            }
        });

        BotaoGerarRodada.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent itn = new Intent(getApplicationContext(),Rodada.class);
                startActivityForResult(itn, Tela_Gerar_Rodada);
            }
        });
    }

    private void binding() {

        BotaoCadastrarAmigos = findViewById(R.id.btnCadastrarAmigos);
        BotaoGerarRodada = findViewById(R.id.btnGerarRodada);
    }
}
