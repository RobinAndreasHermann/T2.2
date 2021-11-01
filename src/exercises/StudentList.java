// AG0706
// Robin Hermann 108017239224, Konstantin Schauerte 108018219798, Leon Mainusch 108020225191
package exercises;

import java.util.ArrayList;

public class StudentList {

    ArrayList<Student> students = new ArrayList<>();

    /**
     * Inizializes an empty list of Students.
     */
    StudentList(){

    }

    /**
     * Initialize a copy of the passed list.
     * @param studentList an instance of the class StudentList to copy.
     */
    StudentList(StudentList studentList){
        for(Student s : studentList.students){
            Student studentCopy = new Student(s.getFirstname(), s.getLastname(), s.getStudentId(), s.getWeight(), s.getBirthday());
            this.students.add(studentCopy);
        }
    }


    //region Methods for Task 2.8

    /**
     * Adds the passed object of Student to the list, if the studentId does not net exists in the list.
     * @param student the object of Student to add to the list.
     * @return true if the Student was added. false if a Student with the same studentId already exists in the list.
     */
    boolean add(Student student){
        if(containsId(student.getStudentId())){
            return false;
        }
        students.add(student);
        return true;
    }

    /**
     * Removes the passed student from the list, if it exists in the list.
     * @param student The instance of Student to remove from the list.
     * @return true, if the Student was removed, false if the Student didn't exist in the list.
     */
    boolean remove(Student student){
        for (Student s : students) {
            if (Long.compare(s.getStudentId(), (student.getStudentId())) == 0){
                students.remove(s);
                return true;
            }
        }
        return false;
    }

    /**
     * Removes the Student at the passed index, if the index is in range.
     * @param pos The index at which the Student is deleted.
     * @return Returns the deleted Student if the index was in range, or null.
     */
    Student remove(int pos){
        if(0 <= pos && pos < students.size()){
            Student s = students.get(pos);
            students.remove(s);
            return s;
        }
        return null;
    }

    /**
     * Get the Student at the passed index, if the index is in range.
     * @param pos The Index of the Student to return.
     * @return Returns the Student at the passed index, or null if the index is not in range.
     */
    Student get(int pos){
        if(0 <= pos && pos < students.size()){
            return students.get(pos);
        }
        return null;
    }

    /**
     * Search in the list for the Students with the passed lastname.
     * @param lastname The lastname that is being searched for.
     * @return A list of indices of Students with the passed lastname.
     */
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

    /**
     * Search in the list for the Students with the passed firstname.
     * @param firstname The firstname that is being searched for.
     * @return A list of indices of Students with the passed firstname.
     */
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

    /**
     * Searches the list for a Student with the passed studentId
     * @param studentId The studentId for which the list is searched
     * @return Returns the index of the Student with the passed studentId if it exists in the list. Returns -1 otherwise.
     */
    int findStudentId(long studentId){
        for(int i = 0; i < students.size(); i++){
            if(Long.compare(students.get(i).getStudentId(), studentId) == 0){
                return i;
            }
        }
        return -1;
    }

    /**
     * Counts the number of Students in the list.
     * @return Returns the number of Students in the list.
     */
    int size(){
        int i = 0;
        for(Student s : students){
            i++;
        }
        return i;
    }

    /**
     * Searches the list for the passed studentId
     * @param studentId The studentId the list is searched for.
     * @return true, if the studentId exists in the list. false otherwise.
     */
    private boolean containsId(final long studentId){
        for (Student s : students) {
            if (Long.compare(s.getStudentId(), studentId) == 0){
                return true;
            }
        }
        return false;
    }
    //endregion


    /**
     * Sorts the list in ascending order according to the passed key.
     * @param key The key by which the list is sorted.
     */
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

                //reset currentIndex
                currentIndex = 0;
            }
            else{
                currentIndex++;
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

                //reset currentIndex
                currentIndex = 0;
            }
            else{
                currentIndex++;
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

                //reset currentIndex
                currentIndex = 0;
            }
            else{
                currentIndex++;
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

                //reset currentIndex
                currentIndex = 0;
            }
            else{
                currentIndex++;
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

                //reset currentIndex
                currentIndex = 0;
            }
            else{
                currentIndex++;
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
