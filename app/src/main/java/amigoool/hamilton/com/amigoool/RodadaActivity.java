package amigoool.hamilton.com.amigoool;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

import amigoool.hamilton.com.amigoool.model.DAO.PlayerDAO;
import amigoool.hamilton.com.amigoool.model.Player;

public class RodadaActivity extends AppCompatActivity {

    private TextView time1, time2, time3, time4;

    private Button gerarRoda ;



    private String[] time = {"Botafogo", "Flamengo", "Fluminense", "Vasco"};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rodada);

        gerarRoda =findViewById(R.id.botaoGerarRodadaId);



        time1 = findViewById(R.id.textoTime1Id);
        time2 = findViewById(R.id.textoTime2Id);
        time3 = findViewById(R.id.textoTime3Id);
        time4 = findViewById(R.id.textoTime4Id);


        gerarRoda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                for(int i = 0; i < 2; i++) {

                    Random gerar = new Random();

                    int numeroAleatorio = gerar.nextInt(4);
                    int numeroAleatorio1 = gerar.nextInt(4);
                    int numeroAleatorio2 = gerar.nextInt(4);
                    int numeroAleatorio3 = gerar.nextInt(4);

                    if (numeroAleatorio != numeroAleatorio1 && numeroAleatorio2 != numeroAleatorio3) {
                        if (numeroAleatorio == 0) {
                            time1.setText("Botafogo");
                        } else if (numeroAleatorio == 1) {
                            time1.setText("Flamengo");
                        } else if (numeroAleatorio == 2) {
                            time1.setText("Fluminense");
                        } else if (numeroAleatorio == 3) {
                            time1.setText("Vasco");
                        }

                        if (numeroAleatorio1 == 0) {
                            time2.setText("Botafogo");
                        } else if (numeroAleatorio1 == 1) {
                            time2.setText("Flamengo");
                        } else if (numeroAleatorio1 == 2) {
                            time2.setText("Fluminense");
                        } else if (numeroAleatorio1 == 3) {
                            time2.setText("Vasco");
                        }

                        if ((numeroAleatorio2 != numeroAleatorio && numeroAleatorio2 != numeroAleatorio1) &&
                                (numeroAleatorio3 != numeroAleatorio && numeroAleatorio3 != numeroAleatorio1)) {

                            if (numeroAleatorio2 == 0) {
                                time3.setText("Botafogo");
                            } else if (numeroAleatorio2 == 1) {
                                time3.setText("Flamengo");
                            } else if (numeroAleatorio2 == 2) {
                                time3.setText("Fluminense");
                            } else if (numeroAleatorio2 == 3) {
                                time3.setText("Vasco");
                            }
                            if (numeroAleatorio3 == 0) {
                                time4.setText("Botafogo");
                            } else if (numeroAleatorio3 == 1) {
                                time4.setText("Flamengo");
                            } else if (numeroAleatorio3 == 2) {
                                time4.setText("Fluminense");
                            } else if (numeroAleatorio3 == 3) {
                                time4.setText("Vasco");
                            }
                        }

                    }
                }
            }
        });


    }
}
