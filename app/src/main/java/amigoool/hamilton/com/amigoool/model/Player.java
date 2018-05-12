package amigoool.hamilton.com.amigoool.model;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by Hamilton on 12/04/2018.
 */

public class Player implements Serializable {

    private int id;
    private String nome;
    private Time times;


    public Player() {
    }

    public Player(int id, String nome, Time times) {
        this.id = id;
        this.nome = nome;
        this.times = times;
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

    public Time getTimes() {
        return times;
    }

    public void setTimes(Time times) {
        this.times = times;
    }
}
