import java.util.*;

public class Main {
                static Scanner Scan = new Scanner(System.in);
                static String nombre;
                static double precio;
                static int opciones, stock, codigo;

                public static void main(String[] args) {

                    Producto p;
                    Vector productos = new Vector;

                    do {

                        System.out.println("Bienvenido a nuestro Menu"
                                + "\n 1. Registrar compra"
                                + "\n 2. Registrar venta"
                                + "\n 3. Buscar producto"
                                + "\n 4. Salir");
                        opciones=Scan.nextInt();

                        switch (opciones) {

                                case 1:
                                System.out.println("Ingresa el nombre de producto");
                                nombre = Scan.next();
                                System.out.println("Ingresa el codigo de tu producto");
                                codigo = Scan.nextInt();
                                System.out.println("Ingresa el precio del producto");
                                precio = Scan.nextDouble();
                                System.out.println("Ingresa el stock del producto");
                                stock = Scan.nextInt();
                                p = busqueda(codigo, productos);
                                if(p==null) {
                                    productos.addElement(new productos(codigo,nombre,precio,stock));
                                    System.out.println("Hello world!");
                                } else {System.out.println("Hello world!");}
                                break;

                                case 2:
                                    System.out.println("Ingresa el codigo del producto");
                                    codigo = Scan.nextInt();
                                    p = busqueda(codigo, productos);
                                    if(p!=null) {
                                    if (p.getStock() > 0) {
                                        p.setStock(p.getStock() - 1);
                                        System.out.println("Venta registrada exitosamente!");
                                        p.mostrarResultado();
                                    } else {System.out.println("No hay Stocks disponibles");}
                                    } else {System.out.println("El producto no existe");}
                                break;

                                case 3:
                                    System.out.println("Ingresa el codigo del producto");
                                    codigo = Scan.nextInt();
                                    p = busqueda(codigo, productos);
                                    if (p!=null){
                                        p.mostrarResultado();
                                    } else {System.out.println("El producto no existe");}
                                break;

                                case 4:
                                break;

                                default:
                                System.out.println("Ingrese una opcion valida");
                        }


                    } while(opciones!=4);

                }

    public Producto busqueda(int codigo, Vector productos) {
        for (int i=0; i<productos.size(); i++) {

            if((Producto productos.get(i)))
        }
    }
}