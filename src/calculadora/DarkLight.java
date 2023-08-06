
package calculadora;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class DarkLight {
    
    private boolean modoClaro;
    //private String img1;
    //private String img2;
    //private String color;
    //private String colorTexto;
    
    public void cambiarColorFrame(JFrame jframe, String color) {  
        jframe.getContentPane().setBackground(Color.decode(color));
    }  
    
    public void cambiarColorBtn(JButton[] btns, String img1, String img2, String foreColor) {
        for(JButton btn : btns) {   
            btn.setIcon(new ImageIcon(getClass().getResource(img1)));
            btn.setPressedIcon(new ImageIcon(getClass().getResource(img1)));
            btn.setRolloverIcon(new ImageIcon(getClass().getResource(img2)));
            btn.setForeground(Color.decode(foreColor));
        }
    }
    public boolean isModoClaro() {
        return modoClaro;
    }
    public void setModoClaro(boolean modoClaro) {
        this.modoClaro = modoClaro;
    }
}
