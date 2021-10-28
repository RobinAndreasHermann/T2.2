package exercises;

import java.util.Date;
import java.util.ArrayList;
import java.util.List;

public class StudentList {

    ArrayList<Student> students = new ArrayList<>();

    StudentList(){

    }

    StudentList(StudentList studentList){
        for(Student s : studentList.students){
            this.students.add(s);
        }
    }

    //Methods for 2.8
    boolean add(Student student){
        for (Student s : students) {
            if (s.getStudentId() == student.getStudentId()){
                return false;
            }
        }
        students.add(student);
        return true;
    }

    boolean remove(Student student){
        for (Student s : students) {
            if (s.getStudentId() == student.getStudentId()){
                students.remove(s);
                return true;
            }
        }
        return false;
    }

    Student remove(int pos){
        if(0 <= pos && pos < students.size()){
            Student s = students.get(pos);
            students.remove(s);
            return s;
        }
        return null;
    }
}
