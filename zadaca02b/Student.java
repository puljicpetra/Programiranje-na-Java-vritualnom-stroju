package zadaca02b;

/**
 * Klasa koja predstavlja studenta s ocjenama.
 *
 * @author Petra Puljić
 * @version 1.0
 */
public class Student {
    private String id;
    private String name;
    private String surname;
    private int noOfGrades;
    private CourseGrade[] grades;

    public Student() {
        grades = new CourseGrade[60]; // Maksimalni broj ocjena
        noOfGrades = 0;
    }

    public void addGrade(int code, String title, int grade) {
        if (noOfGrades >= grades.length) {
            System.out.println("Student je dosegao maksimalan broj ocjena.");
            return;
        }
        if (grade >= 2 && grade <= 5) {
            grades[noOfGrades++] = new CourseGrade(code, title, grade);
        }
    }

    public double averageGrade() {
        int sum = 0;
        for (int i = 0; i < noOfGrades; i++) {
            sum += grades[i].getGrade();
        }
        return noOfGrades > 0 ? (double) sum / noOfGrades : 0;
    }

    @Override
    public String toString() {
        return String.format("%s-%s, %s - Average grade %.2f",
                (id != null ? id : "N/A"),
                (surname != null ? surname : "N/A"),
                (name != null ? name : "N/A"),
                averageGrade());
    }

    public void printGrades() {
        if (noOfGrades == 0) {
            System.out.println(" - Nema unesenih ocjena.");
            return;
        }
        System.out.println("Ocjene:");
        for (int i = 0; i < noOfGrades; i++) {
            System.out.printf(" - %s (%d), Ocjena: %d%n", grades[i].getTitle(), grades[i].getCode(), grades[i].getGrade());
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Student otherStudent = (Student) obj;
        return id.equals(otherStudent.id);
    }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getSurname() { return surname; }
    public void setSurname(String surname) { this.surname = surname; }
}