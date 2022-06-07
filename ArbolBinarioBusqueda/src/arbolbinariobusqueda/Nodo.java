
//Luis David Villar Flores 4M 

package arbolbinariobusqueda;


public class Nodo {
    int dato;
    String nombre;
    Nodo izquierda;
    Nodo derecha;
    
    public Nodo(int d, String n){
        this.dato = d;
        this.nombre = n;
        this.izquierda = null;
        this.derecha = null;
    }

    Nodo(int d) {
       this.dato = d;
       
       this.izquierda = null;
       this.derecha = null;
    }
    
    public String toString(){
        return nombre + " dato: " + dato;
    }
}
