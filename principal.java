import java.util.Scanner;

public class principal 
{
    public static void main(String[] args) 
    {//Menu
        
        Metodos m = new Metodos();
        Scanner sc = new Scanner(System.in);
        int opt = 0;
        boolean continua = true;
        while (continua) 
        {        
            System.out.println("Ingrese el punto que requiere visualizar del 1 al 10: ");
            while (!sc.hasNextInt()) //negar la respuestas 
            {
                System.out.println("dato incorrecto, ingrese otra vez el numero");
                sc.next();     
            }
            opt = sc.nextInt();
            int d = m.SolicitarDimension();
            switch (opt) 
            {
                case 1:
                    p1 punto1 = new p1();
                    punto1.punto1(d);
                    break;
                case 2:
                    p2 punto2 = new p2();
                    punto2.punto2(d);
                    break;
                case 3:
                    p3 punto3 = new p3();
                    punto3.punto3(d);
                    break;
                case 4:
                    p4 punto4 = new p4();
                    punto4.punto4(d);
                    break;
                case 5:
                    p5 punto5 = new p5();
                    punto5.punto5();
                    break;
                case 6:
                
                    break;
                case 7:
                
                    break;
                case 8:
                
                    break;
                case 9:
                
                    break;
                case 10:
                
                    break;
        
                default:
                    System.out.println("Se ha salido");
                    continua = false;
                    break;
            }
        }
    }    
}
