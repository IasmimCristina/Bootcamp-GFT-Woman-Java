package desafios;

import java.util.Objects;
import java.util.Scanner;

public class Desafio01Vinho {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String T = scan.nextLine();

        String respostasCompetidores = scan.nextLine();

        String[] respostasCompetidoresSplit = respostasCompetidores.split(" ");

        int count = 0;
        for (int i = 0; i< respostasCompetidoresSplit.length; i++) {
            if (Objects.equals(respostasCompetidoresSplit[i], T) )
                count++;
        }

        System.out.println(count );

    }
}
