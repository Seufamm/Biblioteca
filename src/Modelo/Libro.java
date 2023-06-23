
package Modelo;


public class Libro {
    
    private int codigo;
    private String titulo;
    private String autor;
    private String disponibilidad;
    private int cantidadEjemplares;
    private int estanteriaId;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(String disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

 

    public int getCantidadEjemplares() {
        return cantidadEjemplares;
    }

    public void setCantidadEjemplares(int cantidadEjemplares) {
        this.cantidadEjemplares = cantidadEjemplares;
    }

    public int getEstanteriaId() {
        return estanteriaId;
    }

    public void setEstanteriaId(int estanteriaId) {
        this.estanteriaId = estanteriaId;
    }
    
    
    
    
}
