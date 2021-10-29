package exercises;

import java.util.Date;

public class Student {


    //Getter and setter Task 2.5
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


    //Filds for Task 2.2
    String firstname;
    String lastname;
    long studentId;
    double weight;
    Date birthday;

    //Enum for Task 2.3
    public enum SortKey{FIRSTNAME, LASTNAME, STUDENT_ID, WEIGHT, BIRTHDAY}

    Student(){
        //Call other constructor Task 2.4
        new Student(null, null, 0, 0, new Date(0));
    }

    Student(String firstname, String lastname, long studentId, double weight, Date birthday){
        this.firstname = firstname;
        this.lastname = lastname;
        this.studentId = studentId;
        this.weight = weight;
        this.birthday = birthday;
    }

    @Override
    public String toString(){
        return firstname + " " + lastname + " " + Long.toString(studentId) + " " + Double.toString(weight) + " " + birthday.toString();
    }


}
