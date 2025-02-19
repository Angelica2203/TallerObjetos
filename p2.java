import java.util.Scanner;

public class p2 
{
    public void punto2(int d)
    {
        Metodos m = new Metodos();
        Scanner sc = new Scanner(System.in);
        ObjProductos [][] M = new ObjProductos[d][d];
        M = m.LlenarMatrizObjetualP2(d);
        m.MostrarMatrizObjetualP2(M);
        int suma = m.sumaMatriz(M);
        System.out.println("La suma de las cantidades es: " + suma);

    }
    
}
