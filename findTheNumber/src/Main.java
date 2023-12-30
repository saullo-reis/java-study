import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Random randomNumber = new Random();
        Scanner numberDigited = new Scanner(System.in);

        int randomNumberGenerated = randomNumber.nextInt(100);
        boolean findTheNumber = false;
        while(!findTheNumber){
            System.out.println("Digite o número de 0 a 100");
            int number = numberDigited.nextInt();
            if(number == randomNumberGenerated){
                findTheNumber = true;
            }
            if(number > randomNumberGenerated){
                System.out.println("O número é menor que o digitado.");
            }
            if(number < randomNumberGenerated){
                System.out.println("O número é maior que o digitado.");
            }
        }
        System.out.println("Você achou o número.");
    }
}
