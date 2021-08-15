<<<<<<< HEAD
import java.util.ArrayList;

public class School {
    ArrayList<Teacher> teacherArrayList = new ArrayList<>();
    ArrayList<Student> studentArrayList = new ArrayList<>();

    public void addTeacherToList(String firstName, String lastName, String subject){// creates a new teacher and adds it to the arrayList
        Teacher teachers = new Teacher(firstName, lastName, subject);
        teachers.setFirstName(firstName);
        teachers.setLastName(lastName);
        teachers.setSubject(subject);
        teacherArrayList.add(teachers);
    }

    public void removeTeacherFromList(int location){// removes any teacher with the given name
        teacherArrayList.remove(location);
    }

    public void showTeacherList(){
        for (int i = 0; i < teacherArrayList.size(); i ++){
            teacherArrayList.get(i).printTeacher();
        }
    }

    public void addStudentToList(String firstName, String lastName, int grade){// creates a new teacher and adds it to the arrayList
        Student students = new Student(firstName, lastName, grade);
        students.setFirstName(firstName);
        students.setLastName(lastName);
        students.setGrade(grade);
        students.setStudentID(students.getStudentID());
        studentArrayList.add(students);
    }

     public void removeStudentFromList(int location){
        studentArrayList.remove(location);
     }

    public void showStudentList(){
        for (int i = 0; i < studentArrayList.size(); i ++){
            studentArrayList.get(i).printName();
        }
    }
}
=======
import java.util.ArrayList;

public class School {
    ArrayList<Teacher> teacherArrayList = new ArrayList<>();
    ArrayList<Student> studentArrayList = new ArrayList<>();

    public void addTeacherToList(String firstName, String lastName, String subject){// creates a new teacher and adds it to the arrayList
        Teacher teachers = new Teacher(firstName, lastName, subject);
        teachers.setFirstName(firstName);
        teachers.setLastName(lastName);
        teachers.setSubject(subject);
        teacherArrayList.add(teachers);
    }

    public void removeTeacherFromList(int location){// removes any teacher with the given name
        teacherArrayList.remove(location);
    }

    public void showTeacherList(){
        for (int i = 0; i < teacherArrayList.size(); i ++){
            teacherArrayList.get(i).printTeacher();
        }
    }

    public void addStudentToList(String firstName, String lastName, int grade){// creates a new teacher and adds it to the arrayList
        Student students = new Student(firstName, lastName, grade);
        students.setFirstName(firstName);
        students.setLastName(lastName);
        students.setGrade(grade);
        students.setStudentID(students.getStudentID());
        studentArrayList.add(students);
    }

     public void removeStudentFromList(int location){
        studentArrayList.remove(location);
     }

    public void showStudentList(){
        for (int i = 0; i < studentArrayList.size(); i ++){
            studentArrayList.get(i).printName();
        }
    }
}
>>>>>>> 23404bc075a6ba40993cd19d195a9d8c3a1ba1b7
