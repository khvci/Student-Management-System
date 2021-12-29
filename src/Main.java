public class Main {
    public static void main(String[] args) {
        Course math101 = new Course("Math 101", "MAT101");
        Course science101 = new Course("Science 101", "SCI101");
        Course arts101 = new Course("Science 101", "ART101");

        Tutor mathTutor = new Tutor("Leonhard Euler", "MAT101");
        Tutor scienceTutor = new Tutor("Celal Şengör", "SCI101");
        Tutor artsTutor = new Tutor("Jean-Michel Basquiat", "ART101");

        math101.addTutor(mathTutor);
        science101.addTutor(scienceTutor);
        arts101.addTutor(artsTutor);

        Student student1 = new Student("Jane Doe", "1001", 1, math101, science101, arts101);
        student1.addMidtermResults(52, 27 ,41);
        student1.addFinalResults(60,58,45);


        Student student2 = new Student("John Doe", "1002", 1, math101, science101, arts101);
        student2.addMidtermResults(70,68,92);
        student2.addFinalResults(81,71,78);


        Student student3 = new Student("Dave Doe", "1003", 1, math101, science101, arts101);
        student2.addMidtermResults(32,25,28);
        student2.addFinalResults(44,54,52);

    }

}
