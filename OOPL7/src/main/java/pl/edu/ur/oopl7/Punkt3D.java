package pl.edu.ur.oopl7;

import java.util.Random;

public class Punkt3D extends Punkt2D {

    public int z;
    Random ran = new Random();
    
    public Punkt3D(){} 
  

    public Punkt3D(int z, int x, int y) {
        super(x, y);
        this.z = z;
    }

    @Override
    public void Losuj() {
        this.x = ran.nextInt(21) - 10;
        this.y = ran.nextInt(21) - 10;
        this.z = ran.nextInt(21) - 10;

    }

    @Override
    public String toString() {
        return "Punkt3D{" + "z=" + z + ", x=" + x + ", y=" + y + '}';
    }

}
