import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       int age = 12;
       String name = "mandu";
       double weight = 9.45;
       boolean isCat = true;

       System.out.println(name + " er" + " " + age + " år gammel og vejer" + " " + weight);
       System.out.println("Hans kattetilstand er: " + isCat);
       System.out.printf("%s er %d år gammel og vejer %.2f kg \n Hans kattetilstand er %b", name, age, weight, isCat);

       System.out.println("\u0043\u006f\u006f\u006c\u263a");
       System.out.println("\uD83C\uDF82");
        System.out.println("\u1F923");
        System.out.println("Den er \u001b[31mrød\uu001b[0m.");
        System.out.println("\uD83D\uDE00");
        System.out.println("Hello");

    }
}