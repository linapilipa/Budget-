import java.time.LocalDateTime;

public class IslaiduIrasas {
    private float suma;
    private String kategorija;
    private LocalDateTime dataLaikas;
    private String atsiskaitymoBudas;
    private String kortele;

    public IslaiduIrasas(float suma, String kategorija, LocalDateTime dataLaikas, String atsiskaitymoBudas, String kortele) {
        this.suma = suma;
        this.kategorija = kategorija;
        this.dataLaikas = dataLaikas;
        this.atsiskaitymoBudas = atsiskaitymoBudas;
        this.kortele = kortele;
    }

    public float getSuma() {
        return suma;
    }

    public void setSuma(float suma) {
        this.suma = suma;
    }

    public String getKategorija() {
        return kategorija;
    }

    public void setKategorija(String kategorija) {
        this.kategorija = kategorija;
    }

    public LocalDateTime getDataLaikas() {
        return dataLaikas;
    }

    public void setDataLaikas(LocalDateTime dataLaikas) {
        this.dataLaikas = dataLaikas;
    }

    public String getAtsiskaitymoBudas() {
        return atsiskaitymoBudas;
    }

    public void setAtsiskaitymoBudas(String atsiskaitymoBudas) {
        this.atsiskaitymoBudas = atsiskaitymoBudas;
    }

    public String getKortele() {
        return kortele;
    }

    public void setKortele(String kortele) {
        this.kortele = kortele;
    }
}




