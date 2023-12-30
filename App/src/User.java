public class User {

    //propriedades
    private String firstName;
    private String lastName;

    //constructor
    public User(String firstName, String lastName){
        this.firstName = firstName.toUpperCase();
        this.lastName = lastName.toUpperCase();
    }

    //setters
    public void setFistName(String firstName){
        this.firstName = firstName.toUpperCase().trim();
    }
    public void setLastName(String lastName){
        this.lastName = lastName.toUpperCase().trim();
    }

    //getters
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
}
