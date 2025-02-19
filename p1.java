import java.util.Scanner;

public class p1 
{
    public void punto1( int d)
    {
        Metodos m = new Metodos();
        Scanner sc = new Scanner(System.in);
        ObjProductos [][] M = new ObjProductos[d][d];
        M = m.LlenarMatrizObjetual(d);
        m.MostrarMatrizObjetual(M);
        System.out.println("Ingrese el nombre del producto a buscar: ");
        String nomProd = sc.nextLine();
        m.buscarProductoPorNombre(M, nomProd);
    }
}
