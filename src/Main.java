import lse.ListaSimplementeEnlazada;

public class Main {
    public static void main(String[] args){
        ListaSimplementeEnlazada ListaSimplementeEnlazada = new ListaSimplementeEnlazada();

        //Metodo 1: EstaVacia:
        System.out.println(ListaSimplementeEnlazada.estaVacia());

        //Metodo 2: Instertar Nodo:
        ListaSimplementeEnlazada.insertar(5);
        ListaSimplementeEnlazada.insertar(4);
        ListaSimplementeEnlazada.insertar(3);
        ListaSimplementeEnlazada.insertar(2);
        ListaSimplementeEnlazada.insertar(1);
        ListaSimplementeEnlazada.insertar(0);

        //Mostrar Lista Insrtada:
        ListaSimplementeEnlazada.mostrar();

        //Metodo 3:Eliminar Nodo:
        ListaSimplementeEnlazada.eliminar();
        ListaSimplementeEnlazada.eliminar();
        ListaSimplementeEnlazada.eliminar();

        //Motrar Nodos Eliminados:
        ListaSimplementeEnlazada.mostrar();


        // Otra Comprobacion de EstaVacia si es True our Else:
        System.out.println(ListaSimplementeEnlazada.estaVacia());

        //Mostrar ListaDoblementeEnlazada:
        for (int i = 10; i >0; i--){
            ListaSimplementeEnlazada.insertar(i);
        }
        ListaSimplementeEnlazada.mostrarAdelante();
        ListaSimplementeEnlazada.mostrarAtras();
    }
}