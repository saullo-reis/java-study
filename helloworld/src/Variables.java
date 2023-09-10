public class Variables {
    public static Number main(String[] args) throws Exception{
        int idade = 10;
        double cm = 1.50;
        String name = "Khalil";
        char letraInicial = 'K';
        try{
          System.out.println("idade = " + idade + ", nome = "+ name + "tamanho = " + cm + ", letra inicial do nome = " + letraInicial);
        }catch(Exception e){
            System.err.println(e);
        }
        return 6;
    }
}
