import java.util.Scanner;

public class ObjProducto5 
{
    Scanner sc = new Scanner(System.in);
    private String nombre;
    private double precio;
    private int stock;
    public ObjProducto5() 
    {

    }
    public ObjProducto5(String nombre, double precio, int stock) 
    {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }
    public String getNombre() 
    {
        return nombre;
    }
    public double getPrecio() 
    {
        return precio;
    }
    public int getStock() 
    {
        return stock;
    }
    public void setNombre(String nombre) 
    {
        this.nombre = nombre;
    }
    public void setPrecio(double precio) 
    {
        this.precio = precio;
    }
    public void setStock(int stock) 
    {
        this.stock = stock;
    }
    public ObjProducto5[][]  LlenarMatrizObjetual(int d)
    {
        ObjProducto5[][] m = new ObjProducto5[d][d];
        for (int i = 0; i < m.length; i++) 
        {
            for (int j = 0; j < m.length; j++) 
            {
                ObjProducto5 obj = new ObjProducto5(); //No olvidar poner eso siempre 

                System.out.println("Ingrese el nombre: ");
                obj.setNombre(sc.next()); 
                System.out.println("Ingrese el precio: ");
                obj.setPrecio(sc.nextDouble());
                System.out.println("Ingrese el stock: ");
                obj.setStock(sc.nextInt());
                m[i][j] = obj;

            }   
        }
        return m;
    }
    public void MostrarMatrizObjetual(ObjProducto5[][] m)
    {
        for (int i = 0; i < m.length; i++) 
        {
            for (int j = 0; j < m.length; j++) 
            {
                System.out.println("Nombre: " + m[i][j].getNombre());
                System.out.println("Precio: " + m[i][j].getPrecio());
                System.out.println("Stock: " + m[i][j].getStock());
                System.out.println("\n");
                
            }
            
        }
    }
    
    
    
    
}
