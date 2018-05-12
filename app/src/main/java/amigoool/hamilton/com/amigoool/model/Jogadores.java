package amigoool.hamilton.com.amigoool.model;

import java.io.Serializable;

/**
 * Created by Hamilton on 12/04/2018.
 */

public class Jogadores implements Serializable{

    private int id, idTime;
    private String nome;

    public Jogadores() {
    }

    public Jogadores(int id, int idTime, String nome) {
        this.id = id;
        this.idTime = idTime;
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdTime() {
        return idTime;
    }

    public void setIdTime(int idTime) {
        this.idTime = idTime;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
