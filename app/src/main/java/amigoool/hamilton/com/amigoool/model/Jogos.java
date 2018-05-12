package amigoool.hamilton.com.amigoool.model;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by Hamilton on 12/04/2018.
 */

public class Jogos implements Serializable{

    private int id;
    private Player player1;
    private Player player2;
    private int placar1, placar2;
    private ArrayList<Gols> gols;

    public Jogos() {
    }

    public Jogos(int id, Player player1, Player player2, int placar1, int placar2, ArrayList<Gols> gols) {
        this.id = id;
        this.player1 = player1;
        this.player2 = player2;
        this.placar1 = placar1;
        this.placar2 = placar2;
        this.gols = gols;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Player getPlayer1() {
        return player1;
    }

    public void setPlayer1(Player player1) {
        this.player1 = player1;
    }

    public Player getPlayer2() {
        return player2;
    }

    public void setPlayer2(Player player2) {
        this.player2 = player2;
    }

    public int getPlacar1() {
        return placar1;
    }

    public void setPlacar1(int placar1) {
        this.placar1 = placar1;
    }

    public int getPlacar2() {
        return placar2;
    }

    public void setPlacar2(int placar2) {
        this.placar2 = placar2;
    }

    public ArrayList<Gols> getGols() {
        return gols;
    }

    public void setGols(ArrayList<Gols> gols) {
        this.gols = gols;
    }
}
