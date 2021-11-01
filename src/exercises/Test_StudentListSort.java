package exercises;

import org.junit.Test;
import org.junit.Assert;

import java.lang.reflect.Array;
import java.util.Date;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Test_StudentListSort {


    @Test
    public void t_sortFirstname_allNamesDiff(){
        //create Teststudents
        Student s0 = new Student("Firstname0", "Lastname0", 1234567890L, 100D, new Date(2000, 01, 01));
        Student s1 = new Student("Firstname1", "Lastname1", 1234567891L, 100D, new Date(2000, 01, 01));
        Student s2 = new Student("Firstname2", "Lastname2", 1234567892L, 100D, new Date(2000, 01, 01));
        Student s3 = new Student("Firstname3", "Lastname3", 1234567893L, 100D, new Date(2000, 01, 01));
        Student s4 = new Student("Firstname4", "Lastname4", 1234567894L, 100D, new Date(2000, 01, 01));
        Student s5 = new Student("Firstname5", "Lastname5", 1234567895L, 100D, new Date(2000, 01, 01));
        Student s6 = new Student("Firstname6", "Lastname6", 1234567896L, 100D, new Date(2000, 01, 01));
        Student s7 = new Student("Firstname7", "Lastname7", 1234567897L, 100D, new Date(2000, 01, 01));
        Student s8 = new Student("Firstname8", "Lastname8", 1234567898L, 100D, new Date(2000, 01, 01));
        Student s9 = new Student("Firstname9", "Lastname9", 1234567899L, 100D, new Date(2000, 01, 01));
        //Array of Students in the right order, to address them by index
        Student[] sArray = {s0, s1, s2, s3, s4, s5, s6, s7, s8, s9};

        //Create List to sort
        StudentList slist = new StudentList();
        slist.add(s9);
        slist.add(s8);
        slist.add(s7);
        slist.add(s6);
        slist.add(s5);
        slist.add(s4);
        slist.add(s3);
        slist.add(s2);
        slist.add(s1);
        slist.add(s0);

        //sort the List by Firstname
        slist.sort(Student.SortKey.FIRSTNAME);

        //Check if the List is sorted correctly
        for (int i = 0; i<10; i++){
            //compares the i´th Firstname in the right order with the i´th firstname in the sorted list
            Assert.assertEquals(sArray[i].getFirstname(), slist.get(i).getFirstname());
        }
    }

    @Test
    public void t_sortFirstname_namesStartsWithOtherName(){
        //create Teststudents
        Student s0 = new Student("Firstname0", "Lastname0", 12345678900L, 100D, new Date(2000, 01, 01));
        Student s1 = new Student("Firstname1", "Lastname1", 12345678910L, 100D, new Date(2000, 01, 01));
        Student s2 = new Student("Firstname2", "Lastname2", 12345678920L, 100D, new Date(2000, 01, 01));
        Student s3 = new Student("Firstname3", "Lastname3", 12345678930L, 100D, new Date(2000, 01, 01));
        Student s4 = new Student("Firstname4", "Lastname4", 12345678940L, 100D, new Date(2000, 01, 01));
        Student s5 = new Student("Firstname5", "Lastname5", 12345678950L, 100D, new Date(2000, 01, 01));
        Student s6 = new Student("Firstname6", "Lastname6", 12345678960L, 100D, new Date(2000, 01, 01));
        Student s7 = new Student("Firstname7", "Lastname7", 12345678970L, 100D, new Date(2000, 01, 01));
        Student s8 = new Student("Firstname8", "Lastname8", 12345678980L, 100D, new Date(2000, 01, 01));
        Student s9 = new Student("Firstname9", "Lastname9", 12345678990L, 100D, new Date(2000, 01, 01));

        Student s00 = new Student("Firstname00", "Lastname0", 12345678901L, 100D, new Date(2000, 01, 01));
        Student s11 = new Student("Firstname11", "Lastname1", 12345678911L, 100D, new Date(2000, 01, 01));
        Student s22 = new Student("Firstname22", "Lastname2", 12345678921L, 100D, new Date(2000, 01, 01));
        Student s33 = new Student("Firstname33", "Lastname3", 12345678931L, 100D, new Date(2000, 01, 01));
        Student s44 = new Student("Firstname44", "Lastname4", 12345678941L, 100D, new Date(2000, 01, 01));
        Student s55 = new Student("Firstname55", "Lastname5", 12345678951L, 100D, new Date(2000, 01, 01));
        Student s66 = new Student("Firstname66", "Lastname6", 12345678961L, 100D, new Date(2000, 01, 01));
        Student s77 = new Student("Firstname77", "Lastname7", 12345678971L, 100D, new Date(2000, 01, 01));
        Student s88 = new Student("Firstname88", "Lastname8", 12345678981L, 100D, new Date(2000, 01, 01));
        Student s99 = new Student("Firstname99", "Lastname9", 12345678991L, 100D, new Date(2000, 01, 01));

        //Array of Students in the right order, to address them by index
        Student[] sArray = {s0, s00, s1, s11, s2, s22, s3, s33, s4, s44, s5, s55, s6, s66, s7, s77, s8, s88, s9, s99};


        //Create List to sort
        StudentList slist = new StudentList();
        slist.add(s99);
        slist.add(s88);
        slist.add(s77);
        slist.add(s66);
        slist.add(s55);
        slist.add(s44);
        slist.add(s33);
        slist.add(s22);
        slist.add(s11);
        slist.add(s00);
        slist.add(s9);
        slist.add(s8);
        slist.add(s7);
        slist.add(s6);
        slist.add(s5);
        slist.add(s4);
        slist.add(s3);
        slist.add(s2);
        slist.add(s1);
        slist.add(s0);


        //sort the List by Firstname
        slist.sort(Student.SortKey.FIRSTNAME);

        //Check if the List is sorted correctly
        for (int i = 0; i<20; i++){
            //compares the i´th Firstname in the right order with the i´th firstname in the sorted list
            Assert.assertEquals(sArray[i].getFirstname(), slist.get(i).getFirstname());
        }
    }

    @Test
    public void t_sortFirstname_allNamesSame(){
//create Teststudents
        Student s0 = new Student("Firstname0", "Lastname0", 1234567890L, 100D, new Date(2000, 01, 01));
        Student s1 = new Student("Firstname0", "Lastname1", 1234567891L, 100D, new Date(2000, 01, 01));
        Student s2 = new Student("Firstname0", "Lastname2", 1234567892L, 100D, new Date(2000, 01, 01));
        Student s3 = new Student("Firstname0", "Lastname3", 1234567893L, 100D, new Date(2000, 01, 01));
        Student s4 = new Student("Firstname0", "Lastname4", 1234567894L, 100D, new Date(2000, 01, 01));
        Student s5 = new Student("Firstname0", "Lastname5", 1234567895L, 100D, new Date(2000, 01, 01));
        Student s6 = new Student("Firstname0", "Lastname6", 1234567896L, 100D, new Date(2000, 01, 01));
        Student s7 = new Student("Firstname0", "Lastname7", 1234567897L, 100D, new Date(2000, 01, 01));
        Student s8 = new Student("Firstname0", "Lastname8", 1234567898L, 100D, new Date(2000, 01, 01));
        Student s9 = new Student("Firstname0", "Lastname9", 1234567899L, 100D, new Date(2000, 01, 01));
        //Array of Students in the right order, to address them by index
        Student[] sArray = {s0, s1, s2, s3, s4, s5, s6, s7, s8, s9};

        //Create List to sort
        StudentList slist = new StudentList();
        slist.add(s9);
        slist.add(s8);
        slist.add(s7);
        slist.add(s6);
        slist.add(s5);
        slist.add(s4);
        slist.add(s3);
        slist.add(s2);
        slist.add(s1);
        slist.add(s0);

        //sort the List by Firstname
        slist.sort(Student.SortKey.FIRSTNAME);

        //Check if the List is sorted correctly
        for (int i = 0; i<10; i++){
            //compares the i´th Firstname in the right order with the i´th firstname in the sorted list
            Assert.assertEquals(sArray[i].getFirstname(), slist.get(i).getFirstname());
        }
    }





}
