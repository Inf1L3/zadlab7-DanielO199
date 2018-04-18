package pl.edu.ur.oopl7;


public class Student extends Osoba {
    
    public int nr_indeksu;
    public String typ;
    public String kierunek;
    public int rok;

    public Student(int nr_indeksu, String typ, String kierunek, int rok, String imie, String nazwisko, String dataUr, String plec) {
        super(imie, nazwisko, dataUr, plec);
        this.nr_indeksu = nr_indeksu;
        this.typ = typ;
        this.kierunek = kierunek;
        this.rok = rok;
    }

    public int getNr_indeksu() {
        return nr_indeksu;
    }

    public void setNr_indeksu(int nr_indeksu) {
        this.nr_indeksu = nr_indeksu;
    }

    public String getTyp() {
        return typ;
    }

    public void setTyp(String typ) {
        this.typ = typ;
    }

    public String getKierunek() {
        return kierunek;
    }

    public void setKierunek(String kierunek) {
        this.kierunek = kierunek;
    }

    public int getRok() {
        return rok;
    }

    public void setRok(int rok) {
        this.rok = rok;
    }

    @Override
    public String toString() {
        return "Student{" + "nr_indeksu=" + nr_indeksu + ", typ=" + typ + ", kierunek=" + kierunek + ", rok=" + rok + '}';
    }
    
    @Override
    public void poka(){
        
        System.out.println("imie:"+ this.imie);
        System.out.println("nazwisko:"+ this.nazwisko);
        System.out.println("data urodzenia:"+ this.dataUr);
        System.out.println("plec:"+ this.plec);
        System.out.println("imie:"+ this.nr_indeksu);
        System.out.println("nazwisko:"+ this.typ);
        System.out.println("data urodzenia:"+ this.kierunek);
        System.out.println("plec:"+ this.rok);
    
    
    }
    
    
    
    

    
    
}
