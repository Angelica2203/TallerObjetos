import java.util.Scanner;

public class p6 
{
    public void punto6(int d)
    {
        Metodos m = new Metodos();
        ObjSupermercado x = new ObjSupermercado();
        Scanner sc = new Scanner(System.in);
        ObjSupermercado [][] M = new ObjSupermercado[d][d];
        M = x.LlenarMatrizObjetual(d);
        x.MostrarMatrizObjetual(M);
        ObjSupermercado [][] ma = m.ProductosDisponibles(M);
        System.out.println("Productos disponibles: ");
        for (int i = 0; i < ma.length; i++) 
        {
            for (int j = 0; j < ma[i].length; j++) 
            {
                if (ma[i][j] != null) 
                {
                    System.out.println("Nombre: " + ma[i][j].getNombre());
                    System.out.println("Precio: " + ma[i][j].getPrecio());
                    System.out.println("Disponible: " + ma[i][j].isDisponibilidad());
                    System.out.println("\n");
                }
            }
        }
        
    }

    
}
