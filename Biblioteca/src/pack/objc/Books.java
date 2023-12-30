package pack.objc;

public class Books {
    private String nameBook;
    private String author;
    public boolean isBorrowed;
    public Integer id;

    public Books(String bookForRegister, String author, Integer id){
        this.nameBook = bookForRegister;
        this.author = author;
        this.isBorrowed = false;
        this.id = id;
    }

    public String getNameBook(){
        return this.nameBook;
    }
    public void modifyBookStatus(){
        if(isBorrowed == false){
            this.isBorrowed = true;
            return;
        }
        System.out.println("Livro ja emprestado");
    }

}
