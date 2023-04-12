
package desicion_logica.ejercicios_propuestos.c5ep41;

import java.util.ArrayList;
import java.util.List;

public class metodos {
    public static int mayor(String numeros) {
    String[] arregloNumeros = numeros.split(",");
    int mayor = Integer.parseInt(arregloNumeros[0]);
    for (int i = 1; i < arregloNumeros.length; i++) {
        int numero = Integer.parseInt(arregloNumeros[i]);
        if (numero > mayor) {
            mayor = numero;
        }
    }
    return mayor;
}
  
}
