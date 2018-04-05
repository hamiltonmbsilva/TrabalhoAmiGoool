package amigoool.hamilton.com.amigoool.model;

import java.io.Serializable;

/**
 * Created by Hamilton on 05/04/2018.
 */

public class Jogadores implements Serializable {


    private int id, numero;
    private String nome, posicao;
    private Time time;

    public Jogadores() {
    }

    public Jogadores(int id, int numero, String nome, String posicao, Time time) {
        this.id = id;
        this.numero = numero;
        this.nome = nome;
        this.posicao = posicao;
        this.time = time;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }
}
