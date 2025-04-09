package zadaca06;

public class Quiz {
    private String name;
    private ShortAnswerQuestion[] questions = new ShortAnswerQuestion[10];
    private int brPitanja = 0;

    public Quiz() {
        name = "Quiz";
    }

    public String getName() {
        return name;
    }

    public void addQuestion(String text, String answer) {
        if (brPitanja < questions.length) {
            questions[brPitanja] = new ShortAnswerQuestion(text, answer);
            brPitanja++;
        } else {
            throw new MaxNumberOfQuestions("Dosegnut je maksimalan broj pitanja (" + questions.length + ").");
        }
    }

    public int getBrPitanja() {
        return brPitanja;
    }

    public String getQuestion(int index) {
        return questions[index].getText();
    }

    public boolean isCorrectAnswer(int questionIndex, String answer) {
        return questions[questionIndex].isCorrectAnswer(answer);
    }
}