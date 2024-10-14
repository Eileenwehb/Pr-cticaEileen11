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
public class Empleado extends Persona {
    private String Puesto;
    private int HorasExtra;

   
    public Empleado(String nombre, String apellido, String direccion, String telefono, String sexo, String correo, String puesto, int HorasExtra) {
        super(nombre, apellido, direccion, telefono);
        this.Puesto = Puesto;
        this.HorasExtra = HorasExtra;
    }

 
    public String SolicitudPermiso() {
        return "Permiso solicitado por " + getNombre();
    }

   
    public String ReporteHorasExtra() {
        return "Horas extra trabajadas por " + getNombre() + ": " + HorasExtra;
    }
}