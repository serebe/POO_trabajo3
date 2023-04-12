package desicion_secuencial.ep_18;


public class metodos {
    public static double salarioB(double horasTrabajadas,double valorHora){
        double salarioB;
        salarioB = horasTrabajadas * valorHora;
        return salarioB;
    }  
    public static double salarioN(double salarioB,double retencion){
        double salarioN = salarioB * (1 - retencion / 100);
        return salarioN;
    }    
}
