
package pl.edu.ur.oopl7;


public class Wykladowca extends Osoba {
    
    public String tytul;
    public String ilLat;
    public String spec;

    public Wykladowca(String tytul, String ilLat, String spec, String imie, String nazwisko, String dataUr, String plec) {
        super(imie, nazwisko, dataUr, plec);
        this.tytul = tytul;
        this.ilLat = ilLat;
        this.spec = spec;
    }

    public String getTytul() {
        return tytul;
    }

    public void setTytul(String tytul) {
        this.tytul = tytul;
    }

    public String getIlLat() {
        return ilLat;
    }

    public void setIlLat(String ilLat) {
        this.ilLat = ilLat;
    }

    public String getSpec() {
        return spec;
    }

    public void setSpec(String spec) {
        this.spec = spec;
    }
    
    public void poka(){
    
          System.out.println("imie:"+ this.imie);
        System.out.println("nazwisko:"+ this.nazwisko);
        System.out.println("data urodzenia:"+ this.dataUr);
        System.out.println("plec:"+ this.plec);
          System.out.println("Tytul:"+ this.tytul);
            System.out.println("Ilosc lat pracy:"+ this.ilLat);
              System.out.println("Specjalizacja:"+ this.spec);
            
        
    
    }
}
