package co.algo;

import java.util.*;

public class Quase {
    public static void main(String[] args){
        User userA = new User("Saullo", "Reis");
        User userB = new User("Pedro", "Silva");

        System.out.println(userA.output());
        System.out.println(userA.output(true));
    }
}
