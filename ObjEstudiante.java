import java.util.Scanner;

public class ObjEstudiante 
{
    Scanner sc = new Scanner(System.in);
    private String nombre;
    private String calificacion;
    public ObjEstudiante() 
    {

    }
    public ObjEstudiante(String nombre, String calificacion) 
    {
        this.nombre = nombre;
        this.calificacion = calificacion;
    }
    public String getNombre() 
    {
        return nombre;
    }
    public String getCalificacion() 
    {
        return calificacion;
    }
    public void setNombre(String nombre) 
    {
        this.nombre = nombre;
    }
    public void setCalificacion(String calificacion) 
    {
        this.calificacion = calificacion;
    }
    public ObjEstudiante[][] LlenarMatrizObjetual(int d)
    {
        ObjEstudiante[][] m = new ObjEstudiante[d][d];
        for (int i = 0; i < m.length; i++) 
        {
            for (int j = 0; j < m.length; j++) 
            {
                ObjEstudiante obj = new ObjEstudiante(); //No olvidar poner eso siempre 

                System.out.println("Ingrese el nombre: ");
                obj.setNombre(sc.next()); 
                System.out.println("Ingrese la calificación: ");
                obj.setCalificacion(sc.next());
                m[i][j] = obj;
            }   
        }
        return m;
    }
    public void MostrarMatrizObjetual(ObjEstudiante[][] m)
    {
        for (int i = 0; i < m.length; i++) 
        {
            for (int j = 0; j < m[0].length; j++) 
            {
                if (m[i][j] != null) 
                {
                    System.out.println("Nombre: " + m[i][j].getNombre());
                    System.out.println("Calificacion: " + m[i][j].getCalificacion());
                    System.out.println("\n");
                    
                }
                
            }
            
        }
    }

    
}
