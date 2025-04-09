package zadaca04;

public class Person {
    private String ime;
    private String prezime;

    public Person(String ime, String prezime) {
        this.ime = ime;
        this.prezime = prezime;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public void displayDetails() {
        System.out.println("Ime: " + ime + ", Prezime: " + prezime);
    }
}