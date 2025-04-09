package zadaca02b;

import java.util.Scanner;

/**
 * Klasa za unos podataka o studentima putem tipkovnice.
 * Omogućuje unos podataka, unos ocjena i ispis studenata.
 *
 * @author Petra P1uljić
 * @version 1.0
 */
public class Main {
    private static final int MAX_STUDENTS = 100;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] students = new Student[MAX_STUDENTS];
        int studentCount = 0;

        while (true) {
            System.out.println("Unesite ID studenta (ili 'exit' za izlaz): ");
            String id = sc.nextLine();
            if (id.equalsIgnoreCase("exit")) break;

            if (studentCount >= MAX_STUDENTS) {
                System.out.println("Dosegnut maksimalan broj studenata.");
                break;
            }

            Student student = new Student();
            student.setId(id);

            System.out.println("Unesite ime studenta: ");
            student.setName(sc.nextLine());

            System.out.println("Unesite prezime studenta: ");
            student.setSurname(sc.nextLine());

            while (true) {
                System.out.println("Unesite šifru kolegija (ili '-1' za kraj unosa ocjena): ");
                int code = sc.nextInt();
                sc.nextLine(); // Čišćenje buffera
                if (code == -1) break;

                System.out.println("Unesite naziv kolegija: ");
                String title = sc.nextLine();

                System.out.println("Unesite ocjenu (2-5): ");
                int grade = sc.nextInt();

                student.addGrade(code, title, grade);
            }

            students[studentCount++] = student;
        }

        System.out.println("Popis studenata:");
        for (int i = 0; i < studentCount; i++) {
            System.out.println(students[i]);
            students[i].printGrades();
        }

        sc.close();
    }
}