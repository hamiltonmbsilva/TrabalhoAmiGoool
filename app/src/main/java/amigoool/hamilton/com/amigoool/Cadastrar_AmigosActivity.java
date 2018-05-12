package amigoool.hamilton.com.amigoool;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

import amigoool.hamilton.com.amigoool.model.DAO.PlayerDAO;
import amigoool.hamilton.com.amigoool.model.DAO.TimeDAO;
import amigoool.hamilton.com.amigoool.model.Player;
import amigoool.hamilton.com.amigoool.model.Time;

public class Cadastrar_AmigosActivity extends AppCompatActivity {

    Button btnCadastrar;
    EditText  nome;
    final int Tela_Time = 1;
    private Spinner times;
    List<Time> listaTimes;
    //private TimeDAO tDAO;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastrar__amigos);

        binding();

        preencherSpinnerTime();


        btnCadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               //Intent itn = new Intent(getApplicationContext(), TimesActivity.class);

                Player p = new Player(1, nome.getText().toString(),
                        listaTimes.get(times.getSelectedItemPosition()));

                PlayerDAO pDAO = new PlayerDAO(getApplicationContext());
                pDAO.open();
                pDAO.gravar1(p);
                pDAO.close();
                setResult(1);
                finish();




            }
        });
    }

    private void preencherSpinnerTime() {
        TimeDAO tDAO = new TimeDAO(getApplicationContext());
        tDAO.open();

        int idx = 0;

        listaTimes = tDAO.findAll();
        //listaTimes = tDAO.findTimesByUser(idx);
        String[] time = new String[listaTimes.size()];
        for (Time t: listaTimes){
            time[idx] = t.getNome();
            idx++;
        }

        tDAO.close();
        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                getApplicationContext(),
                android.R.layout.simple_list_item_1,
                time);
        times.setAdapter(adapter);

    }

    private void binding() {

        btnCadastrar = findViewById(R.id.btnCadastrarAmigoTime);
        times = findViewById(R.id.spinnerTime);
        nome = findViewById(R.id.campoNomeAmigo);
    }
}
