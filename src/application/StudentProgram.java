package application;

import entity.Student;

import java.util.Locale;
import java.util.Scanner;

public class StudentProgram {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Student student = new Student();
        student.name = sc.nextLine();
        student.note1 = sc.nextDouble();
        student.note2 = sc.nextDouble();
        student.note3 = sc.nextDouble();
        System.out.println("Final grade = " + student.finalNote());
        if (student.finalNote() < 60){
            System.out.println("FAILED MISSING " + student.missingPoints() + " POINTS");
        }else{
            System.out.println("PASS");
        }
        sc.close();
    }
}
