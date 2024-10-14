/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prácticaeileen11;
import java.util.Scanner;
/**
 *
 * @author eilee
 */
public class Main {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Empleado empleado = new Empleado("Rosa", "Acosta", "Calle estatal 5", "809-581-7396", "Femenino", "Rosaacosta@gmail.com", "Analista", 3);
        Cliente cliente = new Cliente("Juan", "García", "Av.Juan Pablo Duarte", "849-501-7096", "Masculino", "JuanFgarcía@gmail.com", "Regular");

        
        int opcion = 0;
      
            System.out.println("-----------------------------------------------");
            System.out.println("Seleccione una opción:");
            System.out.println("1. Solicitar permiso (Empleado)");
            System.out.println("2. Reportar horas extra (Empleado)");
            System.out.println("3. Contactar representante (Cliente)");
            System.out.println("4. Solicitar información (Cliente)");
            System.out.println("5. Salir");
            System.out.println("------------------------------------------------");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println(empleado.SolicitudPermiso());
                    break;
                case 2:
                    System.out.println(empleado.ReporteHorasExtra());
                    break;
                case 3:
                    System.out.println(cliente.ContactarRepresentante());
                    break;
                case 4:
                    System.out.println(cliente.SolicitarInformacion());
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }
       }