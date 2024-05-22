/*

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("********************************");
        System.out.println("*     Jogo de Adivinhação!!    *");
        System.out.println("********************************");
        System.out.println("\nDigite um numero de 1 a 10: ");
        Integer num = scanner.nextInt();
        Integer rand = new Random().nextInt(10);


        System.out.println("Seu numero Digitado foi: " + num);
        System.out.println("Numero Sorteado foi: " + rand);

        if(num.equals(rand)){
            System.out.println("********************************");
            System.out.println("*    Parabens Você Acertou!!   *");
            System.out.println("********************************");
        } else {
            System.out.println("********************************");
            System.out.println("*      Você não acertou!!      *");
            System.out.println("********************************");
        }



    }
}*/
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int randomNumber = random.nextInt(10) + 1; // Gera um número aleatório entre 1 e 10

        System.out.println("********************************");
        System.out.println("*     Jogo de Adivinhação!!    *");
        System.out.println("********************************");

        boolean acertou = false;
        while (!acertou) {
            System.out.println("\nDigite um número de 1 a 10: ");
            if (scanner.hasNextInt()) {
                int userGuess = scanner.nextInt();
                System.out.println("Seu número digitado foi: " + userGuess);

                if (userGuess == randomNumber) {
                    System.out.println("********************************");
                    System.out.println("*    Parabéns! Você Acertou!   *");
                    System.out.println("********************************");
                    acertou = true;
                } else if (userGuess < randomNumber) {
                    System.out.println("O número que você digitou é menor do que o número correto.");
                } else {
                    System.out.println("O número que você digitou é maior do que o número correto.");
                }
            } else {
                System.out.println("Por favor, digite um número válido.");
                scanner.next(); // Limpa a entrada inválida do scanner
            }
        }

        scanner.close(); // Fecha o scanner para evitar vazamento de recursos
    }
}
