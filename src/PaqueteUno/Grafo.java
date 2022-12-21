package PaqueteUno;

import java.util.ArrayList;

public class Grafo {

    ArrayList<Nodo> grafo = new ArrayList<>();

    public void addNodo(Nodo nodo) {
        grafo.add(nodo);
    }
    
    public String toString(){
        return "Grafo" + this.grafo;
    }

}
