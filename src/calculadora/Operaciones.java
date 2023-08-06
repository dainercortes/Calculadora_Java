package calculadora;

public class Operaciones {
    
    public double Suma(double num1, double num2) {
        return num1 + num2;
    }
    
    public double Resta(double num1, double num2) {
        return num1 - num2;
    }
    
    public double Multiplicacion(double num1, double num2) {
        return num1 * num2;
    }
    
    public double Division(double num1, double num2) {
        if(num1 == 0 || num2 == 0) {
            return 0;
        } else {
            return num1 / num2;
        }
   
    }
    
    public double Porcentaje(double num) {
        return num / 100;
    }
}
