package Clases;

public class PrivateProperty extends Property {
    private String Color;
    private int BuyingPrice;
    private int StayingPrice;
    private Boolean isBought= false;

    public PrivateProperty(String name, int x, int y, String color, int buyingPrice, int stayingPrice) {
        super(name, x, y);
        Color = color;
        BuyingPrice = buyingPrice;
        StayingPrice = stayingPrice;
    }
    public void buy(){
        this.isBought=true;
    }

    public void mortgage () {}

    public void sell () {}

    public void buyHouse () {}

    public void buyHoutel () { }

}
