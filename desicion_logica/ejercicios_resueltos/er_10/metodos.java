/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package desicion_logica.ejercicios_resueltos.er_10;

public class metodos {
     public static double matricula(double patrimonio,double estrato){
        double pagoMatricula = 50000; // Valor base de la matrícula
        if (patrimonio > 2000000 & estrato > 3) {
            double incremento = patrimonio * 0.03;
            pagoMatricula += incremento;
        }
        return pagoMatricula;
    }
}
