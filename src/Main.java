public class Main {
    public static void main(String[] args) {
/*        Hamburger hamburger = new Hamburger("french", "medium", true, true, true, true);
        System.out.println(hamburger.orderTotal());
        hamburger.setLettuce(false);

        System.out.println(hamburger.orderTotal());*/

        /*Healthy healthy = new Healthy(true,true,true,true, true, true);
        healthy.setAdditional1Name("Drink", 4.00);
        System.out.println("Total price of burger: " + healthy.orderTotal());*/

        /*Deluxe deluxe = new Deluxe("French Roll", "medium");
        System.out.println(deluxe.getBreadType());

        deluxe.setLettuce(true);
        System.out.println(deluxe.orderTotal());*/

        HamburgerFluent hamburger = new HamburgerBuilder().name1("daf").name2("adsf").name3("daf").name4("daf").build();




    }
}

