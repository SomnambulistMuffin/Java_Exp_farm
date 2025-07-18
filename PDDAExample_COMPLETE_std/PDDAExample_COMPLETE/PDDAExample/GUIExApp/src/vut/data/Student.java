/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vut.data;

import java.io.*;
import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class Student implements Serializable
{
  private String nm,gender,scode;
  private int marks;
  public Student(String nm,String gender,String scode,int marks){
      setnm(nm);
      setgender(gender);
      setscode(scode);
      setmarks(marks);
  }
  public void setnm(String nm){this.nm=nm;}
  public String getnm(){return nm;}
  
  public void setgender(String gender){this.gender=gender;}
  public String getgender(){return gender;}
  
  public void setscode(String scode){this.scode=scode;}
  public String getscode(){return scode;}
  
  public void setmarks(int marks){this.marks=marks;}
  public int getmarks(){return marks;}
  
  @Override
  public String toString(){
  return nm+"\t"+gender+"\t"+scode+"\t"+marks;
  }
  
  //DA Methods
  public static void initialize() throws DataStorageException{
  StudentDA.initialize();
  }
  public static void terminate() throws DataStorageException{
  StudentDA.terminate();
  }
  
  public  void addNewStud()throws  DuplicateException{
  StudentDA.addNewStud(this);
  
  }
  
  public static Student findStud(String sname)throws  NotFoundException{
  return StudentDA.findStud(sname);
  }
  
  public  void updateSubj(String nwSubj)throws NotFoundException{
  StudentDA.updateSubj(this, nwSubj);
  }
  public  void deleteSubj(String asubj)throws NotFoundException{
  StudentDA.deleteSubj(this, asubj);
  }
  public static ArrayList<Student> getAllStudRec(){
  return StudentDA.getAllStudRec();
  }
  public static ArrayList<Student> getAllStudRec(String asubj){
  return StudentDA.getAllStudRec(asubj);
  }
}
