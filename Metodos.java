import java.util.Scanner;

public class Metodos 
{
    Scanner sc = new Scanner(System.in);
    public int SolicitarDimension()
    {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        System.out.println("Ingrese la dimension de la matriz: ");
        n = sc.nextInt();
        return n;
    }
    public ObjProductos[][]  LlenarMatrizObjetual(int d)
    {
        ObjProductos[][] m = new ObjProductos[d][d];
        for (int i = 0; i < m.length; i++) 
        {
            for (int j = 0; j < m.length; j++) 
            {
                ObjProductos obj = new ObjProductos(); //No olvidar poner eso siempre 

                System.out.println("Ingrese el nombre: ");
                obj.setNombre(sc.next()); 
                System.out.println("Ingrese el precio: ");
                obj.setPrecio(sc.nextDouble());
                System.out.println("Ingrese la cantidad: ");
                obj.setCantidad(sc.nextInt());
                m[i][j] = obj;

            }   
        }
        return m;
    }
    public ObjProductos[][]  LlenarMatrizObjetualP2(int d)
    {
        ObjProductos[][] m = new ObjProductos[d][d];
        for (int i = 0; i < m.length; i++) 
        {
            for (int j = 0; j < m.length; j++) 
            {
                ObjProductos obj = new ObjProductos(); //No olvidar poner eso siempre 

                System.out.println("Ingrese la cantidad: ");
                obj.setCantidad(sc.nextInt());
                m[i][j] = obj;

            }   
        }
        return m;
    }
    public ObjLibro[][]  LlenarMatrizObjetualP3(int d)
    {
        ObjLibro[][] m = new ObjLibro[d][d];
        for (int i = 0; i < m.length; i++) 
        {
            for (int j = 0; j < m.length; j++) 
            {
                ObjLibro obj = new ObjLibro(); //No olvidar poner eso siempre 

                System.out.println("Ingrese el titulo: ");
                obj.setTitulo(sc.next()); 
                System.out.println("Ingrese el autor: ");
                obj.setAutor(sc.next());
                System.out.println("Ingrese la precio: ");
                while (!sc.hasNextDouble()) 
                {
                    System.out.println("El valor del precio es incorrecto");
                    sc.next();
                    
                }
                obj.setPrecio(sc.nextDouble());
                m[i][j] = obj;

            }   
        }
        return m;
    }
    public void MostrarMatrizObjetual(ObjProductos[][] m)
    {
        for (int i = 0; i < m.length; i++) 
        {
            for (int j = 0; j < m.length; j++) 
            {
                System.out.println("Nombre: " + m[i][j].getNombre());
                System.out.println("Precio: " + m[i][j].getPrecio());
                System.out.println("Cantidad: " + m[i][j].getCantidad());
                System.out.println("\n");
                
            }
            
        }
    }
    public void MostrarMatrizObjetualP2(ObjProductos[][] m)
    {
        for (int i = 0; i < m.length; i++) 
        {
            for (int j = 0; j < m.length; j++) 
            {

                System.out.println("Cantidad: " + m[i][j].getCantidad());
                System.out.println("\n");
                
            }
            
        }
    }
    public void MostrarMatrizObjetualP3(ObjLibro[][] m)
    {
        for (int i = 0; i < m.length; i++) 
        {
            for (int j = 0; j < m.length; j++) 
            {
                System.out.println("Nombre: " + m[i][j].getTitulo());
                System.out.println("Precio: " + m[i][j].getAutor());
                System.out.println("Cantidad: " + m[i][j].getPrecio());
                System.out.println("\n");
                
            }
            
        }
    }

    public void buscarProductoPorNombre(ObjProductos[][] m, String nomProd) 
    {
        //int [] pos = new int[2]
        for (int i = 0; i < m.length; i++) 
        {
            for (int j = 0; j < m[0].length; j++) 
            {
                if (m[i][j].getNombre().toLowerCase().equals(nomProd.toLowerCase())) 
                    System.out.println("Producto encontrado en la fila " + i + ", columna " + j);
                    //pos[0] = i;
                    //pos[1] = j;

            }
        }
    }
    public int sumaMatriz( ObjProductos[][] m)
    {
        int acum = 0;
        for( int i = 0; i < m.length; i ++)
        {
            for( int j = 0; j < m.length; j ++)
            {
                acum += m[i][j].getCantidad();
            }
        }
        return acum;
    }
    public ObjLibro mayorMatriz (ObjLibro [][]m)
    {
        ObjLibro myPrecio= m[0][0];
        for (int i = 0; i < m.length; i++) 
        {
            for (int j = 0; j < m[0].length; j++) 
            { 
                if(m[i][j].getPrecio() > myPrecio.getPrecio())
                    myPrecio = m[i][j];               
            } 
        }
        return myPrecio;
    }

    
}
