public class HamburgerBuilder {
    private String additional1Name;
    private String additional2Name;
    private String additional3Name;
    private String additional4Name;


    public HamburgerBuilder name1(String name) {
        this.additional1Name = name;
        System.out.println("added " + name);
        return this;
    }

    public HamburgerBuilder name2(String name) {
        this.additional2Name = name;
        System.out.println("added " + name);
        return this;
    }

    public HamburgerBuilder name3(String name) {
        this.additional3Name = name;
        System.out.println("added " + name);
        return this;
    }

    public HamburgerBuilder name4(String name) {
        this.additional4Name = name;
        System.out.println("added " + name);
        return this;
    }

 /*   public HamburgerFluent orderTotal() {
        double price = basePrice;
        if(additional1Name != null) {
            System.out.println("adding " + additional1Name + " for a price of " + additional1Price);
            price += additional1Price;
        }
        if(additional2Name != null) {
            System.out.println("adding " + additional2Name + " for a price of " + additional2Name);
            price += additional2Price;
        }
        if(additional3Name != null) {
            System.out.println("adding " + additional3Name + " for a price of " + additional3Name);
            price += additional3Price;
        }
        if(additional4Name != null) {
            System.out.println("adding " + additional4Name + " for a price of " + additional4Name);
            price += additional4Price;
        }*/
    public HamburgerFluent build() {

        HamburgerFluent hamburgerFluent = new HamburgerFluent();
        hamburgerFluent.setAdditional1Name(this.additional1Name);
        hamburgerFluent.setAdditional2Name(this.additional2Name);
        hamburgerFluent.setAdditional3Name(this.additional3Name);
        hamburgerFluent.setAdditional4Name(this.additional4Name);

        return hamburgerFluent;
    }
}
