package vut.Grading;

public class Grade {

    private  double grade;
    private char gradeSymbol;

    /**
     * grading class default constructor
     */
    public Grade()
{
    this(0,'F');
}

    /**
     * grading class overloaded constructor
     * @param grade numeric value of grading score
     * @param gradeSymbol symbolic value of average grading score
     */
    public Grade(double grade,char gradeSymbol)
{
    setGrade(grade);
   setGradeSymbol(gradeSymbol);
}

    /**
     * accessor for grade score
     * @param grade grade score
     */
    public void setGrade(double grade) {
        this.grade = grade;
    }

    /**
     * accessor for grade symbol
     * @param gradeSymbol grade average symbol
     */
    public void setGradeSymbol(char gradeSymbol) {
        this.gradeSymbol = gradeSymbol;
    }

    public char calcGrade(double grade)
    {
       // boolean mark = false;
      if (grade <100 && grade>= 80)
      {
          gradeSymbol = 'A';
      }  else
          if (grade <80 & grade>= 75)
          {
              gradeSymbol = 'B';
          }else
          if (grade <75 & grade>= 60)
          {
              gradeSymbol = 'C';
          } else
              if (grade <60 & grade>= 50)
              {
                  gradeSymbol = 'D';
              } else
              {
                  gradeSymbol = 'F';
              }

        return gradeSymbol;
      }

    @Override
    public String toString() {
        return  "The Grading is: " + gradeSymbol +
                "\nThe Score is: " + grade;

    }
}


