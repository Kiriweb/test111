public class Address {
    private int id;
    private int cityId;
    private String streetName;

    public  Address(){

    }

    public Address(int id, int cityId, String streetName) {
        this.id = id;
        this.cityId = cityId;
        this.streetName = streetName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

}
