package amigoool.hamilton.com.amigoool.model;

import java.io.Serializable;

/**
 * Created by Hamilton on 12/04/2018.
 */

public class Gols implements Serializable {

    private int id;
    private Time time;
    private Jogadores jogadores;

    public Gols() {
    }

    public Gols(int id, Time time, Jogadores jogadores) {
        this.id = id;
        this.time = time;
        this.jogadores = jogadores;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public Jogadores getJogadores() {
        return jogadores;
    }

    public void setJogadores(Jogadores jogadores) {
        this.jogadores = jogadores;
    }
}
