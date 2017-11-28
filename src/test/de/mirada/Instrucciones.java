package test.de.mirada;
public class Instrucciones extends javax.swing.JFrame {
    int edad;
    String name;
    Paciente pac;
    public Instrucciones(Paciente paciente) {
        initComponents();
        pac=paciente;
        edad=pac.getEdad();
        name=pac.getNombre();
        
        if(edad<=16){
            jTextArea1.setText("Hola "+name+",a continuación se te van a mostrar muchas fotos"+
                    " de personas. Cada\nfoto tiene cuatro palabras debajo de ellas.\n" +
                    "\n" + "Lo que quiero es que mires atentamente cada foto y elijas qué palabra\n" +
                    "describe mejor lo que la persona está pensando y sintiendo\n" +
                    "\nTen en cuenta que\n" +
                    "encontrarás algunas fotos más fáciles y otras más difíciles, de modo\n" +
                    "que no te preocupes si no siempre es sencillo elegir la palabra.\n" +
                    "\nSi realmente no sabes qué palabra elegir, puedes adivinar.");
        }
        else
        {
            jTextArea1.setText("Hola "+name+"\nPara cada par de ojos, escoja y tecle la letra correspondiente a la\n" +
"palabra que mejor describa lo que la persona en la fotografía está\n" +
"pensando o sintiendo. Puede que le parezca que aplica más de una\n" +
"palabra, pero por favor escoja únicamente una, la que le parezca más\n" +
"adecuada. Antes de decidir la palabra, asegúrese de haber leído las\n" +
"cuatro palabras. Intente hacerlo sin dedicarle demasiado tiempo a cada\n" +
"fotografía, pero no hay un tiempo límite.\n" +
"\n" +
"Si no entiende alguna de las palabras, puede consultar el manual de\n" +
"definiciones.");
        }
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LabInst = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        ejemploButt = new javax.swing.JToggleButton();
        regresarButton = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        LabInst.setFont(new java.awt.Font("Lucida Sans", 0, 36)); // NOI18N
        LabInst.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabInst.setText("INSTRUCCIONES");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setEnabled(false);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 494, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
                .addContainerGap())
        );

        ejemploButt.setBackground(new java.awt.Color(95, 197, 87));
        ejemploButt.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        ejemploButt.setForeground(new java.awt.Color(255, 255, 255));
        ejemploButt.setText("Ejemplo");
        ejemploButt.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ejemploButt.setBorderPainted(false);
        ejemploButt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ejemploButtActionPerformed(evt);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 57, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LabInst, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(110, 110, 110))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(regresarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ejemploButt, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(88, 88, 88))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(LabInst)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ejemploButt, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(regresarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ejemploButtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ejemploButtActionPerformed
        new Ejemplo(pac).setVisible(true);
        dispose();
    }//GEN-LAST:event_ejemploButtActionPerformed

    private void regresarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarButtonActionPerformed
        new Menu().setVisible(true);
        dispose();
    }//GEN-LAST:event_regresarButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabInst;
    private javax.swing.JToggleButton ejemploButt;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JToggleButton regresarButton;
    // End of variables declaration//GEN-END:variables
}
