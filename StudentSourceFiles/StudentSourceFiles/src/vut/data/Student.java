/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vut.data;

/**
   Store the data of a student
 @author 
 */
public final class Student
{
    public static final int MIN_YEAR_OF_STUDY = 2016;
    public static final int MAX_YEAR_OF_STUDY = 2030;
    
    public enum Gender {MALE, FEMALE };
            
    private int number;
    private String surname;
    private String faculty;
    private Gender gender;
    private int yearOfStudy;
    
    public Student() throws DataException
    {
       this(0,"none", "none", Gender.MALE, 2010); 
    }
    
    public Student(int number, String surname, String faculty, 
            Gender gender, int yearOfStudy) throws DataException
    {
        setNumber(number);
        setSurname(surname);
        setFaculty(faculty);
        setGender(gender);
        setYearOfStudy(yearOfStudy);
    }
    
    public void setNumber(int number)
    {
        this.number = number;
    }

    public void setSurname(String surname) throws DataException
    {
        if (surname.length() < 3)
            throw new DataException("The surname is too short");
        this.surname = surname;
    }

    public void setFaculty(String faculty)
    {
        this.faculty = faculty;
    }

    public void setGender(Gender gender)
    {
        this.gender = gender;
    }

    public void setYearOfStudy(int yearOfStudy) throws DataException
    {
        if (yearOfStudy >= MIN_YEAR_OF_STUDY && yearOfStudy <= MAX_YEAR_OF_STUDY)
            throw new DataException("The year of study must be between "
            + MIN_YEAR_OF_STUDY + " and " + MAX_YEAR_OF_STUDY);
        this.yearOfStudy = yearOfStudy;
    }

    public int getNumber()
    {
        return number;
    }

    public String getSurname()
    {
        return surname;
    }

    public String getFaculty()
    {
        return faculty;
    }

    public Gender getGender()
    {
        return gender;
    }

    public int getYearOfStudy()
    {
        return yearOfStudy;
    }

    @Override
    public String toString()
    {
        return getClass().getName() + "[" + "number=" + number + ", surname=" 
                + surname + ", faculty=" + faculty + ", gender=" + gender 
                + ", yearOfStudy=" + yearOfStudy + ']';
    }
       
    
    
}
