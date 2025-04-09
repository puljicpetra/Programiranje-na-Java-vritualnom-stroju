package zadaca04;

import java.util.Arrays;

public class Teacher extends Person {
    private String[] imenaPredmeta;
    private double iznosPlace;

    public Teacher(String ime, String prezime, String[] imenaPredmeta, double iznosPlace) {
        super(ime, prezime);
        this.imenaPredmeta = imenaPredmeta;
        this.iznosPlace = iznosPlace;
    }

    public String[] getImenaPredmeta() {
        return imenaPredmeta;
    }

    public void setImenaPredmeta(String[] imenaPredmeta) {
        this.imenaPredmeta = imenaPredmeta;
    }

    public double getIznosPlace() {
        return iznosPlace;
    }

    public void setIznosPlace(double iznosPlace) {
        this.iznosPlace = iznosPlace;
    }

    @Override
    public void displayDetails() {
        System.out.println("Ime i prezime: " + getIme() + " " + getPrezime());
        System.out.println("Predmeti: " + Arrays.toString(imenaPredmeta));
        System.out.println("Iznos plaće: " + iznosPlace + " EUR");
    }
}