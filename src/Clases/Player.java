package Clases;

import java.util.ArrayList;

public class Player {
    private Integer Xaxis;
    private Integer Yaxis;
    private Integer money;
    private ArrayList<PrivateProperty> properties;
    private Boolean inPrison;


    public Player( Boolean inPrison, Integer doublesCount) {
        Xaxis = 1;
        Yaxis = 1;
        this.money = 500;
        this.properties = new ArrayList<PrivateProperty>();
        this.inPrison = false;
    }

    public Integer getXaxis() {
        return Xaxis;
    }

    public Integer getYaxis() {
        return Yaxis;
    }

    public Integer getMoney() {
        return money;
    }


    public ArrayList<PrivateProperty> getProperties() {
        return properties;
    }

    public void addProperty(PrivateProperty property) {
        this.properties.add(property);
    }

    public Boolean getInPrison() {
        return inPrison;
    }

    public void changePrisonState ( ) {
        if(!this.inPrison) {
            this.inPrison = true;
        } else {this.inPrison = false;}
    } //Cambia el estado de inPrison.
}
