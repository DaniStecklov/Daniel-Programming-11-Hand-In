public class Main {
    public static void main(String[] args) {
        School school = new School();
        school.addTeacherToList("Alexander", "Smith", "Math");
        school.addTeacherToList("Henry", "Johnson", "Math");
        school.addTeacherToList("Simon", "Williams", "Math");

        school.addStudentToList("Liam", "Brown", 8);
        school.addStudentToList("Noah", "Jones", 8);
        school.addStudentToList("Oliver", "Garcia", 9);
        school.addStudentToList("William", "Miller", 9);
        school.addStudentToList("James", "Davis", 9);
        school.addStudentToList("Emma", "Lopez", 10);
        school.addStudentToList("Charlotte", "Gonzalez", 10);
        school.addStudentToList("Sophia", "Wilson", 10);
        school.addStudentToList("Amelia", "Anderson", 11);
        school.addStudentToList("Mia", "Thomas", 11);


        school.showTeacherList();
        System.out.println("----------------------------------------------------------");
        school.showStudentList();
        System.out.println("----------------------------------------------------------");

        school.removeTeacherFromList(0);
        school.removeStudentFromList(0);
        school.removeStudentFromList(1);

        school.showTeacherList();
        System.out.println("----------------------------------------------------------");
        school.showStudentList();
    }
}
