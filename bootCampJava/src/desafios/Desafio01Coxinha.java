package desafios;



import java.util.Scanner;

public class Desafio01Coxinha {
    public static void main(String[] args) {
        //Criação da leitura.
        Scanner leitura = new Scanner(System.in);
        String entrada = leitura.nextLine();

        //Separação através do " "(espaço).
        String valores[] = entrada.split(" ");

        // Um array foi criado com os valores digitados.
        int H = Integer.parseInt(String.valueOf(valores[0]));
        int P = Integer.parseInt(String.valueOf(valores[1]));

        //Modificando os tipos necessários.
        double media = Double.parseDouble(String.valueOf(H)) / Double.parseDouble(String.valueOf(P));

        // ATENÇÃO: use printf.
        System.out.printf("%.2f", media );
    }
}
