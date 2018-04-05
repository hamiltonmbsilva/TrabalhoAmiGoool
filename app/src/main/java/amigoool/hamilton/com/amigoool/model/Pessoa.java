package amigoool.hamilton.com.amigoool.model;

import java.io.Serializable;
import java.util.ArrayList;

import amigoool.hamilton.com.amigoool.Times;

/**
 * Created by Hamilton on 05/04/2018.
 */

public class Pessoa implements Serializable {

    private int id;
    private String nome;
    private GeneroTime genero;
    private ArrayList<Times> times;


    public Pessoa(int id, String nome, GeneroTime genero) {
        this.id = id;
        this.nome = nome;
        this.genero = genero;
    }

    public Pessoa(){
        this.times = new ArrayList<>();
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

    public GeneroTime getGenero() {
        return genero;
    }

    public void setGenero(GeneroTime genero) {
        this.genero = genero;
    }

    public ArrayList<Times> getTime() {
        return times;
    }

    public void setTime(ArrayList<Times> times) {
        this.times = times;
    }
}
