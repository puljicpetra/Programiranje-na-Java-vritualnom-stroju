package zadaca04;

import java.util.Arrays;

public class Student extends Person {
    private int studentID;
    private String[] upisaniPredmeti;
    private String[] imenaNastavnika;

    public Student(String ime, String prezime, int studentID,
                   String[] upisaniPredmeti, String[] imenaNastavnika) {
        super(ime, prezime);
        this.studentID = studentID;
        this.upisaniPredmeti = upisaniPredmeti;
        this.imenaNastavnika = imenaNastavnika;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String[] getUpisaniPredmeti() {
        return upisaniPredmeti;
    }

    public void setUpisaniPredmeti(String[] upisaniPredmeti) {
        this.upisaniPredmeti = upisaniPredmeti;
    }

    public String[] getImenaNastavnika() {
        return imenaNastavnika;
    }

    public void setImenaNastavnika(String[] imenaNastavnika) {
        this.imenaNastavnika = imenaNastavnika;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("ID studenta: " + studentID);
        System.out.println("Upisani predmeti: " + Arrays.toString(upisaniPredmeti));
        System.out.println("Imena nastavnika: " + Arrays.toString(imenaNastavnika));
    }
}