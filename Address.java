public class Address {

    private String street;
    private String nr;
    private String town;

    public Address(String street, String nr, String town) {
        this.street = street;
        this.nr = nr;
        this.town = town;
    }

    public String getStreet() {
        return street;
    }

    public String getNr() {
        return nr;
    }

    public String getTown() {
        return town;
    }

    public String toString() {
        return street + " " + nr + ", " + town;
    }
}
