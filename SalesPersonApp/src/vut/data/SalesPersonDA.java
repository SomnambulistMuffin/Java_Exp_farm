package vut.data;

import java.util.ArrayList;
import java.io.*;

/**
 *
 * @author Joseph
 */
public class SalesPersonDA {

    private static ArrayList<SalesPerson> arSales;
    private static final File salesPersonFile = new File("salesperson.txt");
    private static double newSalary;

    // we read data from the textfile and then store it in an arraylist
    static void initialise() throws DataStorageException {
        FileInputStream read;
        ObjectInputStream reader;
        arSales = new ArrayList<>();

        if (salesPersonFile.exists()) {
            try {
                read = new FileInputStream(salesPersonFile);
                reader = new ObjectInputStream(read);
                arSales = (ArrayList<SalesPerson>) reader.readObject();
                read.close();
               // reader.close();
            } catch (IOException e) {
                throw new DataStorageException("There was a problem reading "
                        + "from salesPerson File. \n" + e.getMessage());
            } catch (ClassNotFoundException ex) {
                throw new DataStorageException("Salesperson.txt file does not exists.\n  "
                        + ex.getMessage());
            }
        } else {
            arSales = new ArrayList<>();
        }

    }

    //we write the data stored in arraylist to the textfile
    static void terminate() throws DataStorageException {
        FileOutputStream write;
        ObjectOutputStream writer;

        try {
            write = new FileOutputStream(salesPersonFile);
            writer = new ObjectOutputStream(write);

            writer.writeObject(arSales);
            write.close();
       
        } catch (IOException e) {
            throw new DataStorageException("There was a problem saving salesperson's data "
                    + " to salesperson.txt file. \n" + e.getMessage());
        }
    }

    //
    static void addSalesPerson(SalesPerson objSale) throws DuplicateException {
        boolean duplicate = false;
        SalesPerson salesPerson;

        for (int x = 0; x < arSales.size() && !duplicate; x++) {
            salesPerson = arSales.get(x);

            if (salesPerson.getSalesPersonID().equalsIgnoreCase(objSale.getSalesPersonID())) {
                duplicate = true;
            }
        }

        if (duplicate) {
            throw new DuplicateException("Sales person already added.\n "
                    + "Sales person ID: " + objSale.getSalesPersonID());
        } else {
            arSales.add(objSale);
        }

    }

    static void deleteSalesPerson(String cellNo) throws NotFoundException {

        SalesPerson salesPerson;
        boolean found = false;

        for (int x = 0; x < arSales.size() && !found; x++) {
            salesPerson = arSales.get(x);
            if (salesPerson.getCellPhone().equals(cellNo)) {
                found = true;
                arSales.remove(x);
            }
        }

        if (!found) {
            throw new NotFoundException("Hey wena this sales person does not"
                    + "exists.\n"
                    + "Sales person ID: " + cellNo);
        }
    }

    static void updateSalesPerson(SalesPerson objSale) {
        // we don't really need to code this method when using sequential file
        //this method will use shallow copy to update a salesperson record 

    }

    static SalesPerson findSalesPerson(String id) throws NotFoundException {
        boolean found = false;
        SalesPerson salesPerson = null;

        for (int x = 0; x < arSales.size() && !found; x++) {
            salesPerson = arSales.get(x);
            if (salesPerson.getSalesPersonID().equalsIgnoreCase(id)) {
                found = true;
            }
        }

        if (found) {
            return salesPerson;
        } else {
            throw new NotFoundException("Hey wena this sales person  with ID"
                    + ".\n"
                    + id + " " + "does not exists.");
        }
    }

    static java.util.ArrayList<SalesPerson> getAll() throws NotFoundException {
        // use shallow copy to return all sales person added to the list.
        return arSales;
    }

    static double calcSalary() {

        double salary = 0.0;
        for (int x = 0; x < arSales.size(); x++) {
            salary = arSales.get(x).getSalary();
        }
        return salary;

    }

    static double annualSalary() {

        double salary = 0.0;
        for (int x = 0; x < arSales.size(); x++) {
            salary = arSales.get(x).getAnnualSalary();
        }
        return salary;

    }

    static double salesTotal() {

        double salesTot = 0.0;
        for (int x = 0; x < arSales.size(); x++) {
            salesTot = arSales.get(x).getTotalSales();
        }
        return salesTot;

    }

    static double getAllTotalSales() {
        double overAllSales = 0.0;
        for (int x = 0; x < arSales.size(); x++) {
            overAllSales += arSales.get(x).getTotalSales();
        }
        return overAllSales;
    }

    static double getAllSalariesPaid() {
        double overAllSalary = 0.0;
        for (int x = 0; x < arSales.size(); x++) {
            overAllSalary += arSales.get(x).getSalary();
        }
        return overAllSalary;
    }

    static SalesPerson getHighestSalesPersonDetails() throws NotFoundException {
        boolean found = false;
        SalesPerson salesPerson = null;
        double higest = -9999999;

        for (int x = 0; x < arSales.size() && !found; x++) {
            salesPerson = arSales.get(x);

            if (salesPerson.getTotalSales() > higest) {
                found = true;
                higest = salesPerson.getTotalSales();

            }
        }
        if (found) {
            return salesPerson;
        } else {
            throw new NotFoundException("Highest sales not found. ");
        }
    }

    //increase the salary of all the sales person that lived in Johannesburg AND
    // has cellphone starts with 074 by 3% and return the sales person(s) along
    // with their new salary
    static ArrayList<SalesPerson> increaseSalary() throws NotFoundException {

        boolean found = false;
        SalesPerson salesPerson;
        final double INCREASE_RATE = 0.03;

        for (int x = 0; x < arSales.size() && !found; x++) {
            salesPerson = arSales.get(x);

            if (salesPerson.getAddress().contains("Johannesburg")
                    && salesPerson.getCellPhone().startsWith("074")) {
                found = true;
                newSalary = salesPerson.getSalary() + (salesPerson.getSalary() * INCREASE_RATE);
                arSales.add(salesPerson);

            }
        }
        if (found) {
            return arSales;
        } else {
            throw new NotFoundException("Highest sales not found");
        }

    }

   
}
