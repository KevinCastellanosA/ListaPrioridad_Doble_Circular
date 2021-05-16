import packag.NodoParaPrioridad;
/*
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author princ
 */
public class ListaPrioridadDobleCircular extends ListaDobleCircular{
    
    public ListaPrioridadDobleCircular() {
        super();  
    }
    
  @Override
    public boolean insertar(char dato, int prioridad) {
        if (!super.insertar(dato, prioridad)) {
            return false;
        }
        if (fin.getPrioridad() == fin.getAnt().getPrioridad()) {
            return true;
        }
        if (fin.getPrioridad() > ini.getPrioridad()) {
            fin = fin.getAnt();
            ini = ini.getAnt();
            return true;
        }

        NodoParaPrioridad Salvar = fin.getAnt();
        while (fin.getPrioridad() > Salvar.getPrioridad()) {
            Salvar = Salvar.getAnt();
        }

        fin.setSig(Salvar.getSig());
        ini.setAnt(fin.getAnt());
        fin.getAnt().setSig(ini);
        fin.setAnt(Salvar);
        Salvar.getSig().setAnt(fin);
        Salvar.setSig(fin);
        fin = ini.getAnt();
        return true;
    }
}
