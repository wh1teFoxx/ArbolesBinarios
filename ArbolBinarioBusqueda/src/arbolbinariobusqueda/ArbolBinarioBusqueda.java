//Luis David Villar Flores 4M

package arbolbinariobusqueda;

import java.util.Scanner;

public class ArbolBinarioBusqueda {

   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        int dato;
        ArbolBinario arbol = new ArbolBinario();
        
        do{
            System.out.println("ARBOL DE BUSQUEDA BINARIA");
            System.out.println("1. ingresar dato");
            System.out.println("2. Recorrido inorden");
            System.out.println("0. salir");
                opcion = sc.nextInt();
            
            switch(opcion){
                case 1:
                        System.out.println("seleccione el elemento a ingresar");
                        dato = sc.nextInt();
                        arbol.agregarNodo(dato);
                        
                    break;
                case 2:
                    
                    if(!arbol.arbolVacio()){
                        arbol.recorrerInorden(arbol.raiz);
                        System.out.println("");
                    }else{
                        System.out.println("arbol vacío");
                    }
                    break;
                case 0:
                    System.out.println("Me pone 100? (En el parcial )c:");
                    break;
                default:
                    System.out.println("Por favor, seleccione una opción valida");
            }
        }while(opcion != 0);
    }
    
}
