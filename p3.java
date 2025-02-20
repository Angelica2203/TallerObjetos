import java.util.Scanner;

public class p3 
{
    public void punto3(int d)
    {
        Metodos m = new Metodos();
        Scanner sc = new Scanner(System.in);
        ObjLibro [][] M = new ObjLibro[d][d];
        M = m.LlenarMatrizObjetualP3(d);
        m.MostrarMatrizObjetualP3(M);
        ObjLibro libroMyPrecio = m.mayorMatriz(M);
        System.out.println("El libro con el precio mayor es: " + libroMyPrecio.getTitulo() + " con un precio de " + libroMyPrecio.getPrecio());

    }
    
}
