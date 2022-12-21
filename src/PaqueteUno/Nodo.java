package PaqueteUno;

import java.util.ArrayList;

public class Nodo {

    private String ciudad;
    private ArrayList<Arista> lista = new ArrayList();

    public Nodo(String ciudad) {
        this.ciudad = ciudad;
    }
    
    public String getCiudad(){
        return this.ciudad;
    }
    
    public void setCiudad(String ciudad){
        this.ciudad = ciudad;
    }
    
    public ArrayList<Arista> getLista(){
        return this.lista;
    }
    
    public void setLista(ArrayList<Arista> lista){
        this.lista = lista;
    }
    
    public void AddArista(Arista arista){
        lista.add(arista);
    }
    
    public String toString(){
        return "Ciudad \n" + getCiudad() + ", Arista \n" + getLista();
    }
}
