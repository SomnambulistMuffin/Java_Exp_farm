/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vut.data;
import java.io.*;
import java.util.ArrayList;
import javax.swing.*;

/**
 *
 * @author admin
 */
public class EmployeeDA
{
   private static ArrayList<EmployeeClass>aremp;
   private static final String empfile="emp.dat";
   //initialize method
   public static void initialize() throws DataStorageException{
  try{
  FileInputStream fis=new FileInputStream(empfile);
  ObjectInputStream myrid =new ObjectInputStream(fis);
  aremp=(ArrayList<EmployeeClass>)myrid.readObject();
  myrid.close();
  }catch(FileNotFoundException ex){
      JOptionPane.showMessageDialog(null, " file not yet exist "+ex.getMessage());
      aremp=new ArrayList<>();
  }catch(IOException ex){
  throw new DataStorageException("error writing to a file");
  }catch(ClassNotFoundException ex ){
  JOptionPane.showMessageDialog(null,ex.getMessage());
  }
       
   }//init
   //terminate method
   public static void terminate()throws DataStorageException{
   try{
       FileOutputStream fos=new FileOutputStream(empfile);
       ObjectOutputStream mywrite=new ObjectOutputStream(fos);
       mywrite.writeObject(aremp);
       mywrite.close();
               
   }catch(IOException ex){
       throw new DataStorageException("Error writting!");
   }
   }//term
   //Add new employee record to array
   public static void addNewEmp(EmployeeClass oemp) throws DuplicateException{
   boolean duplicate=false;
       for (int i = 0; i < aremp.size()&!duplicate; i++)
       {
           if(aremp.get(i).getName().equals(oemp.getName())){
           duplicate=true;
           }
       }
       if(duplicate){
       throw new DuplicateException(oemp.getName()+" Already exist");
       }else{
       aremp.add(oemp);
       }
   
   }//add
   //find employee record
   public static EmployeeClass findEmp(String empname) throws NotFoundException{
   boolean found=false;
   EmployeeClass oemp=null;
   for (int i = 0; i < aremp.size()&!found; i++){
   oemp=aremp.get(i);
       if(oemp.getName().equals(empname)){
       found=true;
       }
   }
   if(found){
   return oemp;
   }else{
   throw new NotFoundException(oemp.getName()+" not found");
   }
   }//find
   //update employee phone
   public static void updatePhone(EmployeeClass oemp, String newphone) throws NotFoundException{
   boolean found =false;
   for (int i = 0; i < aremp.size()&!found; i++){
   if(aremp.get(i).getName().equals(oemp.getName())){
   found=true;
   aremp.get(i).setPhoneNo(newphone);
   }
   }
   if(!found){
   throw new NotFoundException(oemp.getName()+" dont exist, cannot update");
   }
       
   }//update
   
//delete specific employee record

   public static void deleteEmp(EmployeeClass oemp) throws NotFoundException{
   boolean found =false;
   for (int i = 0; i < aremp.size()&!found; i++){
   if(aremp.get(i).getName().equals(oemp.getName())){
   found=true;
   aremp.remove(i);
   }
   }
   if(!found){
   throw new NotFoundException(oemp.getName()+" dont exist, cannot update");
   }
       
   }//delete
   //view all employees
   public static ArrayList<EmployeeClass> getAllEmp(){
   return aremp;
   }//all
    public static ArrayList<EmployeeClass> getAllEmp(String phonecode){
    ArrayList arData=new ArrayList();
     for(EmployeeClass oemp:aremp)  {
     if(oemp.getPhoneNo().startsWith(phonecode)){
     arData.add(oemp);
     }
     } 
     return arData;
    }//all with input
}//class DA
