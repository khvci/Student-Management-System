import java.sql.SQLOutput;

public class Student {
    String studentName;
    String studentID;
    int studentClasses;
    Course math101, science101, arts101;
    double studentAverage;
    boolean isPassed;

    Student(String studentName, String studentID, int studentClasses, Course math101, Course science101, Course arts101)
    {
        this.studentName = studentName;
        this.studentID = studentID;
        this.studentClasses = studentClasses;
        this.math101 = math101;
        this.science101 = science101;
        this.arts101 = arts101;
        calcAverage();
        this.isPassed = false;
    }

    public void addExamNotes(int mathExam, int scienceExam, int artsExam)
    {
        if (mathExam >= 0 && mathExam <= 100)
        {
            this.math101.examResult = mathExam;
        }
        if (scienceExam >= 0 && scienceExam <= 100)
        {
            this.science101.examResult = scienceExam;
        }
        if (artsExam >= 0 && artsExam <= 100)
        {
            this.arts101.examResult = artsExam;
        }
    }

    public void calcAverage()
    {
        this.studentAverage = (this.math101.examResult + this.science101.examResult + this.arts101.examResult) / 3;
    }

    public void isPassed() {
        this.isPassed = coursePassed();
        printStatus();
        System.out.println("Average: " + this.studentAverage);

        if (this.studentAverage >= 55)
        {
            System.out.println("Passed.");
        } else {
            System.out.println("Failed.");
        }
    }

    public boolean coursePassed()
    {
        calcAverage();
        return this.studentAverage >= 55;
    }

    public void printStatus()
    {
        System.out.println("--------------------------");
        System.out.println("Student\t: " + this.studentName);
        System.out.println("Math 101\t: " + this.math101.examResult);
        System.out.println("Science 101\t: " + this.science101.examResult);
        System.out.println("Arts 101\t " + this.arts101.examResult);
    }

}
