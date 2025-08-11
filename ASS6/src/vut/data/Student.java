package vut.data;

/**
 *
 * @author Nthabi
 */
  public class Student {
    //instance

    private int studentNo;
    private String name, subjectCode;
    private int test1, test2, test3;
    private Gender gender;

    public enum Gender {
        FEMALE, MALE
    }

    //DEFAULT 
    public Student() {
        this.studentNo = 0;
        this.name = "";
        this.subjectCode = "";
        this.test1 = 0;
        this.test2 = 0;
        this.test3 = 0;
        this.gender = null;

    }
    //PARAMETIZED

    public Student(int studentNo, String name, int test1, int test2, int test3, String subjectCode, Gender gender) {
        setStudentNo(studentNo);
        this.name = name;
        this.subjectCode = subjectCode;
        setTest1(test1);
        setTest2(test2);
        setTest3(test3);
        this.gender = gender;

    }
    //SETTERS

    public void setStudentNo(int studentNo) {
//      if (studentNo > 9) {
//       throw new IllegalArgumentException("The student number shouldnt be more than 9 characters");
//      }else{
        this.studentNo = studentNo;
    
    }
    public void setName(String name) {
        if (name.length()<0){
         throw new IllegalArgumentException("The name is invalid"); 
        }else{
        this.name = name;
    }
    }
    public void setSubjectCode(String subjectCode) {
      
        this.subjectCode = subjectCode;
    }
    
    public void setTest1(int test1) {
//       if (test1 < 0) {
//       throw new IllegalArgumentException("Test 1 is invalid");
//      }else{  
        this.test1 = test1;
    
    }
    public void setTest2(int test2) {
//       if (test2 < 0) {
//       throw new IllegalArgumentException("Test 1 is invalid");
//      }else{ 
        this.test2 = test2;
  
    }
    public void setTest3(int test3) {
//        if (test3 < 0) {
//       throw new IllegalArgumentException("Test 1 is invalid");
//      }else{ 
        this.test3 = test3;
    
    }
    public void setGender(Gender gender) {
       this.gender = gender;
    }
    //getter

    public int getStudentNo() {
        return studentNo;
    }

    public String getName() {
        return name;
    }

    public String getSubjectCode() {
        return subjectCode;
    }

    public int getTest1() {
        return test1;
    }

    public int getTest2() {
        return test2;
    }

    public int getTest3() {
        return test3;
    }

    public Gender getGender() {
        return gender;
    }

    //function calcSemesterMark()
    public int calcSemesterMark() {
        int smAverage;
        smAverage = (test1 + test2 + test3) / 3;
        return smAverage;
    }

    //function calcFinalMark
    public int calcFinalMark(int examMark) {
        int finalMark,semesterMark;
        semesterMark=calcSemesterMark();
        finalMark = ((examMark + semesterMark) / 2);
        return finalMark;

    }
    //toString

    @Override
    public String toString() {
        return ("studentNo=" + studentNo + "\nname=" + name + "\nsubjectCode=" + subjectCode + "\ntest1=" + test1 + "\ntest2=" + test2 + "\ntest3=" + test3 + "\ngender=" + gender);
    }

}
