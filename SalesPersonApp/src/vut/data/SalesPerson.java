package vut.data;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Joseph
 */
public class SalesPerson implements Serializable {

    private String salesPersonID, name;
    private String cellPhone, address;
    private double sales1, sales2, sales3, sales4;
    public static final double SALES_FIXED_SALARY = 15000;

    public SalesPerson() {
        this("", "", "", "", 0, 0, 0, 0);
    }

    public SalesPerson(String salesPersonID, String name, String cellPhone, String address, double sales1, double sales2, double sales3, double sales4) {
        setSalesPersonID(salesPersonID);
        setName(name);
        setCellPhone(cellPhone);
        this.address = address;
        setSales1(sales1);
        setSales2(sales2);
        setSales3(sales3);
        setSales4(sales4);
    }

    public void setSalesPersonID(String salesPersonID) {
        if (salesPersonID.length() != 4) {
            throw new IllegalArgumentException("Sales person id must be four"
                    + "characters.\n" + salesPersonID);
        }
        this.salesPersonID = salesPersonID;
    }

    public void setName(String name) {
        if (name.length() < 2) {
            throw new IllegalArgumentException("Please enter enough characters / valid"
                    + "name. \n" + name);
        }
        this.name = name;
    }

    public void setCellPhone(String cellPhone) {
        if (!cellPhone.startsWith("081") && !cellPhone.startsWith("073")
                && !cellPhone.startsWith("084") && !cellPhone.startsWith("074")
                && !cellPhone.startsWith("061") && !cellPhone.startsWith("063")
                && !cellPhone.startsWith("083")) {

            throw new IllegalArgumentException("Please enter valid cellphone");

        } else if (cellPhone.length() != 10) {
            throw new IllegalArgumentException("Please enter 10 numerical digits for cellphone\n. "
                    + cellPhone);
        }
        this.cellPhone = cellPhone;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setSales1(double sales1) {
        if (sales1 < 0) {
            throw new IllegalArgumentException("sale 1 may not be negative. \n"
                    + sales1);
        }
        this.sales1 = sales1;
    }

    public void setSales2(double sales2) {
        if (sales2 < 0) {
            throw new IllegalArgumentException("sale 2 may not be negative. \n"
                    + sales2);
        }
        this.sales2 = sales2;
    }

    public void setSales3(double sales3) {
        if (sales3 < 0) {
            throw new IllegalArgumentException("sale 3 may not be negative. \n"
                    + sales3);
        }
        this.sales3 = sales3;
    }

    public void setSales4(double sales4) {
        if (sales4 < 0) {
            throw new IllegalArgumentException("sale 4 may not be negative. \n"
                    + sales4);
        }
        this.sales4 = sales4;
    }

    public String getSalesPersonID() {
        return salesPersonID;
    }

    public String getName() {
        return name;
    }

    public String getCellPhone() {
        return cellPhone;
    }

    public String getAddress() {
        return address;
    }

    public double getSales1() {
        return sales1;
    }

    public double getSales2() {
        return sales2;
    }

    public double getSales3() {
        return sales3;
    }

    public double getSales4() {
        return sales4;
    }

    public double getTotalSales() {
        return (sales1 + sales2 + sales3 + sales4);
    }

    public double getSalary() {
        double salary;
        double salaryAfterTax;
        final double TAX_RATE = 0.28;
        final double MAX_SALES = 30000.00;
        final double SALES_BONUS_PERC = 0.1;
        if (getTotalSales() > MAX_SALES) {
            salary = SALES_FIXED_SALARY + (getTotalSales() - MAX_SALES) * SALES_BONUS_PERC;
        } else {
            salary = SALES_FIXED_SALARY;
        }
        salaryAfterTax = salary - (salary * TAX_RATE);
        return salaryAfterTax;

    }

    public double getAnnualSalary() {
        final int NUM_OF_MONTHS = 12;
        return getSalary() * NUM_OF_MONTHS;
    }

    @Override
    public String toString() {
        return "Sales person ID\tName\tAddress\tCellphone\tSales 1\tSales \tSales 3\tSales 4" + "\n"
                + salesPersonID + ",\t" + name + ",\t" + address + ",\t" + cellPhone + ",\t"
                + sales1 + ",\t" + sales2 + ",\t" + sales3 + ",\t" + sales4;
    }

    public static void initiliase() throws DataStorageException {
        SalesPersonDA.initialise();
    }

    public static void terminate() throws DataStorageException {
        SalesPersonDA.terminate();
    }

    public void addSalesPerson() throws DuplicateException {
        SalesPersonDA.addSalesPerson(this);
    }

    public void updateSalesPerson() throws NotFoundException {
        SalesPersonDA.updateSalesPerson(this);
    }

    public void deleteSalesPerson(String cell) throws NotFoundException {
        SalesPersonDA.deleteSalesPerson(cell);
    }

    public SalesPerson findSalesPerson(String id) throws NotFoundException {
        return SalesPersonDA.findSalesPerson(id);
    }

    public java.util.ArrayList<SalesPerson> getAll() throws NotFoundException {
        return SalesPersonDA.getAll();
    }

    public double getSalesSalary() {
        return SalesPersonDA.calcSalary();
    }

    public double getAnnualSal() {
        return SalesPersonDA.annualSalary();
    }

    public double getSalesTotal() {
        return SalesPersonDA.salesTotal();
    }

    public double getCompanyTotalSales() {
        return SalesPersonDA.getAllTotalSales();
    }

    public double getCompanyTotalPaidSalaries() {
        return SalesPersonDA.getAllSalariesPaid();
    }

    public SalesPerson findHighestSales() throws NotFoundException {
        return SalesPersonDA.getHighestSalesPersonDetails();
    }

    public static ArrayList<SalesPerson> getIncrease() throws NotFoundException {
        return SalesPersonDA.increaseSalary();
    }

}
