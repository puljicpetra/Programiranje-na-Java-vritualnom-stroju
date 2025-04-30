package zadaca08;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        if (args.length != 2) {
            System.out.println("dat1.txt dat2.txt");
            return;
        }

        Scanner sc1 = new Scanner(new File(args[0]));
        Scanner sc2 = new Scanner(new File(args[1]));

        List<String> imenadat1 = new ArrayList<>();
        while (sc1.hasNextLine()) {
            imenadat1.add(sc1.nextLine());
        }

        Set<String> imenadat2 = new HashSet<>();
        while (sc2.hasNextLine()) {
            imenadat2.add(sc2.nextLine());
        }

        for (String ime : imenadat1) {
            if (!imenadat2.contains(ime)) {
                System.out.println(ime);
            }
        }

        sc1.close();
        sc2.close();
    }
}