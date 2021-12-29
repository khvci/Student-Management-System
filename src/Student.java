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
        isPassed();
        this.isPassed = false;
    }

    public void addMidtermResults(int mathMidterm, int scienceMidterm, int artsMidterm)
    {
        if (mathMidterm >= 0 && mathMidterm <= 100)
        {
            this.math101.midtermResult = mathMidterm;
        }
        if (scienceMidterm >= 0 && scienceMidterm <= 100)
        {
            this.science101.midtermResult = scienceMidterm;
        }
        if (artsMidterm >= 0 && artsMidterm <= 100)
        {
            this.arts101.midtermResult = artsMidterm;
        }
    }

    public void addFinalResults(int mathFinal, int scienceFinal, int artsFinal)
    {
        if (mathFinal >= 0 && mathFinal <= 100)
        {
            this.math101.midtermResult = mathFinal;
        }
        if (scienceFinal >= 0 && scienceFinal <= 100)
        {
            this.science101.midtermResult = scienceFinal;
        }
        if (artsFinal >= 0 && artsFinal <= 100)
        {
            this.arts101.midtermResult = artsFinal;
        }
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
        if (math101.isCoursePassed && science101.isCoursePassed && arts101.isCoursePassed)
        {
            return true;
        } else {
            return false;
        }
    }

    public void printStatus()
    {
        System.out.println("--------------------------");
        System.out.println("Student\t: " + this.studentName);
        System.out.println("Math 101\t: " + this.math101.courseAverage);
        System.out.println("Science 101\t: " + this.science101.courseAverage);
        System.out.println("Arts 101\t " + this.arts101.courseAverage);
    }

}
