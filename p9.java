import java.util.Scanner;

public class p9 
{
    public void punto9()
    {
        Metodos m = new Metodos();
        ObjVentas o = new ObjVentas();
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el número de vendedores: ");
        int n = sc.nextInt();
        System.out.print("Ingrese el número de meses: ");
        int meses = sc.nextInt();
        ObjVentas [][] M = new ObjVentas[n][meses + 1];
        M = o.LlenarMatrizObjetual(n, meses);
        m.mayorVenta(M);

    }
    
}
