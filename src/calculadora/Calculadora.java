package calculadora;

import java.text.DecimalFormat;
import java.util.Arrays;
import javax.swing.JLabel;

public class Calculadora extends Operaciones {
    private double num1 = 0;;
    private double num2 = 0;
    private char signo = ' '; 
    private double acumulado = 0;
    private boolean limpiar = false;
    
    public void Reiniciar() {
       this.num1 = 0;
        this.num2 = 0;
        this.signo = ' ';
        this.acumulado = 0; 
        this.limpiar = false;
    }
    
    public String ValidarDecimales(double numero) {
        String str = Double.toString(numero);
        String[] splitted = str.split("\\.");
        
        try {
            if(splitted[1].equals("0")) {
                return String.format("%.0f", numero);
            } else if(splitted[1].length() > 3) {
                return String.format("%.4f", numero);
            } else {
                return Double.toString(numero);
            }
        } catch (Exception e) {
            System.out.print(e.getMessage());
            return "Error";
        }
    }
    
    public void AñadirNumero(JLabel jlbl, double numero) {       
        try {
            if(jlbl.getText().startsWith("0")) {
                jlbl.setText("");
            } else if (this.limpiar == true) {
                jlbl.setText("");
                limpiar = false;
            }

            jlbl.setText(jlbl.getText() + this.ValidarDecimales(numero));
        } catch (Exception e) {
            e.getMessage();
            limpiar = false;
        }
 }
    public void Ejecutar(char signo, JLabel jlbl, JLabel jlblAcu) {
        try {
            if(!jlbl.getText().equals("0")) {
                this.signo = signo; 
        
                if(jlbl.getText() != "" && this.num1 != 0) {
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
            }        
        } catch (Exception e) {
            e.getMessage();
        }      
    }
    
    public double Calcular(JLabel jlbl) {
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
                case '/':
                    this.acumulado = Division(this.num1, this.num2);
                    break;
            } 

            return this.acumulado;
        } catch (Exception e) {
            e.getMessage();
            return 0;
        }      
    }
    public void MostrarCalculo(JLabel jlbl, JLabel jlblAcu) {
        try {
            jlbl.setText(this.ValidarDecimales(this.acumulado));
            jlblAcu.setText(this.ValidarDecimales(this.num1) + " " + this.signo + " " + this.ValidarDecimales(this.num2) + " = ");
            this.Reiniciar();  
            this.limpiar = true;
        } catch (Exception e) {
            e.getMessage();
        }   
    }
    
}
