package Clases;

public class PrivateProperty extends Property {
    private String Color;
    private int BuyingPrice;
    private int StayingPrice;
    private Boolean Owned;

    public PrivateProperty(String name, int x, int y, String color, int buyingPrice, int stayingPrice) {
        super(name, x, y);
        Color = color;
        BuyingPrice = buyingPrice;
        StayingPrice = stayingPrice;
        this.Owned = false;
    }

    public void buy(){
        this.Owned=true;
    }

    public void sell () { }

    public void buyHouse () {}

    public void buyHotel () { }

}
