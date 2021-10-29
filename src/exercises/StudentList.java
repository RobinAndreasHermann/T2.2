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



    public void sort(Student.SortKey key){
        switch (key){
            case FIRSTNAME:{
                sortByFirstname();
                break;
            }
            case LASTNAME:{
                sortByLastname();
                break;
            }
            case STUDENT_ID:{
                sortByStudentId();
                break;
            }
            case WEIGHT:{
                sortByWeight();
                break;
            }
            case BIRTHDAY:{
                sortByBirthday();
                break;
            }
        }
    }


    /*
        Easy sorting algorithm where 2 neighbor field values are compared.
        If the left value is greater than the right, both Objects switches in the list.
        After two elements were switched, the algorithm starts at the beginning of the list.

        If the Algorithm reaches the last element of the list, no elements further need to be switched, so the list is sorted
     */
    private void sortByFirstname(){
        int currentIndex = 0;

        while (true){
            //if currentIndex reaches the end of students, the List is sorted
            if(currentIndex == students.size()-1){
                return;
            }
            //if the Students Firstname at currentIndex is greater than the FStudents Firstname at currentIndex +1, both Students switch
            if (students.get(currentIndex).getFirstname().compareTo(students.get(currentIndex + 1).getFirstname()) > 0){
                switchStudents(currentIndex, currentIndex+1);
            }
        }
    }

    private void sortByLastname(){
        int currentIndex = 0;

        while (true){
            //if currentIndex reaches the end of students, the List is sorted
            if(currentIndex == students.size()-1){
                return;
            }
            //if the Students Lastname at currentIndex is greater than the Students Lastname at currentIndex +1, both Students switch
            if (students.get(currentIndex).getLastname().compareTo(students.get(currentIndex + 1).getLastname()) > 0){
                switchStudents(currentIndex, currentIndex+1);
            }
        }
    }

    private void sortByStudentId(){
        int currentIndex = 0;

        while (true){
            //if currentIndex reaches the end of students, the List is sorted
            if(currentIndex == students.size()-1){
                return;
            }
            //if the Students StudentId at currentIndex is greater than the Students StudentId at currentIndex +1, both Students switch
            if ((students.get(currentIndex).getStudentId() - students.get(currentIndex + 1).getStudentId()) > 0){
                switchStudents(currentIndex, currentIndex+1);
            }
        }
    }

    private void sortByWeight(){
        int currentIndex = 0;

        while (true){
            //if currentIndex reaches the end of students, the List is sorted
            if(currentIndex == students.size()-1){
                return;
            }
            //if the Students Weight at currentIndex is greater than the Students Weight at currentIndex +1, both Students switch
            if ((students.get(currentIndex).getWeight() - students.get(currentIndex + 1).getWeight()) > 0){
                switchStudents(currentIndex, currentIndex+1);
            }
        }
    }

    private void sortByBirthday(){
        int currentIndex = 0;

        while (true){
            //if currentIndex reaches the end of students, the List is sorted
            if(currentIndex == students.size()-1){
                return;
            }
            //if the Students Birthday at currentIndex is greater than the Students Birthday at currentIndex +1, both Students switch
            if (students.get(currentIndex).getBirthday().compareTo(students.get(currentIndex + 1).getBirthday()) > 0){
                switchStudents(currentIndex, currentIndex+1);
            }
        }
    }



    /** Switches the Students at index1 with Student at index2
     *
     * @param index1 index of Student 1 to switch
     * @param index2 index of Student 2 to switch
     */
    private void switchStudents(int index1, int index2){
        Student temp = students.get(index1);
        students.set(index1, students.get(index2));
        students.set(index2, temp);
        return;
    }
}
