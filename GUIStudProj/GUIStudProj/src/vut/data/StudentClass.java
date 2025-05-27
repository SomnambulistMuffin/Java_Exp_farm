/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vut.data;

/**
 *
 * @author user
 */
public class StudentClass
{
  private String stdno;
    private String stuname;
    private String gender;
    private String subjcode;
    private int marks;
    
    //constuctor
    
    public StudentClass(String stdno,String stuname,String gender,String subjcode,int marks){
        setStdno(stdno);
        setStuname(stuname);
        setGender(gender);
        setSubjcode(subjcode);
        setMarks(marks);
    }

    /**
     * @return the stdno
     */
    public String getStdno()
    {
        return stdno;
    }

    /**
     * @param stdno the stdno to set
     */
    public void setStdno(String stdno)
    {
        this.stdno = stdno;
    }

    /**
     * @return the stuname
     */
    public String getStuname()
    {
        return stuname;
    }

    /**
     * @param stuname the stuname to set
     */
    public void setStuname(String stuname)
    {
        this.stuname = stuname;
    }

    /**
     * @return the gender
     */
    public String getGender()
    {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(String gender)
    {
        this.gender = gender;
    }

    /**
     * @return the subjcode
     */
    public String getSubjcode()
    {
        return subjcode;
    }

    /**
     * @param subjcode the subjcode to set
     */
    public void setSubjcode(String subjcode)
    {
        this.subjcode = subjcode;
    }

    /**
     * @return the marks
     */
    public int getMarks()
    {
        return marks;
    }

    /**
     * @param marks the marks to set
     */
    public void setMarks(int marks)
    {
        this.marks = marks;
    }
  @Override
  public String toString(){
  
      return stdno+"\t"+stuname+"\t"+gender+"\t"+subjcode+"\t"+marks+"\n";
  
  }
  
}
