package exercises;

import org.junit.Test;
import org.junit.Assert;
import java.util.Date;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class StudentListTests {

    @Test
    public void t_copyConstructor(){

       StudentList l1 = new StudentList();

       for
    }

    @Test
    public void t_copyContructor_sameFirstnameAfterCopy(){

        Student student = createRandomStudent();
        StudentList studentList1 = new StudentList();
        studentList1.add(student);
        StudentList studentList2 = new StudentList(studentList1);


        Assert.assertEquals(studentList1.get(0).getFirstname() , studentList2.get(0).getFirstname());
    }

    @Test
    public void t_copyContructor_sameLastnameAfterCopy(){

        Student student = createRandomStudent();
        StudentList studentList1 = new StudentList();
        studentList1.add(student);
        StudentList studentList2 = new StudentList(studentList1);


        Assert.assertEquals(studentList1.get(0).getLastname() , studentList2.get(0).getLastname());
    }

    @Test
    public void t_copyContructor_sameStudentIdAfterCopy(){

        Student student = createRandomStudent();
        StudentList studentList1 = new StudentList();
        studentList1.add(student);
        StudentList studentList2 = new StudentList(studentList1);


        Assert.assertEquals(studentList1.get(0).getStudentId() , studentList2.get(0).getStudentId());
    }


    @Test
    public void t_copyContructor_sameWeightAfterCopy(){

        Student student = createRandomStudent();
        StudentList studentList1 = new StudentList();
        studentList1.add(student);
        StudentList studentList2 = new StudentList(studentList1);


        Assert.assertEquals(studentList1.get(0).getWeight() , studentList2.get(0).getWeight(), 0.000002f);
    }

    @Test
    public void t_copyContructor_sameBirthdaynameAfterCopy(){

        Student student = createRandomStudent();
        StudentList studentList1 = new StudentList();
        studentList1.add(student);
        StudentList studentList2 = new StudentList(studentList1);


        Assert.assertEquals(studentList1.get(0).getBirthday() , studentList2.get(0).getBirthday());
    }





    //Methods to create random values for testing


    private Student createRandomStudent(){
        String firstname = createRandomString(7);
        String lastname = createRandomString(10);
        long studentId = createRandomLong(10);
        //generates weight between 0 - 100
        double weight = new Random().nextDouble() * 100;
        Date birthday = createRandomDate(new Date(1980, 01, 01), new Date(2020, 01, 01));

        return new Student(firstname, lastname, studentId, weight, birthday);
    }

    //edited Template from https://www.baeldung.com/java-random-string Example 3
    private String createRandomString(int targetStringLength){
        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        Random random = new Random();
        StringBuilder buffer = new StringBuilder(targetStringLength);
        for (int i = 0; i < targetStringLength; i++) {
            int randomLimitedInt = leftLimit + (int)
                    (random.nextFloat() * (rightLimit - leftLimit + 1));
            buffer.append((char) randomLimitedInt);
        }
        String generatedString = buffer.toString();
        return generatedString;
    }

    //edited Template from https://www.baeldung.com/java-generate-random-long-float-integer-double Example 2.1
    private Long createRandomLong(int lenght) {
        if(lenght <= 0){
            return null;
        }
        long leftLimit = (long) Math.pow(10, lenght-1);
        long rightLimit = (long) (Math.pow(10, lenght)-1);
        long generatedLong = leftLimit + (long) (Math.random() * (rightLimit - leftLimit));
        return generatedLong;
    }

    // Source https://www.baeldung.com/java-random-dates
    public Date createRandomDate(Date startInclusive, Date endExclusive) {
        long startMillis = startInclusive.getTime();
        long endMillis = endExclusive.getTime();
        long randomMillisSinceEpoch = ThreadLocalRandom
                .current()
                .nextLong(startMillis, endMillis);

        return new Date(randomMillisSinceEpoch);
    }
}
