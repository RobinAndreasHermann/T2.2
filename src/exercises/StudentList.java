package exercises;

import java.util.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class StudentList {

    ArrayList<Student> students = new ArrayList<>();

    StudentList(){

    }

    StudentList(StudentList studentList){
        for(Student s : studentList.students){
            Student studentCopy = new Student(s.getFirstname(), s.getLastname(), s.getStudentId(), s.getWeight(), s.getBirthday());
            this.students.add(studentCopy);
        }
    }

    //Methods for 2.8
    boolean add(Student student){
        if(containsId(student.getStudentId())){
            return false;
        }
        students.add(student);
        return true;
    }

    boolean remove(Student student){
        for (Student s : students) {
            if (Long.compare(s.getStudentId(), (student.getStudentId())) == 0){
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

    Student get(int pos){
        if(0 <= pos && pos < students.size()){
            return students.get(pos);
        }
        return null;
    }

    ArrayList<Integer> findLastname(String lastname){
        ArrayList<Integer> resultList = new ArrayList<>();
        for(Student s : students){
            if(s.getLastname().equals(lastname)){
                //find the position of the student with the lastname in the list
                resultList.add(findStudentId(s.getStudentId()));
            }
        }
        return resultList;
    }

    ArrayList<Integer> findFirstname(String firstname){
        ArrayList<Integer> resultList = new ArrayList<>();
        for(Student s : students){
            if(s.getFirstname().equals(firstname)){
                //find the position of the student with the firstname in the list
                resultList.add(findStudentId(s.getStudentId()));
            }
        }
        return resultList;
    }

    int findStudentId(long studentId){
        for(int i = 0; i < students.size(); i++){
            if(Long.compare(students.get(i).getStudentId(), studentId) == 0){
                return i;
            }
        }
        return -1;
    }

    int size(){
        int i = 0;
        for(Student s : students){
            i++;
        }
        return i;
    }

    private boolean containsId(final long studentId){
        for (Student s : students) {
            if (Long.compare(s.getStudentId(), studentId) == 0){
                return true;
            }
        }
        return false;
    }



}
