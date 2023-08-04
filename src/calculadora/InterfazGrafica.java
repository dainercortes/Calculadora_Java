package calculadora;

import java.awt.Color;
import org.w3c.dom.css.RGBColor;

public class InterfazGrafica extends javax.swing.JFrame {

    private Integer num1 = 0;
    private Integer num2 = 0;
    private String signo = ""; 
    private Integer acumulado = 0;
    
    Operaciones op = new Operaciones();

    public InterfazGrafica() {
        initComponents();
        
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(new Color(23, 23, 23));
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
        jbtn_division1 = new javax.swing.JButton();
        jbtn_division = new javax.swing.JButton();
        jbtn_10 = new javax.swing.JButton();
        jlbl_acumulado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 51, 51));
        setMaximumSize(new java.awt.Dimension(346, 530));
        setMinimumSize(new java.awt.Dimension(346, 530));
        setPreferredSize(new java.awt.Dimension(346, 530));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlbl_texto.setBackground(new java.awt.Color(255, 255, 255));
        jlbl_texto.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jlbl_texto.setForeground(new java.awt.Color(255, 255, 255));
        jlbl_texto.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlbl_texto.setText("0");
        getContentPane().add(jlbl_texto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 290, 60));

        jbtn_multi.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jbtn_multi.setForeground(new java.awt.Color(255, 255, 255));
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
        getContentPane().add(jbtn_multi, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 210, 50, 50));

        jbtn_eleminar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jbtn_eleminar.setForeground(new java.awt.Color(255, 255, 255));
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
        getContentPane().add(jbtn_eleminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 50, 50));

        jbtn_borrar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jbtn_borrar.setForeground(new java.awt.Color(255, 255, 255));
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
        getContentPane().add(jbtn_borrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 50, 50));

        jbtn_resta.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jbtn_resta.setForeground(new java.awt.Color(255, 255, 255));
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
        getContentPane().add(jbtn_resta, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 280, 50, 50));

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
        getContentPane().add(jbtn_9, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, 50, 50));

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
        getContentPane().add(jbtn_7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 50, 50));

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
        getContentPane().add(jbtn_8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, 50, 50));

        jbtn_suma.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jbtn_suma.setForeground(new java.awt.Color(255, 255, 255));
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
        getContentPane().add(jbtn_suma, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 350, 50, 50));

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
        getContentPane().add(jbtn_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 280, 50, 50));

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
        getContentPane().add(jbtn_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, 50, 50));

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
        getContentPane().add(jbtn_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 50, 50));

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
        getContentPane().add(jbtn_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 50, 50));

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
        getContentPane().add(jbtn_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 350, 50, 50));

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
        getContentPane().add(jbtn_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 350, 50, 50));

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
        getContentPane().add(jbtn_0, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, 50, 50));

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
        getContentPane().add(jbtn_igual, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 420, 50, 50));

        jbtn_division1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jbtn_division1.setForeground(new java.awt.Color(255, 255, 255));
        jbtn_division1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn_black2.png"))); // NOI18N
        jbtn_division1.setText("%");
        jbtn_division1.setBorder(null);
        jbtn_division1.setBorderPainted(false);
        jbtn_division1.setContentAreaFilled(false);
        jbtn_division1.setDefaultCapable(false);
        jbtn_division1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtn_division1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn_black2.png"))); // NOI18N
        jbtn_division1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn_black2_pressed.png"))); // NOI18N
        jbtn_division1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_division1ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtn_division1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 50, 50));

        jbtn_division.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jbtn_division.setForeground(new java.awt.Color(255, 255, 255));
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
        getContentPane().add(jbtn_division, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 140, 50, 50));

        jbtn_10.setBackground(new java.awt.Color(0, 0, 0));
        jbtn_10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jbtn_10.setForeground(new java.awt.Color(255, 255, 255));
        jbtn_10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn_black.png"))); // NOI18N
        jbtn_10.setText(".");
        jbtn_10.setBorderPainted(false);
        jbtn_10.setContentAreaFilled(false);
        jbtn_10.setDefaultCapable(false);
        jbtn_10.setFocusPainted(false);
        jbtn_10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtn_10.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn_black.png"))); // NOI18N
        jbtn_10.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn_black_pressed.png"))); // NOI18N
        jbtn_10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_10ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtn_10, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 420, 50, 50));

        jlbl_acumulado.setBackground(new java.awt.Color(255, 255, 255));
        jlbl_acumulado.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jlbl_acumulado.setForeground(new java.awt.Color(204, 204, 204));
        jlbl_acumulado.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        getContentPane().add(jlbl_acumulado, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 290, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtn_multiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_multiActionPerformed
        num1 = Integer.parseInt(jlbl_texto.getText());
        signo = "*";
        jlbl_texto.setText("");
    }//GEN-LAST:event_jbtn_multiActionPerformed

    private void jbtn_eleminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_eleminarActionPerformed
        String texto = jlbl_texto.getText().substring(0, jlbl_texto.getText().length()-1);
        jlbl_texto.setText(texto);
    }//GEN-LAST:event_jbtn_eleminarActionPerformed

    private void jbtn_borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_borrarActionPerformed
        jlbl_texto.setText("");
    }//GEN-LAST:event_jbtn_borrarActionPerformed

    private void jbtn_restaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_restaActionPerformed
        num1 = Integer.parseInt(jlbl_texto.getText());
        signo = "-";
        jlbl_texto.setText("");
    }//GEN-LAST:event_jbtn_restaActionPerformed

    private void jbtn_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_9ActionPerformed
        jlbl_texto.setText(jlbl_texto.getText() + "9");
    }//GEN-LAST:event_jbtn_9ActionPerformed

    private void jbtn_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_7ActionPerformed
        jlbl_texto.setText(jlbl_texto.getText() + "7");
    }//GEN-LAST:event_jbtn_7ActionPerformed

    private void jbtn_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_8ActionPerformed
        jlbl_texto.setText(jlbl_texto.getText() + "8");
    }//GEN-LAST:event_jbtn_8ActionPerformed

    private void jbtn_sumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_sumaActionPerformed
        
        
        if(jlbl_texto.getText() != "" && num1 != 0) {
            num2 = Integer.parseInt(jlbl_texto.getText());
            jlbl_texto.setText(Integer.toString(op.Suma(num1, num2)));
        }
        num1 = Integer.parseInt(jlbl_texto.getText());
        signo = "+";
        jlbl_texto.setText("");
        jlbl_acumulado.setText(Integer.toString(num1) + signo);
        
        
    }//GEN-LAST:event_jbtn_sumaActionPerformed

    private void jbtn_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_5ActionPerformed
        jlbl_texto.setText(jlbl_texto.getText() + "5");
    }//GEN-LAST:event_jbtn_5ActionPerformed

    private void jbtn_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_6ActionPerformed
        jlbl_texto.setText(jlbl_texto.getText() + "6");
    }//GEN-LAST:event_jbtn_6ActionPerformed

    private void jbtn_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_4ActionPerformed
        jlbl_texto.setText(jlbl_texto.getText() + "4");
    }//GEN-LAST:event_jbtn_4ActionPerformed

    private void jbtn_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_1ActionPerformed
        if(jlbl_texto.getText() == "0") {
            jlbl_texto.setText("");
        }
        
        jlbl_texto.setText(jlbl_texto.getText() + "1");
    }//GEN-LAST:event_jbtn_1ActionPerformed

    private void jbtn_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_3ActionPerformed
        jlbl_texto.setText(jlbl_texto.getText() + "3");
    }//GEN-LAST:event_jbtn_3ActionPerformed

    private void jbtn_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_2ActionPerformed
        jlbl_texto.setText(jlbl_texto.getText() + "2");
    }//GEN-LAST:event_jbtn_2ActionPerformed

    private void jbtn_0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_0ActionPerformed
        jlbl_texto.setText(jlbl_texto.getText() + "0");
    }//GEN-LAST:event_jbtn_0ActionPerformed

    private void jbtn_igualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_igualActionPerformed
        num2 = Integer.parseInt(jlbl_texto.getText());
        
        switch (signo) {
            case "+":
                acumulado = op.Suma(num1, num2);
                jlbl_texto.setText(Integer.toString(acumulado));
                jlbl_acumulado.setText((Integer.toString(num1) + " + " + Integer.toString(num2) + " = " + Integer.toString(acumulado)));
                
                break;
            case "-":
                jlbl_texto.setText(Integer.toString(num1 - num2));
                break;
            case "*":
                jlbl_texto.setText(Integer.toString(num1 * num2));
                break;
            case "/":
                jlbl_texto.setText(Integer.toString(num1 / num2));
                break;
            default:
                throw new AssertionError();
        }
    }//GEN-LAST:event_jbtn_igualActionPerformed

    private void jbtn_divisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_divisionActionPerformed
        num1 = Integer.parseInt(jlbl_texto.getText());
        signo = "/";
        jlbl_texto.setText("");
    }//GEN-LAST:event_jbtn_divisionActionPerformed

    private void jbtn_10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtn_10ActionPerformed

    private void jbtn_division1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_division1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtn_division1ActionPerformed

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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbtn_0;
    private javax.swing.JButton jbtn_1;
    private javax.swing.JButton jbtn_10;
    private javax.swing.JButton jbtn_2;
    private javax.swing.JButton jbtn_3;
    private javax.swing.JButton jbtn_4;
    private javax.swing.JButton jbtn_5;
    private javax.swing.JButton jbtn_6;
    private javax.swing.JButton jbtn_7;
    private javax.swing.JButton jbtn_8;
    private javax.swing.JButton jbtn_9;
    private javax.swing.JButton jbtn_borrar;
    private javax.swing.JButton jbtn_division;
    private javax.swing.JButton jbtn_division1;
    private javax.swing.JButton jbtn_eleminar;
    private javax.swing.JButton jbtn_igual;
    private javax.swing.JButton jbtn_multi;
    private javax.swing.JButton jbtn_resta;
    private javax.swing.JButton jbtn_suma;
    private javax.swing.JLabel jlbl_acumulado;
    private javax.swing.JLabel jlbl_texto;
    // End of variables declaration//GEN-END:variables
}
