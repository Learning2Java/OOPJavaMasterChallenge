public class Healthy extends Hamburger{
    private boolean mushrooms;
    private boolean frenchFries;
    private double mushroomPrice;
    private double friesPrice;

    public Healthy(boolean lettuce, boolean tomato, boolean onions, boolean pickles, boolean mushrooms, boolean frenchFries) {
        super("brown rye break roll", "vegetarian", lettuce, tomato, onions, pickles);
        this.mushrooms = mushrooms;
        this.frenchFries = frenchFries;
        this.mushroomPrice = 0.50;
        this.friesPrice = 2.00;
    }

    @Override
    public double orderTotal() {
        double price = super.orderTotal();
        while(mushrooms) {
            System.out.println("includes mushrooms = " + getMushroomPrice());
            price += mushroomPrice;
            break;
        }
        while (frenchFries) {
            System.out.println("includes french fries = " + friesPrice);
            price += friesPrice;
            break;
        }
        return price;
    }

    public boolean isMushrooms() {
        return mushrooms;
    }

    public boolean isFrenchFries() {
        return frenchFries;
    }

    public double getMushroomPrice() {
        return mushroomPrice;
    }

    public double getFriesPrice() {
        return friesPrice;
    }

    public void setMushrooms(boolean mushrooms) {
        this.mushrooms = mushrooms;
    }

    public void setFrenchFries(boolean frenchFries) {
        this.frenchFries = frenchFries;
    }
}
