/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vut.data;

import java.io.Serializable;

import java.util.ArrayList;

/**
 *
 * @author st
 */
public class Student implements Serializable{
   private String studno,name,gender,phone,course,subject;
   
   public Student(){
   studno=name=phone=gender=course=subject="";
   
   }
   public Student(String studno,String name,String phone,String gender,String course,String subject){
       setStudNo(studno);
       setName(name);
       setPhone(phone);
       setGender(gender);
       setCourse(course);
       setSubject(subject);
   }
   public void setStudNo(String studno){
        if(studno.length() <=9){
             this.studno = studno;
            
        }else{
            throw new IllegalArgumentException("Invalid ID, only six digits");
        }
    }
   public void setName(String name){
       {
            this.name = name;
        }
    }
 public void setPhone(String phone){
   if(phone.length()==10){
       this.phone = phone;
            
        }else{
            throw new IllegalArgumentException("only 10 digits for phone no");
        }
   }
     public void setGender(String gender){
       {
            this.gender = gender;
        }
    }
       public void setCourse(String course){
       {
            this.course = course;
        }
    }
      public void setSubject(String subject){
       {
            this.subject = subject;
        }
    }
   //getters
  public String getStudNo(){return studno;}
   public String getName(){return name;} 
   public String getPhone(){return phone;}
   public String getGender(){return gender;}  
   public String getCourse(){return course;}
   public String getSubject(){return subject;} 
   
   //DA Methods Here
   
   
   
    @Override
   public String toString(){
   
   
   return studno+ "\t "+ name +"\t "+ phone+"\t "+ gender + "\t " + course + "\t "+ subject  ;
   }
}
