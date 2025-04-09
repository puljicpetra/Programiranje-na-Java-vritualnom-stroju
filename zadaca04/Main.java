package zadaca04;

public class Main {
    public static void main(String[] args) {
        String[] predmetiStudent1 = {"Matematika", "Fizika", "Kemija"};
        String[] nastavniciStudent1 = {"Luka Lukić", "Marko Markić"};
        String[] predmetiStudent2 = {"Hrvatski", "Engleski"};
        String[] nastavniciStudent2 = {"Ivana Ivić", "Marija Marić"};

        Student s1 = new Student("Iva", "Ivić", 1234, predmetiStudent1, nastavniciStudent1);
        Student s2 = new Student("Ana", "Anić", 5678, predmetiStudent2, nastavniciStudent2);

        String[] predmetiNastavnika1 = {"Matematika", "Statistika"};
        String[] predmetiNastavnika2 = {"Hrvatski", "Literatura"};

        Teacher t1 = new Teacher("Luka", "Lukić", predmetiNastavnika1, 1000.0);
        Teacher t2 = new Teacher("Ivana", "Ivić", predmetiNastavnika2, 950.5);

        System.out.println("STUDENT 1");
        s1.displayDetails();

        System.out.println("\nSTUDENT 2");
        s2.displayDetails();

        System.out.println("\nTEACHER 1");
        t1.displayDetails();

        System.out.println("\nTEACHER 2");
        t2.displayDetails();
    }
}