import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Login userA = new Login();
        Scanner scanner = new Scanner(System.in);

        userA.login = "Saullo";
        userA.password = "12345";
        userA.email = "saullo@hotmail.com";

        String senhaDigitada = "";
        boolean isLogged = false;
        int count = 0;
        while(!isLogged){
            if(count == 3){
                System.out.println("Limite estourado de tentativa de login");
                isLogged = true;
                return;
            }
            System.out.println("Digite a senha");
            senhaDigitada = scanner.nextLine();
            isLogged = userA.enter(String.valueOf(senhaDigitada));
            count++;
        };
    }
}
