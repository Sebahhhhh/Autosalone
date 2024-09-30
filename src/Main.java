package Autosalone;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Auto[] auto = new Auto[4];
        for (int i = 0; i < auto.length; i++) {

            System.out.println("Inserisci i dati per l'auto " + (i + 1) + ":");

            System.out.print("Marca: ");
            String marca = in.nextLine();

            System.out.print("Modello: ");
            String modello = in.nextLine();

            System.out.print("Anno: ");
            int anno = in.nextInt();
            in.nextLine();

            System.out.print("Colore: ");
            String colore = in.nextLine();

            auto[i] = new Auto(marca, modello, anno, colore);
        }
    }
}

