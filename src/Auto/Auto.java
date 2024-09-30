package Auto;


public class Auto {
    private String marcaAuto;
    private String modelloAuto;
    private double prezzoAuto;

    // marca
    public String getMarca() {
        return marcaAuto;
    }
    public void setMarca(String marca) {
        marcaAuto = marca;
    }

     // modello
    public String getModello() {
        return modelloAuto;
    }
    public void setModello(String modello) {
        modelloAuto = modello;
    }

    // prezzo
    public double getPrezzo() {
        return prezzoAuto;
    }
    public void setPrezzo(double prezzo) {
        prezzoAuto = prezzo;
    }


    // inizializzazione
    public Auto(){
        marcaAuto = "";
        modelloAuto = "";
        prezzoAuto = 0.0;
    }
}




