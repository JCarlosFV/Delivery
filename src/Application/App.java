package Application;

import Utils.*;

public class App {
    public static void main(String[] args){
        //CREAMOS NUESTRO DELIVERYDC
        DeliveryDC DeliveryDC1 = new DeliveryDC();

        //CREAMOS LOS NEGOCIOS
        Negocio neg1 = new Negocio("Denny´s", "Familiar", "22568982","Col.Las Torres");
        Negocio neg2 = new Negocio("Bigos", "Comida Rapida", "22567645","Col.Lomas del Guijarro");
        Negocio neg3 = new Negocio("Asados el Gordo", "Buffet", "22213498","City Mall");
        Negocio neg4 = new Negocio("Sushi 2 Go", "Gourmet", "22129856","Col.Renacer");
        Negocio neg5 = new Negocio("Little Caeesars", "Comida Rapida", "22756398","Col.Las Brisas");
        Negocio neg6 = new Negocio("Pizza Hut", "Comida Rapida", "22091899","Col.15 de Septiembre");
        Negocio neg7 = new Negocio("Burger King", "Comida Rapida", "22118523","Boulevard Juan Pablo II");
        Negocio neg8 = new Negocio("Pollo Campero", "Familiar", "22908765","Col.Reynel");
        Negocio neg9 = new Negocio("KFC", "Familiar", "22125412","Boulevard Morazan");
        Negocio neg10 = new Negocio("Fleur D'Lis Bistro Café", "Gourmet", "22009426","Col.Nueva Era");

        //REGISTRAMOS LOS NEGOCIOS A NUESTRO DELIVERY
        DeliveryDC1.anadir_comercio(neg1);
        DeliveryDC1.anadir_comercio(neg2);
        DeliveryDC1.anadir_comercio(neg3);
        DeliveryDC1.anadir_comercio(neg4);
        DeliveryDC1.anadir_comercio(neg5);
        DeliveryDC1.anadir_comercio(neg6);
        DeliveryDC1.anadir_comercio(neg7);
        DeliveryDC1.anadir_comercio(neg8);
        DeliveryDC1.anadir_comercio(neg9);
        DeliveryDC1.anadir_comercio(neg10);

        //CREAMOS PRODUCTOS
        Producto p1 = new Producto("Pizza 4 Estaciones","Cuatro diferentes especialidades en una sola",320);
        Producto p2 = new Producto("Pizza Super Suprema","Elaborada con pepperoni, carne de res y cerdo, salchicha italiana, jamón, champiñones, aceitunas, cebolla y chile verde.",199);
        Producto p3 = new Producto("Hut Pack","Una pizza gigante, 8 pechurricas, un refresco 2 L.",299.9);
        Producto p4 = new Producto("Pizza Time","Cualquier pizza gigante, más 6 alitas.",319.0);
        Producto p5 = new Producto("Paquete Pizza n Stix","Incluye 2 pizza n stix y 1 bebida 2 litros.",450.0);
        Producto p6 = new Producto("Bacon Cheese Bread","12 deliciosos pedacitos de pan cubierto con una mezcla de 3 quesos y bacon.",99.0);
        Producto p7 = new Producto("Clásica Queso","Pizza con una mezcla de quesos Mozarella y Muenster.",119.0);
        Producto p8 = new Producto("Hamburguesa Doble Carne Doble Queso","Incluye bebida y papas fritas",125.0);
        Producto p9 = new Producto("Hamburguesa Gigante","Incluye bebida y papas fritas",129.0);
        Producto p10 = new Producto("Hamburguesa de Pollo","Incluye bebida y papas fritas",99.0);
        Producto p11 = new Producto("Hamburguesa Jumbo con Queso","Incluye bebida y papas fritas",150.5);
        Producto p12 = new Producto("BACON KING","Incluye bebida y papas fritas",170.0);
        Producto p13 = new Producto("RODEO KING","Incluye bebida y papas fritas",159.7);
        Producto p14 = new Producto("TENDERGRILL","Incluye bebida y papas fritas",189.5);
        Producto p15 = new Producto("Banquete Familiar 6 Piezas","Banquete de 6 deliciosas piezas de pollo con sabor tierno, jugoso y crujiente",340.6);
        Producto p16 = new Producto("Banquetazo","Banquetazo Campero que te incluye: 15 alitas y 18 Nuggets",270.5);
        Producto p17 = new Producto("Pollo Entero","Pollo entero frito o asado",198.9);
        Producto p18 = new Producto("ALL AMERICAN SLAM","Tres huevos revueltos con queso cheddar, dos tiras de tocino, dos salchichas",160.5);
        Producto p19 = new Producto("DESAYUNO TIPICO","Dos huevos al gusto, plátano maduro frito, mantequilla, queso crema, frijoles",110.9);
        Producto p20 = new Producto("Chuleta","Mixto con 2 complementos",150.0);
        Producto p21 = new Producto("Filete de Pollo","Cob Bebida y un postre",250.5);
        Producto p22 = new Producto("Atlantic","Baked Salmon, spicy aoli, cucumber",350.9);
        Producto p23 = new Producto("Las Vegas Roll","Salmon crab mix, cram cheese, tempura fried",300.10);
        Producto p24 = new Producto("STRIPS BASKET","Tiras de pechuga de pollo empanizadas con papas",130.0);
        Producto p25 = new Producto("BUFFALO WINGS","Alitas bañadas en Salsa Buffalo",119.0);
        Producto p26 = new Producto("Avena Swiss","Avena de Manzana con yogurt",150.9);
        Producto p27 = new Producto("Parfait","Parfait de Frutilla con Yogurt",160.8);

        //REGISTRAMOS LOS PRODUCTOS AL NEGOCIO
        neg1.anadir_producto(p18);
        neg1.anadir_producto(p19);

        neg2.anadir_producto(p8);
        neg2.anadir_producto(p9);
        neg2.anadir_producto(p10);
        neg2.anadir_producto(p11);

        neg3.anadir_producto(p20);
        neg3.anadir_producto(p21);

        neg4.anadir_producto(p22);
        neg4.anadir_producto(p23);

        neg5.anadir_producto(p5);
        neg5.anadir_producto(p6);
        neg5.anadir_producto(p7);

        neg6.anadir_producto(p1);
        neg6.anadir_producto(p2);
        neg6.anadir_producto(p3);
        neg6.anadir_producto(p4);

        neg7.anadir_producto(p12);
        neg7.anadir_producto(p13);
        neg7.anadir_producto(p14);

        neg8.anadir_producto(p15);
        neg8.anadir_producto(p16);
        neg8.anadir_producto(p17);

        neg9.anadir_producto(p24);
        neg9.anadir_producto(p25);

        neg10.anadir_producto(p26);
        neg10.anadir_producto(p27);

        //CREAMOS CLIENTE A
        Cliente clienteA = new Cliente("0816200100520","Juan Carlos Funez","97176322","Col.La Pradera","jcfunez@gmail.com");

        clienteA.anadir_a_carrito(p1);
        clienteA.anadir_a_carrito(p2);
        clienteA.anadir_a_carrito(p3);
        clienteA.anadir_a_carrito(p4);

        clienteA.imprimir_carrito();

        //CREAMOS CLIENTE B
        Cliente clienteB = new Cliente("0816199500506","Gerson Misael Funez","98567865","Col.El Prado","gfunez21@yahoo.com");

        clienteB.anadir_a_carrito(p21);
        clienteB.anadir_a_carrito(p12);
        clienteB.anadir_a_carrito(p16);
        clienteB.anadir_a_carrito(p15);
        clienteB.anadir_a_carrito(p13);
        clienteB.anadir_a_carrito(p1);
        clienteB.anadir_a_carrito(p27);

        clienteB.imprimir_carrito();

        //BUSQUEDA DE CATEGORIAS
        DeliveryDC1.categoria("Comida Rapida"); //Existe
        DeliveryDC1.categoria("Francesa"); //No Existe
    }
}
