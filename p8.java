import java.util.Scanner;

public class p8 
{
    public void punto8(int d)
    {
        Metodos m = new Metodos();
        ObjListaProducto o = new ObjListaProducto();
        Scanner sc = new Scanner(System.in);
        ObjListaProducto [][] M = new ObjListaProducto[d][d];
        M = o.LlenarMatrizObjetual(d);
        ObjListaProducto[] vec = m.Categoria(M);
        m.MatrizXCategoria(M, vec);
    }
}
