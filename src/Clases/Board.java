package Clases;
import java.awt.*;
import java.util.ArrayList;

public class Board {
    private ArrayList<Player> players;
    private ArrayList<Property> cells;
    private Integer bank;
    private Boolean PlayerOneTurn;
    private Integer Height;
    private Integer Width;
    private ArrayList<PrivateProperty> freeCells;


    public Board(Integer bank, Integer height, Integer width) {
        this.players = new ArrayList<Player>();
        this.cells = new ArrayList<Property>();
        this.bank = bank;
        PlayerOneTurn = true;
        Height = height;
        Width = width;
        this.freeCells = new ArrayList<PrivateProperty>();
    }


    public void changeTurn () {
        if (PlayerOneTurn) {
            this.PlayerOneTurn = false;
        } else {this.PlayerOneTurn = true;}
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public ArrayList<Property> getCells() {
        return cells;
    }

    public void setCells(ArrayList<Property> cells) {
        this.cells = cells;
    }

    public Integer getBank() {
        return bank;
    }

    public void setBank(Integer bank) {
        this.bank = bank;
    }

    public Boolean getPlayerOneTurn() {
        return PlayerOneTurn;
    }

    public void setPlayerOneTurn(Boolean playerOneTurn) {
        PlayerOneTurn = playerOneTurn;
    }

    public Integer getHeight() {
        return Height;
    }



    public Integer getWidth() {
        return Width;
    }

    public ArrayList<PrivateProperty> getFreeCells() {
        return freeCells;
    }

    public void setFreeCells(ArrayList<PrivateProperty> freeCells) {
        this.freeCells = freeCells;
    }
}
