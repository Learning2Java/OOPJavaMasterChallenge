public class HamburgerBuilder {
    private String additional1Name;
    private String additional2Name;
    private String additional3Name;
    private String additional4Name;

    private double additional1Price;
    private double additional2Price;
    private double additional3Price;
    private double additional4Price;


    public HamburgerBuilder name1Price(String name, double price) {
        this.additional1Name = name;
        this.additional1Price = price;
        System.out.println("added " + name + " and costs: " + price);
        return this;
    }

    public HamburgerBuilder name2Price(String name, double price) {
        this.additional2Name = name;
        this.additional2Price = price;
        System.out.println("added " + name + " and costs: " + price);
        return this;
    }

    public HamburgerBuilder name3Price(String name, double price) {
        this.additional3Name = name;
        this.additional3Price = price;
        System.out.println("added " + name + " and costs: " + price);
        return this;
    }

    public HamburgerBuilder name4Price(String name, double price) {
        this.additional4Name = name;
        this.additional4Price = price;
        System.out.println("added " + name + " and costs: " + price);
        return this;
    }

    public HamburgerBuilder orderTotal() {
        double price = 0;
        if (this.additional1Name != null) {
            price += additional1Price;
            System.out.println("Current total with "+ additional1Name + " = " + price);
        }
        if (this.additional2Name != null) {
            price += additional2Price;
            System.out.println("Current total with "+ additional2Name + " = " + price);
        }
        if (this.additional3Name != null) {
            price += additional3Price;
            System.out.println("Current total with "+ additional3Name + " = " + price);
        }
        if (this.additional4Name != null) {
            price += additional4Price;
            System.out.println("Current total with "+ additional4Name + " = " + price);
        }
        return this;
    }

    public HamburgerFluent build() {

        HamburgerFluent hamburgerFluent = new HamburgerFluent();
        hamburgerFluent.setAdditional1Name(this.additional1Name);
        hamburgerFluent.setAdditional2Name(this.additional2Name);
        hamburgerFluent.setAdditional3Name(this.additional3Name);
        hamburgerFluent.setAdditional4Name(this.additional4Name);

        return hamburgerFluent;
    }
}
