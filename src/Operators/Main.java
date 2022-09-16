package Operators;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Skriv en siffra");
        int a = scanner.nextInt();
        System.out.println("Skriv en till siffra");
        int b = scanner.nextInt();
        System.out.println("Skriv en sista siffra");
        int c = scanner.nextInt();

        System.out.println("Din siffror är " + a + "," + b + "," + c);

        if (c > a && c > b) {
            System.out.println(c + " är den största siffran");
        } else if (a > b && a > c) {
            System.out.println(a + " är den största siffran");
        } else if (b > a && b > a) {
            System.out.println(b + " är den största siffran");

        }
        System.out.println("Slut");
    }
}