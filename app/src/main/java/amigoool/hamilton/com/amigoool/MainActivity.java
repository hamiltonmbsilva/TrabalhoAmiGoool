package amigoool.hamilton.com.amigoool;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button BotaoTelaPrincipal;
    final int Tela_Principal = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        binding();

        BotaoTelaPrincipal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent itn = new Intent(getApplicationContext(),TelaPrincipal.class);

                startActivityForResult(itn, Tela_Principal);

            }
        });
    }

    private void binding() {

        BotaoTelaPrincipal = findViewById(R.id.btnEntrar);

    }
}
