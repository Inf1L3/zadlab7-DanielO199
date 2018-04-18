package pl.edu.ur.oopl7;
import java.util.Scanner;

public class Osoba {
    
    public String imie;
    public String nazwisko;
    public String dataUr;
    public String plec;
    public Scanner input=new Scanner(System.in);
    public Osoba(String imie, String nazwisko,String dataUr, String plec){
        this.imie=imie;
        this.nazwisko=nazwisko;
        this.dataUr=dataUr;
        this.plec=plec;
    
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getDataUr() {
        return dataUr;
    }

    public void setDataUr(String dataUr) {
        this.dataUr = dataUr;
    }

    public String getPlec() {
        return plec;
    }

    public void setPlec(String plec) {
        this.plec = plec;
    }
    
     

    
    public void poka() {
        
        System.out.println("imie:"+ this.imie);
        System.out.println("nazwisko:"+ this.nazwisko);
        System.out.println("data urodzenia:"+ this.dataUr);
        System.out.println("plec:"+ this.plec);
        
        
    }

    @Override
    public String toString() {
        return "Osoba{" + "imie=" + imie + ", nazwisko=" + nazwisko + ", dataUr=" + dataUr + ", plec=" + plec + ", input=" + input + '}';
    }

    
    
}
