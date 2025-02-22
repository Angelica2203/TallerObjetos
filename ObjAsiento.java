import java.util.Scanner;

public class ObjAsiento 
{
    Scanner sc = new Scanner(System.in);
    private int asiento;
    private int fila;
    private double precio;
    public ObjAsiento() 
    {

    }
    public ObjAsiento(int asiento, int fila, double precio) 
    {
        this.asiento = asiento;
        this.fila = fila;
        this.precio = precio;
    }
    public int getAsiento() 
    {
        return asiento;
    }
    public int getFila() 
    {
        return fila;
    }
    public double getPrecio() 
    {
        return precio;
    }
    public void setAsiento(int asiento) 
    {
        this.asiento = asiento;
    }
    public void setFila(int fila) 
    {
        this.fila = fila;
    }
    public void setPrecio(double precio) 
    {
        this.precio = precio;
    }
    
    public ObjAsiento[][]  LlenarMatrizObjetual(int d)
    {
        ObjAsiento[][] m = new ObjAsiento[d][d];
        for (int i = 0; i < m.length; i++) 
        {
            for (int j = 0; j < m.length; j++) 
            {
                ObjAsiento obj = new ObjAsiento(); //No olvidar poner eso siempre 

                System.out.println("Ingrese el numero de asiento: ");
                obj.setAsiento(sc.nextInt()); 
                System.out.println("Ingrese el numero de fila: ");
                obj.setFila(sc.nextInt());
                System.out.println("Ingrese la precio: ");
                obj.setPrecio(sc.nextDouble());
                m[i][j] = obj;

            }   
        }
        return m;
    }
    public void MostrarMatrizObjetual(ObjAsiento[][] m)
    {
        for (int i = 0; i < m.length; i++) 
        {
            for (int j = 0; j < m.length; j++) 
            {
                System.out.println("Asiento: " + m[i][j].getAsiento());
                System.out.println("Fila: " + m[i][j].getFila());
                System.out.println("Precio: " + m[i][j].getPrecio());
                System.out.println("\n");
                
            }
            
        }
    }

    
    
}
