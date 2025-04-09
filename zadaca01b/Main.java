package zadaca01b;

/**
 * Glavna klasa koja pokrece program
 */
public class Main {

    /**
     * Glavna metoda koja kreira i provjerava pitanje s kratkim odgovorom
     *
     * @param args Argumenti (ne koriste se)
     */
    public static void main(String[] args) {
        // Kreiranje instance pitanja kratkog odgovora
        ShortAnswerQuestion question = new ShortAnswerQuestion(
                "U kojem jeziku se programira za Android?", "Java");

        // Ispis teksta pitanja
        System.out.println(question.getText());

        // Provjera odgovora "C"
        System.out.println("C: " + question.isCorrectAnswer("C"));

        // Provjera odgovora "java"
        System.out.println("java: " + question.isCorrectAnswer("java"));
    }
}