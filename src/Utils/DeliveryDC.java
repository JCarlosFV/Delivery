package Utils;

import java.util.ArrayList;
import java.util.List;

public class DeliveryDC {
    public List<Negocio> negocios_vinculados;

    public DeliveryDC(){
        this.negocios_vinculados = new ArrayList<Negocio>();
    }

    public void anadir_comercio (Negocio vinculados ){
        this.negocios_vinculados.add(vinculados);
    }

    public void categoria (String categoria){
        System.out.println("\n"+"Negocios con categoria " + categoria + ":");
        int a = 0;
        for (Negocio c: this.negocios_vinculados) {
            if (c.categoria == categoria){
                System.out.println(c.nombre);
            }else {
                a+=1;
            }
        }
        if (a == 10){
            System.out.println("No Hay Comercios");
        }
    }
}


