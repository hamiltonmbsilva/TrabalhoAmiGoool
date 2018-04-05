package amigoool.hamilton.com.amigoool.model;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by Hamilton on 05/04/2018.
 */

public class Time implements Serializable {

    private int id;
    private String nome, tecnico;
    private Pessoa pessoa;
    private ArrayList<Jogadores> jogadores;



    public Time(int id, String nome, String tecnico, Pessoa pessoa) {
        this.id = id;
        this.nome = nome;
        this.tecnico = tecnico;
        this.pessoa = pessoa;
    }

    public Time(){
        this.jogadores = new ArrayList<>();
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

    public String getTecnico() {
        return tecnico;
    }

    public void setTecnico(String tecnico) {
        this.tecnico = tecnico;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public ArrayList<Jogadores> getJogadores() {
        return jogadores;
    }

    public void setJogadores(ArrayList<Jogadores> jogadores) {
        this.jogadores = jogadores;
    }
}
