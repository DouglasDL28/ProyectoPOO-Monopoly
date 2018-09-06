package Clases;

import Clases.Property.PrivateProperty;

import java.util.ArrayList;

public class Player {
    private Integer Xaxis;
    private Integer Yaxis;
    private Integer money;
    private ArrayList<PrivateProperty> properties;
    private Boolean inPrison;
    private Integer doublesCount;

    public Player( Boolean inPrison, Integer doublesCount) {
        Xaxis = 1;
        Yaxis = 1;
        this.money = 500;
        this.properties = new ArrayList<PrivateProperty>();
        this.inPrison = false;
        this.doublesCount = 0%4;
    }
}
