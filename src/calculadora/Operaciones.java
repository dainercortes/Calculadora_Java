package calculadora;

/**
 * La clase Operaciones contiene metodos como suma, resta multiplicacion, etc. 
 * Es el padre de la clase Calculadora
 * 
 * @version 1.0
 * @author Dainer Cortes
 */
public class Operaciones {
    
    /**
     * Suma dos numeros
     * 
     * @param num1
     * @param num2
     * @return 
     */
    public double suma(double num1, double num2) {
        return num1 + num2;
    }
    
    /**
     * Resta dos numeros
     * 
     * @param num1
     * @param num2
     * @return 
     */
    public double resta(double num1, double num2) {
        return num1 - num2;
    }
    
    /**
     * Multiplica dos numeros
     * 
     * @param num1
     * @param num2
     * @return 
     */
    public double multiplicacion(double num1, double num2) {
        return num1 * num2;
    }
    
    /**
     * Divide dos numeros
     * 
     * @param num1
     * @param num2
     * @return 
     */
    public double division(double num1, double num2) {
        if(num1 == 0 || num2 == 0) {
            return 0;
        } else {
            return num1 / num2;
        }  
    }
    
    /**
     * Calcula el porcentanje de un numero
     * Ejemplo: El porcentaje de 20 es 0.2
     * 
     * @param num
     * @return 
     */
    public double porcentaje(double num) {
        return num / 100;
    }
}
