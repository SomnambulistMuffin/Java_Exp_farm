package vut.Homework;

public class CustomerSalesTest {

    public static void main(String[] args) {
        double accAmount, currAmount;
        String name;
        Integer noSales;

        CustomerSales newSale;

        newSale = new CustomerSales();

        System.out.println(newSale);

        System.out.println("******************");

        newSale.setName("Maria Ndono");


        newSale.setAccSales(122.55);
        newSale.setCurrSales(87.44);
        newSale.setNoSales(1);


        System.out.println(newSale.toString());
        System.out.println("*********************");

        System.out.println(newSale.salesPurchase(87.44));

        System.out.println("************************");



        newSale.setAccSales(27.44);
       newSale.setCurrSales(55.33);
        newSale.salesPurchase(78.00);
       // newSale.salesPurchase(78.00);
       // newSale.salesPurchase(27.33);

        System.out.println(newSale.toString());




    }


}
