package Utils;

public class Producto {
    public String nombre;
    public String descripcion;
    public double precio;
    Negocio mi_local;

    public Producto (String nombre, String descripcion,double precio){
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public void mi_local (Negocio mi_local){
        this.mi_local = mi_local;
    }
}
