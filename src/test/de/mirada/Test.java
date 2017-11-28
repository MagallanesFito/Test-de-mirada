
package test.de.mirada;

public class Test extends javax.swing.JFrame {
    Paciente pacTest;
    public Test(Paciente paciente) {
        pacTest=paciente;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ImageEjem = new javax.swing.JLabel();
        opcion1 = new javax.swing.JToggleButton();
        opcion2 = new javax.swing.JToggleButton();
        opcion3 = new javax.swing.JToggleButton();
        opcion4 = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ImageEjem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/n01.png"))); // NOI18N

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(opcion1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(opcion2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(opcion3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(opcion4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(ImageEjem, javax.swing.GroupLayout.PREFERRED_SIZE, 563, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(69, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(64, Short.MAX_VALUE)
                .addComponent(ImageEjem, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(opcion3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(opcion4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(opcion2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(opcion1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(78, 78, 78))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void opcion1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcion1ActionPerformed
        
    }//GEN-LAST:event_opcion1ActionPerformed

    private void opcion1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_opcion1KeyPressed
        char t=evt.getKeyChar();
        switch(t){
            case 'z':
                break;
            case 'x':
                break;
            case 'n':
                break;
            case 'm':
                break;
        }
    }//GEN-LAST:event_opcion1KeyPressed

    private void opcion2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcion2ActionPerformed
        
    }//GEN-LAST:event_opcion2ActionPerformed

    private void opcion3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcion3ActionPerformed
        
    }//GEN-LAST:event_opcion3ActionPerformed

    private void opcion4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcion4ActionPerformed
        
    }//GEN-LAST:event_opcion4ActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ImageEjem;
    private javax.swing.JToggleButton opcion1;
    private javax.swing.JToggleButton opcion2;
    private javax.swing.JToggleButton opcion3;
    private javax.swing.JToggleButton opcion4;
    // End of variables declaration//GEN-END:variables
}
