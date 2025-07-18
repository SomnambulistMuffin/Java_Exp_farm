/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vut.data;

import java.io.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author admin
 */
public class StudentDA 
{
   private static ArrayList<Student> arStud;
   private static final String stuFile="studs.dat";
   //initialize method
   public static void initialize() throws DataStorageException{
   try{
       FileInputStream fis=new FileInputStream(stuFile);
        ObjectInputStream objrd=new ObjectInputStream(fis);
        arStud=(ArrayList<Student>)objrd.readObject();
        objrd.close();
   }catch(FileNotFoundException ex){
       JOptionPane.showMessageDialog(null, "No data yet,load data "+ ex.getMessage());
       arStud=new ArrayList<>();
   }catch(IOException ex){
   throw new DataStorageException("No data to read"+ex.getMessage());
   }catch(ClassNotFoundException ex){
   JOptionPane.showMessageDialog(null,ex.getMessage());
   }
   }//init
   
//terminate
   public  static void terminate()throws DataStorageException{
   try{
   FileOutputStream fos=new FileOutputStream(stuFile);
   ObjectOutputStream objwr=new ObjectOutputStream(fos);
   objwr.writeObject(arStud);
   objwr.close();
   }catch(IOException ex){
   throw new DataStorageException("Error writing"+ex.getMessage());
   }
   }//term
   //add new record, by checking any duplicates
   public static void addNewStud(Student st)throws  DuplicateException{
   boolean duplicate=false;
       for (int i = 0; i < arStud.size()&&!duplicate; i++)
       {
        if(arStud.get(i).getnm().equals(st.getnm())) {
        duplicate=true;
        }  
       }
       if(duplicate){
       throw new DuplicateException(st.getnm() +" already exist");
                     
       }else{
       arStud.add(st);
       }
   }//add
   
   public static Student findStud(String sname)throws  NotFoundException{
   boolean found=false;
   Student astu=null;
       for (int i = 0; i < arStud.size()&&!found; i++)
       {
         astu=arStud.get(i);
         if(astu.getnm().equals(sname)){
         found=true;
         }
       }
       if(found){
       return astu;
       }else{
       throw  new NotFoundException(sname+" not found");
       
       }
   
   }//find
   
   //update stud subj
   public static void updateSubj(Student st,String nwSubj)throws NotFoundException{
   boolean found=false;
   for (int i = 0; i < arStud.size()&&!found; i++)
       {
         
         if(arStud.get(i).getnm().equals(st.getnm())){
         found=true;
         arStud.get(i).setscode(nwSubj);
         }
       }
   
   if(!found){
   throw new NotFoundException(st.getnm()+" not found for updating ");
   }
   }//update
   
   //delete stud subject
   public static void deleteSubj(Student st,String asubj)throws NotFoundException{
   boolean found=false;
   for (int i = 0; i < arStud.size()&&!found; i++)
       {
         
         if((arStud.get(i).getnm().equals(st.getnm())&&(arStud.get(i).getscode().equals(asubj)))){
         found=true;
         arStud.remove(i);
         }
       }
   
   if(!found){
   throw new NotFoundException(st.getnm()+" not found for updating ");
   }
   }//delete
   
   //retrive all from arraylist
   public static ArrayList<Student> getAllStudRec(){
   return arStud;
   }
   //retrive all stud who are doing specific subj from arraylist
   public static ArrayList<Student> getAllStudRec(String asubj){
   ArrayList arData=new ArrayList();
   for(Student astu:arStud){
   if(astu.getscode().equals(asubj)){
   arData.add(astu);
   }
   }
   return arData;
   }//getAll specific
}//DA
