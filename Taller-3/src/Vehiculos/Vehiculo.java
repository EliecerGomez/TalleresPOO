package Vehiculos;

import javax.swing.JOptionPane;

/**
 *
 * 
 */
public class Vehiculo {
    private String tipo;
    
    
    public Vehiculo(String tipo) {
        this.tipo = tipo;
    }
    
    public String getTipo() {
        return tipo;
    }
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public void mostraInfor() {
        JOptionPane.showMessageDialog(null, "Tipo de vehiculo: " + tipo);
    }
    
    
}

