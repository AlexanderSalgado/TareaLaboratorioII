
package com.inventario;


import java.util.Scanner;
/**
 *
 * @author 00191617
 */
public class Inventario {
    private String producto;
    private int cantidad;
    private float precio;
    
    public Inventario() {};
    
    public Inventario(String producto, int cantidad, float precio){
        this.producto = producto;
        this.cantidad = cantidad;
        this.precio = precio;
    }
    
    public String getProducto(){
        return producto;
    }
    
    public void setProducto(String producto){
        this.producto = producto;
    }
    
    public int getCantidad(){
        return cantidad;
    }
    
    public void setCantidad(int cantidad){
        this.cantidad = cantidad;
    }
    
    public float getPrecio(){
        return precio;
    }
    
    public void setPrecio(float precio){
        this.precio = precio;
    }

   
    public static void main(String[] args) {
        String username = "administrador", password = "1234", username2, password2;
        boolean flag = true;
        Scanner leer = new Scanner(System.in);
        
        
        Menu menu = Menu.getInstance();
        
        while(flag){
            System.out.println("Ingrese el usuario: ");
            username2 = leer.next();
            System.out.println("Ingrese la contrasenia: ");
            password2 = leer.next();
            if(username.equals(username2) && password.equals(password2)){
                menu.mostrar();
                flag = false;
            }
            else{
                System.out.println("Datos erroneos");
            }
        }
        
        

    }
    
}
