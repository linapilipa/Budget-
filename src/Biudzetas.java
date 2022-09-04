import java.time.LocalDate;
import java.time.LocalDateTime;

public class Biudzetas {
    private PajamuIrasas[] pajamos = new PajamuIrasas[100];
    private IslaiduIrasas[] islaidos = new IslaiduIrasas[100];

    private int pajamuIrasuKiekis = 0;
    private int islaiduIrasuKiekis = 0;


    public void pridetiPajamauIrasa (float suma, String kategorija, LocalDate data, boolean gauta) {
        PajamuIrasas irasas = new PajamuIrasas(suma, kategorija, data, gauta);
        pajamos[pajamuIrasuKiekis++] = irasas;
        for (int i = 0; i < pajamos.length; i++) {
            irasas = pajamos[i];
            if (irasas != null) {
                System.out.print("\n ------------ PAJAMOS ------------\n");
                System.out.println("Suma: " + irasas.getSuma() + " EUR");
                System.out.println("Kategorija: " + irasas.getKategorija());
                System.out.println("Data: " + irasas.getData());
                System.out.println("Ar gautos pajamos: " + irasas.isGauta());
                System.out.println("------------------------------------");
            }
        }
    }

    public void pridetiIslaiduIrasa (float suma, String kategorija, LocalDateTime dataLaikas, String atsiskaitymoBudas, String mokejimoKortele){
        IslaiduIrasas islaiduIrasas = new IslaiduIrasas(suma, kategorija, dataLaikas, atsiskaitymoBudas, mokejimoKortele);
        islaidos[islaiduIrasuKiekis++] = islaiduIrasas;
        for (int i = 0; i < islaidos.length; i++) {
            islaiduIrasas = islaidos[i];
            if (islaiduIrasas != null) {
                System.out.print("\n ------------ IŠLAIDOS ------------\n");
                System.out.println("Suma: " + islaiduIrasas.getSuma());
                System.out.println("Kategorija: " + islaiduIrasas.getKategorija());
                System.out.println("Data: " + islaiduIrasas.getDataLaikas());
                System.out.println("Mokėjimo būdas: " + islaiduIrasas.getAtsiskaitymoBudas());
                System.out.println("Mokėjimo kortelė: " + islaiduIrasas.getKortele());
                System.out.println("------------------------------------");
            }
        }

    }










}
