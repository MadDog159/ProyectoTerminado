/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aleja
 */
public class Nodo {
    private long data;
    
    private Nodo hijoIzquierdo;
    
    private Nodo hijoDerecho;
    
    public Nodo() {
        
    }
    

    public Nodo(long data) {
        
        this.data = data;
        
        this.hijoIzquierdo = null;
        
        this.hijoDerecho = null;
        
    }
    
    
    public long getData() {
        
        return this.data;
        
    }

    public void setData(long data) {
        
        this.data = data;
        
    }

    public Nodo getHijoIzquierdo() {
        
        return this.hijoIzquierdo;
        
    }

    public void setHijoIzquierdo(Nodo hijoIzquierdo) {
        
        this.hijoIzquierdo = hijoIzquierdo;
        
    }

    public Nodo getHijoDerecho() {
        
        return this.hijoDerecho;
        
    }

    public void setHijoDerecho(Nodo hijoDerecho) {
        
        this.hijoDerecho = hijoDerecho;
        
    }
    
    public void presentar(){
        
        System.out.println("( "+ this.data +" )");
        
    }
    public long presentar2(){
        
        return this.data;
        
    }
    public String presentar1(String valor){
               System.out.println("presenta" + valor);
         return valor + this.data;
        
    }
    
    
    public boolean esHoja(){
        
        return this.hijoIzquierdo == null && this.hijoDerecho == null;
    
    }
}
