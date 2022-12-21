
package PaqueteUno;

public class Arista {
    private Nodo origen;
    private Nodo destino;
    private int peso;
    
    public Arista(Nodo origen , Nodo destino , int peso){
        this.origen = origen;
        this.destino = destino;
        this.peso = peso;
    }
    
    public Nodo getOrigen(){
        return this.origen;
    }
    
    public void setOrigen(Nodo origen){
        this.origen = origen;
    }
    
    public Nodo getDestino(){
        return this.destino;
    }
    
    public void setDestino(Nodo destino){
        this.destino = destino;
    }
    
    public int getPeso(){
        return this.peso;
    }
    
    public void setPeso(int peso){
        this.peso = peso;
    }
    
    public String toString(){
        return "Origen " + getOrigen().getCiudad() + ", Destino " + getDestino().getCiudad() + ", Peso " + getPeso();
    }
}
