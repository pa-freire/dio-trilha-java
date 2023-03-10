package ExerciciosJava.Loop.exercicio1.Exercicio5;
import java.util.Scanner;

public class Ex6Fatorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Fatorila : ");
        int fatorial = sc.nextInt();
        int mult = 1;

        System.out.println(fatorial + "! = ");
        for (int i = fatorial ; i >= 1; i-- ){
            
            mult = mult * i;

            System.out.println(mult);
        }
    }
}
