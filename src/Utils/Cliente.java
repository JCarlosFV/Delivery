package Utils;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Cliente {
    public String id;
    public String nombre;
    public String telefono;
    public String direccion;
    public String correo;
    public List<Negocio> negocios;
    public List<Producto> pedidos;

    public Cliente (String id, String nombre, String telefono, String direccion, String correo ){
        this.id = id;
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
        this.correo = correo;
        this.negocios = new ArrayList<Negocio>();
        this.pedidos = new ArrayList<Producto>();
    }

    public void anadir_a_carrito (Producto producto){
        this.pedidos.add(producto);
        this.negocios.add(producto.mi_local);
    }

    public void imprimir_carrito (){
        double impuesto = 0;
        double Subtotal = 0;
        double Total = 0;
        int aumento = 0;

        negocios = negocios.stream().distinct().collect(Collectors.toList());
        aumento = 70 * negocios.size();

        for (Producto c: this.pedidos) {
            Subtotal += c.precio;
        }

        impuesto = Subtotal*(0.15);
        Total = Subtotal + impuesto + aumento;

        System.out.println("--------------------------------- DeliveryDC -----------------------------------"+ "\n");

        System.out.println("Carrito de: " + nombre +"\n" + "#Identidad: " + id + "\n" + "Direccion: " + direccion+ "\n"+ "Tel."+telefono + "\n" + "\n"+
                           "PEDIDOS REALIZADOS -----------------------"+ "\n" );

        for (Producto c: this.pedidos){
            System.out.println("(" + c.mi_local.nombre + ") "  + c.nombre + " Lps." + c.precio);
        }

        System.out.println("\n" + "Subtotal: " + Subtotal + "\n" + "Delivery: " + aumento +  "\n" + "Imp. S/Vta: " + impuesto + "\n" + "Total: Lps." + Total );

        System.out.println("\n" + "Su orden esta en camino, Gracias por confiar en nostros :) " + "\n" + "---------------------------------------------------------------------------");
    }
}
