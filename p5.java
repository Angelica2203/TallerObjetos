import java.util.Scanner;

public class p5 
{
    public void punto5()
    {
        Metodos m = new Metodos();
        ObjProducto5 o = new ObjProducto5();
        Scanner sc = new Scanner(System.in);
        int f1 = 0, c1 = 0, f2 = 0, c2 = 0;
        System.out.println("Ingrese las filas de la matriz 1: ");
        f1 = sc.nextInt();
        System.out.println("Ingrese las columnas de la matriz 1:");
        c1 = sc.nextInt();
        System.out.println("Ingrese las filas de la matriz 2: ");
        f2 = sc.nextInt();
        System.out.println("Ingrese las columnas de la matriz 2:");
        c2 = sc.nextInt();
        ObjProducto5 [][] M1 = new ObjProducto5[f1][c1];
        ObjProducto5 [][] M2 = new ObjProducto5[f2][c2];
        M1 = o.LlenarMatrizObjetual(f1, c1);
        M2 = o.LlenarMatrizObjetual(f2, c2);
        if ((M1.length * M1[0].length) > (M2.length * M2[0].length)) 
        {
            M1 = m.SumarStock(M1, M2);
            o.MostrarMatrizObjetual(M1);
        }
        else if ((M1.length * M1[0].length) < (M2.length * M2[0].length)) 
        {
            M2 = m.SumarStock(M1, M2);
            o.MostrarMatrizObjetual(M2);
        }
        else 
        {
            M1 = m.SumarStock(M1, M2);
            o.MostrarMatrizObjetual(M1);
        }
    }
    
}
