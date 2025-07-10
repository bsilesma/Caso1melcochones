/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package melcochones.s.a;

import javax.swing.JOptionPane;

/**
 *
 * @author brand
 */
public class MelcochonesSA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        //Mensaje de bienvenida
        JOptionPane.showMessageDialog(null, "Bienvenido al sistema de facturación de los alajuelense, favor ingrese los datos que se le solicitan");
        
        //Creamos la clase agente y obtenemos los datos
        Agente agente1 = new Agente();
        agente1.getNombre();
        agente1.getNumeroCedula();
        agente1.getCodigo();
        agente1.getSucursal();
        agente1.getVehiculo();
        
        
        //Creamos la clase factura y obtenemos los datos
        Factura factura1 = new Factura();
        factura1.getNombreCliente();
        factura1.getCedulaCliente();
        factura1.getCodigoFactura();
        factura1.getMontoFactura();
        factura1.getNumeroMes();
        factura1.getProductosElectricos();
        factura1.getProductosElectricos();
        factura1.getProductosConstrucción();
        
        //Imprimir datos en pantalla
        
        JOptionPane.showMessageDialog(null, "El agente: ");
        
        
        
        
                
                
                
    }    
     
}

