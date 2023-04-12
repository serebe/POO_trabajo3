/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package desicion_logica.ejercicios_propuestos.c5ep40;

import java.util.ArrayList;
import java.util.List;

public class metodos {
    private List<Integer> numeros;
    public metodos(String lista) {
        numeros = new ArrayList<Integer>();
        String[] numerosdatos = lista.split(",");
        for (String numero : numerosdatos) {
            numeros.add(Integer.parseInt(numero.trim()));
        }
    }

    public List<Double> raices() {
        List<Double> raices = new ArrayList<Double>();
        for (Integer numero : numeros) {
            if (numero > 0) {
                double raizCuadrada = Math.sqrt(numero);
                raices.add(raizCuadrada);
            }
        }
        return raices;
    }

    public List<Double> cuadrados() {
        List<Double> cuadrados = new ArrayList<Double>();
        for (Integer numero : numeros) {
            double cuadrado = Math.pow(numero, 2);
            cuadrados.add(cuadrado);
        }
        return cuadrados;
    }

    public List<Double> cubos() {
        List<Double> cubos = new ArrayList<Double>();
        for (Integer numero : numeros) {
            double cubo = Math.pow(numero, 3);
            cubos.add(cubo);
        }
        return cubos;
    }
}
