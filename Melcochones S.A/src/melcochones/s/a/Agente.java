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
public class Agente {

    //Definimos las variables del agente
    public String nombre;
    public int numeroCedula;
    public int codigo;
    public String sucursal;
    private String vehiculo;

    //Definimos constructor vacío
    public Agente() {
    }

    //Definimos constructor lleno
    public Agente(String nombre, int numeroCedula, int codigo, String sucursal, int vehiculo) {
        this.nombre = nombre;
        this.numeroCedula = numeroCedula;
        this.codigo = codigo;
        this.sucursal = sucursal;

    }

    public Agente(String vehiculo) {
        this.vehiculo = vehiculo;
    }

    //Definimos getters and setters
    public String getNombre() {
        JOptionPane.showInputDialog("Digite su nombre; ");
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroCedula() {
        JOptionPane.showInputDialog("Digite su número de cedula: ");
        return numeroCedula;
    }

    public void setNumeroCedula(int numeroCedula) {
        this.numeroCedula = numeroCedula;
    }

    public int getCodigo() {
        JOptionPane.showInputDialog("Digite su código: ");
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getSucursal() {
        JOptionPane.showInputDialog("Digite su sucursal: ");
        return sucursal;
    }

    public void setSucursal(String sucursal) {
        this.sucursal = sucursal;
    }

    public String getVehiculo() {
        JOptionPane.showInputDialog("Tiene vehículo si/no: ");
        return vehiculo;
    }

    public void setVehiculo(String vehiculo) {
        this.vehiculo = vehiculo;
    }

    
}
