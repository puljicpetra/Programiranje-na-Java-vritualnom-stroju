package zadaca02a;

import java.util.Scanner;

public class BalancedStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] rijeci = new String[100];
        int brRijeci = 0;

        System.out.println("Unesite stringove, za kraj unesite 'kraj':");

        // Ucitavanje stringova
        while (true) {
            String unos = sc.nextLine().toLowerCase();
            if (unos.equals("kraj")) {
                break;
            }
            rijeci[brRijeci] = unos;
            brRijeci++;
        }

        System.out.println("Stringovi s jednakim brojem samoglasnika i suglasnika:");

        // Ispis stringova
        for (int i = 0; i < brRijeci; i++) {
            if (jednakBrSamoglSugl(rijeci[i])) {
                System.out.println(rijeci[i]);
            }
        }

        sc.close();
    }

    /**
     * Metoda koja provjerava ima li string jednak broj samoglasnika i suglasnika
     *
     * @param rijec String koji provjeravamo
     * @return true ako su jednaki, inace - false
     */
    private static boolean jednakBrSamoglSugl(String rijec) {
        int samogl = 0, sugl = 0;
        String samoglasniciSet = "aeiou";

        for (char c : rijec.toCharArray()) {
            if (Character.isLetter(c)) {
                if (samoglasniciSet.indexOf(c) != -1) {
                    samogl++;
                } else {
                    sugl++;
                }
            }
        }

        return samogl == sugl;
    }
}