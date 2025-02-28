import java.util.Scanner;

public class ObjOferta 
{ 
    Scanner sc = new Scanner(System.in);
    private String nombre;
    private boolean oferta;
    public ObjOferta() {
    }
    public ObjOferta(String nombre, boolean oferta) {
        this.nombre = nombre;
        this.oferta = oferta;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setOferta(boolean oferta) {
        this.oferta = oferta;
    }
    public String getNombre() {
        return nombre;
    }
    public boolean isOferta() {
        return oferta;
    }
    public ObjOferta[][]  LlenarMatrizObjetual(int d)
    {
        ObjOferta[][] m = new ObjOferta[d][d];
        for (int i = 0; i < m.length; i++) 
        {
            for (int j = 0; j < m.length; j++) 
            {
                ObjOferta obj = new ObjOferta(); //No olvidar poner eso siempre 

                System.out.println("Ingrese el nombre: ");
                obj.setNombre(sc.next()); 
                System.out.println("Si el producto esta en oferta ingrese true, de lo contrario false: ");
                while (!sc.hasNextBoolean()) 
                {
                    System.out.println("dato incorrecto, es true o false");
                    sc.next();
                    
                }
                obj.setOferta(sc.nextBoolean());
                m[i][j] = obj;

            }   
        }
        return m;
    }
    
}
