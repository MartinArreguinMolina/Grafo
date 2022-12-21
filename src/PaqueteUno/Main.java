package PaqueteUno;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    
    public static void main(String... args) throws IOException {
        Grafo grafo;
        
        grafo = metodo();
        
        System.out.println(grafo.toString());
    }
    
    public static Grafo metodo() throws IOException{
        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Nodo> listaNodos = new ArrayList<>();
        
        String entrada;
        String[] arista;
        int[] aux = new int [3];
        int n;
        int m;
        int peso;
        int pos = 0;
        
        System.out.print("Dame el numero de nodos que deseas ingresar");
        n = Integer.parseInt(entrada = bufer.readLine());
        
        for (int i = 0; i < n; i++) {
            String ciudad;
            ciudad = bufer.readLine();
            
            Nodo x = new Nodo(ciudad);
            
            listaNodos.add(x);
        }
        
        System.out.println("Dame el numero de aristas que deseas ingresar");
        m = Integer.parseInt(entrada = bufer.readLine());
        
        System.out.println("Origen - Destino - Peso");
        for (int i = 0; i < m; i++) {
            entrada = bufer.readLine();
            arista = entrada.split(" ");
            
            peso = Integer.parseInt(arista[2]);
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < listaNodos.size(); k++) {
                    if (listaNodos.get(k).getCiudad().equals(arista[j])) {
                        pos = k;
                    }
                }
                aux[j] = pos;
                pos = 0;
            }
            
            listaNodos.get(aux[0]).AddArista(new Arista(listaNodos.get(aux[0]) , listaNodos.get(aux[1]) , peso));
            listaNodos.get(aux[1]).AddArista(new Arista(listaNodos.get(aux[1]) , listaNodos.get(aux[0]) , peso));
        }
        
        Grafo ob1 = new Grafo();
        
        for(int i = 0; i < listaNodos.size(); i++){
            ob1.addNodo(listaNodos.get(i));
        }
        
        return ob1;
    }
    
}
