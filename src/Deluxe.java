public class Deluxe extends Hamburger {
    private boolean drink;
    private boolean chips;
    private double deluxePrice;

    public Deluxe(String breadType, String meat) {
        super(breadType, meat, false, false, false, false);
        this.drink = true;
        this.chips = true;
        this.deluxePrice = 5.00;
    }

    @Override
    public double orderTotal() {
        double price = this.deluxePrice;
        return price;
    }

    public boolean isDrink() {
        return drink;
    }

    public boolean isChips() {
        return chips;
    }

    @Override
    public void setLettuce(boolean lettuce) {
        System.out.println("cannot add additional item");;
    }

    @Override
    public void setTomato(boolean tomato) {
        System.out.println("cannot add additional item");;
    }

    @Override
    public void setOnions(boolean onions) {
        System.out.println("cannot add additional item");;
    }

    @Override
    public void setPickles(boolean pickles) {
        System.out.println("cannot add additional item");;
    }
}

