package exercises;

import org.junit.Test;
import org.junit.Assert;
import java.util.Date;

public class Test_StudentListSort {


    @Test
    public void t_sortFirstname_allNamesDiff(){
        //create Teststudents
        //Array of Students in the right order, to address them by index
        Student[] sArray = createTenSortedStudents();

        //Create List to sort
        StudentList slist = createUnsortedStudentlistOfTen(sArray);

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
        //Array of Students in the right order, to address them by index
        Student[] sArray = createTwentySortedStudents();


        //Create List to sort
        StudentList slist = createUnsortedStudentlistOfTwenty(sArray);


        //sort the List by Firstname
        slist.sort(Student.SortKey.FIRSTNAME);

        //Check if the List is sorted correctly
        for (int i = 0; i<20; i++){
            //compares the i´th Firstname in the right order with the i´th firstname in the sorted list
            Assert.assertEquals(sArray[i].getFirstname(), slist.get(i).getFirstname());
        }
    }



    @Test
    public void t_sortLastname_allNamesDiff(){
        //create Teststudents
        //Array of Students in the right order, to address them by index
        Student[] sArray = createTenSortedStudents();

        //Create List to sort
        StudentList slist = createUnsortedStudentlistOfTen(sArray);

        //sort the List by Lastname
        slist.sort(Student.SortKey.LASTNAME);

        //Check if the List is sorted correctly
        for (int i = 0; i<10; i++){
            //compares the i´th Lastname in the right order with the i´th Lastname in the sorted list
            Assert.assertEquals(sArray[i].getFirstname(), slist.get(i).getFirstname());
        }
    }

    @Test
    public void t_sortLastname_namesStartsWithOtherName(){
        //create Teststudents
        //Array of Students in the right order, to address them by index
        Student[] sArray = createTwentySortedStudents();


        //Create List to sort
        StudentList slist = createUnsortedStudentlistOfTwenty(sArray);


        //sort the List by Lastname
        slist.sort(Student.SortKey.LASTNAME);

        //Check if the List is sorted correctly
        for (int i = 0; i<20; i++){
            //compares the i´th Lastname in the right order with the i´th Lastname in the sorted list
            Assert.assertEquals(sArray[i].getLastname(), slist.get(i).getLastname());
        }
    }


    @Test
    public void t_sortStudentId(){
        //create Teststudents
        //Array of Students in the right order, to address them by index
        Student[] sArray = createTenSortedStudents();

        //Create List to sort
        StudentList slist = createUnsortedStudentlistOfTen(sArray);

        //sort the List by StudentId
        slist.sort(Student.SortKey.STUDENT_ID);

        //Check if the List is sorted correctly
        for (int i = 0; i<10; i++){
            //compares the i´th StudentId in the right order with the i´th StudentId in the sorted list
            Assert.assertEquals(sArray[i].getStudentId(), slist.get(i).getStudentId());
        }
    }


    @Test
    public void t_sortWeight(){
        //create Teststudents
        //Array of Students in the right order, to address them by index
        Student[] sArray = createTenSortedStudents();

        //Create List to sort
        StudentList slist = createUnsortedStudentlistOfTen(sArray);

        //sort the List by Weight
        slist.sort(Student.SortKey.WEIGHT);

        //Check if the List is sorted correctly
        for (int i = 0; i<10; i++){
            //compares the i´th Weight in the right order with the i´th Weight in the sorted list
            Assert.assertEquals(sArray[i].getWeight(), slist.get(i).getWeight(), 0.0001);
        }
    }


    @Test
    public void t_sortBirthday(){
        //create Teststudents
        //Array of Students in the right order, to address them by index
        Student[] sArray = createTenSortedStudents();

        //Create List to sort
        StudentList slist = createUnsortedStudentlistOfTen(sArray);

        //sort the List by birthday
        slist.sort(Student.SortKey.BIRTHDAY);

        //Check if the List is sorted correctly
        for (int i = 0; i<10; i++){
            //compares the i´th birthday in the right order with the i´th birthday in the sorted list
            Assert.assertEquals(sArray[i].getBirthday(), slist.get(i).getBirthday());
        }
    }


