package pack.objc;

import java.util.ArrayList;
import java.util.Scanner;

public class Autors {
    private String name;
    private Integer id;
    private ArrayList<String> books;
    Scanner scanner = new Scanner(System.in);

    public Autors(Integer id){
        System.out.println("Nome do autor");
        String nameAutor = scanner.nextLine();
        this.name = nameAutor;
    }

    public void registerBook(String nameBookForRegister){
        books.add(nameBookForRegister);
    }

    public String getName(){
        return this.name;
    }
    public void getBooks(){
        for(String book: books){
            System.out.println(book);
        }
    }
}
