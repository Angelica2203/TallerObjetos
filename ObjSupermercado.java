import java.util.Scanner;

public class ObjSupermercado 
{
    Scanner sc = new Scanner(System.in);
    private String nombre;
    private double precio;
    private boolean disponibilidad;
    public ObjSupermercado() {
    }
    public ObjSupermercado(String nombre, double precio, boolean disponibilidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.disponibilidad = disponibilidad;
    }
    public String getNombre() {
        return nombre;
    }
    public double getPrecio() {
        return precio;
    }
    public boolean isDisponibilidad() {
        return disponibilidad;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }
    public ObjSupermercado[][]  LlenarMatrizObjetual(int d)
    {
        ObjSupermercado[][] m = new ObjSupermercado[d][d];
        for (int i = 0; i < m.length; i++) 
        {
            for (int j = 0; j < m.length; j++) 
            {
                ObjSupermercado obj = new ObjSupermercado(); //No olvidar poner eso siempre 

                System.out.println("Ingrese el nombre: ");
                obj.setNombre(sc.next()); 
                System.out.println("Ingrese el precio: ");
                obj.setPrecio(sc.nextDouble());
                System.out.println("Si el producto esta disponible ingrese true, de lo contrario false: ");
                while (!sc.hasNextBoolean()) 
                {
                    System.out.println("dato incorrecto, es true o false");
                    sc.next();
                    
                }
                obj.setDisponibilidad(sc.nextBoolean());
                m[i][j] = obj;

            }   
        }
        return m;
    }
    public void MostrarMatrizObjetual(ObjSupermercado[][] m)
    {
        for (int i = 0; i < m.length; i++) 
        {
            for (int j = 0; j < m.length; j++) 
            {
                System.out.println("Nombre: " + m[i][j].getNombre());
                System.out.println("Precio: " + m[i][j].getPrecio());
                System.out.println("Disponible: " + m[i][j].isDisponibilidad());
                System.out.println("\n");
                
            }
            
        }
    }
    
    
    
    
}
