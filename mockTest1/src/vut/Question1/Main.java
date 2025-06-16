package vut.Question1;
import vut.Question1.Product;
public class Main {


    public static void main(String[] args) {
       double salesPrice;
       int totalReceived;
	// write your code here
        Product objProd = new Product("Apples","AA11",15.99,50);

        System.out.println(objProd.toString());
        System.out.println("========================");

       salesPrice=  objProd.salesTransaction(30);
        System.out.println("the unit price is: " + salesPrice + "\nqty: " + objProd.getQty());
        totalReceived = objProd.receiveGoods(10);
        System.out.println("the total amount f goods " + totalReceived);
        salesPrice=  objProd.salesTransaction(25);
        System.out.println("the unit price is: " + salesPrice + "\nqty: " + objProd.getQty());
        salesPrice=  objProd.salesTransaction(10);
        System.out.println("the unit price is: " + salesPrice + "\nqty: " + objProd.getQty());

    }
}
