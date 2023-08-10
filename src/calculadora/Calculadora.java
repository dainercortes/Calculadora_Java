package calculadora;

import java.text.DecimalFormat;
import java.util.Arrays;
import javax.swing.JLabel;

/**
 * Calculadora va a heredar los metodos de la clase Operaciones.
 * Esta clase contiene metodos que se encargan de realizar todas las operaciones basicas de una calculadora.
 * 
 * @version 1.0
 * @author Dainer Cortes
 */
public class Calculadora extends Operaciones {
    
    // Atributos de la clase
    private double num1 = 0.00;
    private double num2 = 0;
    private char signo = ' '; 
    private double acumulado = 0;
    private boolean limpiar = false;
    
    /**
     * Este metodo publico se encarga de reiniciar por defecto todos 
     * los valores de los atributos de la clase
     */
    public void reiniciar() {
       this.num1 = 0.00;
        this.num2 = 0;
        this.signo = ' ';
        this.acumulado = 0; 
        this.limpiar = false;
    }
    
    /**
     * Este metodo recibe un numero para luego validar la cantidad de decimales que contiene y
     * solo retornara los decimales necesarios.
     * Ejemplo si el número es 2.0 retornara 2
     *         si el número es 12.2345675 retornara 12.2346
     * 
     * @param numero
     * @return 
     */
    public String validarDecimales(double numero) {
        String str = Double.toString(numero);
        // Obtiene todos los numeros despues del punto
        String[] splitted = str.split("\\.");
        
        try {    
            if(splitted[1].equals("0") || numero == 0.00) { // Si tiene cero decimales o tiene dos decimales cero
                // No devuelve ningun decimal
                str = String.format("%.0f", numero);       
            } else if(splitted[1].length() > 3) { // Si el numero tiene mas de tres decimales
                // Devuelve cuatro decimales
                str = String.format("%.4f", numero);
            } else {
                // Devulve el numero talcual por defecto
                str = Double.toString(numero);
            }
        } catch (ArithmeticException e) {
            e.getMessage();
        } finally {
            // Retorna el numero obtenido
            return str;
        }    
    }
    
    /**
     * Este metodo se encarga de anadir el numero seleccionado a la pantalla de la calculadora,
     * Si ha ejecutado alguna operacion como suma el resultado en pantalla se borra y se empieza
     * a mostrar los nuevos números que este seleccionando
     * 
     * @param jlbl
     * @param numero 
     */
    public void anadirNumero(JLabel jlbl, double numero) {       
        try {
            if(jlbl.getText().startsWith("0") && 
               !jlbl.getText().startsWith("0.") ||          
                this.limpiar == true) {
                
                //limpia la pantalla
                jlbl.setText("");
                limpiar = false;
            }
            
            // Anade el numero a la pantalla
            jlbl.setText(jlbl.getText() + this.validarDecimales(numero));
            
        } catch (ArithmeticException e) {
            e.getMessage();       
            limpiar = true;
        }
    }
    
    /**
     * Este metodo realiza el calculo de la operacion matematica
     * 
     * @param jlbl 
     */
    public void calcular(JLabel jlbl) {
        try {
            this.num2 = Double.parseDouble(jlbl.getText());
 
            switch (this.signo) {
                case '+':
                    this.acumulado = suma(this.num1, this.num2);       
                    break;
                case '-':
                    this.acumulado = resta(this.num1, this.num2);
                    break;
                case '*':
                    this.acumulado = multiplicacion(this.num1, this.num2);
                    break;
                case '÷':
                    this.acumulado = division(this.num1, this.num2);
                    break;
            }    
        } catch (ArithmeticException e) {
            e.getMessage();
        }      
    }
    
    /**
     * Este metodo tiene dos opciones  
     * - Invoca el metodo Calcular y muestra en pantalla 
     * los valores obtenidos de la operacion matematica
     * solo cuando se presiona varias vares un signo 
     * como el de la suma o resta.
     * 
     * - Solo muestra el numero en pantalla y el signo 
     * escogido hasta el momento.
     * 
     * @param signo
     * @param jlbl
     * @param jlblAcu 
     */
    public void ejecutar(char signo, JLabel jlbl, JLabel jlblAcu) {
        try {
            this.signo = signo; 
        
                if(jlbl.getText() != "" && this.num1 != 0.00) {
                    this.calcular(jlbl);
                    jlbl.setText(this.validarDecimales(this.acumulado));
                    jlblAcu.setText(this.validarDecimales(this.acumulado) + " " + this.signo);
                    this.num1 = this.acumulado; 
                    limpiar = true;

                } else {
                    this.num1 = Double.parseDouble(jlbl.getText());   
                    jlblAcu.setText(this.validarDecimales(this.num1) + " " + this.signo);
                    limpiar = true;
                }       
        } catch (ArithmeticException e) {
            e.getMessage();
        }      
    }
      
    /**
     * Muestra los resultados en pantalla solo cuando se presiona 
     * el boton igual '='     
     * 
     * @param jlbl
     * @param jlblAcu 
     */
    public void mostrarCalculo(JLabel jlbl, JLabel jlblAcu) {
        try {
            jlbl.setText(this.validarDecimales(this.acumulado));
            jlblAcu.setText(this.validarDecimales(this.num1) + " " + this.signo + " " + this.validarDecimales(this.num2) + " = ");
            this.reiniciar();  
            this.limpiar = true;       
        } catch (ArithmeticException e) {
            e.getMessage();
        }   
    }
    
}
