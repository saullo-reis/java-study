import pack.objc.Autors;
import pack.objc.Books;
import pack.objc.User;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        ArrayList<User> users = new ArrayList<>();
        ArrayList<Autors> autors = new ArrayList<>();
        ArrayList<Books> books = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        for (int k = 0; k < 2; k++) {
            Autors author = new Autors(k);
            autors.add(author);
        }

        for(int j = 0; j < 10; j++){
            System.out.println("Nome do livro:");
            String nameBook = scanner.nextLine();

            System.out.println("Nome do autor:");
            for(int p = 0; p < autors.size(); p++){
                System.out.println("[" + p + "]" + autors.get(p).getName());
            }
            int index = scanner.nextInt();

            Books currentBook = new Books(nameBook, autors.get(index).getName(), j);
            books.add(currentBook);
        }

        boolean exitProgram = false;
        while(!exitProgram){
            System.out.println("[1] Registrar um usuário");
            System.out.println("[2] Consultar livros de autor");
            System.out.println("[3] Emprestar um livro");
            System.out.println("[4] Consultar usuário");
            System.out.println("[5] Consultar livros disponíveis");
            System.out.println("[6] Fechar programa");
            System.out.println("Digite um comando:");
            int comand = scanner.nextInt();
            switch(comand){
                case 1:
                    User user = new User(users.size());
                    users.add(user);
                    break;
                case 2:
                    for(int q = 0; q < autors.size(); q++){
                        System.out.println("[" + q + "]" + autors.get(q).getName());
                    }
                    Integer indexAutor = scanner.nextInt();
                    autors.get(indexAutor).getBooks();
                    break;
                case 3:
                    System.out.println("Id do usuário:");
                    Integer idUserToGetBook = scanner.nextInt();
                    System.out.println("Id do livro:");
                    Integer idBook = scanner.nextInt();

                    books.get(idBook).modifyBookStatus();
                    users.get(idUserToGetBook).getBook(books.get(idBook).getNameBook());
                    break;
                case 4:
                    System.out.println("Digite o id do usuário");
                    Integer idUser = scanner.nextInt();
                    users.get(idUser).getData();
                    break;
                case 5:
                    boolean booksAvailable = false;
                    for(Books book : books){
                        if(!book.isBorrowed){
                            System.out.println("O livro" + book.getNameBook() + "está disponível.");
                        }
                    }
                    if (!booksAvailable) {
                        System.out.println("Nenhum livro disponível no momento.");
                    }
                    break;
                case 6:
                    exitProgram = true;
                    break;
            }
        }

    }
}
