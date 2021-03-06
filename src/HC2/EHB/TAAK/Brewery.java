package HC2.EHB.TAAK;

public class Brewery {
    private String Name_Brewery;

    private final int IDBrewery;

    private String Region;

    private String Adres;

    private String Brands;

    //construct

    public Brewery(String name_Brewery, int IDBrewery, String region, String Adres, String brands) {
        this.Name_Brewery = name_Brewery;
        this.IDBrewery = IDBrewery;
        this.Region = region;
        this.Adres = Adres;
        this.Brands = brands;
    }
    //getters

    public String getName_Brewery() {
        return Name_Brewery;
    }

    public int getIDBrewery() {
        return IDBrewery;
    }

    public String getRegion() {
        return Region;
    }

    public String getAdres() {
        return Adres;
    }

    public String getBrands() {
        return Brands;
    }

    //setters


    public void setName_Brewery(String name_Brewery) {
        Name_Brewery = name_Brewery;
    }

    public void setRegion(String region) {
        Region = region;
    }

    public void setAdres(String adres) {
        Adres = adres;
    }

    public void setBrands(String brands) {
        Brands = brands;
    }
}
