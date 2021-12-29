public class Course {
    String courseName;
    String courseCode;
    double midtermResult;
    double finalResult;
    Tutor courseTutor;
    int courseAverage;

    Course(String courseName, String courseCode)
    {
        this.courseName = courseName;
        this.courseCode = courseCode;
    }

    public void addTutor(Tutor t)
    {
        if (this.courseCode.equals(t.branch))
        {
            this.courseTutor = t;
            System.out.println("--------------------------\n" + t.tutorName + " is assigned to " + this.courseName);
        } else {
        System.out.println(t + " can't be assigned to " + this.courseName);
    }
    }
}
