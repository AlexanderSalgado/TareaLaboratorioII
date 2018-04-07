
package com.productos;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author 00191617
 */
public class Productos {
    private ArrayList<Inventario> productos;
    
    public Productos() {
        productos = new ArrayList<>();
    }

    public void agregar() {
        Inventario producto = new Inventario();
        productos.add(producto);
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el nombre del producto: ");
        System.out.print(": ");
        producto.setProducto(leer.nextLine());
        
        System.out.println("Ingrese la cantidad que hay del producto: ");
        System.out.print(": ");
        producto.setCantidad(leer.nextInt());
        
        System.out.println("Ingrese el precio del producto: ");
        System.out.print(": ");
        producto.setPrecio(leer.nextFloat());
    }


    public void eliminar(String prod) {
        for(int i = 0; i< productos.size(); i++){
            if(productos.get(i).getProducto().equals(prod)){
                productos.remove(i);
            }
        }
    
    }

    void modificar(String prod) {
        Scanner leer = new Scanner(System.in);
        float nuevo;
        for(int i = 0; i< productos.size(); i++){
            if(productos.get(i).getProducto().equals(prod)){
                System.out.println("Ingrese el nuevo precio: ");
                nuevo = leer.nextFloat();
                productos.get(i).setPrecio(nuevo);
            }
        }
    }

    void cargar(String prod) {
        Scanner leer = new Scanner(System.in);
        int nuevo, ref;
        for(int i = 0; i< productos.size(); i++){
            if(productos.get(i).getProducto().equals(prod)){
                ref = productos.get(i).getCantidad();
                System.out.println("Ingrese  la cantidad a cargar: ");
                nuevo = leer.nextInt();
                productos.get(i).setCantidad(ref + nuevo);
            }
        } 
    }

    void descargar(String prod) {
        Scanner leer = new Scanner(System.in);
        int nuevo, ref;
        for(int i = 0; i< productos.size(); i++){
            if(productos.get(i).getProducto().equals(prod)){
                ref = productos.get(i).getCantidad();
                System.out.println("Ingrese  la cantidad a descargar: ");
                nuevo = leer.nextInt();
                productos.get(i).setCantidad(ref - nuevo);
            }
        } 
    }

    void descartar(String prod) {
        for(int i = 0; i< productos.size(); i++){
            if(productos.get(i).getProducto().equals(prod)){
                productos.get(i).setCantidad(0);
            }
        }
    }

    
}
