import java.util.ArrayList;
import java.util.Scanner;

class Student{
    int id; String name; int age; String course;
    Student(int i, String n, int a, String c) { id = i; name = n; age = a; course = c; }
    public String toString() { return id + " " + name + " " + age + " " + course; }
}

class Faculty {
    int id; String name; int age; String dept;
    Faculty(int i, String n, int a, String d) { id = i; name = n; age = a; dept = d; }
    public String toString() { return id + " " + name + " " + age + " " + dept; }
}

public class CollegeManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();
        ArrayList<Faculty> faculties = new ArrayList<>();

        while(true) {
            System.out.println("\n1-Add Student  2-Add Faculty  3-Show Students  4-Show Faculties  5-Exit");
            int ch = sc.nextInt();
            sc.nextLine();

            if(ch == 1) {
                students.add(new Student(sc.nextInt(), sc.next(), sc.nextInt(), sc.next()));
            }
            else if(ch == 2) {
                faculties.add(new Faculty(sc.nextInt(), sc.next(), sc.nextInt(), sc.next()));
            }
            else if(ch == 3) {
                for(Student s : students) System.out.println(s);
            }
            else if(ch == 4) {
                for(Faculty f : faculties) System.out.println(f);
            }
            else if(ch == 5) {
                break;
            }
        }
        sc.close();
    }
}