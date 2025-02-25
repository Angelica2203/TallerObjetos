import java.util.Scanner;

public class p7 
{
    public void punto7(int d)
    {
        Metodos m = new Metodos();
        ObjEstudiante o = new ObjEstudiante();
        Scanner sc = new Scanner(System.in);
        ObjEstudiante [][] M = new ObjEstudiante[d][d];
        M = o.LlenarMatrizObjetual(d);
        ObjEstudiante[] vec = m.CalificacionUnica(M);
        m.MatrizXCalificacion(M, vec);
    }
    
}
