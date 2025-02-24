package hu.szamalk.Modell;

public class Auto {
    private int ferohely, ar;
    private String rendszam;

    public Auto(String rendszam, int ferohely, int ar) {
        this.rendszam = rendszam;
        this.ferohely = ferohely;
        this.ar = ar;
    }

    public String getRendszam() {
        return rendszam;
    }


    public void setRendszam(String rendszam) {
        if (rendszam.length() < 6) {
            throw new NemLetezoAutoException("A rendszámnak minimum 6 betűből kell állnia");
        }
        this.rendszam = rendszam;
    }

    public int getFerohely() {
        return ferohely;
    }

    public void setFerohely(int ferohely) {
        this.ferohely = ferohely;
    }

    public int getAr() {
        return ar;
    }

    public void setAr(int ar) {
        this.ar = ar;
    }

    public void azonosAutoVizsgalat(){

    }
}
