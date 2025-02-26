import java.util.Scanner;

public class ObjListaProducto 
{
    Scanner sc = new Scanner(System.in);
    private String nombre;
    private double peso;
    private String categoria;
    public ObjListaProducto() 
    {

    }
    public ObjListaProducto(String nombre, double peso, String categoria) {
        this.nombre = nombre;
        this.peso = peso;
        this.categoria = categoria;
    }
    public String getNombre() {
        return nombre;
    }
    public double getPeso() {
        return peso;
    }
    public String getCategoria() {
        return categoria;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    public ObjListaProducto[][] LlenarMatrizObjetual(int d)
    {
        ObjListaProducto[][] m = new ObjListaProducto[d][d];
        for (int i = 0; i < m.length; i++) 
        {
            for (int j = 0; j < m.length; j++) 
            {
                ObjListaProducto obj = new ObjListaProducto(); //No olvidar poner eso siempre 

                System.out.println("Ingrese el nombre: ");
                obj.setNombre(sc.next()); 
                System.out.println("Ingrese el peso: ");
                obj.setPeso(sc.nextDouble());
                System.out.println("Ingrese la categoria: ");
                obj.setCategoria(sc.next());
                m[i][j] = obj;
            }   
        }
        return m;
    }
    public void MostrarMatrizObjetual(ObjListaProducto[][] m)
    {
        for (int i = 0; i < m.length; i++) 
        {
            for (int j = 0; j < m[0].length; j++) 
            {
                if (m[i][j] != null) 
                {
                    System.out.println("Nombre: " + m[i][j].getNombre());
                    System.out.println("Peso: " + m[i][j].getPeso());
                    System.out.println("Categoria: " + m[i][j].getCategoria());
                    System.out.println("\n");
                    
                }
                
            }
            
        }
    }
    
    
}
