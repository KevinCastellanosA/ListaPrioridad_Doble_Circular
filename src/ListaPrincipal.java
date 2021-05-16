//<editor-fold defaultstate="" desc="">  
import packag.NodoParaPrioridad;
//</editor-fold>
/**
 *
 * @author princ
 */
 

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author princ
 */
  public class ListaPrincipal {
  protected NodoParaPrioridad ini;
  protected NodoParaPrioridad fin;
  public ListaPrincipal() {
    ini = fin = null;
  }
  public boolean insertar(char dato, int prioridad) {
        if (ini == null) {
            ini = fin = new NodoParaPrioridad(dato, prioridad);
            return true;
        }

        if (ini == fin) {
            fin = new NodoParaPrioridad(dato, prioridad);
            ini.setSig(fin);
            fin.setAnt(ini);
            return true;
        }

        fin.setSig(new NodoParaPrioridad(dato, prioridad));
        fin.getSig().setAnt(fin);
        fin = fin.getSig();
        return true;
    }

    public boolean eliminar() {
        if (fin == null) {
            return false;
        }
        if (ini == fin) {
            ini = fin = null;
            return true;
        }
        ini = ini.getSig();
        ini.getAnt().setSig(null);
        ini.setAnt(fin);
        return true;
    }                                                                                                                      //<editor-fold defaultstate="collapsed" desc="">  
    @Override
    public String toString() {
        return mostrar(fin);
   }
   
    private String mostrar(NodoParaPrioridad mostrar) {
        if (mostrar == ini) {
            return String.format("%s \n", mostrar.getAnt(), mostrar, mostrar.getSig());
        }
        return mostrar(mostrar.getAnt()) + String.format("%s\n", mostrar.getAnt(), mostrar, mostrar.getSig());
    }
    //</editor-fold> 
 }
 

