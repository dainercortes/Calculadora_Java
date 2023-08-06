package calculadora;

import java.text.DecimalFormat;
import java.util.Arrays;
import javax.swing.JLabel;

public class Calculadora extends Operaciones {
    private double num1 = 0.00;
    private double num2 = 0;
    private char signo = ' '; 
    private double acumulado = 0;
    private boolean limpiar = false;
    
    public void Reiniciar() {
       this.num1 = 0.00;
        this.num2 = 0;
        this.signo = ' ';
        this.acumulado = 0; 
        this.limpiar = false;
    }
    
    public String ValidarDecimales(double numero) {
        String str = Double.toString(numero);
        String[] splitted = str.split("\\.");
        
        try {
            if(splitted[1].equals("0") || numero == 0.00) {
                str = String.format("%.0f", numero);
            } else if(splitted[1].length() > 3) {
                str = String.format("%.4f", numero);
            } else {
                str = Double.toString(numero);
            }
        } catch (ArithmeticException e) {
            e.getMessage();
        }
        return str;
    }
    
    public void AñadirNumero(JLabel jlbl, double numero) {       
        try {
            if(jlbl.getText().startsWith("0") && 
               !jlbl.getText().startsWith("0.")) {
                jlbl.setText("");
                limpiar = false;
            } else if (this.limpiar == true) {
                jlbl.setText("");
                limpiar = false;
            }

            jlbl.setText(jlbl.getText() + this.ValidarDecimales(numero));
        } catch (ArithmeticException e) {
            e.getMessage();
            limpiar = false;
        }
 }
    public void Ejecutar(char signo, JLabel jlbl, JLabel jlblAcu) {
        try {
            this.signo = signo; 
        
                if(jlbl.getText() != "" && this.num1 != 0.00) {
                    this.Calcular(jlbl);
                    jlbl.setText(this.ValidarDecimales(this.acumulado));
                    jlblAcu.setText(this.ValidarDecimales(this.acumulado) + " " + this.signo);
                    this.num1 = this.acumulado; 
                    limpiar = true;

                } else {
                    this.num1 = Double.parseDouble(jlbl.getText());   
                    jlblAcu.setText(this.ValidarDecimales(this.num1) + " " + this.signo);
                    limpiar = true;
                }       
        } catch (ArithmeticException e) {
            e.getMessage();
        }      
    }
    
    public void Calcular(JLabel jlbl) {
        try {
            this.num2 = Double.parseDouble(jlbl.getText());
 
            switch (this.signo) {
                case '+':
                    this.acumulado = Suma(this.num1, this.num2);       
                    break;
                case '-':
                    this.acumulado = Resta(this.num1, this.num2);
                    break;
                case '*':
                    this.acumulado = Multiplicacion(this.num1, this.num2);
                    break;
                case '÷':
                    this.acumulado = Division(this.num1, this.num2);
                    break;
            }    
        } catch (ArithmeticException e) {
            e.getMessage();
        }      
    }
    public void MostrarCalculo(JLabel jlbl, JLabel jlblAcu) {
        try {
            jlbl.setText(this.ValidarDecimales(this.acumulado));
            jlblAcu.setText(this.ValidarDecimales(this.num1) + " " + this.signo + " " + this.ValidarDecimales(this.num2) + " = ");
            this.Reiniciar();  
            this.limpiar = true;       
        } catch (ArithmeticException e) {
            e.getMessage();
        }   
    }
    
}
