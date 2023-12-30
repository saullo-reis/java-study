public class Login {

    public String login;
    public String password;
    public String email;
    public boolean enter(String passwordDigitada) {
        if (passwordDigitada.equals(password)) {
            System.out.println("Login efetuado");
            return true;
        } else {
            System.out.println("Senha Errada");
            return false;
        }

    }
}
