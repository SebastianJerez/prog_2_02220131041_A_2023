/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TercerPunto;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author sebas
 */
public class TiendaDoWhile {
    
    private static ArrayList<Productos> myProductos = new ArrayList<>();
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        entrada.useDelimiter("\n");
        int numero = (int)(Math.random()*5+1);
        String aux1, aux2="", aux3="";
        
        System.out.println("Tienda de Productos (Usando DO WHILE)");
        System.out.println("Numero RAND generado: "+numero+"\n");
        
        System.out.println("Ingrese los productos a comprar");
        //Se ingresan cada uno de los productos de la tienda
        int i=0;
        do{
            System.out.println("Producto "+(i+1)+": ");
            System.out.print("Nombre del producto: ");
            aux1 = entrada.next();
            //Aqui se valida que el precio y la cantidad sean datos numericos y no alfabeticos
            do{
                System.out.print("Cantidad del producto: ");
                aux2 = entrada.next();
            }while(!EsNumero(aux2));
            do{
                System.out.print("Precio del producto: ");
                aux3 = entrada.next();
            }while(!EsNumero(aux3));
            int num1;
            double num2;
            //Se pasan los datos a enteros y dobles
            num1=Integer.parseInt(aux2);
            num2=Double.parseDouble(aux3);
            //Asignamos los datos a una nueva instancia de productos el cual se añade al Arraylist myProductos
            Productos aux4 = new Productos(aux1,num1,num2);
            myProductos.add(aux4);
            i++;
        }while(i<numero);
        
        System.out.println("\nLista de Productos");
        i=0;
        do{
            System.out.println(myProductos.get(i).getNombre()+"\t\tx"+myProductos.get(i).getCantidad()+"\t$$: "+myProductos.get(i).getPrecio());            
            i++;
        }while(i<numero);
        
    }
    //Esta funcion valida si el numero que se ingresa es entero
    public static boolean EsNumero(String text) {
        int n;
        try {
          n=Integer.parseInt(text);
          return true;
        } catch (NumberFormatException ex) {
           return false;
        }
    }
}
