/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author princ
 */
public class ListaDobleCircular extends ListaPrincipal {
   public ListaDobleCircular() {
        super();
    }

    @Override
    public boolean insertar(char dato, int prioridad) {
        if (super.insertar(dato, prioridad)) {
            fin.setSig(ini);
            ini.setAnt(fin);
            return true;
        }
        return false;
    }

    @Override
    public boolean eliminar() {
        if (super.eliminar() && fin != null) {
            fin.getSig().setAnt(null);
            fin.setSig(ini);
            return true;
        }

        return false;
    } 
}
