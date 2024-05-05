/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package appempleadoovertime;

import java.util.*;

/**
 *
 * @author Jose
 */
public class AppEmpleadoOvertime {

    private Scanner teclado;
    private String nombre;
    private String apellido;
    private String idEmpleado;
    private int hrTrabajadas;

    //Ingreso de datos
    public void inicializar() {
        teclado = new Scanner(System.in);
        System.out.print("Nombre del empleado: ");
        nombre = teclado.next();
        System.out.print("IApellido del empleado: ");
        apellido = teclado.next();
        System.out.println("Id del empleado");
        idEmpleado = teclado.next();
        System.out.println("¿Cuantas horas trabajo este empleado?");
        hrTrabajadas = teclado.nextInt();
    }

    // Mostrar daot sdel empleado
    public void imprimir() {
        System.out.println("\t--- Datos del empleado ---");
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Id. empleado: " + idEmpleado);
        System.out.println("Horas trabajadas: " + hrTrabajadas);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }

}
