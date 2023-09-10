import java.util.Scanner;

public class Soma{
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        System.out.println("Escreva o primeiro número");
        int numberOne = ler.nextInt();
        System.out.println("Escreva o segundo número");
        int numberTwo = ler.nextInt();
        int sum = numberOne + numberTwo;
        System.out.println("Seu resultado da soma é " + sum);
        ler.close();
    }
}