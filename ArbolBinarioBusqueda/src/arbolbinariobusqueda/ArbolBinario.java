//Luis David Villar Flores 4M

package arbolbinariobusqueda;


public class ArbolBinario {
    Nodo raiz;
    
    public ArbolBinario(){
        raiz = null;
    }
    
    
    public boolean arbolVacio(){
        return raiz == null;
    }
    
    //Metodo para insertar un nodo en el arbol
    public void agregarNodo(int dato){
        Nodo nuevo = new Nodo(dato);
        
        
        if(raiz == null){
            raiz = nuevo;
        }else{
            Nodo auxiliar = raiz;
            Nodo padre;
            
            while(true){
                padre = auxiliar;
                if(dato < auxiliar.dato){
                    auxiliar = auxiliar.izquierda;
                    if(auxiliar == null){
                        padre.izquierda = nuevo;
                        return;
                    }
                }else if(dato > auxiliar.dato){
                    auxiliar = auxiliar.derecha;
                    if(auxiliar == null){
                        padre.derecha = nuevo;
                        return;
                    }
                }else{
                    System.out.println("No se aceptan numeros repetidos, numero ingresado: " + dato);
                    return;
                }
                
                
                
            }
            
        }
    }
    
    public void recorrerInorden(Nodo r){
        if (r != null){
            recorrerInorden(r.izquierda);
            System.out.print(r.dato + " , ");
            recorrerInorden(r.derecha);
        
        }
    }
}
