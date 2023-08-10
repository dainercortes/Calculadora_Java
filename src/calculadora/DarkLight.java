package calculadora;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * Esta clase contiene metodos los cuales permiten 
 * cambiar la interfaz entre modo claro y oscuro
 * 
 * @version 1.0
 * @author Dainer Cortes
 */
public class DarkLight {
    
    // Atributos de la clase
    private boolean modoClaro;

    /**
     * Constructor de la clase inicializa la variable modoClaro en false
     */
    public DarkLight() {
        this.modoClaro = false;
    }
    
   
    /**
     * Metodo get de la variable modoClaro
     * 
     * @return 
     */
    public boolean getModoClaro() {
        return modoClaro;
    }
    
    /**
     * Metodo set de la variable modoClaro
     * 
     * @param modoClaro 
     */
    public void setModoClaro(boolean modoClaro) {
        this.modoClaro = modoClaro;
    }
    
    /**
     * Este metodo cambia el color de la ventana JFrame
     * 
     * @param jframe
     * @param color 
     */
    public void cambiarColorFrame(JFrame jframe, String color) {  
        jframe.getContentPane().setBackground(Color.decode(color));
    }  
    
    /**
     * Este metodo cambia el color de fondo fuente e iconos de los botonos 
     * 
     * @param btns
     * @param img1
     * @param img2
     * @param foreColor 
     */
    public void cambiarColorBtn(JButton[] btns, String img1, String img2, String foreColor) {
        for(JButton btn : btns) {   
            btn.setIcon(new ImageIcon(getClass().getResource(img1)));
            btn.setPressedIcon(new ImageIcon(getClass().getResource(img1)));
            btn.setRolloverIcon(new ImageIcon(getClass().getResource(img2)));
            btn.setForeground(Color.decode(foreColor));
        }
    }
}
