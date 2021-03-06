package amigoool.hamilton.com.amigoool.model;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by Hamilton on 05/04/2018.
 */

public class Time implements Serializable {

    private int id;
    private String nome;
    private ArrayList<Jogadores> jogadores;

    public Time() {

    }

    public Time(int id, String nome, ArrayList<Jogadores> jogadores) {
        this.id = id;
        this.nome = nome;
        this.jogadores = jogadores;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Jogadores> getJogadores() {
        return jogadores;
    }

    public void setJogadores(ArrayList<Jogadores> jogadores) {
        this.jogadores = jogadores;
    }
}
