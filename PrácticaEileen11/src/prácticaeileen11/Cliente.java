/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prácticaeileen11;

/**
 *
 * @author eilee
 */
public class Cliente extends Persona {
    private String tipoCliente;

 
    public Cliente(String nombre, String apellido, String direccion, String telefono, String sexo, String correo, String tipoCliente) {
        super(nombre, apellido, direccion, telefono);
        this.tipoCliente = tipoCliente;
    }

  
    public String ContactarRepresentante() {
        return "Cliente " + getNombre() + " ha contactado a su representante.";
    }

 
    public String SolicitarInformacion() {
        return "Cliente " + getNombre() + " ha solicitado información.";
    }
}