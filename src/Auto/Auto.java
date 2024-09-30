package Auto;

public class Auto {
    private String marcaAuto;
    private String modelloAuto;
    private double prezzoAuto;

    public String getMarca() {
        return marcaAuto;
    }
    public void setMarca(String marca) {
        marcaAuto = marca;
    }

     //
    public String getModello() {
        return modelloAuto;
    }
    public void setModello(String modello) {
        modelloAuto = modello;
    }

    //
    public String getPrezzo() {
        return modelloAuto;
    }
    public void setPrezzo(double prezzo) {
        prezzoAuto = prezzo;
    }

    public Auto(){
        marcaAuto = "";
        modelloAuto = "";
        prezzoAuto = 0.0;
    }
}




