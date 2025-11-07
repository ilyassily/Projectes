package Joc;

import java.util.Scanner;

public class Exercici4 {
    public static void main(String[] args) {
        Scanner llegir = new Scanner(System.in);

        int random = (int) (Math.random() * 30) + 1;

        System.out.println("Endevina el número (entre 1 i 30):");
        int numero = llegir.nextInt();

        if (numero == random) {
            System.out.println("L'has encertat, molt bé!");
        } else {
            System.out.println("No l'has encertat. El número correcte era: " + random);
        }

        llegir.close();
    }    
}
