public class Course {
    String courseName;
    String courseCode;
    int examResult;
    String courseTutor;

    Course(String courseName, String courseCode)
    {
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.examResult = -1;
    }
}
