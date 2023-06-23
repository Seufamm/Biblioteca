
package Controlador;
import java.awt.event.ActionListener;
import Modelo.Libro;
import Vista.frmLibro;
import Modelo.ConsultaLibro;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;


public class CtrlLibro implements ActionListener {
    
    
    private Libro mod;
    private ConsultaLibro modC;
    private frmLibro frm;
    
    
    public CtrlLibro (Libro mod, ConsultaLibro modC, frmLibro frm)
    {
        this.mod = mod;
        this.modC = modC;
        this.frm = frm;
        this.frm.btnRegistrar.addActionListener(this);
        
    }
        
    
    public void iniciar()
    {
        frm.setTitle("Libros");
        frm.setLocationRelativeTo(null);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e)
    {
        
        if(e.getSource() == frm.btnRegistrar)
        {
            mod.setCodigo(Integer.parseInt(frm.txtCodigo.getText()));
            mod.setTitulo(frm.txtTitulo.getText());
            mod.setAutor(frm.txtAutor.getText());
            mod.setDisponibilidad((frm.txtDisponibilidad.getText()));
            mod.setCantidadEjemplares(Integer.parseInt(frm.txtCantidad.getText()));
            mod.setEstanteriaId(Integer.parseInt(frm.txtEstanteria.getText()));
           
        
        
            if(modC.registrar(mod))
            {
                JOptionPane.showMessageDialog(null, "Registro Guardado");
                
            } else {
                JOptionPane.showMessageDialog(null, "Error al Guardar");
                
            }
        }
         
       
    } 
}
