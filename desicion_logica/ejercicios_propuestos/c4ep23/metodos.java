
package desicion_logica.ejercicios_propuestos.c4ep23;


public class metodos {
     public static String resultado(double a,double b,double c){
       double discriminante = b * b - 4 * a * c;

        // Es por si tiene solucion en los reales
        if (discriminante < 0) {
            String resultado="La ecuación no tiene solución real";
            return resultado;
        } else {
            double x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminante)) / (2 * a);
            
            // Mostrar las soluciones
            String resultado="Las soluciones de la ecuación son: x1 = " + x1 + " y x2 = " + x2;
            return resultado;
        }
    }
}
