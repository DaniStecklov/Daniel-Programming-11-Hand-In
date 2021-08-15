public class Student {
    private String firstName;
    private String lastName;
    private int grade;
    static int studentNumber = 1;
    private int studentID;

    public Student(String firstName, String lastName, int grade) {// constructor to initialize the variables
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;
        this.studentID = studentNumber;
        studentNumber ++;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public void printName(){ // when called it will print the students full name and grade
        System.out.println("Name: " + this.firstName + " " + this.lastName + "  ||  Grade: " + this.grade + "  ||  Student number: " + studentID);
    }
}
