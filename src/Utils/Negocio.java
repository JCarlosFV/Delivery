package Utils;

import java.util.ArrayList;
import java.util.List;

public class Negocio {
    public String nombre;
    public String categoria;
    public String telefono;
    public String ubicacion;
    public List<Producto> menu;


    public Negocio (String nombre, String categoria, String telefono,String ubicacion){
        this.nombre = nombre;
        this.categoria = categoria;
        this.telefono = telefono;
        this.ubicacion = ubicacion;
        this.menu = new ArrayList<Producto>();
    }

    public void anadir_producto(Producto producto){
        producto.mi_local = this;
        this.menu.add(producto);
    }
}
