/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hn.uth.pa1.parcial2.tarea2.app;

import hn.uth.pa1.parcial2.tarea2.app.objetos.Vehiculo;
import hn.uth.pa1.parcial2.tarea2.app.repositorios.VehiculoRepositorio;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Miriam
 */
public class FrmCatalogoVehiculos1 extends javax.swing.JFrame {

    /**
     * Creates new form FrmCatalogoVehiculos
     */
    public static VehiculoRepositorio repo = new VehiculoRepositorio();
    public static List<Vehiculo> vehiculos;
    public static int contador;
    
    public FrmCatalogoVehiculos1() {
        try {
            this.vehiculos = repo.buscarTodo();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error al bucar todos");
        }
        initComponents();
        
        panImagenVehiculo1.setVisible(false);
        panImagenVehiculo1.setVisible(true);
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lblMarca = new javax.swing.JLabel();
        lblModelo = new javax.swing.JLabel();
        lblPrecio = new javax.swing.JLabel();
        lblAnio1 = new javax.swing.JLabel();
        lblMotor1 = new javax.swing.JLabel();
        lblPlaca1 = new javax.swing.JLabel();
        lblNombre1 = new javax.swing.JLabel();
        lblAnio = new javax.swing.JLabel();
        lblMarca1 = new javax.swing.JLabel();
        lblMotor = new javax.swing.JLabel();
        lblModelo1 = new javax.swing.JLabel();
        lblPlaca = new javax.swing.JLabel();
        lblPrecio1 = new javax.swing.JLabel();
        btnVer = new javax.swing.JButton();
        lblNombre = new javax.swing.JLabel();
        panImagenVehiculo1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        lblMarca2 = new javax.swing.JLabel();
        lblModelo2 = new javax.swing.JLabel();
        lblPrecio2 = new javax.swing.JLabel();
        lblAnio2 = new javax.swing.JLabel();
        lblMotor2 = new javax.swing.JLabel();
        lblPlaca2 = new javax.swing.JLabel();
        lblNombre2 = new javax.swing.JLabel();
        lblAnio3 = new javax.swing.JLabel();
        lblMarca3 = new javax.swing.JLabel();
        lblMotor3 = new javax.swing.JLabel();
        lblModelo3 = new javax.swing.JLabel();
        lblPlaca3 = new javax.swing.JLabel();
        lblPrecio3 = new javax.swing.JLabel();
        btnVer1 = new javax.swing.JButton();
        lblNombre3 = new javax.swing.JLabel();
        panImagenVehiculo2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        lblMarca6 = new javax.swing.JLabel();
        lblModelo6 = new javax.swing.JLabel();
        lblPrecio6 = new javax.swing.JLabel();
        lblAnio6 = new javax.swing.JLabel();
        lblMotor6 = new javax.swing.JLabel();
        lblPlaca6 = new javax.swing.JLabel();
        lblNombre6 = new javax.swing.JLabel();
        lblAnio7 = new javax.swing.JLabel();
        lblMarca7 = new javax.swing.JLabel();
        lblMotor7 = new javax.swing.JLabel();
        lblModelo7 = new javax.swing.JLabel();
        lblPlaca7 = new javax.swing.JLabel();
        lblPrecio7 = new javax.swing.JLabel();
        btnVer3 = new javax.swing.JButton();
        lblNombre7 = new javax.swing.JLabel();
        panImagenVehiculo3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        lblMarca.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblMarca.setText("Uwu");

        lblModelo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblModelo.setText("Uwu");

        lblPrecio.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblPrecio.setText("Uwu");

        lblAnio1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblAnio1.setText("Año: ");

        lblMotor1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblMotor1.setText("Motor: ");

        lblPlaca1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblPlaca1.setText("Placa: ");

        lblNombre1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblNombre1.setText("Nombre: ");

        lblAnio.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblAnio.setText("Uwu");

        lblMarca1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblMarca1.setText("Marca: ");

        lblMotor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblMotor.setText("Uwu");

        lblModelo1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblModelo1.setText("Modelo: ");

        lblPlaca.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblPlaca.setText("Uwu");

        lblPrecio1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblPrecio1.setText("Precio: ");

        btnVer.setBackground(new java.awt.Color(204, 204, 204));
        btnVer.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnVer.setText("Ver");
        btnVer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerActionPerformed(evt);
            }
        });

        lblNombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblNombre.setText("Uwu");

        panImagenVehiculo1.setBackground(new java.awt.Color(255, 255, 255));
        panImagenVehiculo1.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                panImagenVehiculo1ComponentShown(evt);
            }
        });

        javax.swing.GroupLayout panImagenVehiculo1Layout = new javax.swing.GroupLayout(panImagenVehiculo1);
        panImagenVehiculo1.setLayout(panImagenVehiculo1Layout);
        panImagenVehiculo1Layout.setHorizontalGroup(
            panImagenVehiculo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 245, Short.MAX_VALUE)
        );
        panImagenVehiculo1Layout.setVerticalGroup(
            panImagenVehiculo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 187, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(panImagenVehiculo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMarca1)
                    .addComponent(lblNombre1)
                    .addComponent(lblModelo1)
                    .addComponent(lblPrecio1))
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPrecio)
                    .addComponent(lblModelo)
                    .addComponent(lblNombre)
                    .addComponent(lblMarca))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 117, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMotor1)
                    .addComponent(lblPlaca1)
                    .addComponent(lblAnio1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(lblAnio)
                        .addComponent(lblPlaca))
                    .addComponent(lblMotor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(78, 78, 78)
                .addComponent(btnVer, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(btnVer, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblAnio1)
                                    .addComponent(lblAnio))
                                .addGap(35, 35, 35)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblMotor1)
                                    .addComponent(lblMotor))
                                .addGap(27, 27, 27)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblPlaca1)
                                    .addComponent(lblPlaca)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblNombre1)
                                    .addComponent(lblNombre))
                                .addGap(35, 35, 35)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblMarca1)
                                    .addComponent(lblMarca))
                                .addGap(27, 27, 27)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblModelo1)
                                    .addComponent(lblModelo))))
                        .addGap(49, 49, 49)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPrecio1)
                            .addComponent(lblPrecio)))
                    .addComponent(panImagenVehiculo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        lblMarca2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblMarca2.setText("Uwu");

        lblModelo2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblModelo2.setText("Uwu");

        lblPrecio2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblPrecio2.setText("Uwu");

        lblAnio2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblAnio2.setText("Año: ");

        lblMotor2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblMotor2.setText("Motor: ");

        lblPlaca2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblPlaca2.setText("Placa: ");

        lblNombre2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblNombre2.setText("Nombre: ");

        lblAnio3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblAnio3.setText("Uwu");

        lblMarca3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblMarca3.setText("Marca: ");

        lblMotor3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblMotor3.setText("Uwu");

        lblModelo3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblModelo3.setText("Modelo: ");

        lblPlaca3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblPlaca3.setText("Uwu");

        lblPrecio3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblPrecio3.setText("Precio: ");

        btnVer1.setBackground(new java.awt.Color(204, 204, 204));
        btnVer1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnVer1.setText("Ver");
        btnVer1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVer1ActionPerformed(evt);
            }
        });

        lblNombre3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblNombre3.setText("Uwu");

        panImagenVehiculo2.setBackground(new java.awt.Color(255, 255, 255));
        panImagenVehiculo2.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                panImagenVehiculo2ComponentShown(evt);
            }
        });

        javax.swing.GroupLayout panImagenVehiculo2Layout = new javax.swing.GroupLayout(panImagenVehiculo2);
        panImagenVehiculo2.setLayout(panImagenVehiculo2Layout);
        panImagenVehiculo2Layout.setHorizontalGroup(
            panImagenVehiculo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 245, Short.MAX_VALUE)
        );
        panImagenVehiculo2Layout.setVerticalGroup(
            panImagenVehiculo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 187, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(panImagenVehiculo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMarca3)
                    .addComponent(lblNombre2)
                    .addComponent(lblModelo3)
                    .addComponent(lblPrecio3))
                .addGap(25, 25, 25)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPrecio2)
                    .addComponent(lblModelo2)
                    .addComponent(lblNombre3)
                    .addComponent(lblMarca2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 117, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMotor2)
                    .addComponent(lblPlaca2)
                    .addComponent(lblAnio2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(lblAnio3)
                        .addComponent(lblPlaca3))
                    .addComponent(lblMotor3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(78, 78, 78)
                .addComponent(btnVer1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(btnVer1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblAnio2)
                                    .addComponent(lblAnio3))
                                .addGap(35, 35, 35)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblMotor2)
                                    .addComponent(lblMotor3))
                                .addGap(27, 27, 27)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblPlaca2)
                                    .addComponent(lblPlaca3)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblNombre2)
                                    .addComponent(lblNombre3))
                                .addGap(35, 35, 35)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblMarca3)
                                    .addComponent(lblMarca2))
                                .addGap(27, 27, 27)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblModelo3)
                                    .addComponent(lblModelo2))))
                        .addGap(49, 49, 49)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPrecio3)
                            .addComponent(lblPrecio2)))
                    .addComponent(panImagenVehiculo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        lblMarca6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblMarca6.setText("Uwu");

        lblModelo6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblModelo6.setText("Uwu");

        lblPrecio6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblPrecio6.setText("Uwu");

        lblAnio6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblAnio6.setText("Año: ");

        lblMotor6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblMotor6.setText("Motor: ");

        lblPlaca6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblPlaca6.setText("Placa: ");

        lblNombre6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblNombre6.setText("Nombre: ");

        lblAnio7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblAnio7.setText("Uwu");

        lblMarca7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblMarca7.setText("Marca: ");

        lblMotor7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblMotor7.setText("Uwu");

        lblModelo7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblModelo7.setText("Modelo: ");

        lblPlaca7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblPlaca7.setText("Uwu");

        lblPrecio7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblPrecio7.setText("Precio: ");

        btnVer3.setBackground(new java.awt.Color(204, 204, 204));
        btnVer3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnVer3.setText("Ver");
        btnVer3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVer3ActionPerformed(evt);
            }
        });

        lblNombre7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblNombre7.setText("Uwu");

        panImagenVehiculo3.setBackground(new java.awt.Color(255, 255, 255));
        panImagenVehiculo3.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                panImagenVehiculo3ComponentShown(evt);
            }
        });

        javax.swing.GroupLayout panImagenVehiculo3Layout = new javax.swing.GroupLayout(panImagenVehiculo3);
        panImagenVehiculo3.setLayout(panImagenVehiculo3Layout);
        panImagenVehiculo3Layout.setHorizontalGroup(
            panImagenVehiculo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 245, Short.MAX_VALUE)
        );
        panImagenVehiculo3Layout.setVerticalGroup(
            panImagenVehiculo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 187, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(panImagenVehiculo3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMarca7)
                    .addComponent(lblNombre6)
                    .addComponent(lblModelo7)
                    .addComponent(lblPrecio7))
                .addGap(25, 25, 25)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPrecio6)
                    .addComponent(lblModelo6)
                    .addComponent(lblNombre7)
                    .addComponent(lblMarca6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 117, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMotor6)
                    .addComponent(lblPlaca6)
                    .addComponent(lblAnio6, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(30, 30, 30)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(lblAnio7)
                        .addComponent(lblPlaca7))
                    .addComponent(lblMotor7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(78, 78, 78)
                .addComponent(btnVer3, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(btnVer3, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblAnio6)
                                    .addComponent(lblAnio7))
                                .addGap(35, 35, 35)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblMotor6)
                                    .addComponent(lblMotor7))
                                .addGap(27, 27, 27)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblPlaca6)
                                    .addComponent(lblPlaca7)))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblNombre6)
                                    .addComponent(lblNombre7))
                                .addGap(35, 35, 35)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblMarca7)
                                    .addComponent(lblMarca6))
                                .addGap(27, 27, 27)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblModelo7)
                                    .addComponent(lblModelo6))))
                        .addGap(49, 49, 49)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPrecio7)
                            .addComponent(lblPrecio6)))
                    .addComponent(panImagenVehiculo3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(110, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_btnVerActionPerformed

    private void panImagenVehiculo1ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_panImagenVehiculo1ComponentShown
        // TODO add your handling code here:
        Vehiculo vehiculo = vehiculos.get(contador);
        
        lblNombre.setText(vehiculo.getNombre());
        lblMarca.setText(vehiculo.getMarca());
        lblModelo.setText(vehiculo.getModelo());
        lblPrecio.setText(String.valueOf(vehiculo.getPrecio()));
        lblAnio.setText(String.valueOf(vehiculo.getAnio()));
        lblMotor.setText(vehiculo.getMotor());
        lblPlaca.setText(vehiculo.getPlaca());
        PanImagen im = new PanImagen(panImagenVehiculo1);
        panImagenVehiculo1.add(im);
        panImagenVehiculo1.revalidate();
        panImagenVehiculo1.repaint();
        
        contador++;
        panImagenVehiculo2.setVisible(false);
        panImagenVehiculo2.setVisible(true);
    }//GEN-LAST:event_panImagenVehiculo1ComponentShown

    private void btnVer1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVer1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVer1ActionPerformed

    private void panImagenVehiculo2ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_panImagenVehiculo2ComponentShown
        // TODO add your handling code here:
        Vehiculo vehiculo = vehiculos.get(contador);
        
        lblNombre3.setText(vehiculo.getNombre());
        lblMarca2.setText(vehiculo.getMarca());
        lblModelo2.setText(vehiculo.getModelo());
        lblPrecio2.setText(String.valueOf(vehiculo.getPrecio()));
        lblAnio3.setText(String.valueOf(vehiculo.getAnio()));
        lblMotor3.setText(vehiculo.getMotor());
        lblPlaca3.setText(vehiculo.getPlaca());
        PanImagen im = new PanImagen(panImagenVehiculo2);
        panImagenVehiculo2.add(im);
        panImagenVehiculo2.revalidate();
        panImagenVehiculo2.repaint();
    }//GEN-LAST:event_panImagenVehiculo2ComponentShown

    private void btnVer3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVer3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVer3ActionPerformed

    private void panImagenVehiculo3ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_panImagenVehiculo3ComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_panImagenVehiculo3ComponentShown

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
            java.util.logging.Logger.getLogger(FrmCatalogoVehiculos1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmCatalogoVehiculos1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmCatalogoVehiculos1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmCatalogoVehiculos1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmCatalogoVehiculos1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVer;
    private javax.swing.JButton btnVer1;
    private javax.swing.JButton btnVer3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel lblAnio;
    private javax.swing.JLabel lblAnio1;
    private javax.swing.JLabel lblAnio2;
    private javax.swing.JLabel lblAnio3;
    private javax.swing.JLabel lblAnio6;
    private javax.swing.JLabel lblAnio7;
    private javax.swing.JLabel lblMarca;
    private javax.swing.JLabel lblMarca1;
    private javax.swing.JLabel lblMarca2;
    private javax.swing.JLabel lblMarca3;
    private javax.swing.JLabel lblMarca6;
    private javax.swing.JLabel lblMarca7;
    private javax.swing.JLabel lblModelo;
    private javax.swing.JLabel lblModelo1;
    private javax.swing.JLabel lblModelo2;
    private javax.swing.JLabel lblModelo3;
    private javax.swing.JLabel lblModelo6;
    private javax.swing.JLabel lblModelo7;
    private javax.swing.JLabel lblMotor;
    private javax.swing.JLabel lblMotor1;
    private javax.swing.JLabel lblMotor2;
    private javax.swing.JLabel lblMotor3;
    private javax.swing.JLabel lblMotor6;
    private javax.swing.JLabel lblMotor7;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNombre1;
    private javax.swing.JLabel lblNombre2;
    private javax.swing.JLabel lblNombre3;
    private javax.swing.JLabel lblNombre6;
    private javax.swing.JLabel lblNombre7;
    private javax.swing.JLabel lblPlaca;
    private javax.swing.JLabel lblPlaca1;
    private javax.swing.JLabel lblPlaca2;
    private javax.swing.JLabel lblPlaca3;
    private javax.swing.JLabel lblPlaca6;
    private javax.swing.JLabel lblPlaca7;
    private javax.swing.JLabel lblPrecio;
    private javax.swing.JLabel lblPrecio1;
    private javax.swing.JLabel lblPrecio2;
    private javax.swing.JLabel lblPrecio3;
    private javax.swing.JLabel lblPrecio6;
    private javax.swing.JLabel lblPrecio7;
    public javax.swing.JPanel panImagenVehiculo1;
    public javax.swing.JPanel panImagenVehiculo2;
    public javax.swing.JPanel panImagenVehiculo3;
    // End of variables declaration//GEN-END:variables
}
