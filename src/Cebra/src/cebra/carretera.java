/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cebra;

import java.awt.Color;

/**
 *
 * @author Astrid Caicedo
 */
public class carretera extends javax.swing.JFrame {

    /**
     * Creates new form carretera
     */
    private semaforo mySemaforo;
    private Carro myCarro;

    private int velocidad = 20;

    public carretera() {
        initComponents();
        setSize(850, 350);

    }

    //545
    //  ---------------  HILO CARRO -------------------
    Thread carrito = new Thread(new Runnable() {

        @Override
        public void run() {
            boolean b = true;
            semaforin.start(); //INICIA SEMAFORO
            try {
                while (b) {
                    int aceleracion = (int) (Math.random()*50+10); // generan velocidades aleatorias para la luz VERDE (ACELERA)
                    int desaceleracion = (int) (Math.random()*90+60);// generan velocidades aleatorias para la luz amarilla (DESACELERA)
                 
                    carro.setBounds((1) + carro.getBounds().x, 40, 69, 45); //hace andar al carro
                    

                    if (carro.getBounds().x >= 545) {
                        String c = mySemaforo.getColo();

                        if (c.equalsIgnoreCase("rojO")) {

                            while (!c.equalsIgnoreCase("amarillo")) { //ESPERA HASTA QUE CAMBIE A AMARILLO
                                c = mySemaforo.getColo();

                            }

                        } else if (c.equalsIgnoreCase("amarillo")) {//dismunuye o aumenta su velocidad
                            velocidad = aceleracion;

                        } else if (c.equalsIgnoreCase("verde")) {//aumenta un poco su velocidad
                            
                            velocidad = aceleracion;
                            System.out.println(velocidad);
                            

                        }

                        if (carro.getBounds().x == 700) { //regresa al ORIGEN
                            carro.setBounds(5, 40, 71, 28);
                        }

                    }

                    Thread.sleep(velocidad);

                    // TODO add your handling code here:
                }
                carrito.stop();

            } catch (InterruptedException ex) {

            }

        }

    });

    //  ---------------  HILO SEMAFORO -------------------
    Thread semaforin = new Thread(new Runnable() {

        @Override
        public void run() {

            while (mySemaforo.getE()) {

                String c = mySemaforo.getColo();
                if (c.equalsIgnoreCase("rojo")) {

                    rojoX.setBackground(Color.red);
                    amarillo.setBackground(new Color(240, 245, 132));
                    verde.setBackground(new Color(139, 226, 153));
                } else if (c.equalsIgnoreCase("amarillo")) {

                    amarillo.setBackground(Color.yellow);
                    rojoX.setBackground(new Color(255, 120, 120));
                    verde.setBackground(new Color(139, 226, 153));
                } else if (c.equalsIgnoreCase("verde")) {

                    verde.setBackground(Color.green);
                    rojoX.setBackground(new Color(255, 120, 120));
                    amarillo.setBackground(new Color(240, 245, 132));
                }

            }

        }

    });

    //  ---------------  HILO CARRO2 -------------------
    Thread carrito2 = new Thread(new Runnable() {

        @Override
        public void run() {
            
            boolean b = true;
            semaforin.start(); //INICIA SEMAFORO
            try {
                myCarro.start();
                while (myCarro.isB()) {
                    carro.setBounds(myCarro.getX() + carro.getBounds().x, myCarro.getY(), myCarro.getLargo(), myCarro.getAlto());
                    if (carro.getBounds().x >= 545) {
                        String c = mySemaforo.getColo();

                        if (c.equalsIgnoreCase("rojO")) {

                            while (!c.equalsIgnoreCase("amarillo")) { //ESPERA HASTA QUE CAMBIE A AMARILLO
                                c = mySemaforo.getColo();

                            }

                        } else if (c.equalsIgnoreCase("amarillo")) {
                            velocidad = 150;

                        } else if (c.equalsIgnoreCase("verde")) {
                            velocidad = 10;

                        }

                        if (carro.getBounds().x == 700) {
                            carro.setBounds(5, 40, 71, 28);
                        }

                    }

                    Thread.sleep(velocidad);

                    // TODO add your handling code here:
                }
                carro.setBounds(5, 40, 71, 28);
                carrito.stop();

            } catch (InterruptedException ex) {

            }

        }

    });

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        carro = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        semaforo = new javax.swing.JPanel();
        rojoX = new javax.swing.JTextField();
        verde = new javax.swing.JTextField();
        amarillo = new javax.swing.JTextField();
        iniciar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        carro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cebra/car.jpg"))); // NOI18N
        getContentPane().add(carro);
        carro.setBounds(60, 40, 69, 45);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cebra/calle.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(12, 10, 760, 159);

        semaforo.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED), "SEMAFORO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));

        rojoX.setEditable(false);
        rojoX.setBackground(new java.awt.Color(255, 255, 255));

        verde.setEditable(false);
        verde.setBackground(new java.awt.Color(255, 255, 255));
        verde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verdeActionPerformed(evt);
            }
        });

        amarillo.setEditable(false);
        amarillo.setBackground(new java.awt.Color(255, 255, 255));
        amarillo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amarilloActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout semaforoLayout = new javax.swing.GroupLayout(semaforo);
        semaforo.setLayout(semaforoLayout);
        semaforoLayout.setHorizontalGroup(
            semaforoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(semaforoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rojoX, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(amarillo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(verde, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        semaforoLayout.setVerticalGroup(
            semaforoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(semaforoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(semaforoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rojoX, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(amarillo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(verde, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(semaforo);
        semaforo.setBounds(570, 180, 198, 94);

        iniciar.setText("INICIAR");
        iniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iniciarActionPerformed(evt);
            }
        });
        getContentPane().add(iniciar);
        iniciar.setBounds(100, 220, 73, 23);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void iniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iniciarActionPerformed

//hilo.start();
        this.mySemaforo = new semaforo();
        this.myCarro = new Carro();
        mySemaforo.start();
        carrito.start();

        this.iniciar.setEnabled(false);


    }//GEN-LAST:event_iniciarActionPerformed

    private void amarilloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amarilloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_amarilloActionPerformed

    private void verdeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verdeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_verdeActionPerformed

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
            java.util.logging.Logger.getLogger(carretera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(carretera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(carretera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(carretera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new carretera().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField amarillo;
    private javax.swing.JLabel carro;
    private javax.swing.JButton iniciar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField rojoX;
    private javax.swing.JPanel semaforo;
    private javax.swing.JTextField verde;
    // End of variables declaration//GEN-END:variables
}
