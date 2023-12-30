package pack.objc;

import java.util.ArrayList;
import java.util.Scanner;

public class User {
    private String name;
    private Integer id;
    private String CPF;
    private ArrayList<String> booksWithMe;
    Scanner scanner = new Scanner(System.in);
    public User(Integer id){
        System.out.println("Nome do usuário:");
        String name = scanner.nextLine();
        System.out.println("CPF do usuário:");
        String CPF = scanner.nextLine();
        if(CPF.length() != 11){
            System.out.println("CPF invalido. Usuário não registrado");
            return;
        }
        this.name = name;
        this.CPF = CPF;
        this.id = id;
    }
    public void getBook(String bookName){
        this.booksWithMe.add(bookName);
    }

    public void getData(){
        System.out.println(name);
        System.out.println(CPF);
        for(String book : booksWithMe){
            System.out.println(book);
        }
    }
}
