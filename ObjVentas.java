import java.util.Scanner;

public class ObjVentas 
{
    Scanner sc = new Scanner(System.in);
    private String nombre;
    private int ventas;
    public ObjVentas() {
    }
    public ObjVentas(String nombre, int ventas) {
        this.nombre = nombre;
        this.ventas = ventas;
    }
    public String getNombre() {
        return nombre;
    }
    public int getVentas() {
        return ventas;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setVentas(int ventas) {
        this.ventas = ventas;
    }
    public ObjVentas[][]  LlenarMatrizObjetual(int f, int c)
    {
        ObjVentas[][] m = new ObjVentas[f][c + 1];
        for (int i = 0; i < f; i++) 
        {
            System.out.println("Ingrese el nombre del vendedor " + (i + 1) + ": ");
            String nombre = sc.next(); // Guardamos el nombre en una variable
    
            // Guardamos el nombre en la primera celda de la fila
            m[i][0] = new ObjVentas();
            m[i][0].setNombre(nombre);
    
            // Llenar las ventas (Meses)
            for (int j = 1; j <= c; j++) 
            {
                m[i][j] = new ObjVentas(); // Crear un nuevo objeto para cada celda
                m[i][j].setNombre(nombre); // Reasignamos el nombre en cada objeto
                System.out.println("Ingrese la venta del mes " + j);
                m[i][j].setVentas(sc.nextInt()); // Guardamos la venta en cada celda
            }
        }
        return m;
    }
    
    
}
