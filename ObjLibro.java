public class ObjLibro 
{
    private String titulo;
    private String autor;
    private double precio;
    public ObjLibro() 
    {

    }
    public ObjLibro(String titulo, String autor, double precio) 
    {
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
    }
    public String getTitulo() 
    {
        return titulo;
    }
    public String getAutor() 
    {
        return autor;
    }
    public double getPrecio() 
    {
        return precio;
    }
    public void setTitulo(String titulo) 
    {
        this.titulo = titulo;
    }
    public void setAutor(String autor) 
    {
        this.autor = autor;
    }
    public void setPrecio(double precio) 
    {
        this.precio = precio;
    }
    
    
    
    
    
}
