public class Student {
    String studentName;
    String studentID;
    int studentGrade;
    Course math101, science101, arts101;

    Student(String studentName, String studentID, int studentGrade, Course math101, Course science101, Course arts101)
    {
        this.studentName = studentName;
        this.studentID = studentID;
        this.studentGrade = studentGrade;
        this.math101 = math101;
        this.science101 = science101;
        this.arts101 = arts101;
    }

    public void addMidtermResults(double mathMidterm, double scienceMidterm, double artsMidterm)
    {
        if (mathMidterm >= 0 && mathMidterm <= 100)
        {
            math101.midtermResult = mathMidterm;
        }
        if (scienceMidterm >= 0 && scienceMidterm <= 100)
        {
            science101.midtermResult = scienceMidterm;
        }
        if (artsMidterm >= 0 && artsMidterm <= 100)
        {
            arts101.midtermResult = artsMidterm;
        }
    }

    public void addFinalResults(double mathFinal, double scienceFinal, double artsFinal)
    {
        if (mathFinal >= 0 && mathFinal <= 100)
        {
            math101.finalResult = mathFinal;
            math101.courseAverage = (int)((math101.midtermResult * 0.2) + (math101.finalResult * 0.8));
        }
        if (scienceFinal >= 0 && scienceFinal <= 100)
        {
            science101.finalResult = scienceFinal;
            science101.courseAverage = (int)((science101.midtermResult * 0.2) + (science101.finalResult * 0.8));
        }
        if (artsFinal >= 0 && artsFinal <= 100)
        {
            arts101.finalResult = artsFinal;
            arts101.courseAverage = (int)((arts101.midtermResult * 0.2) + (arts101.finalResult * 0.8));
        }
    }

    public void printStatus()
    {
        System.out.println("--------------------------");
        System.out.println("Student\t\t: " + this.studentName);
        System.out.println("Student ID\t: " + this.studentID);
        System.out.println("Math 101\t: " + this.math101.courseAverage + isCoursePassed(math101));
        System.out.println("Science 101\t: " + this.science101.courseAverage + isCoursePassed(science101));
        System.out.println("Arts 101\t: " + this.arts101.courseAverage + isCoursePassed(arts101));
    }

    public String isCoursePassed(Course courseName)
    {
        if (courseName.courseAverage >= 55)
        {
            return "\t Passed";
        } else {
            return "\t Failed";
        }
    }
}
