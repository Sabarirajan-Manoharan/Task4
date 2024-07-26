package Task4;

import java.util.AbstractQueue;

class AgeNotWithinRangeException extends Exception{
    public AgeNotWithinRangeException (String message){
        super(message);
    }
}

class NameNotValidException extends Exception{
    public NameNotValidException (String message){
        super(message);
    }
}

public class Student {

    private int rollNo;
    private String name;
    private String course;
    private int age;

    public Student(int rollNo, String name, String course, int age) throws AgeNotWithinRangeException, NameNotValidException {
        this.rollNo = rollNo;
        System.out.println(name+"********");
        for(int i=0;i<name.length();i++){
            if(!Character.isAlphabetic(name.charAt(i))){
                throw new NameNotValidException("Name should not contain number or special character");
            }
        }
        this.name = name;
        this.course = course;
        if(!(age >=15 && age <=21)){
            throw new AgeNotWithinRangeException("Age should be with in 15 to 21");
        }
        this.age= age;
    }

    public static void main(String[] args) throws AgeNotWithinRangeException,NameNotValidException {
        try{
            Student stu = new Student(123456,"Sabari","CSE",18);
            Student stu1 = new Student(123456,"Sabariraj","CSE",16);
            Student stu2 = new Student(123456,"Sabarirajan","CSE",33);
        }catch(AgeNotWithinRangeException e){
            System.out.println(e);
        }catch (NameNotValidException e){
            System.out.println(e);
        }

    }
}
