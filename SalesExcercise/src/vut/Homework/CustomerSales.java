package vut.Homework;

public class CustomerSales {

    private double accSales, currSales;
    private String name;
    private Integer noSales;

public CustomerSales()
{
    this(0.0,"none",0,0);
}
public CustomerSales(double accSales,String name,Integer noSales,double currSales)
{
    setAccSales(accSales);
    setName(name);
    setNoSales(noSales);
    setCurrSales(currSales);
}

    public void setCurrSales(double currSales) {
        this.currSales = currSales;
    }

    public void setAccSales(double accSales) {
        this.accSales = accSales;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setNoSales(Integer noSales) {
        this.noSales = noSales;
    }






        return  (this.currSales + this.accSales)*(this.noSales++);
    }
    @Override

    public String toString()
    {
        return "the Person's name is: " + this.name +
                "\n the total amount is: " + this.salesPurchase(currSales) +
                "\n the number of sales are " + this.noSales ;
    }

}
