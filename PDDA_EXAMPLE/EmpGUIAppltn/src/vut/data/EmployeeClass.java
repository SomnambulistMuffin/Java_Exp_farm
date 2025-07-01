/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vut.data;

import java.text.NumberFormat;
import java.io.*;
import java.util.ArrayList;
/**
 *
 * @author Thaby
 */
public class EmployeeClass implements Serializable{
  // private int empNo;
  private String name, gender;
  //private int age;
  private double annualSalary,perc;
  public EmployeeClass(){
    
      name=gender="";
     
      annualSalary=perc=0;
   }
  public EmployeeClass(String name,String gender,double annualSalary,double perc){
      
      setName(name);
      setGender(gender);
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
    
  //DA METHODS
  public static void initialize()throws DataStorageException{
  EmployeeDA.initialize();
  }
  public static void terminate()throws DataStorageException{
  EmployeeDA.terminate();
  }
  public void addNew()throws DuplicateException{
  EmployeeDA.addNew(this);
  
  }
  
  public  void updateNm(String newNm)throws NotFoundException{
  EmployeeDA.updateNm(this, newNm);
  }
  public static EmployeeClass findEmp(String name)throws NotFoundException{
return EmployeeDA.findEmp(name);
  }
  
  public  void deleteEmp() throws NotFoundException{
  EmployeeDA.deleteEmp(this);
  }
   public static ArrayList<EmployeeClass>getAll(String stName){
   return EmployeeDA.getAll(stName);
   }
   public static ArrayList<EmployeeClass>getAll(){
   return EmployeeDA.getAll();
   }
  
  public String toString(){
  NumberFormat curr=NumberFormat.getCurrencyInstance();
        NumberFormat percs=NumberFormat.getPercentInstance();
  
        return name+"\t"+curr.format( annualSalary)+"\t"+curr.format(monthlySalary())+"\t"+curr.format(salaryIncrement());
  }   
}
