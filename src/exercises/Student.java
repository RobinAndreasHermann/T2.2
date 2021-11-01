// AG0706
// Robin Hermann 108017239224, Konstantin Schauerte 108018219798, Leon Mainusch 108020225191
package exercises;

import java.util.Date;

public class Student {

    //Fields for Task 2.2
    String firstname;
    String lastname;
    long studentId;
    double weight;
    Date birthday;

    //region Getter and setter Task 2.5
    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public long getStudentId() {
        return studentId;
    }

    //no setter for studentId

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    //provide full name
    public String getName(){
        return firstname + "" + lastname;
    }
    //endregion


    //Enum for Task 2.3
    public enum SortKey{FIRSTNAME, LASTNAME, STUDENT_ID, WEIGHT, BIRTHDAY}

    /**
     * Initializes an Object of Student with:
     * firstname = null
     * lastname = null
     * studentId = 0
     * weight = 0
     * birthday = January 1, 1970 in UTC
     */
    Student(){
        //Call other constructor Task 2.4
        new Student(null, null, 0, 0, new Date(0));
    }

    /**
     * Initializes an object of Student
     * @param firstname The firstname of the student
     * @param lastname The Lastname of the student
     * @param studentId The StudentId of the Student
     * @param weight The weight of the student
     * @param birthday The birthday of the student
     */
    Student(String firstname, String lastname, long studentId, double weight, Date birthday){
        this.firstname = firstname;
        this.lastname = lastname;
        this.studentId = studentId;
        this.weight = weight;
        this.birthday = birthday;
    }

    /**
     * Returns all five fields of a student in one string, seperated by spaces
     * @return firstname lastname studentId weight birthday
     */
    @Override
    public String toString(){
        return firstname + " " + lastname + " " + Long.toString(studentId) + " " + Double.toString(weight) + " " + birthday.toString();
    }

}
