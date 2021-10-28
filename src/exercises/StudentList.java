package exercises;

import java.util.Date;
import java.util.ArrayList;
import java.util.List;

public class StudentList {

    ArrayList<Student> students = new ArrayList<Student>();

    StudentList(){

    }

    StudentList(StudentList studentList){
        for(Student s : studentList.students){
            this.students.add(s);
        }
    }
}
