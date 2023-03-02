public class Address {

    private String houseNum;
    private String street;
    private String city;
    private String state;
    private int zipCode;
    public Address(String houseNum,String street,String city,String state,int zipCode){
        this.houseNum = houseNum;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    public Address(Address info){
        this.houseNum = info.getHouseNum();
        this.street = info.getStreet();
        this.city = info.getCity();
        this.state = info.getState();
        this.zipCode = info.getZipCode();

    }

    public Address(String info){

    }

    public String getHouseNum() {
        return houseNum;
    }

    public void setHouseNum(String houseNum) {
        this.houseNum = houseNum;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }


}
