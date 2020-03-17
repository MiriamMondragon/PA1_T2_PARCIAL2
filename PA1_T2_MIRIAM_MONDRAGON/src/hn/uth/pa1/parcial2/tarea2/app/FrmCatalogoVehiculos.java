/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hn.uth.pa1.parcial2.tarea2.app;

import hn.uth.pa1.parcial2.tarea2.app.objetos.Vehiculo;
import hn.uth.pa1.parcial2.tarea2.app.repositorios.VehiculoRepositorio;
import java.awt.Image;
import java.util.ArrayList;
import java.util.List;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Miriam
 */
public class FrmCatalogoVehiculos extends javax.swing.JFrame {

    /**
     * Creates new form FrmCatalogoVehiculos
     */
    
    VehiculoRepositorio repo = new VehiculoRepositorio();
    List<Vehiculo> vehiculos;
    int contador = 0;
    List<Vehiculo> vehiculosVentana;
    List<Vehiculo> vehiculosFiltrados = new ArrayList<>();
    
    public FrmCatalogoVehiculos() {
        initComponents();
        try {
            this.vehiculos = repo.buscarTodo();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error al bucar todos");
        }
        btnRegresar.setVisible(false);
        vehiculosVentana = comprobarListadoDatosSiguiente(vehiculos);
    }

    public void cargarDatos1(Vehiculo vehiculo){
        lblNombre1.setText(vehiculo.getNombre());
        lblMarca1.setText(vehiculo.getMarca());
        lblModelo1.setText(vehiculo.getModelo());
        lblPrecio1.setText(String.valueOf("LSP " + vehiculo.getPrecio()));
        lblAnio1.setText(String.valueOf(vehiculo.getAnio()));
        lblMotor1.setText(vehiculo.getMotor());
        lblPlaca1.setText(vehiculo.getPlaca());
        String ruta = vehiculo.getImagen();
        lblImagen1.setIcon(traerImagen(ruta));
    }
    
    public void cargarDatos2(Vehiculo vehiculo){
        lblNombre2.setText(vehiculo.getNombre());
        lblMarca2.setText(vehiculo.getMarca());
        lblModelo2.setText(vehiculo.getModelo());
        lblPrecio2.setText(String.valueOf("LSP " + vehiculo.getPrecio()));
        lblAnio2.setText(String.valueOf(vehiculo.getAnio()));
        lblMotor2.setText(vehiculo.getMotor());
        lblPlaca2.setText(vehiculo.getPlaca());
        String ruta = vehiculo.getImagen();
        lblImagen2.setIcon(traerImagen(ruta));
    }
    
    public void cargarDatos3(Vehiculo vehiculo){
        lblNombre3.setText(vehiculo.getNombre());
        lblMarca3.setText(vehiculo.getMarca());
        lblModelo3.setText(vehiculo.getModelo());
        lblPrecio3.setText(String.valueOf("LSP " + vehiculo.getPrecio()));
        lblAnio3.setText(String.valueOf(vehiculo.getAnio()));
        lblMotor3.setText(vehiculo.getMotor());
        lblPlaca3.setText(vehiculo.getPlaca());
        String ruta = vehiculo.getImagen();
        lblImagen3.setIcon(traerImagen(ruta));
    }
    
    public Icon traerImagen(String ruta){
        ImageIcon imagen1 = new ImageIcon(getClass().getResource(ruta));
        ImageIcon icon1 = new ImageIcon(imagen1.getImage().getScaledInstance(lblImagen1.getWidth(), lblImagen1.getHeight(), Image.SCALE_DEFAULT));
        return icon1;
    }
    
