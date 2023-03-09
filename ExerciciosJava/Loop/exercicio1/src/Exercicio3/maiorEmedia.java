import java.util.Scanner;

public class maiorEmedia{
    public static void main (String[] args) throws Exception {   
        Scanner sc = new Scanner(System.in);
        int numero;
        int maior = 0;
        int count = 0;
        int soma = 0;

        do{
            System.out.println("Digite o numero: ");
            numero = sc.nextInt();

            soma = soma + numero;
            System.out.println("A soma é :" + soma);

            if(numero > maior) maior = numero;
            
            count = count + 1;

        }while(count < 5);

        System.out.println("Qual o maior numero? "+maior);
        System.out.println("A média é: " + (soma / 5));
        }
    }



