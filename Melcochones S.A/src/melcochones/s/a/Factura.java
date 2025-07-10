/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package melcochones.s.a;

import javax.swing.JOptionPane;

/**
 *
 * @author brand
 */
public class Factura {
    
    //Definimos variables
    private String nombreCliente;
    private int cedulaCliente;
    private int codigoFactura;
    private int montoFactura;
    public int numeroMes;
    public String productosElectricos;
    public String productosAutomotrices;
    public String productosConstrucción;
;

    //Definimos constructor vacío
    public Factura() {
    }
    
    //Definimos constructor lleno
    public Factura(String nombreCliente, int cedulaCliente, int codigoFactura, int montoFactura, int numeroMes, String productosElectricos, String productosAutomotrices, String productosConstrucción) {
        this.nombreCliente = nombreCliente;
        this.cedulaCliente = cedulaCliente;
        this.codigoFactura = codigoFactura;
        this.montoFactura = montoFactura;
        this.numeroMes = numeroMes;
        this.productosElectricos = productosElectricos;
        this.productosAutomotrices = productosAutomotrices;
        this.productosConstrucción = productosConstrucción;
    }
    //Definimos getters and setters
    public String getNombreCliente() {
        JOptionPane.showInputDialog("Digite el nombre del cliente; ");
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public int getCedulaCliente() {
        JOptionPane.showInputDialog("Digite la cédula del cliente: ");
        return cedulaCliente;
    }

    public void setCedulaCliente(int cedulaCliente) {
        this.cedulaCliente = cedulaCliente;
    }

    public int getCodigoFactura() {
        JOptionPane.showInputDialog("Digite el número de factura: ");
        return codigoFactura;
    }

    public void setCodigoFactura(int codigoFactura) {
        this.codigoFactura = codigoFactura;
    }

    public int getMontoFactura() {
        JOptionPane.showInputDialog("Digite el monto de la factura; ");
        return montoFactura;
    }

    public void setMontoFactura(int montoFactura) {
        this.montoFactura = montoFactura; 
 }

    public int getNumeroMes() { //Seteamos los numero del mes con un switch
        JOptionPane.showInputDialog("Digite el numero del mes: ");
        switch (numeroMes){
            case 1:
                JOptionPane.showMessageDialog(null, "Mes de enero");
            case 2:
                JOptionPane.showMessageDialog(null, "Mes de febrero");
            case 3:
                JOptionPane.showMessageDialog(null,"Mes de marzo");
            case 4:
                JOptionPane.showMessageDialog(null, "Mes de Abril");
            case 5: 
                JOptionPane.showMessageDialog(null, "Mes de mayo");
            case 6:
                JOptionPane.showMessageDialog(null, "Mes de Junio");
            case 7:
                JOptionPane.showMessageDialog(null, "Mes de Julio");
            case 8:
                JOptionPane.showMessageDialog(null,"Mes de Agosto");
            case 9:
                JOptionPane.showMessageDialog(null, "Mes de Setiembre");
            case 10:
                JOptionPane.showMessageDialog(null, "Mes de Octubre");
            case 11:
                JOptionPane.showMessageDialog(null, "Mes de noviembre");
            case 12:
                JOptionPane.showMessageDialog(null,"Mes de Diciemrbe");
            break;
    }
        return numeroMes;
           
      
    }

    public void setNumeroMes(int numeroMes) {
        this.numeroMes = numeroMes;
    }

    public String getProductosElectricos() {
        JOptionPane.showInputDialog("Cúantos productos electricos contiene: ");
        return productosElectricos;
    }

    public void setProductosElectricos(String productosElectricos) {
        this.productosElectricos = productosElectricos;
    }

    public String getProductosAutomotrices() {
        JOptionPane.showInputDialog("Cuántos productos automotrices contiene: ");
        return productosAutomotrices;
    }

    public void setProductosAutomotrices(String productosAutomotrices) {
        this.productosAutomotrices = productosAutomotrices;
    }

    public String getProductosConstrucción() {
        JOptionPane.showInputDialog("Cuántos productos de construccion contiene: ");
        return productosConstrucción;
    }

    public void setProductosConstrucción(String productosConstrucción) {
        this.productosConstrucción = productosConstrucción;
    }

  
    
    
}