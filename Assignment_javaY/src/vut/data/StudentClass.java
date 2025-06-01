package vut.data;

public class StudentClass {
    private String stdNo;
    private String studName;
    private String gender;
    private String subjCode;
    private int marks;

    //constrctor


    public StudentClass(String stdNo, String studName, String gender, String subjCode, int marks) {
        setStdNo(stdNo);
        setStudName(studName);
       setGender(gender);
        setSubjCode(subjCode);
        setMarks(marks);
    }

    public String getStdNo() {
        return stdNo;
    }

    public void setStdNo(String stdNo) {
        this.stdNo = stdNo;
    }

    public String getStudName() {
        return studName;
    }

    public void setStudName(String studName) {
        this.studName = studName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getSubjCode() {
        return subjCode;
    }

    public void setSubjCode(String subjCode) {
        this.subjCode = subjCode;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return
                "stdNo='" + stdNo + '\'' +
                ", studName='" + studName + '\'' +
                ", gender='" + gender + '\'' +
                ", subjCode='" + subjCode + '\'' +
                ", marks=" + marks
                ;
    }
}
