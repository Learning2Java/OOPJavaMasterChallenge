public class HamburgerFluent {
    private String breadType;
    private String meat;
    private String additional1Name;
    private String additional2Name;
    private String additional3Name;
    private String additional4Name;

    private double additional1Price;
    private double additional2Price;


    public void setAdditional1Name(String name) {
        this.additional1Name = name;
    }

    public void setAdditional2Name(String name) {
        this.additional2Name = name;
    }

    public void setAdditional3Name(String name) {
        this.additional3Name = name;
    }

    public void setAdditional4Name(String name) {
        this.additional1Name = name;
    }

    public String getBreadType() {
        return this.breadType;
    }

    public String getMeat() {
        return this.meat;
    }

    public String getAdditional1Name() {
        return this.additional1Name;
    }

    public String getAdditional2Name() {
        return this.additional2Name;
    }

    public String getAdditional3Name() {
        return this.additional3Name;
    }

    public String getAdditional4Name() {
        return this.additional4Name;
    }
}

