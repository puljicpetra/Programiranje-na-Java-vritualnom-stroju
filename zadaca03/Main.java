package zadaca03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Quiz quiz = new Quiz();

        // dva "default" pitanja:
        quiz.addQuestion("U kojem jeziku se programira za Android?", "Java");
        quiz.addQuestion("U kojem jeziku se programira za iPhone?", "Objective-C");

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Želite li dodati novo pitanje? (da/ne)");
            String odg = sc.nextLine().trim();

            if (!odg.equalsIgnoreCase("da")) {
                break;
            }

            System.out.println("Unesite tekst pitanja:");
            String tekst = sc.nextLine();
            System.out.println("Unesite točan odgovor:");
            String tocanOdg = sc.nextLine();

            quiz.addQuestion(tekst, tocanOdg);

            if (quiz.getBrPitanja() == 10) {
                System.out.println("Dosegnut je maksimalan broj pitanja.");
                break;
            }
        }

        int brTocnih = 0;

        for (int i = 0; i < quiz.getBrPitanja(); i++) {
            System.out.println("Pitanje " + (i+1) + ": " + quiz.getQuestion(i));
            String unos = sc.nextLine();

            if (quiz.isCorrectAnswer(i, unos)) {
                System.out.println("Točno!");
                brTocnih++;
            } else {
                System.out.println("Netočno.");
            }
        }

        double postotak = (double) brTocnih / quiz.getBrPitanja() * 100;
        System.out.printf(
                "Imali ste %d točnih odgovora od ukupno %d pitanja. To je %.2f%% točnih odgovora.\n",
                brTocnih, quiz.getBrPitanja(), postotak
        );
    }
}