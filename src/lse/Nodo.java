package lse;

public class Nodo {
    private Nodo Anterior;
    private Object dato;
    private Nodo Primero;

    public Nodo(Nodo anterior, Object dato, Nodo siguiente) {
        this.Anterior = anterior;
        this.dato = dato;
        this.Primero = siguiente;
    }


    public Nodo getAnterior() {
        return Anterior;
    }

    public void setAnterior(Nodo anterior) {
        Anterior = anterior;
    }

    public Object getDato() {
        return dato;
    }

    public void setDato(Object dato) {
        this.dato = dato;
    }

    public Nodo getSiguiente() {
        return Primero;
    }

    public void setSiguiente(Nodo siguiente) {
        Primero = siguiente;
    }
}
