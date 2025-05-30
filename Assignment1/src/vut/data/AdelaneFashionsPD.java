package vut.data;

public class AdelaneFashionsPD {

    private int storeNum;
    private String storeNumber, city,province,ownership;
    private Double sales;

    public enum Province{
        WC,EC,NC,NW,FS,KZN,GP,LP,MP;
    }
    public enum Ownership{

        C,F;
    }
    public AdelaneFashionsPD(String storeNumber, String city, String province, String ownership, Double sales) {

      setStoreNumber(storeNumber);
        setCity(city);
        setProvince(province);
        setOwnership(ownership);
        setSales(sales);
    }

    public String getStoreNumber() {
        return storeNumber;
    }

    public void setStoreNumber(String storeNumber) {
        this.storeNumber = storeNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getOwnership() {
        return ownership;
    }

    public void setOwnership(String ownership) {
        this.ownership = ownership;
    }

    public Double getSales() {
        return sales;
    }

    public void setSales(Double sales) {
        if (sales > 0){
            this.sales = sales;
        } else {
            throw new IllegalArgumentException("enter valid number");
        }

    }

    @Override
    public String toString() {
        return "AdelaneFashionsPD{" +
                "storeNumber='" + storeNumber + '\'' +
                ", city='" + city + '\'' +
                ", province='" + province + '\'' +
                ", ownership='" + ownership + '\'' +
                ", sales=" + sales +
                '}';
    }
    public void openConnection throws DataStorageException{
        AdelaneFashionsDA.initConnection();
    }

}
