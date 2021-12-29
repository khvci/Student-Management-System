public class Course {
    String courseName;
    String courseCode;
    int midtermResult;
    int finalResult;
    Tutor courseTutor;
    double courseAverage;
    boolean isCoursePassed;

    Course(String courseName, String courseCode)
    {
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.midtermResult = -1;
        this.finalResult = -1;
        this.courseAverage = (this.midtermResult * 0.2 + this.finalResult * 0.8);
        this.isCoursePassed = this.courseAverage >= 55;
    }

    public void addTutor(Tutor t)
    {
        if (this.courseCode.equals(t.branch))
        {
            this.courseTutor = t;
            System.out.println(this.courseTutor + " is assigned to " + this.courseName);
        } else {
        System.out.println(t + " can't be assigned to " + this.courseName);
    }
    }
}