    public List<Vehiculo> comprobarListadoDatosSiguiente(List<Vehiculo> vehiculos){
        int tamanioLista;
        List<Vehiculo> vehiculosMostrados = new ArrayList<>();
        tamanioLista = vehiculos.size();
        Vehiculo vehiculo = new Vehiculo();
        if(contador < tamanioLista){
            pan1.setVisible(true);
            vehiculo = vehiculos.get(contador);
            cargarDatos1(vehiculo);
            vehiculosMostrados.add(vehiculo);
            contador++;
        }else{
            pan1.setVisible(false);
        }
        if(contador < tamanioLista){
            pan2.setVisible(true);
            vehiculo = vehiculos.get(contador);
            cargarDatos2(vehiculo);
            vehiculosMostrados.add(vehiculo);
            contador++;
        }else{
            pan2.setVisible(false);
        }
        if(contador < tamanioLista){
            pan3.setVisible(true);
            vehiculo = vehiculos.get(contador);
            cargarDatos3(vehiculo);
            vehiculosMostrados.add(vehiculo);
            contador++;
        }else{
            pan3.setVisible(false);
        }
        
        lblObjetos.setText("Objetos " + contador + "/" + tamanioLista);
        return vehiculosMostrados;
    }
    
    public List<Vehiculo> comprobarListadoDatosAnterior(List<Vehiculo> vehiculos){
        int tamanioLista;
        List<Vehiculo> vehiculosMostradosInverso = new ArrayList<>();
        List<Vehiculo> vehiculosMostrados = new ArrayList<>();
        tamanioLista = vehiculos.size();
        Vehiculo vehiculo = new Vehiculo();
        if(contador > 0){
            contador-=3;
            if(contador > 0){
                pan3.setVisible(true);
                vehiculo = vehiculos.get(contador);
                cargarDatos3(vehiculo);
                vehiculosMostradosInverso.add(vehiculo);
            }
        }
        if(contador > 0){
            pan2.setVisible(true);
            contador--;
            vehiculo = vehiculos.get(contador);
            cargarDatos2(vehiculo);
            vehiculosMostradosInverso.add(vehiculo);
        }
        if(contador > 0){
            pan1.setVisible(true);
            contador--;
            vehiculo = vehiculos.get(contador);
            cargarDatos1(vehiculo);
            vehiculosMostradosInverso.add(vehiculo);
        }
        if(vehiculosMostradosInverso.isEmpty() == false){
            vehiculosMostrados.add(vehiculosMostradosInverso.get(2));
            vehiculosMostrados.add(vehiculosMostradosInverso.get(1));
            vehiculosMostrados.add(vehiculosMostradosInverso.get(0));
        }
        contador +=3;
        lblObjetos.setText("Objetos " + contador + "/" + tamanioLista);
        return vehiculosMostrados;
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
        pan1 = new javax.swing.JPanel();
        lblImagen1 = new javax.swing.JLabel();
        lblName1 = new javax.swing.JLabel();
        lblModel1 = new javax.swing.JLabel();
        lblBrand1 = new javax.swing.JLabel();
        lblPrice1 = new javax.swing.JLabel();
        lblNombre1 = new javax.swing.JLabel();
        lblMarca1 = new javax.swing.JLabel();
        lblModelo1 = new javax.swing.JLabel();
        lblPrecio1 = new javax.swing.JLabel();
        lblYear1 = new javax.swing.JLabel();
        lblmotor1 = new javax.swing.JLabel();
        lblKey1 = new javax.swing.JLabel();
        lblAnio1 = new javax.swing.JLabel();
        lblMotor1 = new javax.swing.JLabel();
        lblPlaca1 = new javax.swing.JLabel();
        btnVer1 = new javax.swing.JButton();
        pan2 = new javax.swing.JPanel();
        lblImagen2 = new javax.swing.JLabel();
        lblName2 = new javax.swing.JLabel();
        lblModel2 = new javax.swing.JLabel();
        lblBrand2 = new javax.swing.JLabel();
        lblPrice2 = new javax.swing.JLabel();
        lblNombre2 = new javax.swing.JLabel();
        lblMarca2 = new javax.swing.JLabel();
        lblModelo2 = new javax.swing.JLabel();
        lblPrecio2 = new javax.swing.JLabel();
        lblYear2 = new javax.swing.JLabel();
        lblmotor2 = new javax.swing.JLabel();
        lblKey2 = new javax.swing.JLabel();
        lblAnio2 = new javax.swing.JLabel();
        lblMotor2 = new javax.swing.JLabel();
        lblPlaca2 = new javax.swing.JLabel();
        btnVer2 = new javax.swing.JButton();
        pan3 = new javax.swing.JPanel();
        lblImagen3 = new javax.swing.JLabel();
        lblName3 = new javax.swing.JLabel();
        lblModel3 = new javax.swing.JLabel();
        lblBrand3 = new javax.swing.JLabel();
        lblPrice3 = new javax.swing.JLabel();
        lblNombre3 = new javax.swing.JLabel();
        lblMarca3 = new javax.swing.JLabel();
        lblModelo3 = new javax.swing.JLabel();
        lblPrecio3 = new javax.swing.JLabel();
        lblYear3 = new javax.swing.JLabel();
        lblmotor3 = new javax.swing.JLabel();
        lblKey3 = new javax.swing.JLabel();
        lblAnio3 = new javax.swing.JLabel();
        lblMotor3 = new javax.swing.JLabel();
        lblPlaca3 = new javax.swing.JLabel();
        btnVer3 = new javax.swing.JButton();
        btnAnterior = new javax.swing.JButton();
        btnSiguiente = new javax.swing.JButton();
        lblObjetos = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        lblFiltrar = new javax.swing.JLabel();
        txtFiltro = new javax.swing.JTextField();
        btnFiltrar = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Catalogo de Vehiculos");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        pan1.setBackground(new java.awt.Color(241, 238, 238));

        lblImagen1.setBackground(new java.awt.Color(255, 255, 255));
        lblImagen1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImagen1.setText("Imagen 1");

        lblName1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblName1.setText("Nombre: ");

        lblModel1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblModel1.setText("Modelo: ");

        lblBrand1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblBrand1.setText("Marca: ");

        lblPrice1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblPrice1.setText("Precio: ");

        lblNombre1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblNombre1.setText("jLabel1");

        lblMarca1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblMarca1.setText("jLabel2");

        lblModelo1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblModelo1.setText("jLabel3");

        lblPrecio1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblPrecio1.setText("jLabel1");

        lblYear1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblYear1.setText("Año: ");

        lblmotor1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblmotor1.setText("Motor: ");

        lblKey1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblKey1.setText("Placa: ");

        lblAnio1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblAnio1.setText("jLabel1");

        lblMotor1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblMotor1.setText("jLabel2");

        lblPlaca1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblPlaca1.setText("jLabel3");

        btnVer1.setBackground(new java.awt.Color(204, 204, 204));
        btnVer1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnVer1.setText("Ver");
        btnVer1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVer1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pan1Layout = new javax.swing.GroupLayout(pan1);
        pan1.setLayout(pan1Layout);
        pan1Layout.setHorizontalGroup(
            pan1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pan1Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(lblImagen1, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76)
                .addGroup(pan1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblName1)
                    .addComponent(lblModel1)
                    .addComponent(lblBrand1)
                    .addComponent(lblPrice1))
                .addGap(39, 39, 39)
                .addGroup(pan1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblNombre1)
                    .addComponent(lblMarca1)
                    .addComponent(lblModelo1)
                    .addComponent(lblPrecio1))
                .addGap(119, 119, 119)
                .addGroup(pan1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblYear1)
                    .addComponent(lblmotor1)
                    .addComponent(lblKey1))
                .addGap(32, 32, 32)
                .addGroup(pan1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pan1Layout.createSequentialGroup()
                        .addComponent(lblAnio1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pan1Layout.createSequentialGroup()
                        .addGroup(pan1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPlaca1)
                            .addComponent(lblMotor1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                        .addComponent(btnVer1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(76, 76, 76))))
        );
        pan1Layout.setVerticalGroup(
            pan1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pan1Layout.createSequentialGroup()
                .addGroup(pan1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pan1Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(pan1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblName1)
                            .addComponent(lblNombre1)
                            .addComponent(lblYear1)
                            .addComponent(lblAnio1))
                        .addGroup(pan1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pan1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(pan1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblBrand1)
                                    .addComponent(lblMarca1)
                                    .addComponent(lblmotor1)
                                    .addComponent(lblMotor1))
                                .addGap(18, 18, 18)
                                .addGroup(pan1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblModel1)
                                    .addComponent(lblModelo1)
                                    .addComponent(lblKey1)
                                    .addComponent(lblPlaca1))
                                .addGap(29, 29, 29)
                                .addGroup(pan1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblPrice1)
                                    .addComponent(lblPrecio1)))
                            .addGroup(pan1Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(btnVer1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(pan1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(lblImagen1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(52, Short.MAX_VALUE))
        );

        pan2.setBackground(new java.awt.Color(241, 238, 238));

        lblImagen2.setBackground(new java.awt.Color(255, 255, 255));
        lblImagen2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImagen2.setText("Imagen 2");

        lblName2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblName2.setText("Nombre: ");

        lblModel2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblModel2.setText("Modelo: ");

        lblBrand2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblBrand2.setText("Marca: ");

        lblPrice2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblPrice2.setText("Precio: ");

        lblNombre2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblNombre2.setText("jLabel1");

        lblMarca2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblMarca2.setText("jLabel2");

        lblModelo2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblModelo2.setText("jLabel3");

        lblPrecio2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblPrecio2.setText("jLabel1");

        lblYear2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblYear2.setText("Año: ");

        lblmotor2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblmotor2.setText("Motor: ");

        lblKey2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblKey2.setText("Placa: ");

        lblAnio2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblAnio2.setText("jLabel1");

        lblMotor2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblMotor2.setText("jLabel2");

        lblPlaca2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblPlaca2.setText("jLabel3");

        btnVer2.setBackground(new java.awt.Color(204, 204, 204));
        btnVer2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnVer2.setText("Ver");
        btnVer2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVer2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pan2Layout = new javax.swing.GroupLayout(pan2);
        pan2.setLayout(pan2Layout);
        pan2Layout.setHorizontalGroup(
            pan2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pan2Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(lblImagen2, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76)
                .addGroup(pan2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblName2)
                    .addComponent(lblModel2)
                    .addComponent(lblBrand2)
                    .addComponent(lblPrice2))
                .addGap(39, 39, 39)
                .addGroup(pan2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblNombre2)
                    .addComponent(lblMarca2)
                    .addComponent(lblModelo2)
                    .addComponent(lblPrecio2))
                .addGap(115, 115, 115)
                .addGroup(pan2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblYear2)
                    .addComponent(lblmotor2)
                    .addComponent(lblKey2))
                .addGap(32, 32, 32)
                .addGroup(pan2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pan2Layout.createSequentialGroup()
                        .addComponent(lblAnio2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pan2Layout.createSequentialGroup()
                        .addGroup(pan2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPlaca2)
                            .addComponent(lblMotor2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnVer2, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(78, 78, 78))))
        );
        pan2Layout.setVerticalGroup(
            pan2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pan2Layout.createSequentialGroup()
                .addGroup(pan2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pan2Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(pan2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblName2)
                            .addComponent(lblNombre2)
                            .addComponent(lblYear2)
                            .addComponent(lblAnio2))
                        .addGroup(pan2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pan2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(pan2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblBrand2)
                                    .addComponent(lblMarca2)
                                    .addComponent(lblmotor2)
                                    .addComponent(lblMotor2))
                                .addGap(18, 18, 18)
                                .addGroup(pan2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblModel2)
                                    .addComponent(lblModelo2)
                                    .addComponent(lblKey2)
                                    .addComponent(lblPlaca2))
                                .addGap(29, 29, 29)
                                .addGroup(pan2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblPrice2)
                                    .addComponent(lblPrecio2)))
                            .addGroup(pan2Layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(btnVer2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(pan2Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(lblImagen2, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(52, Short.MAX_VALUE))
        );

        pan3.setBackground(new java.awt.Color(241, 238, 238));

        lblImagen3.setBackground(new java.awt.Color(255, 255, 255));
        lblImagen3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImagen3.setText("Imagen 2");

        lblName3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblName3.setText("Nombre: ");

        lblModel3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblModel3.setText("Modelo: ");

        lblBrand3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblBrand3.setText("Marca: ");

        lblPrice3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblPrice3.setText("Precio: ");

        lblNombre3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblNombre3.setText("jLabel1");

        lblMarca3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblMarca3.setText("jLabel2");

        lblModelo3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblModelo3.setText("jLabel3");

        lblPrecio3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblPrecio3.setText("jLabel1");

        lblYear3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblYear3.setText("Año: ");

        lblmotor3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblmotor3.setText("Motor: ");

        lblKey3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblKey3.setText("Placa: ");

        lblAnio3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblAnio3.setText("jLabel1");

        lblMotor3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblMotor3.setText("jLabel2");

        lblPlaca3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblPlaca3.setText("jLabel3");

        btnVer3.setBackground(new java.awt.Color(204, 204, 204));
        btnVer3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnVer3.setText("Ver");
        btnVer3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVer3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pan3Layout = new javax.swing.GroupLayout(pan3);
        pan3.setLayout(pan3Layout);
        pan3Layout.setHorizontalGroup(
            pan3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pan3Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(lblImagen3, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76)
                .addGroup(pan3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblName3)
                    .addComponent(lblModel3)
                    .addComponent(lblBrand3)
                    .addComponent(lblPrice3))
                .addGap(39, 39, 39)
                .addGroup(pan3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblNombre3)
                    .addComponent(lblMarca3)
                    .addComponent(lblModelo3)
                    .addComponent(lblPrecio3))
                .addGap(119, 119, 119)
                .addGroup(pan3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblYear3)
                    .addComponent(lblmotor3)
                    .addComponent(lblKey3))
                .addGap(32, 32, 32)
                .addGroup(pan3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAnio3)
                    .addComponent(lblPlaca3)
                    .addComponent(lblMotor3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(btnVer3, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76))
        );
        pan3Layout.setVerticalGroup(
            pan3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pan3Layout.createSequentialGroup()
                .addGroup(pan3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pan3Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(pan3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblName3)
                            .addComponent(lblNombre3)
                            .addComponent(lblYear3)
                            .addComponent(lblAnio3))
                        .addGap(18, 18, 18)
                        .addGroup(pan3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblBrand3)
                            .addComponent(lblMarca3)
                            .addComponent(lblmotor3)
                            .addComponent(lblMotor3))
                        .addGap(18, 18, 18)
                        .addGroup(pan3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblModel3)
                            .addComponent(lblModelo3)
                            .addComponent(lblKey3)
                            .addComponent(lblPlaca3))
                        .addGap(29, 29, 29)
                        .addGroup(pan3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPrice3)
                            .addComponent(lblPrecio3)))
                    .addGroup(pan3Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(lblImagen3, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pan3Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(btnVer3, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        btnAnterior.setBackground(new java.awt.Color(204, 204, 204));
        btnAnterior.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnAnterior.setText("Anterior");
        btnAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnteriorActionPerformed(evt);
            }
        });

        btnSiguiente.setBackground(new java.awt.Color(204, 204, 204));
        btnSiguiente.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnSiguiente.setText("Siguiente");
        btnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteActionPerformed(evt);
            }
        });

        lblObjetos.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblObjetos.setText("Objetos 3/5");

        lblTitulo.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblTitulo.setText("Catálogo de Vehículos");

        lblFiltrar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblFiltrar.setText("Filtrar por Año:");

        btnFiltrar.setBackground(new java.awt.Color(204, 204, 204));
        btnFiltrar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnFiltrar.setText("Buscar");
        btnFiltrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiltrarActionPerformed(evt);
            }
        });

        btnRegresar.setBackground(new java.awt.Color(204, 204, 204));
        btnRegresar.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(145, 145, 145)
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblFiltrar)
                .addGap(18, 18, 18)
                .addComponent(txtFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnFiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(332, 332, 332)
                        .addComponent(btnAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(129, 129, 129)
                        .addComponent(lblObjetos)
                        .addGap(123, 123, 123)
                        .addComponent(btnSiguiente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRegresar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(115, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(pan3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(pan2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(pan1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGap(120, 120, 120))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lblFiltrar, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtFiltro)
                            .addComponent(btnFiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                    .addComponent(lblTitulo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(pan1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pan2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pan3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblObjetos)
                        .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteActionPerformed
        // TODO add your handling code here:
        List<Vehiculo> vehiculosRecibidos = new ArrayList<>();
        if(btnRegresar.isVisible() == false){
            if(contador < vehiculos.size()){
            vehiculosRecibidos = comprobarListadoDatosSiguiente(vehiculos);
                if(vehiculosRecibidos.isEmpty() == false){
                    vehiculosVentana.clear();
                    vehiculosVentana = vehiculosRecibidos;
                }
            }
        }else {
            if(contador < vehiculosFiltrados.size()){
            vehiculosRecibidos = comprobarListadoDatosSiguiente(vehiculosFiltrados);
                if(vehiculosRecibidos.isEmpty() == false){
                    vehiculosVentana.clear();
                    vehiculosVentana = vehiculosRecibidos;
                }
            }
        }
    }//GEN-LAST:event_btnSiguienteActionPerformed

    private void btnAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnteriorActionPerformed
        // TODO add your handling code here:
        List<Vehiculo> vehiculosRecibidos = new ArrayList<>();
        if(btnRegresar.isVisible() == false){
           if(contador > 0){
            vehiculosRecibidos = comprobarListadoDatosAnterior(vehiculos);
                if(vehiculosRecibidos.isEmpty() == false){
                    vehiculosVentana.clear();
                    vehiculosVentana = vehiculosRecibidos;
                }
            } 
        }else {
            if(contador > 0){
            vehiculosRecibidos = comprobarListadoDatosAnterior(vehiculosFiltrados);
                if(vehiculosRecibidos.isEmpty() == false){
                    vehiculosVentana.clear();
                    vehiculosVentana = vehiculosRecibidos;
                }
            } 
        }
            
    }//GEN-LAST:event_btnAnteriorActionPerformed

    private void btnVer1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVer1ActionPerformed
        // TODO add your handling code here:
        Vehiculo vehiculo;
        vehiculo = vehiculosVentana.get(0);
        FrmDetallesVehiculo detalles = new FrmDetallesVehiculo(vehiculo);
        util.mostrarFormulario(detalles);
    }//GEN-LAST:event_btnVer1ActionPerformed

    private void btnVer2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVer2ActionPerformed
        // TODO add your handling code here:
        Vehiculo vehiculo;
        vehiculo = vehiculosVentana.get(1);
        FrmDetallesVehiculo detalles = new FrmDetallesVehiculo(vehiculo);
        util.mostrarFormulario(detalles);
    }//GEN-LAST:event_btnVer2ActionPerformed

    private void btnVer3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVer3ActionPerformed
        // TODO add your handling code here:
        Vehiculo vehiculo;
        vehiculo = vehiculosVentana.get(2);
        FrmDetallesVehiculo detalles = new FrmDetallesVehiculo(vehiculo);
        util.mostrarFormulario(detalles);
    }//GEN-LAST:event_btnVer3ActionPerformed

    private void btnFiltrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiltrarActionPerformed
        // TODO add your handling code here:
        vehiculosFiltrados.clear();
        int filtro = Integer.parseInt(txtFiltro.getText());
        for (Vehiculo vehiculoTemp : vehiculos) {
            if(vehiculoTemp.getAnio() == filtro){
                vehiculosFiltrados.add(vehiculoTemp);
            }   
        }
        if(vehiculosFiltrados.isEmpty() == false){
            contador = 0;
            vehiculosVentana = comprobarListadoDatosSiguiente(vehiculosFiltrados);
            btnRegresar.setVisible(true);
        }else{
            JOptionPane.showMessageDialog(this, "No se encontraron vehículos del año " + filtro);
        }
    }//GEN-LAST:event_btnFiltrarActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        // TODO add your handling code here:
        btnRegresar.setVisible(false);
        vehiculosFiltrados.clear();
        contador = 0;
        vehiculosVentana = comprobarListadoDatosSiguiente(vehiculos);
    }//GEN-LAST:event_btnRegresarActionPerformed

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
            java.util.logging.Logger.getLogger(FrmCatalogoVehiculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmCatalogoVehiculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmCatalogoVehiculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmCatalogoVehiculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmCatalogoVehiculos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnterior;
    private javax.swing.JButton btnFiltrar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton btnSiguiente;
    private javax.swing.JButton btnVer1;
    private javax.swing.JButton btnVer2;
    private javax.swing.JButton btnVer3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblAnio1;
    private javax.swing.JLabel lblAnio2;
    private javax.swing.JLabel lblAnio3;
    private javax.swing.JLabel lblBrand1;
    private javax.swing.JLabel lblBrand2;
    private javax.swing.JLabel lblBrand3;
    private javax.swing.JLabel lblFiltrar;
    private javax.swing.JLabel lblImagen1;
    private javax.swing.JLabel lblImagen2;
    private javax.swing.JLabel lblImagen3;
    private javax.swing.JLabel lblKey1;
    private javax.swing.JLabel lblKey2;
    private javax.swing.JLabel lblKey3;
    private javax.swing.JLabel lblMarca1;
    private javax.swing.JLabel lblMarca2;
    private javax.swing.JLabel lblMarca3;
    private javax.swing.JLabel lblModel1;
    private javax.swing.JLabel lblModel2;
    private javax.swing.JLabel lblModel3;
    private javax.swing.JLabel lblModelo1;
    private javax.swing.JLabel lblModelo2;
    private javax.swing.JLabel lblModelo3;
    private javax.swing.JLabel lblMotor1;
    private javax.swing.JLabel lblMotor2;
    private javax.swing.JLabel lblMotor3;
    private javax.swing.JLabel lblName1;
    private javax.swing.JLabel lblName2;
    private javax.swing.JLabel lblName3;
    private javax.swing.JLabel lblNombre1;
    private javax.swing.JLabel lblNombre2;
    private javax.swing.JLabel lblNombre3;
    private javax.swing.JLabel lblObjetos;
    private javax.swing.JLabel lblPlaca1;
    private javax.swing.JLabel lblPlaca2;
    private javax.swing.JLabel lblPlaca3;
    private javax.swing.JLabel lblPrecio1;
    private javax.swing.JLabel lblPrecio2;
    private javax.swing.JLabel lblPrecio3;
    private javax.swing.JLabel lblPrice1;
    private javax.swing.JLabel lblPrice2;
    private javax.swing.JLabel lblPrice3;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblYear1;
    private javax.swing.JLabel lblYear2;
    private javax.swing.JLabel lblYear3;
    private javax.swing.JLabel lblmotor1;
    private javax.swing.JLabel lblmotor2;
    private javax.swing.JLabel lblmotor3;
    private javax.swing.JPanel pan1;
    private javax.swing.JPanel pan2;
    private javax.swing.JPanel pan3;
    private javax.swing.JTextField txtFiltro;
    // End of variables declaration//GEN-END:variables
}
