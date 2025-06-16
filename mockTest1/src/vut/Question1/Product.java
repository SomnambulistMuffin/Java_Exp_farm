package vut.Question1;

public class Product {
    private String description;
    private String code;
    private double unitPrice;
    private  int qty;

    public Product() {
        this("none","none",0.00,0);
    }

    public Product(String description, String code, double unitPrice, int qty) {
        setDescription(description);
        setCode(code);
       setUnitPrice(unitPrice);
        setQty(qty);
    }

    public String getDescription() {
        return description;
    }

    private void setDescription(String description) {
        if (description.length()>3) {
            this.description = description;
        }else {
            throw new IllegalArgumentException("invalid description entered");
        }

    }

    public String getCode() {
        return code;
    }

    private void setCode(String code) {
        if (code.length()>3) {
            this.code=code;
        }else {
            throw new IllegalArgumentException("invalid description entered");
        }

    }

    public double getUnitPrice() {
        return unitPrice;
    }

    private void setUnitPrice(double unitPrice) {
        if (unitPrice >=0.00 ) {
            this.unitPrice = unitPrice;
        }else {
            throw new NumberFormatException("invalid value entered");
        }

    }

    public int getQty() {
        return qty;
    }

    private void setQty(int qty) {
        if (qty >=0 ) {
            this.qty = qty;
        }else {
            throw new NumberFormatException("invalid value entered");
        }

    }

    public double salesTransaction(int prodsold){
        double sales;

        if (prodsold >= 0){
            sales = getQty() - prodsold;
            return sales;
        } else {
            throw new NumberFormatException("invalid values entered");
        }
    }

    public int receiveGoods(int numprod){

        if (numprod >=0) {
            return getQty() + numprod;
        }else {
            throw new NumberFormatException("invalid number values entered");
        }
    }

    @Override
    public String toString() {
        return "Product{" +
                "description='" + getDescription()+ '\'' +
                ", code='" + getCode() + '\'' +
                ", unitPrice=" + getUnitPrice() +
                ", qty=" + getQty() +
                '}';
    }
}
