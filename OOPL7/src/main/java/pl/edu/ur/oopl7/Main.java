package pl.edu.ur.oopl7;
import java.util.Scanner;

public class Main {

    
    public static void main(String[] args) {
        
        Scanner input=new Scanner(System.in);
        
    System.out.println("Podaj imie");
    String a=input.next();
    System.out.println("Podaj nazwisko");
    String b=input.next();
    System.out.println("Podaj date urodzenia");
    String c=input.next();
    System.out.println("Podaj plec");
    String d=input.next();
        
        Osoba osoba1=new Osoba(a,b,c,d);
        
        
        Student student1 =new Student(0,"xd","elo",0,a,b,c,d);
        student1.poka();
        Wykladowca wykla1=new Wykladowca("xd","elo","","","","","");
        wykla1.poka();
      
        
        
        
    }
    
}
