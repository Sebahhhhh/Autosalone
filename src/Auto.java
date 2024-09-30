package Autosalone;

public class Auto {
    private String marcaAuto;
    private String modelloAuto;
    private int annoAuto;
    private String coloreAuto;

    public Auto(String marca, String modello, int anno, String colore) {
        marcaAuto = marca;
        modelloAuto = modello;
        annoAuto = anno;
        coloreAuto = colore;
    }
    public String getMarca() {
        return marcaAuto;
    }
    public String getModello() {
        return modelloAuto;
    }
    public int getAnno() {
        return annoAuto;
    }
    public String getColore() {
        return coloreAuto;
    }
}


