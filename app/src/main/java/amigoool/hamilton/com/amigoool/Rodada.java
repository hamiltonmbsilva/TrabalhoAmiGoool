package amigoool.hamilton.com.amigoool;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.Collections;

public class Rodada extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rodada);

        Object original = null;
        ArrayList<Times> embaralhar = new ArrayList <Times>() ;

        Collections.shuffle(embaralhar);

        ArrayList<Times> grupo1 = new ArrayList<>();
        ArrayList<Times> grupo2 = new ArrayList<>();
        ArrayList<Times> grupo3 = new ArrayList<>();
        ArrayList<Times> grupo4 = new ArrayList<>();

        for (int i =0; i<embaralhar.size(); i++){

            if (i < embaralhar.size()){
                grupo1.add(embaralhar.get(i));
            }else if(i < embaralhar.size() + 1){
                grupo2.add(embaralhar.get(i));
            }else if(i < embaralhar.size() + 1) {
                grupo3.add(embaralhar.get(i));
            }else{
                grupo4.add(embaralhar.get(i));
            }
        }
    }
}
