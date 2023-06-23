
package prueba2biblio;

import Controlador.CtrlLibro;
import Modelo.ConsultaLibro;
import Modelo.Libro;
import Vista.frmLibro;


public class Prueba2Biblio {

    
    public static void main(String[] args) {
     
        Libro mod = new Libro();
        ConsultaLibro modC = new ConsultaLibro();
        frmLibro frm = new frmLibro();
        
        CtrlLibro ctrl = new CtrlLibro(mod, modC, frm);
        ctrl.iniciar();
        frm.setVisible(true);
        
    }
    
}
