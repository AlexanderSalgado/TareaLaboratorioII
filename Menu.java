
package com.menu;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.ArrayList;


/**
 *
 * @author 00191617
 */
public class Menu {

    private static Menu menu;
    private ArrayList<String> proveedores;

    private Menu() {
    }

    public static Menu getInstance() {
        if (menu == null) {
            menu = new Menu();
        }
        return menu;
    }

    public void opciones() {
        System.out.println("***** Menu ******");
        System.out.println("1. Agregar Producto");
        System.out.println("2. Modificar Producto");
        System.out.println("3. Eliminar Producto");
        System.out.println("4. Cargar Producto");
        System.out.println("5. Descartar Producto");
        System.out.println("6. Descargar Producto");
        System.out.println("7. Salir");
    }
    
    public void mostrar() {
        proveedores = new ArrayList<>();
        int opcion = 4;
        String dato;
        Scanner leer = new Scanner(System.in);
        Productos BaseDatos = new Productos();

        while (opcion != 7) {
            opciones();
            try {
                opcion = leer.nextInt();
                switch (opcion) {
                    case 1:
                        System.out.println("Quien es su proveedor?: ");
                        proveedores.add(leer.next());
                        BaseDatos.agregar();
                        break;
                    case 2:
                        System.out.println("Ingrese el producto a modificar: ");
                        dato = leer.next();
                        BaseDatos.modificar(dato);
                        break;
                    case 3:
                        System.out.println("Ingrese el producto a eliminar: ");
                        dato = leer.next();
                        BaseDatos.eliminar(dato);
                        break;
                    case 4:
                        System.out.println("Ingrese el producto a cargar: ");
                        dato = leer.next();
                        BaseDatos.cargar(dato);
                        break;
                    case 5:
                        System.out.println("Ingrese el producto a descartar: ");
                        dato = leer.next();
                        BaseDatos.descartar(dato);
                    case 6:
                        System.out.println("Ingrese el producto a descargar: ");
                        dato = leer.next();
                        BaseDatos.descargar(dato);
                        break;
                    case 7:
                        System.out.println("Salu :(");
                        break;
                    default:
                        System.out.println("Por favor ingrese una opcion valida");
                }
            } catch (InputMismatchException e) {
                System.err.println("Por favor, Ingrese un numero");
                leer.nextLine();
            }
        }
    }
}
