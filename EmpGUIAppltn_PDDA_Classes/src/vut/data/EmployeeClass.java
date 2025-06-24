/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vut.data;

import java.io.Serializable;
import java.text.NumberFormat;
import java.util.ArrayList;

/**
 *
 * @author Thaby
 */
public class EmployeeClass implements Serializable{
  
  private String name, gender,phoneNo;
  
  private double annualSalary,perc;
  public EmployeeClass(){
    
      name=gender=phoneNo="";
     
      annualSalary=perc=0;
   }
  public EmployeeClass(String name,String gender,String phoneNo,double annualSalary,double perc){
      
      setName(name);
      setGender(gender);
      setPhoneNo(phoneNo);
      setAnnualSalary(annualSalary);
      setPerc(perc);
  
  }
  public void setGender(String gender){
  this.gender=gender;
  }
  public String getGender(){
  return gender;
  }
  public void setName(String name){
  this.name=name;
  
  }
  public String getName(){
  return name;
  }
  
   public void setPhoneNo(String phoneNo){
  this.phoneNo=phoneNo;
  
  }
  public String getPhoneNo(){
  return phoneNo;
  }

  public void setAnnualSalary(double annualSalary){
  this.annualSalary=annualSalary;
  
  }
  public double getAnnualSalary(){
  return annualSalary;
  }
  public void setPerc(double perc){
  this.perc=perc;
  
  }
  public double getPerc(){
  return perc;
  }
  public double salaryIncrement(){
  return annualSalary+(annualSalary*perc/100);
  }
  public double monthlySalary(){
      return annualSalary/12;
  
  }
  public String toString(){
  NumberFormat curr=NumberFormat.getCurrencyInstance();
        NumberFormat percs=NumberFormat.getPercentInstance();
  
        return name+"\t "+phoneNo+" \t"+curr.format( annualSalary)+" \t"+curr.format(monthlySalary())+" \t"+curr.format(salaryIncrement());
  }
  
  //DA METHODS
  public static void initialize() throws DataStorageException{
  EmployeeDA.initialize();
  }
  public static void terminate()throws DataStorageException{
  EmployeeDA.terminate();
  }
  public  void addNewEmp() throws DuplicateException{
  EmployeeDA.addNewEmp(this);
  }
  public static EmployeeClass findEmp(String empname) throws NotFoundException{
  return EmployeeDA.findEmp(empname);
  }
  public  void updatePhone( String newphone) throws NotFoundException{
  EmployeeDA.updatePhone(this, newphone);
  }
  public  void deleteEmp() throws NotFoundException{
  EmployeeDA.deleteEmp(this);
  }
   public static ArrayList<EmployeeClass> getAllEmp(){
   return EmployeeDA.getAllEmp();
   }
   public static ArrayList<EmployeeClass> getAllEmp(String phonecode){
   return EmployeeDA.getAllEmp(phonecode);
   }
}
