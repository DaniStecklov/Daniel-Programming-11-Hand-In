<<<<<<< HEAD
public class Teacher {
    private String firstName;
    private String lastName;
    private String subject;

    public Teacher(String firstName, String lastName, String subject) {// constructor to initialize the variables
        this.firstName = firstName;
        this.lastName = lastName;
        this.subject = subject;
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

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void printTeacher(){ // when called it will print the teachers full name and subject
        System.out.println("Name: " + getFirstName() + " " + getLastName() + "  ||  Subject: " + getSubject());
    }
}
=======
public class Teacher {
    private String firstName;
    private String lastName;
    private String subject;

    public Teacher(String firstName, String lastName, String subject) {// constructor to initialize the variables
        this.firstName = firstName;
        this.lastName = lastName;
        this.subject = subject;
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

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void printTeacher(){ // when called it will print the teachers full name and subject
        System.out.println("Name: " + getFirstName() + " " + getLastName() + "  ||  Subject: " + getSubject());
    }
}
>>>>>>> 23404bc075a6ba40993cd19d195a9d8c3a1ba1b7
