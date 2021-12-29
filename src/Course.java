public class Course {
    String courseName;
    String courseCode;
    int midtermResult;
    int finalResult;
    String courseTutor;
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
}
