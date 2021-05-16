/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packag;

/**
 *
 * @author princ
 */
public class NodoParaPrioridad {
   private char dato;
  private int prioridad;
  private NodoParaPrioridad sig,ant;
  
  public NodoParaPrioridad(char dato,int prioridad){
    this.dato = dato;
    this.prioridad = prioridad;
  }

    public char getDato() {
        return dato;
    }

    public void setDato(char dato) {
        this.dato = dato;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    public NodoParaPrioridad getSig() {
        return sig;
    }

    public void setSig(NodoParaPrioridad sig) {
        this.sig = sig;
    }

    public NodoParaPrioridad getAnt() {
        return ant;
    }

    public void setAnt(NodoParaPrioridad ant) {
        this.ant = ant;
    }
  
  @Override
  public String toString(){
      return "Dato: "+dato+" Tiene prioridad: "+prioridad+"\n";
  }
}  

