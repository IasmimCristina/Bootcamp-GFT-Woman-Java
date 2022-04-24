package desafios;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;



public class Desafio01FigurinhasCopa {
    public static void main(String[] args) {
        //A HashSet is a collection of items where every item is unique. Se houver duas entradas iguais , serão tratadas como uma.
        // Set não permite itens duplicados. Não guarda valores em ordem.
        Scanner scan = new Scanner(System.in);
        int numTotal = scan.nextInt(); //Primeira entrada.
        int numFigCompradas = scan.nextInt(); //Segunda entrada das figurinhas compradas.
        Set<Integer> setFig = new HashSet<>();

        for (int i = 0; i < numFigCompradas ;i++ ) {

            int entrada = scan.nextInt();
            setFig.add(entrada);


        }
        System.out.println(numTotal - setFig.size());
    }
 }

