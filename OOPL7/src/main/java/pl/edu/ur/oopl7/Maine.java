
package pl.edu.ur.oopl7;

public class Maine {

    
    public static void main(String[] args) {
        
        
       Punkt2D[] array2D = new Punkt2D[100];
       Punkt3D[] array3D = new Punkt3D[100];
       
       for(int i=0;i<=99;i++){
       
           array2D[i]= new Punkt2D();
           array2D[i].Losuj();
           array3D[i]= new Punkt3D();
           array3D[i].Losuj();
       
       }
       
       for(int i=0; i<100; i++)
          {
             if(array2D[i].x == array3D[i].x && array2D[i].y == array3D[i].y)
                {
                  
                    System.out.println(array2D[i].toString());
                  System.out.println(array3D[i].toString());
                }
           }
      
       
       
       
       
    }
    
}
