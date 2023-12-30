public class App2 {
    public static void main(String[] args){

        //chamada do constructor
        User[] users = new User[]{
                new User("Tiago", "Beltron"),
                new User("Flavia", "Roberto")
        };


        System.out.println(users[2].getFirstName());
        

    }
}
