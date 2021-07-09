package lse;

public class ListaSimplementeEnlazada {
    Nodo Primero;
    Nodo Inicio;
    public ListaSimplementeEnlazada(){
        Primero = null;
    }
    public boolean estaVacia() {
        return Primero == null;
    }
    public void insertar(Object dato) {
        if(estaVacia()){
            Nodo nuevo = new Nodo(null, dato, null);
            Primero = nuevo;
        }else{
                Nodo nuevo = new Nodo(null, dato, Primero);
                Primero.setAnterior(nuevo);
                Primero = nuevo;
        }
    }
    //public void poner(Object dato) {
        //if (estaVacia()){
            //Nodo nuevo = new Nodo(null, dato, null);
            //Inicio = nuevo;
        //} else {
            //Nodo nuevo = new Nodo(null, dato, Inicio);
            //Inicio.setAnterior(nuevo);
            //Inicio = nuevo;
        //}
    //}
    public void eliminar() {
        if(!estaVacia()) {
            Nodo Anterior;
            Primero = Primero.getSiguiente();
        }
    }
    public void mostrar() {
        Nodo tmp = Primero;
        while (tmp != null) {
            System.out.print(tmp.getDato() +"  ");

            tmp = tmp.getSiguiente();
        }
        System.out.println();
    }
    public void mostrarAdelante(){
        if( !estaVacia()){
            Nodo temp = Primero;
            while(temp != null) {
                System.out.print(temp.getDato() + "   ");
                temp = temp.getSiguiente();
            }
            System.out.println();
        }
    }
    public void mostrarAtras(){
        if( !estaVacia()) {
            Nodo Ultimo = Primero;
            while (Ultimo.getSiguiente() != null) {
                Ultimo = Ultimo.getSiguiente();
            }
            Nodo temp = Ultimo;
            while (temp != null) {
                System.out.print(temp.getDato() + "   ");
                temp = temp.getAnterior();
            }
            System.out.println();
        }
    }
}