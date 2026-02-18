package conjuntos;

import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class Conjuntos<T> implements Conjuntable<T>, Iterator<T> {
    //Atributos
    private T[] data; //elementos del conjunto
    private int nElem,pos;
    private static final int SIZE = 20;

    //constructores
    public Conjuntos(){
        this (SIZE); //llamada de constructor a constructor
    }
    public Conjuntos(int size){
        data = (T[]) new Object[size>0 ? size: SIZE]; //if terciario
        Arrays.fill(data, null);
        nElem = pos =0;
    }
    public Conjuntos(Conjuntos<T> set){
        this.data = Arrays.copyOf(set.data, set.data.length);
        this.nElem = set.nElem;
    }
    @Override
    public boolean vacio() {
        return nElem==0;
    }

    @Override
    public void limpia() {
        Arrays.fill(data, null);
        nElem =0;
    }

    @Override
    public void agregar(T elemento) {
        if (nElem != 0){
            if(contiene(elemento) == -1){ // NO ESTA EL ELEMENTO
                IO.println("Nosta men");
                if(nElem>= data.length){
                    data=Arrays.copyOf(data,data.length+1); //se copia todo el arreglo y se le agrega un espacio
                }
                data[nElem++]=elemento;
            }
        }

    }

    @Override
    //tarea w
    public void eliminar(T elemento) {
        if (contiene(elemento) == -1) { // NO ESTA EL ELEMENTO
            IO.println("Nosta men");
            if (nElem >= data.length) {
                data = Arrays.copyOf(data, data.length - 1); //se copia todo el arreglo y se le elimina un espacio
            }
            data[nElem++] = null;
        }

    }
    @Override
    // ***RECURSIVIDAD INDIRECTA***
    public int contiene(T elemento) {
        return contiene(elemento,0);
    }
    public int contiene(T elemento, int index){

        if(index== data.length-1 || data[index]== null){// **NO LO ENCONTRO**
            return -1;
        }
        if(data[index].equals(elemento)){ // **ENCONTRO EL ELEMENTO**
            return index;
        }
        return contiene(elemento,index+1);
    }

    @Override
    public Conjuntos<T> union(Conjuntos<T> set) {
        Conjuntos<T> nuevo = new Conjuntos<T>(this);
        //a {13 5 7 3 20 2} set{5 3 20 2}
        //nuevo {13 5 7 3}
        for (int i = 0; i < set.data.length; i++) {
            if(nuevo.contiene(set.data[i])==-1){
                nuevo.agregar(set.data[i]);
            }
        }

        return null;
    }

    @Override
    public Conjuntos<T> interseccion(Conjuntos<T> set) {
        return null;
    }

    @Override
    public Conjuntos<T> diferencia(Conjuntos<T> set) {
        return null;
    }

    @Override
    public boolean subconjunto(Conjuntos<T> set) {
        return false;
    }

    @Override
    public boolean hasNext(){
        return pos <nElem;
    }

    @Override
    public T next() throws NoSuchElementException {
        if(hasNext()){
            return data[pos++];
        }
        throw new NoSuchElementException("No hay mas elementos");
    }

    public T[] getData() {
        return data;
    }
}
