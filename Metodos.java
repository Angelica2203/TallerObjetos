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
    public ObjAsiento [] MatrizAVector(ObjAsiento [][]m)
    {
        ObjAsiento [] v = new ObjAsiento[m.length * m[0].length];
        int k = 0;
        for (int i = 0; i < m.length; i++) 
        {
            for (int j = 0; j < m[0].length; j++) 
            { 
                v[k++] = m[i][j];              
            } 
        }
        return v;
    }
    public ObjAsiento[] ordenarVectorDeMayorAMenor(ObjAsiento[] vector) 
    {
        int n = vector.length;
        for (int i = 0; i < n - 1; i++) 
        {
            for (int j = 0; j < n - 1 - i; j++) 
            {
                if (vector[j].getPrecio() < vector[j + 1].getPrecio()) 
                {
                    // Intercambiar los elementos
                    ObjAsiento temp = vector[j];
                    vector[j] = vector[j + 1];
                    vector[j + 1] = temp;
                }
            }
        }
        return vector;
    }
    public ObjAsiento[][] vectorAMatriz(ObjAsiento[] vector, ObjAsiento[][]ma) 
    {
        int n = 0;
        for (int i = 0; i < ma.length; i++) 
        {
            for (int j = 0; j < ma.length; j++) 
            {
                ma[i][j] = vector[n++];
            }
        }

        return ma;
    }
    public ObjSupermercado[][] ProductosDisponibles(ObjSupermercado[][] m) 
    {
        ObjSupermercado[][] matrizFiltrada = new ObjSupermercado[m.length][];

        for (int i = 0; i < m.length; i++) 
        {
            matrizFiltrada[i] = new ObjSupermercado[m[i].length];//Para el tamaño de las columnas 
            for (int j = 0; j < m.length; j++) 
            {
                if (m[i][j].isDisponibilidad()) 
                {
                    matrizFiltrada[i][j] = m[i][j];
                } 
                else 
                {
                    matrizFiltrada[i][j] = null;
                }
            }
        }
        return matrizFiltrada;
    }
    public ObjEstudiante[] CalificacionUnica(ObjEstudiante[][] m)
    {
        // Contar calificaciones únicas
        ObjEstudiante[] calificacionesUnicas = new ObjEstudiante[m.length * 2];
        int count = 0;
        for (int i = 0; i < m.length; i++) 
        {
            for (int j = 0; j < m.length; j++) 
            {
                String calificacion = m[i][j].getCalificacion();
                boolean existe = false;
                for (int k = 0; k < count; k++) 
                {
                    if (calificacionesUnicas[k].getCalificacion().equals(calificacion)) 
                    {
                        existe = true;
                        break;
                    }
                }
                if (!existe) 
                {
                    calificacionesUnicas[count++] = m[i][j];
                }
            }
        }
        return calificacionesUnicas;
    }
    public void MatrizXCalificacion(ObjEstudiante[][]m, ObjEstudiante[] Unicas )
    {
        // Crear y mostrar matrices para cada calificación única
        int count = Unicas.length;
        for (int k = 0; k < count; k++) 
        {
            String calificacionActual = Unicas[k].getCalificacion();
            ObjEstudiante[][] grupo = new ObjEstudiante[m.length][m.length];
            
            for (int i = 0; i < m.length; i++) 
            {
                for (int j = 0; j < m.length; j++) 
                {
                    if (m[i][j].getCalificacion().equals(calificacionActual)) 
                    {
                        grupo[i][j] = m[i][j];
                    }
                }
            }
            
            System.out.println("Grupo " + calificacionActual + ":");
            ObjEstudiante O = new ObjEstudiante();
            O.MostrarMatrizObjetual(grupo);
        }
    }
    public ObjProducto5[][] SumarStock(ObjProducto5[][] m1, ObjProducto5[][]m2)
    {
        if (((m1.length * m1[0].length) > (m2.length * m2[0].length))) 
        {
            for (int i = 0; i < m1.length; i++) 
            {
                for (int j = 0; j < m1[0].length; j++) 
                {
                    for (int i2 = 0; i2 < m2.length; i2++) 
                    {
                        for (int j2 = 0; j2 < m2[0].length; j2++) 
                        {
                            if (m1[i][j].getNombre().equalsIgnoreCase(m2[i2][j2].getNombre())) 
                            {
                                m1[i][j].setStock(m1[i][j].getStock() + m2[i2][j2].getStock());   
                            }
                        }
                        
                    }
                    
                }
                
            }
            return m1;
        }
        else if (((m1.length * m1[0].length) < (m2.length * m2[0].length))) 
        {
            for (int i = 0; i < m2.length; i++) 
            {
                for (int j = 0; j < m2[0].length; j++) 
                {
                    for (int i2 = 0; i2 < m1.length; i2++) 
                    {
                        for (int j2 = 0; j2 < m1[0].length; j2++) 
                        {
                            if (m2[i][j].getNombre().equalsIgnoreCase(m1[i2][j2].getNombre())) 
                            {
                                m2[i][j].setStock(m1[i][j].getStock() + m2[i2][j2].getStock());   
                            }
                        }
                        
                    }
                    
                }
                
            }
            return m2;
        }
        else
        {
            for (int i = 0; i < m1.length; i++) 
            {
                for (int j = 0; j < m1[0].length; j++) 
                {
                    for (int i2 = 0; i2 < m2.length; i2++) 
                    {
                        for (int j2 = 0; j2 < m2[0].length; j2++) 
                        {
                            if (m1[i][j].getNombre().equalsIgnoreCase(m2[i2][j2].getNombre())) 
                            {
                                m1[i][j].setStock(m1[i][j].getStock() + m2[i2][j2].getStock());   
                            }
                        }
                        
                    }
                    
                }
                
            }
            return m1;
        }
    }
    public ObjListaProducto[] Categoria(ObjListaProducto[][] m)
    {
        // Contar calificaciones únicas
        ObjListaProducto[] categoriaUnicas = new ObjListaProducto[m.length * 2];
        int count = 0;
        for (int i = 0; i < m.length; i++) 
        {
            for (int j = 0; j < m.length; j++) 
            {
                String categoria = m[i][j].getCategoria();
                boolean existe = false;
                for (int k = 0; k < count; k++) 
                {
                    if (categoriaUnicas[k].getCategoria().equalsIgnoreCase(categoria)) 
                    {
                        existe = true;
                        break;
                    }
                }
                if (!existe) 
                {
                    categoriaUnicas[count++] = m[i][j];
                }
            }
        }
        return categoriaUnicas;
    }
    public void MatrizXCategoria(ObjListaProducto[][]m, ObjListaProducto[] Unicas )
    {
        // Crear y mostrar matrices para cada calificación única
        int count = Unicas.length;
        for (int k = 0; k < count; k++) 
        {
            String categoriaActual = Unicas[k].getCategoria();
            ObjListaProducto[][] grupo = new ObjListaProducto[m.length][m.length];
            
            for (int i = 0; i < m.length; i++) 
            {
                for (int j = 0; j < m.length; j++) 
                {
                    if (m[i][j].getCategoria().equalsIgnoreCase(categoriaActual)) 
                    {
                        grupo[i][j] = m[i][j];
                    }
                }
            }
            System.out.println("\nCategoria " + categoriaActual + ":");
            ObjListaProducto O = new ObjListaProducto();
            O.MostrarMatrizObjetual(grupo);
        }
    }
    public void mayorVenta (ObjVentas [][]m)
    {
        String mayorVenta = ""; //un obj se declara como null y no con 0 orque es un obj y no un int 
        int mayorVentaTotal = 0;
        for (int i = 0; i < m.length; i++) 
        {
            int sumaVentas = 0;
            for (int j = 1; j < m[0].length; j++) 
            { // Sumamos solo las columnas de ventas
                sumaVentas += m[i][j].getVentas();
            }

            if (sumaVentas > mayorVentaTotal) {
                mayorVentaTotal = sumaVentas;
                mayorVenta = m[i][0].getNombre(); 
            }
        }
        System.out.println("El vendedor con la mayor venta es: " + mayorVenta + " con una venta de " + mayorVentaTotal);
        
    }
    public void ProductosOferta(ObjOferta[][] m) 
    {
        int cont = 0;
        for (int i = 0; i < m.length; i++) 
        {
            for (int j = 0; j < m.length; j++) 
            {
                if (m[i][j].isOferta()) 
                {
                    cont++;
                } 
                
            }
        }
        System.out.println("La cantidad de productos en oferta es: " + cont);
    }

}

    


    /*public ObjAsiento[][] ordenarAsientosPorPrecio(ObjAsiento[][] matriz) 
    {
        for (int i = 0; i < matriz.length; i++) 
        {
            for (int j = 0; j < matriz[i].length - 1; j++) 
            {
                for (int k = 0; k < matriz[i].length - j - 1; k++) 
                {
                    if (matriz[i][k].getPrecio() > matriz[i][k + 1].getPrecio()) 
                    {
                        // Intercambiar los asientos
                        ObjAsiento temp = matriz[i][k];
                        matriz[i][k] = matriz[i][k + 1];
                        matriz[i][k + 1] = temp;
                    }
                }
            }
        }
        return matriz; //solo es por filas ordena las filas no toda la matriz
    }*/
    

