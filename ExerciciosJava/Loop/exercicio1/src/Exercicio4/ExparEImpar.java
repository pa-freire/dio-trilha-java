package ExerciciosJava.Loop.exercicio1.src.Exercicio4;

import java.util.Scanner;

public class ExparEImpar{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int quantNumeros = 0;
        int count = 0;
        int num;
        int qtdPares = 0, qtdImpares = 0;

        System.out.println("Quantudade de numeros? ");
        quantNumeros = sc.nextInt();

        do{
            System.out.println("Digie valor ");
            num = sc.nextInt();

            if (num % 2 == 0) qtdPares++;
            else qtdImpares++;

            count = count + 1;
        } while(count < quantNumeros);

        System.out.println("Quanidades de Pares: " + qtdPares);
        System.out.println("Quantidades de Impares: " + qtdImpares);
    }

}