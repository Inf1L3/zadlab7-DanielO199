package pl.edu.ur.oopl7;
import java.util.Random;


public class Punkt2D {
    
    public int x;
    public int y;
    Random ran = new Random();

    public Punkt2D() {
        this.x = 0;
        this.y = 0;
    }
    
    public Punkt2D(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public void Losuj()
    {
        this.x=ran.nextInt(21)-10;
        this.y=ran.nextInt(21)-10;
    
    
    }

    @Override
    public String toString() {
        return "Punkt2D{" + "x=" + x + ", y=" + y + ", ran=" + ran + '}';
    }
    
    
    
    
    
}
