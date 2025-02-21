import java.util.Scanner;

public class p4 
{
    public void punto4 (int d)
    {
        Metodos m = new Metodos();
        ObjAsiento x = new ObjAsiento();
        Scanner sc = new Scanner(System.in);
        ObjAsiento [][] M = new ObjAsiento[d][d];
        M = x.LlenarMatrizObjetual(d);
        x.MostrarMatrizObjetual(M);

        ObjAsiento[] vect = m.MatrizAVector(M);
        ObjAsiento[] ve = m.ordenarVectorDeMayorAMenor(vect);
        ObjAsiento[][] ma = m.vectorAMatriz(ve, M);
        
        System.out.println("Asientos ordenados por precio dentro de cada fila:");
        for (int i = 0; i < ma.length; i++) 
        {
            for (int j = 0; j < ma[i].length; j++) 
            {
                System.out.print("Asiento " + ma[i][j].getAsiento() + " (Fila: " + ma[i][j].getFila() + 
                                 ", Precio: " + ma[i][j].getPrecio() + ") ");
            }
            System.out.println();
        }

    }
    
}
