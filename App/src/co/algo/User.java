package co.algo;

public class User {

    private String firstName;
    private String lastName;

    public User(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;

    }

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

    public String output(){
        return firstName.toUpperCase() + " " + lastName.toUpperCase();
    }
    public String output(boolean showLastName){
        if(showLastName){
            return output();
        }
        return firstName;
    }
}
