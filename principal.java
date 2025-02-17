import java.util.Scanner;

public class principal 
{
    public static void main(String[] args) 
    {//Menu
        
        Metodos m = new Metodos();
        Scanner sc = new Scanner(System.in);
        int opt = 0;
        System.out.println("Ingrese el punto que requiere visualizar del 1 al 10: ");
        opt = sc.nextInt();
        int d = m.SolicitarDimension();
        //ObjPersonas [][] M = new ObjPersonas[d][d];
        switch (opt) {
            case 1:
                
                break;
        
            default:
                break;
        }
        

    }


    
}
