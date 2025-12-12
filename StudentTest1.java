import java.util.Scanner;

public class StudentTest1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Student s = new Student();

        System.out.print("Enter Name: ");
        s.setName(sc.nextLine());

        System.out.print("Enter Roll No: ");
        s.setrollno(sc.nextInt());

        System.out.print("Enter Marks 1: ");
        s.setmarks1(sc.nextInt());

        System.out.print("Enter Marks 2: ");
        s.setmarks2(sc.nextInt());

        System.out.print("Enter Marks 3: ");
        s.setmarks3(sc.nextInt());

        System.out.println("\n---- Student Details ----");
        System.out.println("Name: " + s.getName());
        System.out.println("Roll No: " + s.getRollno());
        System.out.println("Marks 1: " + s.getMarks1());
        System.out.println("Marks 2: " + s.getMarks2());
        System.out.println("Marks 3: " + s.getMarks3());
        System.out.println("Percentage: " + s.calculatepercentage() + "%");

        sc.close();
    }
}
