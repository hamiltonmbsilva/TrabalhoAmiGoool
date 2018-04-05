package amigoool.hamilton.com.amigoool;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import amigoool.hamilton.com.amigoool.model.Pessoa;

public class Cadastrar_Amigos extends AppCompatActivity {

    Button btnOk;
    EditText campoNomeAmigo;
    final int Tela_Time = 1;
    private Spinner times;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastrar__amigos);

        binding();

        btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent itn = new Intent(getApplicationContext(), Times.class);

                itn.putExtra("nome", campoNomeAmigo.getText());
                Pessoa p = new Pessoa();

                itn.putExtra("Pessoa",p);

                startActivityForResult(itn, Tela_Time);
            }
        });
    }

    private void binding() {

        btnOk = findViewById(R.id.btnCadastrarAmigoTime);
    }
}
