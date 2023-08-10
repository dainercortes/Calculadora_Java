package calculadora;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import org.w3c.dom.css.RGBColor;
import FiveCodMover.FiveCodMoverJFrame;
import javax.swing.JFrame;

/**
 * Interfaz grafica del programa
 * 
 * @version 1.0
 * @author Dainer Cortes
 */
public class InterfazGrafica extends javax.swing.JFrame {
  
    //Instancia de objetos
    Calculadora cl = new Calculadora();
    Operaciones op = new Operaciones();
    DarkLight dl = new DarkLight();
    
    
    /**
     * Metodo constructor
     * Inicializa el color del JFrame en oscuro y lo centra en la pantalla
     */
    public InterfazGrafica() {
        initComponents();
        
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(Color.decode("#171717"));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlbl_texto = new javax.swing.JLabel();
        jbtn_multi = new javax.swing.JButton();
        jbtn_eleminar = new javax.swing.JButton();
        jbtn_borrar = new javax.swing.JButton();
        jbtn_resta = new javax.swing.JButton();
        jbtn_9 = new javax.swing.JButton();
        jbtn_7 = new javax.swing.JButton();
        jbtn_8 = new javax.swing.JButton();
        jbtn_suma = new javax.swing.JButton();
        jbtn_5 = new javax.swing.JButton();
        jbtn_6 = new javax.swing.JButton();
        jbtn_4 = new javax.swing.JButton();
        jbtn_1 = new javax.swing.JButton();
        jbtn_3 = new javax.swing.JButton();
        jbtn_2 = new javax.swing.JButton();
        jbtn_0 = new javax.swing.JButton();
        jbtn_igual = new javax.swing.JButton();
        jbtn_porcentaje = new javax.swing.JButton();
        jbtn_division = new javax.swing.JButton();
        jbtn_punto = new javax.swing.JButton();
        jlbl_acumulado = new javax.swing.JLabel();
        jbtn_cerrar = new javax.swing.JLabel();
        jlbl_modo = new javax.swing.JLabel();
        jbtn_minimizar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 51, 51));
        setMaximumSize(new java.awt.Dimension(330, 550));
        setMinimumSize(new java.awt.Dimension(330, 550));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(330, 550));
        setResizable(false);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlbl_texto.setBackground(new java.awt.Color(255, 255, 255));
        jlbl_texto.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jlbl_texto.setForeground(new java.awt.Color(135, 206, 250));
        jlbl_texto.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlbl_texto.setText("0");
        getContentPane().add(jlbl_texto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 290, 70));

        jbtn_multi.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jbtn_multi.setForeground(new java.awt.Color(135, 206, 250));
        jbtn_multi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn_black2.png"))); // NOI18N
        jbtn_multi.setText("X");
        jbtn_multi.setBorderPainted(false);
        jbtn_multi.setContentAreaFilled(false);
        jbtn_multi.setDefaultCapable(false);
        jbtn_multi.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtn_multi.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn_black2.png"))); // NOI18N
        jbtn_multi.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn_black2_pressed.png"))); // NOI18N
        jbtn_multi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_multiActionPerformed(evt);
            }
        });
        getContentPane().add(jbtn_multi, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 260, 50, 50));

        jbtn_eleminar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jbtn_eleminar.setForeground(new java.awt.Color(135, 206, 250));
        jbtn_eleminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn_black2.png"))); // NOI18N
        jbtn_eleminar.setText("C");
        jbtn_eleminar.setBorderPainted(false);
        jbtn_eleminar.setContentAreaFilled(false);
        jbtn_eleminar.setDefaultCapable(false);
        jbtn_eleminar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtn_eleminar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn_black2.png"))); // NOI18N
        jbtn_eleminar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn_black2_pressed.png"))); // NOI18N
        jbtn_eleminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_eleminarActionPerformed(evt);
            }
        });
        getContentPane().add(jbtn_eleminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, 50, 50));

        jbtn_borrar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jbtn_borrar.setForeground(new java.awt.Color(135, 206, 250));
        jbtn_borrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn_black2.png"))); // NOI18N
        jbtn_borrar.setText("AC");
        jbtn_borrar.setBorder(null);
        jbtn_borrar.setBorderPainted(false);
        jbtn_borrar.setContentAreaFilled(false);
        jbtn_borrar.setDefaultCapable(false);
        jbtn_borrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtn_borrar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn_black2.png"))); // NOI18N
        jbtn_borrar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn_black2_pressed.png"))); // NOI18N
        jbtn_borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_borrarActionPerformed(evt);
            }
        });
        getContentPane().add(jbtn_borrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 50, 50));

        jbtn_resta.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jbtn_resta.setForeground(new java.awt.Color(135, 206, 250));
        jbtn_resta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn_black2.png"))); // NOI18N
        jbtn_resta.setText("-");
        jbtn_resta.setBorderPainted(false);
        jbtn_resta.setContentAreaFilled(false);
        jbtn_resta.setDefaultCapable(false);
        jbtn_resta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtn_resta.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn_black2.png"))); // NOI18N
        jbtn_resta.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn_black2_pressed.png"))); // NOI18N
        jbtn_resta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_restaActionPerformed(evt);
            }
        });
        getContentPane().add(jbtn_resta, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 330, 50, 50));

        jbtn_9.setBackground(new java.awt.Color(0, 0, 0));
        jbtn_9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jbtn_9.setForeground(new java.awt.Color(255, 255, 255));
        jbtn_9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn_black.png"))); // NOI18N
        jbtn_9.setText("9");
        jbtn_9.setBorderPainted(false);
        jbtn_9.setContentAreaFilled(false);
        jbtn_9.setDefaultCapable(false);
        jbtn_9.setFocusPainted(false);
        jbtn_9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtn_9.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn_black.png"))); // NOI18N
        jbtn_9.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn_black_pressed.png"))); // NOI18N
        jbtn_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_9ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtn_9, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, 50, 50));

        jbtn_7.setBackground(new java.awt.Color(0, 0, 0));
        jbtn_7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jbtn_7.setForeground(new java.awt.Color(255, 255, 255));
        jbtn_7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn_black.png"))); // NOI18N
        jbtn_7.setText("7");
        jbtn_7.setBorderPainted(false);
        jbtn_7.setContentAreaFilled(false);
        jbtn_7.setDefaultCapable(false);
        jbtn_7.setFocusPainted(false);
        jbtn_7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtn_7.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn_black.png"))); // NOI18N
        jbtn_7.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn_black_pressed.png"))); // NOI18N
        jbtn_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_7ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtn_7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 50, 50));

        jbtn_8.setBackground(new java.awt.Color(0, 0, 0));
        jbtn_8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jbtn_8.setForeground(new java.awt.Color(255, 255, 255));
        jbtn_8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn_black.png"))); // NOI18N
        jbtn_8.setText("8");
        jbtn_8.setBorderPainted(false);
        jbtn_8.setContentAreaFilled(false);
        jbtn_8.setDefaultCapable(false);
        jbtn_8.setFocusPainted(false);
        jbtn_8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtn_8.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn_black.png"))); // NOI18N
        jbtn_8.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn_black_pressed.png"))); // NOI18N
        jbtn_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_8ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtn_8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, 50, 50));

        jbtn_suma.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jbtn_suma.setForeground(new java.awt.Color(135, 206, 250));
        jbtn_suma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn_black2.png"))); // NOI18N
        jbtn_suma.setText("+");
        jbtn_suma.setBorderPainted(false);
        jbtn_suma.setContentAreaFilled(false);
        jbtn_suma.setDefaultCapable(false);
        jbtn_suma.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtn_suma.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn_black2.png"))); // NOI18N
        jbtn_suma.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn_black2_pressed.png"))); // NOI18N
        jbtn_suma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_sumaActionPerformed(evt);
            }
        });
        getContentPane().add(jbtn_suma, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 400, 50, 50));

        jbtn_5.setBackground(new java.awt.Color(0, 0, 0));
        jbtn_5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jbtn_5.setForeground(new java.awt.Color(255, 255, 255));
        jbtn_5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn_black.png"))); // NOI18N
        jbtn_5.setText("5");
        jbtn_5.setBorderPainted(false);
        jbtn_5.setContentAreaFilled(false);
        jbtn_5.setDefaultCapable(false);
        jbtn_5.setFocusPainted(false);
        jbtn_5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtn_5.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn_black.png"))); // NOI18N
        jbtn_5.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn_black_pressed.png"))); // NOI18N
        jbtn_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_5ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtn_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 330, 50, 50));

        jbtn_6.setBackground(new java.awt.Color(0, 0, 0));
        jbtn_6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jbtn_6.setForeground(new java.awt.Color(255, 255, 255));
        jbtn_6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn_black.png"))); // NOI18N
        jbtn_6.setText("6");
        jbtn_6.setBorderPainted(false);
        jbtn_6.setContentAreaFilled(false);
        jbtn_6.setDefaultCapable(false);
        jbtn_6.setFocusPainted(false);
        jbtn_6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtn_6.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn_black.png"))); // NOI18N
        jbtn_6.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn_black_pressed.png"))); // NOI18N
        jbtn_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_6ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtn_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 330, 50, 50));

        jbtn_4.setBackground(new java.awt.Color(0, 0, 0));
        jbtn_4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jbtn_4.setForeground(new java.awt.Color(255, 255, 255));
        jbtn_4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn_black.png"))); // NOI18N
        jbtn_4.setText("4");
        jbtn_4.setBorderPainted(false);
        jbtn_4.setContentAreaFilled(false);
        jbtn_4.setDefaultCapable(false);
        jbtn_4.setFocusPainted(false);
        jbtn_4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtn_4.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn_black.png"))); // NOI18N
        jbtn_4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn_black_pressed.png"))); // NOI18N
        jbtn_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_4ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtn_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 50, 50));

        jbtn_1.setBackground(new java.awt.Color(0, 0, 0));
        jbtn_1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jbtn_1.setForeground(new java.awt.Color(255, 255, 255));
        jbtn_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn_black.png"))); // NOI18N
        jbtn_1.setText("1");
        jbtn_1.setBorderPainted(false);
        jbtn_1.setContentAreaFilled(false);
        jbtn_1.setDefaultCapable(false);
        jbtn_1.setFocusPainted(false);
        jbtn_1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtn_1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn_black.png"))); // NOI18N
        jbtn_1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn_black_pressed.png"))); // NOI18N
        jbtn_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_1ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtn_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 50, 50));

        jbtn_3.setBackground(new java.awt.Color(0, 0, 0));
        jbtn_3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jbtn_3.setForeground(new java.awt.Color(255, 255, 255));
        jbtn_3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn_black.png"))); // NOI18N
        jbtn_3.setText("3");
        jbtn_3.setBorderPainted(false);
        jbtn_3.setContentAreaFilled(false);
        jbtn_3.setDefaultCapable(false);
        jbtn_3.setFocusPainted(false);
        jbtn_3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtn_3.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn_black.png"))); // NOI18N
        jbtn_3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn_black_pressed.png"))); // NOI18N
        jbtn_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_3ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtn_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 400, 50, 50));

        jbtn_2.setBackground(new java.awt.Color(0, 0, 0));
        jbtn_2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jbtn_2.setForeground(new java.awt.Color(255, 255, 255));
        jbtn_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn_black.png"))); // NOI18N
        jbtn_2.setText("2");
        jbtn_2.setBorderPainted(false);
        jbtn_2.setContentAreaFilled(false);
        jbtn_2.setDefaultCapable(false);
        jbtn_2.setFocusPainted(false);
        jbtn_2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtn_2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn_black.png"))); // NOI18N
        jbtn_2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn_black_pressed.png"))); // NOI18N
        jbtn_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_2ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtn_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 400, 50, 50));

        jbtn_0.setBackground(new java.awt.Color(0, 0, 0));
        jbtn_0.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jbtn_0.setForeground(new java.awt.Color(255, 255, 255));
        jbtn_0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn_black.png"))); // NOI18N
        jbtn_0.setText("0");
        jbtn_0.setBorderPainted(false);
        jbtn_0.setContentAreaFilled(false);
        jbtn_0.setFocusPainted(false);
        jbtn_0.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtn_0.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn_black.png"))); // NOI18N
        jbtn_0.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn_black_pressed.png"))); // NOI18N
        jbtn_0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_0ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtn_0, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, 50, 50));

        jbtn_igual.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jbtn_igual.setForeground(new java.awt.Color(255, 255, 255));
        jbtn_igual.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn_blue_pressed.png"))); // NOI18N
        jbtn_igual.setText("=");
        jbtn_igual.setBorderPainted(false);
        jbtn_igual.setContentAreaFilled(false);
        jbtn_igual.setDefaultCapable(false);
        jbtn_igual.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtn_igual.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn_blue_pressed.png"))); // NOI18N
        jbtn_igual.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn_blue.png"))); // NOI18N
        jbtn_igual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_igualActionPerformed(evt);
            }
        });
        getContentPane().add(jbtn_igual, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 470, 50, 50));

        jbtn_porcentaje.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jbtn_porcentaje.setForeground(new java.awt.Color(135, 206, 250));
        jbtn_porcentaje.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn_black2.png"))); // NOI18N
        jbtn_porcentaje.setText("%");
        jbtn_porcentaje.setBorder(null);
        jbtn_porcentaje.setBorderPainted(false);
        jbtn_porcentaje.setContentAreaFilled(false);
        jbtn_porcentaje.setDefaultCapable(false);
        jbtn_porcentaje.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtn_porcentaje.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn_black2.png"))); // NOI18N
        jbtn_porcentaje.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn_black2_pressed.png"))); // NOI18N
        jbtn_porcentaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_porcentajeActionPerformed(evt);
            }
        });
        getContentPane().add(jbtn_porcentaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, 50, 50));

        jbtn_division.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jbtn_division.setForeground(new java.awt.Color(135, 206, 250));
        jbtn_division.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn_black2.png"))); // NOI18N
        jbtn_division.setText("/");
        jbtn_division.setBorder(null);
        jbtn_division.setBorderPainted(false);
        jbtn_division.setContentAreaFilled(false);
        jbtn_division.setDefaultCapable(false);
        jbtn_division.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtn_division.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn_black2.png"))); // NOI18N
        jbtn_division.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn_black2_pressed.png"))); // NOI18N
        jbtn_division.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_divisionActionPerformed(evt);
            }
        });
        getContentPane().add(jbtn_division, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 190, 50, 50));

        jbtn_punto.setBackground(new java.awt.Color(0, 0, 0));
        jbtn_punto.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jbtn_punto.setForeground(new java.awt.Color(255, 255, 255));
        jbtn_punto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn_black.png"))); // NOI18N
        jbtn_punto.setText(".");
        jbtn_punto.setBorderPainted(false);
        jbtn_punto.setContentAreaFilled(false);
        jbtn_punto.setDefaultCapable(false);
        jbtn_punto.setFocusPainted(false);
        jbtn_punto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtn_punto.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn_black.png"))); // NOI18N
        jbtn_punto.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn_black_pressed.png"))); // NOI18N
        jbtn_punto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_puntoActionPerformed(evt);
            }
        });
        getContentPane().add(jbtn_punto, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 470, 50, 50));

        jlbl_acumulado.setBackground(new java.awt.Color(255, 255, 255));
        jlbl_acumulado.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jlbl_acumulado.setForeground(new java.awt.Color(135, 206, 250));
        jlbl_acumulado.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        getContentPane().add(jlbl_acumulado, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 290, 30));

        jbtn_cerrar.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        jbtn_cerrar.setForeground(new java.awt.Color(255, 0, 0));
        jbtn_cerrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jbtn_cerrar.setText("•");
        jbtn_cerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtn_cerrarMouseClicked(evt);
            }
        });
        getContentPane().add(jbtn_cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 20, 20));

        jlbl_modo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jlbl_modo.setForeground(new java.awt.Color(135, 206, 250));
        jlbl_modo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlbl_modo.setText("Modo Claro");
        jlbl_modo.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jlbl_modo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlbl_modoMouseClicked(evt);
            }
        });
        getContentPane().add(jlbl_modo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 100, 20));

        jbtn_minimizar.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        jbtn_minimizar.setForeground(new java.awt.Color(255, 143, 0));
        jbtn_minimizar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jbtn_minimizar.setText("•");
        jbtn_minimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtn_minimizarMouseClicked(evt);
            }
        });
        getContentPane().add(jbtn_minimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 20, 20));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtn_multiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_multiActionPerformed
        cl.ejecutar('*', this.jlbl_texto, this.jlbl_acumulado);
    }//GEN-LAST:event_jbtn_multiActionPerformed

    /**
     * Elimina uno por uno los numeros escritos en la pantalla
     * 
     * @param evt 
     */
    private void jbtn_eleminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_eleminarActionPerformed
        try {
            String texto = jlbl_texto.getText().substring(0, jlbl_texto.getText().length()-1);
            jlbl_texto.setText(texto);
        } catch (Exception e) {
            e.getMessage();
        }   
    }//GEN-LAST:event_jbtn_eleminarActionPerformed

    /**
     * Limia todo el texto que este en la pantalla
     * @param evt 
     */
    private void jbtn_borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_borrarActionPerformed
        try {
            jlbl_texto.setText("");
            jlbl_acumulado.setText("");
            cl.reiniciar();
        } catch (Exception e) {
            e.getMessage();
        }
    }//GEN-LAST:event_jbtn_borrarActionPerformed

    private void jbtn_restaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_restaActionPerformed
        cl.ejecutar('-', this.jlbl_texto, this.jlbl_acumulado);
    }//GEN-LAST:event_jbtn_restaActionPerformed

    private void jbtn_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_9ActionPerformed
        cl.anadirNumero(jlbl_texto, 9);
    }//GEN-LAST:event_jbtn_9ActionPerformed

    private void jbtn_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_7ActionPerformed
        cl.anadirNumero(jlbl_texto, 7);
    }//GEN-LAST:event_jbtn_7ActionPerformed

    private void jbtn_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_8ActionPerformed
        cl.anadirNumero(jlbl_texto, 8);
    }//GEN-LAST:event_jbtn_8ActionPerformed

    private void jbtn_sumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_sumaActionPerformed
        cl.ejecutar('+', this.jlbl_texto, this.jlbl_acumulado);
    }//GEN-LAST:event_jbtn_sumaActionPerformed

    private void jbtn_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_5ActionPerformed
        cl.anadirNumero(jlbl_texto, 5);
    }//GEN-LAST:event_jbtn_5ActionPerformed

    private void jbtn_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_6ActionPerformed
        cl.anadirNumero(jlbl_texto, 6);
    }//GEN-LAST:event_jbtn_6ActionPerformed

    private void jbtn_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_4ActionPerformed
        cl.anadirNumero(jlbl_texto, 4);
    }//GEN-LAST:event_jbtn_4ActionPerformed

    private void jbtn_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_1ActionPerformed
        cl.anadirNumero(jlbl_texto, 1);
    }//GEN-LAST:event_jbtn_1ActionPerformed

    private void jbtn_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_3ActionPerformed
        cl.anadirNumero(jlbl_texto, 3);
    }//GEN-LAST:event_jbtn_3ActionPerformed

    private void jbtn_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_2ActionPerformed
        cl.anadirNumero(this.jlbl_texto, 2);
    }//GEN-LAST:event_jbtn_2ActionPerformed

    private void jbtn_0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_0ActionPerformed
        cl.anadirNumero(this.jlbl_texto, 0);
    }//GEN-LAST:event_jbtn_0ActionPerformed

    private void jbtn_igualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_igualActionPerformed
        cl.calcular(this.jlbl_texto);
        cl.mostrarCalculo(jlbl_texto, jlbl_acumulado);
    }//GEN-LAST:event_jbtn_igualActionPerformed

    private void jbtn_divisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_divisionActionPerformed
        cl.ejecutar('÷', this.jlbl_texto, this.jlbl_acumulado);
    }//GEN-LAST:event_jbtn_divisionActionPerformed

    private void jbtn_puntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_puntoActionPerformed
        if(jlbl_texto.getText().indexOf('.') == -1){
            jlbl_texto.setText(jlbl_texto.getText() + '.');
        }
    }//GEN-LAST:event_jbtn_puntoActionPerformed

    /**
     * Invoca la operación para calcular el porcentaje del número ingresado en pantalla
     * 
     * @param evt 
     */
    private void jbtn_porcentajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_porcentajeActionPerformed
        jlbl_texto.setText(cl.validarDecimales(cl.porcentaje(Double.parseDouble(this.jlbl_texto.getText()))));
    }//GEN-LAST:event_jbtn_porcentajeActionPerformed

    /**
     * Emplea la libreria FiveCod la cual permite mover el Jframe en la pantalla
     * 
     * @param evt 
     */
    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        FiveCodMoverJFrame.MousePressed(evt);
    }//GEN-LAST:event_formMousePressed

    /**
     * Emplea la libreria FiveCod la cual permite mover el Jframe en la pantalla
     * 
     * @param evt 
     */
    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        FiveCodMoverJFrame.MouseDraggedFrame(evt, this);
    }//GEN-LAST:event_formMouseDragged

    /**
     * 
     * Al hacer clic en el texto cambia entre modo claro y oscuro
     * 
     * @param evt 
     */
    private void jlbl_modoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbl_modoMouseClicked
          if(dl.getModoClaro() == false) {
              dl.setModoClaro(true);
              this.jlbl_modo.setText("Modo Oscuro");
              this.jlbl_modo.setForeground(Color.decode("#000000"));
              this.jlbl_texto.setForeground(Color.decode("#000000"));
              this.jlbl_acumulado.setForeground(Color.decode("#000000"));
              //---------            
              dl.cambiarColorFrame(this, "#FFFFFF");
              //Botones 1
              dl.cambiarColorBtn(this.Btns1(), "/img/btn_white.png", "/img/btn_white_pressed.png", "#000000");
              //Botones 2
              dl.cambiarColorBtn(this.Btns2(), "/img/btn_white_pressed.png", "/img/btn_white2_pressed.png", "#000000");
        } else {
              dl.setModoClaro(false);
              this.jlbl_modo.setText("Modo Claro");
              this.jlbl_modo.setForeground(Color.decode("#87CEFA"));
              this.jlbl_texto.setForeground(Color.decode("#87CEFA"));
              this.jlbl_acumulado.setForeground(Color.decode("#87CEFA"));
              //---------            
              dl.cambiarColorFrame(this, "#171717");
              //Botones 1
              dl.cambiarColorBtn(this.Btns1(), "/img/btn_black.png", "/img/btn_black_pressed.png", "#FFFFFF");    
              //Botones2
              dl.cambiarColorBtn(this.Btns2(), "/img/btn_black2.png", "/img/btn_black2_pressed.png", "#87CEFA");
          }
    }//GEN-LAST:event_jlbl_modoMouseClicked

    /**
     * Al hacer clic sobre el boton minimiza la ventana JFrame
     * 
     * @param evt 
     */
    private void jbtn_minimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtn_minimizarMouseClicked
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_jbtn_minimizarMouseClicked

    /**
     * Al hacer clic sobre el boton cierra la ventana JFrame
     * 
     * @param evt 
     */
    private void jbtn_cerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtn_cerrarMouseClicked
        this.dispose();
    }//GEN-LAST:event_jbtn_cerrarMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InterfazGrafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazGrafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazGrafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazGrafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazGrafica().setVisible(true);
            }
        });
    } 
    
    /**
     * Este metodo aloja en un array todos los botones comunes
     * 
     * @return 
     */
    private JButton[] Btns1() {
        JButton[] jb = {this.jbtn_0, 
                        this.jbtn_1,
                        this.jbtn_2,
                        this.jbtn_3,
                        this.jbtn_4,
                        this.jbtn_5,
                        this.jbtn_6,
                        this.jbtn_7,
                        this.jbtn_8,
                        this.jbtn_9,
                        this.jbtn_punto};     
        return jb;
    } 
    
    /**
     * Este metodo aloja en un arreglo todos los botones especiales
     * 
     * @return 
     */
    private JButton[] Btns2() {
        JButton[] jb = {this.jbtn_borrar, 
                        this.jbtn_division,
                        this.jbtn_eleminar,
                        this.jbtn_igual,
                        this.jbtn_multi,
                        this.jbtn_porcentaje,
                        this.jbtn_resta,
                        this.jbtn_suma}; 
        return jb;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbtn_0;
    private javax.swing.JButton jbtn_1;
    private javax.swing.JButton jbtn_2;
    private javax.swing.JButton jbtn_3;
    private javax.swing.JButton jbtn_4;
    private javax.swing.JButton jbtn_5;
    private javax.swing.JButton jbtn_6;
    private javax.swing.JButton jbtn_7;
    private javax.swing.JButton jbtn_8;
    private javax.swing.JButton jbtn_9;
    private javax.swing.JButton jbtn_borrar;
    private javax.swing.JLabel jbtn_cerrar;
    private javax.swing.JButton jbtn_division;
    private javax.swing.JButton jbtn_eleminar;
    private javax.swing.JButton jbtn_igual;
    private javax.swing.JLabel jbtn_minimizar;
    private javax.swing.JButton jbtn_multi;
    private javax.swing.JButton jbtn_porcentaje;
    private javax.swing.JButton jbtn_punto;
    private javax.swing.JButton jbtn_resta;
    private javax.swing.JButton jbtn_suma;
    private javax.swing.JLabel jlbl_acumulado;
    private javax.swing.JLabel jlbl_modo;
    private javax.swing.JLabel jlbl_texto;
    // End of variables declaration//GEN-END:variables
}
