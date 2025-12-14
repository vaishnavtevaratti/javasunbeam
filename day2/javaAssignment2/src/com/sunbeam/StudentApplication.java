package com.sunbeam;
import java.util.*;

public class StudentApplication {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Student> students = new ArrayList<>();
        int choice;

        do {
        
            System.out.println("1. add student");
            System.out.println("2. display all students");
            System.out.println("3. search student by roll no");
            System.out.println("4. sort students by roll no");
            System.out.println("5. sort students by name");
            System.out.println("6. sort students by marks");
            System.out.println("0. exit");
            
            System.out.print("enter choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("enter roll no: ");
                    int roll = sc.nextInt();
                    sc.nextLine();

                    System.out.print("enter name: ");
                    String name = sc.nextLine();

                    System.out.print("enter marks: ");
                    int marks = sc.nextInt();

                    students.add(new Student(roll, name, marks));
                    System.out.println("student added");
                    break;

                case 2:
                    if (students.isEmpty()) {
                        System.out.println("no students");
                    } else {
                        for (Student s : students) {
                            System.out.println(s.toString()); 
                        }
                    }
                    break;

                case 3:
                    System.out.print("enter roll no: ");
                    int searchRoll = sc.nextInt();
                    boolean found = false;

                    for (Student s : students) {
                        if (s.getRollNo() == searchRoll) {
                            System.out.println("student found :");
                            System.out.println(s.toString());
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("student not found ");
                    }
                    break;
                   /* System.out.print("enter roll no: ");
                    int searchRoll = sc.nextInt();

                    Student key = new Student(searchRoll, "", 0);

                    if (students.contains(key)) {
                        int index = students.indexOf(key);
                        System.out.println("student found :");
                        System.out.println(students.get(index))
                    } else {
                        System.out.println("student not found");
                    }*/


                case 4:
                    Collections.sort(students);
                    System.out.println("students started by roll no ");
                    break;

                case 5:
                    Collections.sort(students, new Comparator<Student>() {
                        public int compare(Student s1, Student s2) {
                            return s1.getName().compareTo(s2.getName());
                        }
                    });
                    System.out.println("students sorted by name.");
                    break;

                case 6:
                    Collections.sort(students, new Comparator<Student>() {
                        public int compare(Student s1, Student s2) {
                            return s1.getMarks() - s2.getMarks();
                        }
                    });
                    System.out.println(" students sorted by marks.");
                    break;

                case 0:
                    System.out.println("exitt");
                    break;

                default:
                    System.out.println("invalid choice");
            }

        } while (choice != 0);

        sc.close();
    }
}
