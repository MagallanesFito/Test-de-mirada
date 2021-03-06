package test.de.mirada;

import java.awt.Color;

public class Ejemplo extends javax.swing.JFrame {
    Paciente pac;
    public Ejemplo(Paciente paciente) {
        initComponents();
        pac=paciente;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ImageEjem = new javax.swing.JLabel();
        LabEjem = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jToggleButton2 = new javax.swing.JToggleButton();
        jToggleButton3 = new javax.swing.JToggleButton();
        jToggleButton4 = new javax.swing.JToggleButton();
        opcion1 = new javax.swing.JToggleButton();
        opcion2 = new javax.swing.JToggleButton();
        opcion3 = new javax.swing.JToggleButton();
        opcion4 = new javax.swing.JToggleButton();
        regresarButton = new javax.swing.JToggleButton();
        comenzarButt = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        ImageEjem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/n00.png"))); // NOI18N

        LabEjem.setFont(new java.awt.Font("Lucida Sans", 0, 36)); // NOI18N
        LabEjem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabEjem.setText("EJEMPLO");

        jToggleButton1.setBackground(new java.awt.Color(0, 0, 0));
        jToggleButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jToggleButton1.setForeground(new java.awt.Color(153, 153, 153));
        jToggleButton1.setText("Z");
        jToggleButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jToggleButton1.setBorderPainted(false);
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        jToggleButton2.setBackground(new java.awt.Color(0, 0, 0));
        jToggleButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jToggleButton2.setForeground(new java.awt.Color(153, 153, 153));
        jToggleButton2.setText("X");
        jToggleButton2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jToggleButton2.setBorderPainted(false);
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });

        jToggleButton3.setBackground(new java.awt.Color(0, 0, 0));
        jToggleButton3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jToggleButton3.setForeground(new java.awt.Color(153, 153, 153));
        jToggleButton3.setText("N");
        jToggleButton3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jToggleButton3.setBorderPainted(false);
        jToggleButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton3ActionPerformed(evt);
            }
        });

        jToggleButton4.setBackground(new java.awt.Color(0, 0, 0));
        jToggleButton4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jToggleButton4.setForeground(new java.awt.Color(153, 153, 153));
        jToggleButton4.setText("M");
        jToggleButton4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jToggleButton4.setBorderPainted(false);
        jToggleButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton4ActionPerformed(evt);
            }
        });

        opcion1.setBackground(new java.awt.Color(95, 197, 87));
        opcion1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        opcion1.setForeground(new java.awt.Color(255, 255, 255));
        opcion1.setText("CELOSO");
        opcion1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        opcion1.setBorderPainted(false);
        opcion1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcion1ActionPerformed(evt);
            }
        });
        opcion1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                opcion1KeyPressed(evt);
            }
        });

        opcion2.setBackground(new java.awt.Color(95, 197, 87));
        opcion2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        opcion2.setForeground(new java.awt.Color(255, 255, 255));
        opcion2.setText("ASUSTADO");
        opcion2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        opcion2.setBorderPainted(false);
        opcion2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcion2ActionPerformed(evt);
            }
        });

        opcion3.setBackground(new java.awt.Color(95, 197, 87));
        opcion3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        opcion3.setForeground(new java.awt.Color(255, 255, 255));
        opcion3.setText("TRANQUILO");
        opcion3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        opcion3.setBorderPainted(false);
        opcion3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcion3ActionPerformed(evt);
            }
        });

        opcion4.setBackground(new java.awt.Color(95, 197, 87));
        opcion4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        opcion4.setForeground(new java.awt.Color(255, 255, 255));
        opcion4.setText("CARA DE ODIO");
        opcion4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        opcion4.setBorderPainted(false);
        opcion4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcion4ActionPerformed(evt);
            }
        });

        regresarButton.setBackground(new java.awt.Color(95, 197, 87));
        regresarButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        regresarButton.setForeground(new java.awt.Color(255, 255, 255));
        regresarButton.setText("Regresar");
        regresarButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        regresarButton.setBorderPainted(false);
        regresarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarButtonActionPerformed(evt);
            }
        });

        comenzarButt.setBackground(new java.awt.Color(95, 197, 87));
        comenzarButt.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        comenzarButt.setForeground(new java.awt.Color(255, 255, 255));
        comenzarButt.setText("Comenzar");
        comenzarButt.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        comenzarButt.setBorderPainted(false);
        comenzarButt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comenzarButtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(opcion1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43)
                                .addComponent(opcion2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(opcion3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(52, 52, 52)
                                .addComponent(opcion4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(regresarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(94, 94, 94)
                                        .addComponent(jToggleButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(111, 111, 111)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jToggleButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(103, 103, 103)
                                        .addComponent(jToggleButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(comenzarButt, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addComponent(LabEjem, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(ImageEjem, javax.swing.GroupLayout.PREFERRED_SIZE, 563, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(78, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(LabEjem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ImageEjem, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(opcion3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(opcion4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(opcion2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(opcion1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jToggleButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(regresarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comenzarButt, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed

    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton2ActionPerformed

    private void jToggleButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton3ActionPerformed

    private void jToggleButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton4ActionPerformed

    private void opcion1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcion1ActionPerformed
        opcion1.setBackground(Color.red);
    }//GEN-LAST:event_opcion1ActionPerformed

    private void opcion2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcion2ActionPerformed
        opcion2.setBackground(Color.green);
    }//GEN-LAST:event_opcion2ActionPerformed

    private void opcion3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcion3ActionPerformed
        opcion3.setBackground(Color.red);
    }//GEN-LAST:event_opcion3ActionPerformed

    private void opcion4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcion4ActionPerformed
        opcion4.setBackground(Color.red);
    }//GEN-LAST:event_opcion4ActionPerformed

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
    }//GEN-LAST:event_formKeyPressed

    private void regresarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarButtonActionPerformed
        new Instrucciones(pac).setVisible(true);
        dispose();
    }//GEN-LAST:event_regresarButtonActionPerformed

    private void comenzarButtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comenzarButtActionPerformed
        new Test(pac).setVisible(true);
        dispose();
    }//GEN-LAST:event_comenzarButtActionPerformed

    private void opcion1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_opcion1KeyPressed
        char t=evt.getKeyChar();
        switch(t){
            case 'z':
                opcion1.setBackground(Color.red);
                break;
            case 'x':
                opcion2.setBackground(Color.green);
                break;
            case 'n':
                opcion3.setBackground(Color.red);
                break;
            case 'm':
                opcion4.setBackground(Color.red);
                break;
        }
    }//GEN-LAST:event_opcion1KeyPressed
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ImageEjem;
    private javax.swing.JLabel LabEjem;
    private javax.swing.JToggleButton comenzarButt;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JToggleButton jToggleButton3;
    private javax.swing.JToggleButton jToggleButton4;
    private javax.swing.JToggleButton opcion1;
    private javax.swing.JToggleButton opcion2;
    private javax.swing.JToggleButton opcion3;
    private javax.swing.JToggleButton opcion4;
    private javax.swing.JToggleButton regresarButton;
    // End of variables declaration//GEN-END:variables
}
