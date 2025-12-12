import java.util.Scanner;

class Student {

 
    private String name;
    private int rollno;
    private int marks1;
    private int marks2;
    private int marks3;
    public String getName() {
        return name;
    }
    public int getRollno(){
        return rollno;
    }

    public int getMarks1() {
        return marks1;
    }

    public int getMarks2() {
        return marks2;
    }

    public int getMarks3() {
        return marks3;
    }

    
    public void setName(String name) {
        this.name = name;
    }

    public void setRollno( int rollno){
        this.rollno=rollno;
    }

    public void setMarks1(int marks1) {
        this.marks1 = marks1;
    }

    public void setMarks2(int marks2) {
        this.marks2 = marks2;
    }

    public void setMarks3(int marks3) {
        this.marks3 = marks3;
    }

    
    public double calculatePercentage() {
        int total = marks1 + marks2 + marks3;
        return (total / 3.0);
    }
}

public class StudentTest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Student s = new Student();
        s.setName("Vaishnav");
        s.setRollno(103);
        s.setMarks1(98);
        s.setMarks2(90);
        s.setMarks3(100);
        double percentage = s.calculatePercentage();
        System.out.println("Name: " + s.getName());
        System.out.println("Roll no :"+s.getRollno());
        System.out.println("Marks 1: " + s.getMarks1());
        System.out.println("Marks 2: " + s.getMarks2());
        System.out.println("Marks 3: " + s.getMarks3());
        System.out.println("Percentage: " + percentage+ "%");
    }
}