    //region Initialize Testvalues
    private Student[] createTenSortedStudents(){
        Student s0 = new Student("Firstname0", "Lastname0", 123456789000L, 10D, new Date(2000, 01, 01));
        Student s1 = new Student("Firstname1", "Lastname1", 123456789010L, 11D, new Date(2010, 01, 01));
        Student s2 = new Student("Firstname2", "Lastname2", 123456789020L, 12D, new Date(2020, 01, 01));
        Student s3 = new Student("Firstname3", "Lastname3", 123456789030L, 13D, new Date(2030, 01, 01));
        Student s4 = new Student("Firstname4", "Lastname4", 123456789040L, 14D, new Date(2040, 01, 01));
        Student s5 = new Student("Firstname5", "Lastname5", 123456789050L, 15D, new Date(2050, 01, 01));
        Student s6 = new Student("Firstname6", "Lastname6", 123456789060L, 16D, new Date(2060, 01, 01));
        Student s7 = new Student("Firstname7", "Lastname7", 123456789070L, 17D, new Date(2070, 01, 01));
        Student s8 = new Student("Firstname8", "Lastname8", 123456789080L, 18D, new Date(2080, 01, 01));
        Student s9 = new Student("Firstname9", "Lastname9", 123456789090L, 19D, new Date(2090, 01, 01));
        //Array of Students in the right order, to address them by index
        Student[] sArray = {s0, s1, s2, s3, s4, s5, s6, s7, s8, s9};
        return sArray;
    }

    private StudentList createUnsortedStudentlistOfTen(Student[] s){
        StudentList slist = new StudentList();
        slist.add(s[9]);
        slist.add(s[8]);
        slist.add(s[7]);
        slist.add(s[6]);
        slist.add(s[5]);
        slist.add(s[4]);
        slist.add(s[3]);
        slist.add(s[2]);
        slist.add(s[1]);
        slist.add(s[0]);

        return slist;
    }


    private Student[] createTwentySortedStudents(){
        Student[] firstTen = createTenSortedStudents();
        //Students are designed to fit between the first ten students, no matter which key is tested
        Student s00 = new Student("Firstname00", "Lastname00", 123456789001L, 100D, new Date(2001, 01, 01));
        Student s11 = new Student("Firstname11", "Lastname11", 123456789011L, 101D, new Date(2011, 01, 01));
        Student s22 = new Student("Firstname22", "Lastname22", 123456789021L, 102D, new Date(2021, 01, 01));
        Student s33 = new Student("Firstname33", "Lastname33", 123456789031L, 103D, new Date(2031, 01, 01));
        Student s44 = new Student("Firstname44", "Lastname44", 123456789041L, 104D, new Date(2041, 01, 01));
        Student s55 = new Student("Firstname55", "Lastname55", 123456789051L, 105D, new Date(2051, 01, 01));
        Student s66 = new Student("Firstname66", "Lastname66", 123456789061L, 106D, new Date(2061, 01, 01));
        Student s77 = new Student("Firstname77", "Lastname77", 123456789071L, 107D, new Date(2071, 01, 01));
        Student s88 = new Student("Firstname88", "Lastname88", 123456789081L, 108D, new Date(2081, 01, 01));
        Student s99 = new Student("Firstname99", "Lastname99", 123456789091L, 109D, new Date(2091, 01, 01));

        //Array of Students in the right order, to address them by index
        Student[] sArray = {firstTen[0], s00, firstTen[1], s11, firstTen[2], s22, firstTen[3], s33, firstTen[4], s44, firstTen[5], s55, firstTen[6], s66, firstTen[7], s77, firstTen[8], s88, firstTen[9], s99};
        return sArray;
    }

    private StudentList createUnsortedStudentlistOfTwenty(Student[] s){
        StudentList slist = new StudentList();
        slist.add(s[19]);
        slist.add(s[17]);
        slist.add(s[15]);
        slist.add(s[13]);
        slist.add(s[11]);
        slist.add(s[9]);
        slist.add(s[7]);
        slist.add(s[5]);
        slist.add(s[3]);
        slist.add(s[1]);
        slist.add(s[18]);
        slist.add(s[16]);
        slist.add(s[14]);
        slist.add(s[12]);
        slist.add(s[10]);
        slist.add(s[8]);
        slist.add(s[6]);
        slist.add(s[4]);
        slist.add(s[2]);
        slist.add(s[0]);

        return slist;
    }
    //endregion



}
