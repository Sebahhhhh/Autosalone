package Auto;

//Scanner
import java.util.Scanner;

// Main
public class Main {
    public static void main(String[] args) {

        // Scanner
        Scanner in = new Scanner(System.in);

        // Oggetti delle 4 macchine
        Auto macchina1 = new Auto();
        Auto macchina2 = new Auto();
        Auto macchina3 = new Auto();
        Auto macchina4 = new Auto();

        // Dati prima vettura
        System.out.println("PRIMA MACCHINA");
        System.out.println("");
        System.out.println("Inserisci la marca della PRIMA autovettura: ");
        String marca1 = in.next();
        macchina1.setMarca(marca1);
        System.out.println("Inserisci la modello della PRIMA autovettura: ");
        String modello1 = in.next();
        macchina1.setModello(modello1);
        System.out.println("Inserisci il prezzo della PRIMA autovettura: ");
        Double prezzo1 = in.nextDouble();
        macchina1.setPrezzo(prezzo1);

        // Dati seconda vettura
        System.out.println("SECONDA MACCHINA");
        System.out.println("");
        System.out.println("Inserisci la marca della SECONDA autovettura: ");
        String marca2 = in.next();
        macchina2.setMarca(marca2);
        System.out.println("Inserisci la modello della SECONDA autovettura: ");
        String modello2 = in.next();
        macchina2.setModello(modello2);
        System.out.println("Inserisci il prezzo della SECONDA autovettura: ");
        Double prezzo2 = in.nextDouble();
        macchina2.setPrezzo(prezzo2);

        // Dati terza vettura
        System.out.println("TERZA MACCHINA");
        System.out.println("");
        System.out.println("Inserisci la marca della TERZA autovettura: ");
        String marca3 = in.next();
        macchina3.setMarca(marca3);
        System.out.println("Inserisci la modello della TERZA autovettura: ");
        String modello3 = in.next();
        macchina3.setModello(modello3);
        System.out.println("Inserisci il prezzo della TERZA autovettura: ");
        Double prezzo3 = in.nextDouble();
        macchina3.setPrezzo(prezzo3);

        // Dati quarta vettura
        System.out.println("QUARTA MACCHINA");
        System.out.println("");
        System.out.println("Inserisci la marca della QUARTA vettura: ");
        String marca4 = in.next();
        macchina4.setMarca(marca4);
        System.out.println("Inserisci la modello della QUARTA autovettura: ");
        String modello4 = in.next();
        macchina4.setModello(modello4);
        System.out.println("Inserisci il prezzo della QUARTA autovettura: ");
        Double prezzo4 = in.nextDouble();
        macchina4.setPrezzo(prezzo4);


         // Output
        System.out.println("(1) Prima autovettura   | MARCA: " + macchina1.getMarca() + " | MODELLO: " + macchina1.getModello() + " | PREZZO: " + macchina1.getPrezzo() );

        System.out.println("(2) Seconda autovettura | MARCA: " + macchina2.getMarca() + " | MODELLO: " + macchina2.getModello() + " | PREZZO: "+ macchina2.getPrezzo() );

        System.out.println("(3) Terza autovettura   | MARCA: " + macchina3.getMarca() + " | MODELLO: " + macchina3.getModello() + " | PREZZO: " + macchina3.getPrezzo() );

        System.out.println("(4) Quarta autovettura  | MARCA: " + macchina4.getMarca() + " | MODELLO: " + macchina4.getModello() + " | PREZZO: " + macchina4.getPrezzo() );

    }
}


