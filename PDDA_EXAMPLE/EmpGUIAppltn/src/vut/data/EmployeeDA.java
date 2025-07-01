/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vut.data;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Thaby
 */
public class EmployeeDA {
    private static ArrayList<EmployeeClass>arEmp;
    private static final String empfile="emp.dat";
    public static void initialize()throws DataStorageException{
        try{
     FileInputStream fis=new FileInputStream(empfile);
       ObjectInputStream objRead=new ObjectInputStream(fis);
       arEmp=(ArrayList<EmployeeClass>)objRead.readObject();
       objRead.close();
   }catch(FileNotFoundException ex){
       JOptionPane.showMessageDialog(null,"No data in the file "+ex.getMessage());
       
       arEmp=new ArrayList<>();
   }catch(IOException ex){
   throw new DataStorageException("No data to read "+ex.getMessage());
   }catch(ClassNotFoundException ex){
     JOptionPane.showMessageDialog(null, ex.getMessage());
    }
}//init
    public static void terminate()throws DataStorageException{
      try{
    FileOutputStream fos=new FileOutputStream(empfile);
   ObjectOutputStream objWrite=new ObjectOutputStream(fos);
   
  objWrite.writeObject(arEmp);
  
  objWrite.close();
       
    }catch(IOException ex){
        throw new DataStorageException("Cannot write "+ex.getMessage());
    }
    }//term
    
    public static void addNew(EmployeeClass emp)throws DuplicateException{
    boolean duplicate=false;
        for (int i = 0; i < arEmp.size()&&!duplicate; i++) {
            if(arEmp.get(i).getName().equals(emp.getName())){
            duplicate=true;
            }
            
        }
        if(duplicate){
        throw new DuplicateException("Emp already exist");
        }else{
        arEmp.add(emp);
        }
    }//add
    public static void updateNm(EmployeeClass emp, String newNm)throws NotFoundException{
    boolean found=false;
    for (int i = 0; i < arEmp.size()&&!found; i++) {
            if(arEmp.get(i).getName().equals(emp.getName())){
            found=true;
            arEmp.get(i).setName(newNm);
            }
            
        }
    if(!found){
    throw  new NotFoundException(emp.getName()+" Not found for updating");
    }
    }//upd
    
    public static EmployeeClass findEmp(String name)throws NotFoundException{
    boolean found=false;
    EmployeeClass emp=null;
    for (int i = 0; i < arEmp.size()&&!found; i++) {
        emp=arEmp.get(i);
            if(emp.getName().equals(name)){
            found=true;
            }
            
        }
    if(found){
    return emp;
    }else{
    throw new NotFoundException(name+" Not found");
    }
    }//find
    
    public static void deleteEmp(EmployeeClass emp) throws NotFoundException{
    boolean found=false;
    
     for (int i = 0; i < arEmp.size()&&!found; i++) {
            if(arEmp.get(i).getName().equals(emp.getName())){
            found=true;
            arEmp.remove(i);
            }
            
        }
    if(!found){
    throw  new NotFoundException(emp.getName()+" Not found for deleting");
    }
    }//del
    public static ArrayList<EmployeeClass>getAll(String stName){
    ArrayList arD=new ArrayList<>();
    for(EmployeeClass emp:arEmp){
        if(emp.getName().startsWith(stName)){
    arD.add(emp);
        }
    }
    return arD;
    }//ar inp
    
    public static ArrayList<EmployeeClass>getAll(){
    return arEmp;
    }
}
