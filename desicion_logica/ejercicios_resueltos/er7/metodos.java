
package desicion_logica.ejercicios_resueltos.er7;


public class metodos {
    public static String retornar(double a,double b){
        if (a > b) {
            String retorno=" es mayor que "; 
            return retorno;
        } else if (a < b) {
            String retorno=" es menor que ";
            return retorno;
        } else {
            String retorno=" es igual a ";
            return retorno;
        }
    }
}
