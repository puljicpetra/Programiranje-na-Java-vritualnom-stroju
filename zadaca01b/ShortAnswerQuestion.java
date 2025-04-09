package zadaca01b;

/**
 * Klasa koja predstavlja pitanje s kratkim odgovorom
 */
public class ShortAnswerQuestion {

    /** Tekst pitanja. */
    private String text;

    /** Tocan odgovor. */
    private String correctAnswer;

    /**
     * Konstruktor koji inicijalizira pitanje i odgovor
     *
     * @param text          Tekst pitanja
     * @param correctAnswer Tocan odgovor
     */
    public ShortAnswerQuestion(String text, String correctAnswer) {
        this.text = text;
        this.correctAnswer = correctAnswer;
    }

    /**
     * Vraca tekst pitanja
     *
     * @return Tekst pitanja
     */
    public String getText() {
        return text;
    }

    /**
     * Provjerava je li odgovor tocan
     *
     * @param answer Odgovor koji se provjerava
     * @return true ako je odgovor tocan, u suprotnom - false.
     */
    public boolean isCorrectAnswer(String answer) {
        return correctAnswer.equalsIgnoreCase(answer);
    }
}