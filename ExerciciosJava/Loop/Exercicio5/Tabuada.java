package ExerciciosJava.Loop.Exercicio5;
import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Taubuada ");
        int tabuada = sc.nextInt();

        System.out.println("Tabuada de " + tabuada );

        for( int i = 1; i <= 10 ; i++ ){
            System.out.println(tabuada + " X " + i + " = " + (tabuada*i));
        }
    }
}
