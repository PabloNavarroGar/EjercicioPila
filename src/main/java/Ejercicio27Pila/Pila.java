/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio27Pila;


import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author pablo
 */
public class Pila<T> {

    protected List<T> lista;
    private final int tamanio;
    public Pila(int tamanio) {
        //Creo un constructor, el cual tiene un tamaño.
        tamanio = Math.abs(tamanio);
        this.lista = new ArrayList<>(tamanio);
        this.tamanio = tamanio;
    }

    @Override
    public String toString() {
        String tmp = "";//declaracion string
        //Foreach que le metemos el arraylist y luego le metmeos la lista
        for (T t : this.lista) {

            //Lanzar una expecion
            //Hacemos un tostring del objeto 'v' 
            tmp += t.toString() + "\n";

        }
        return tmp;
    }

    public int numeroElementosPila() {

        return this.lista.size();
    }

    public boolean estaVacia() {

       return this.lista.isEmpty();
    }

    public boolean estaLlena(){
        
        
        return this.lista.size() == tamanio ;
    }
    public int buscarElemento(T elemento) {
        //T es el array list del Objeto
        //Se le pasa el elemento como objeto, que esta ne el parametro
        if (elemento != null) {
            for (int i = 0; i < this.lista.size(); i++) {
                if (this.lista.get(i) != null && elemento.equals(this.lista.get(i))) {
                    return i;
                }
            }
        }
        //Como no encuentra ese cliente devuelve -1
        return -1;
    }

    public boolean borrarElementoPop(T elemento) {
        //LLamo al metodo de buscar enlazandolo con una variable
        if(!estaVacia()){
        int posicionVehiculoArray = buscarElemento(elemento);
        //Si la posicion es mayor o iguala 0, pone el vehiculo en 0
        if (posicionVehiculoArray >= 0) {
            this.lista.remove(posicionVehiculoArray);
            return true;
        }
        }
        return false;

    }

    public void anadirElementoPush(T elemento) {
        
        if(!estaLlena()){
        this.lista.add(elemento);//Solo es una linea de comando.
        }
    }
    
     public ArrayList<T> sacarArrayList() {
       ArrayList<T> listado = new ArrayList<>();
        
        //Con el objeto T
        //ForEach que se le pasa los soldados de la clase al ejercito
        for (T pila : lista) {
            listado.add(pila);//Se le añade a la ArryList los soldados
        }

        return listado; //devuelvo el array(soldados)
    }
     
     public void rellenar(T[] array){
         lista.clear();
         
         for(T t :array ){
             
             anadirElementoPush(t);
         }
    
         
         
     }

}
