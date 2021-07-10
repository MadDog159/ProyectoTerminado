/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aleja
 */
public class ArbolBinarioBusqueda {
    private Nodo raiz;
    String valor = "";
    
    public Nodo getRaiz1() {
        
        return this.raiz;
        
    }

           public String getValor() {
                      return valor;
           }

           public void setValor(String valor) {
                      this.valor = valor;
           }
    

    public void setRaiz(Nodo raiz) {
        
        this.raiz = raiz;
        
    }
    
    public boolean estaVacio() {
        
        return this.raiz == null;
        
    }
    
    public void recorrerPreOrden(Nodo aux) {
        
        if(aux != null){
            
            aux.presentar();
            
            this.recorrerPreOrden(aux.getHijoIzquierdo());
            
            this.recorrerPreOrden(aux.getHijoDerecho()); 
            
        }
        
    }
    
    
    public void recorrerEnOrden(Nodo aux) {
               
        while(aux != null) {
            
            this.recorrerEnOrden(aux.getHijoIzquierdo());
            
           aux.presentar();
            
            this.recorrerEnOrden(aux.getHijoDerecho()); 
            
        }
        
    }
     public String recorrerEnOrden1(Nodo aux,String valor) {

        if(aux != null){
            
            this.recorrerEnOrden1(aux.getHijoIzquierdo(),valor);
            
            valor = String.valueOf(aux.presentar1(valor));
            
            this.recorrerEnOrden1(aux.getHijoDerecho(),valor); 
            
        }
         System.out.println("orden " + valor);
        return valor;
        
    }
     public String recorrerEnOrden2(Nodo aux) {
               
        if(aux != null){
            
            this.recorrerEnOrden2(aux.getHijoIzquierdo());
            
           valor += aux.presentar2() + "\n";
            
            this.recorrerEnOrden2(aux.getHijoDerecho()); 
            
        }
        return valor;
        
    }
     public String recorrerEnOrden3(Nodo aux) {
               
        if(aux != null){
            
            this.recorrerEnOrden3(aux.getHijoIzquierdo());
            
           valor = String.valueOf(aux.presentar2());
            
            this.recorrerEnOrden3(aux.getHijoDerecho()); 
            
        }
        return valor;
        
    }
     
    
//    public void recorrerPostOrden(Nodo aux) {
//        
//        if(aux != null){
//            
//            this.recorrerPostOrden(aux.getHijoIzquierdo());
//            
//            this.recorrerPostOrden(aux.getHijoDerecho());
//            
//            aux.presentar();
//            
//        }
//        
//    }
//    
    public String insertarNodo(Nodo aux, Nodo nuevo) {
        
        if (estaVacio()) {
            
            this.raiz = nuevo;
            
        }else if (nuevo.getData() < aux.getData()) {
            
            if (aux.getHijoIzquierdo() == null) {
                
		aux.setHijoIzquierdo(nuevo);
                
            }else {
                
                this.insertarNodo(aux.getHijoIzquierdo(), nuevo);
                
            }
            
        }else if (nuevo.getData() > aux.getData()) {
            
            if (aux.getHijoDerecho() == null) {
                
		aux.setHijoDerecho(nuevo);
                
            }else {
                
		this.insertarNodo(aux.getHijoDerecho(), nuevo);
                
            }
            
        }else{
            return valor = "El carnet ya se encuentra registrado";
            
        }
               return valor = "El carnet se registro correctamente";
        
    }
    
    public long contarNodos(Nodo aux) {
        
        if(aux == null) {
            
            return 0;
            
        }else {
            
            return 1 + this.contarNodos(aux.getHijoIzquierdo())+ this.contarNodos(aux.getHijoDerecho());
            
        }
        
    }
    
    public Nodo buscarNodo(Nodo aux, long data) {
        
        if (aux != null) {
            
            if (data < aux.getData()) {

                return this.buscarNodo(aux.getHijoIzquierdo(), data);

            }else if (data > aux.getData()) {

                return this.buscarNodo(aux.getHijoDerecho(), data);

            }else {
                
                return aux;
                
            }
            
        }
        
        return null;
        
    }
}
