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
                    p6 punto6 = new p6();
                    punto6.punto6(d);
                    break;
                case 7:
                    p7 punto7 = new p7();
                    punto7.punto7(d);
                    break;
                case 8:
                    p8 punto8 = new p8();
                    punto8.punto8(d);
                    break;
                case 9:
                    p9 punto9 = new p9();
                    punto9.punto9();
                
                    break;
                case 10:
                    p10 punto10 = new p10();
                    punto10.punto10(d);
                    break;
        
                default:
                    System.out.println("Se ha salido");
                    continua = false;
                    break;
            }
        }
    }    
}
