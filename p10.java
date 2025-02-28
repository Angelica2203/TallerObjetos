import java.util.Scanner;

public class p10 
{
    public void punto10(int d)
    {
        Metodos m = new Metodos();
        ObjOferta x = new ObjOferta();
        Scanner sc = new Scanner(System.in);
        ObjOferta [][] M = new ObjOferta[d][d];
        M = x.LlenarMatrizObjetual(d);
        m.ProductosOferta(M);
    }
    
}
