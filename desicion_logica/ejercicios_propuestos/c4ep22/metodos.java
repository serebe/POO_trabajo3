/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package desicion_logica.ejercicios_propuestos.c4ep22;

public class metodos {
    public static String salario(double salarioPorHora,double horasTrabajadas,String nombre){
       double salarioMensual = salarioPorHora * horasTrabajadas;
        if (salarioMensual > 450000) {
            String retorno="El salario mensual de " + nombre + " es de: $" + salarioMensual;
            return retorno;
        } else {
            String retorno=nombre;
            return retorno;
        }
    }
}
