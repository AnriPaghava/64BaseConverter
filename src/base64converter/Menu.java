
package base64converter;

import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.security.Security;
import java.util.Set;

public class Menu extends javax.swing.JFrame {

    public Menu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        cbAlgo = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtInput = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtOutput = new javax.swing.JTextArea();
        btnEncode = new javax.swing.JButton();
        btnDecode = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setText("შიფრაციის ტიპი:");
        jLabel1.setToolTipText("");

        cbAlgo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MD2", "MD5", "SHA-1", "SHA-256", "SHA-512", "Base64", "Hex" }));
        cbAlgo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbAlgoItemStateChanged(evt);
            }
        });

        txtInput.setColumns(20);
        txtInput.setLineWrap(true);
        txtInput.setRows(5);
        jScrollPane1.setViewportView(txtInput);

        txtOutput.setColumns(20);
        txtOutput.setLineWrap(true);
        txtOutput.setRows(5);
        jScrollPane2.setViewportView(txtOutput);

        btnEncode.setText("შიფრაცია");
        btnEncode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEncodeActionPerformed(evt);
            }
        });

        btnDecode.setText("დეშიფრაცია");
        btnDecode.setToolTipText("");
        btnDecode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDecodeActionPerformed(evt);
            }
        });

        jLabel2.setText("შესატანი მონაცემები:");

        jLabel3.setText("შედეგი:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(27, 27, 27)
                        .addComponent(cbAlgo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnEncode, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnDecode, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 442, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addGap(23, 23, 23))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cbAlgo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEncode)
                    .addComponent(btnDecode))
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEncodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEncodeActionPerformed
        switch (cbAlgo.getSelectedIndex()) {
            case 0:
                txtOutput.setText(MD2.encrypt(txtInput.getText()));
                System.out.println("MD2");
                break;
            case 1:
                txtOutput.setText(MD5.encrypt(txtInput.getText()));
                System.out.println("MD5");
                break;
            case 2:
                txtOutput.setText(SHA1.encrypt(txtInput.getText()));
                System.out.println("SHA1");
                break;
            case 3:
                txtOutput.setText(SHA256.encrypt(txtInput.getText()));
                System.out.println("SHA256");
                break;
            case 4:
                txtOutput.setText(SHA512.encrypt(txtInput.getText()));
                System.out.println("SHA512");
                break;
            case 5:
                txtOutput.setText(Base_64.encrypt(txtInput.getText()));
                System.out.println("Base64");
                break;
            case 6:
                txtOutput.setText(Hex.encrypt(txtInput.getText()));
                System.out.println("Hex");
                break;
        }


    }//GEN-LAST:event_btnEncodeActionPerformed

    private void cbAlgoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbAlgoItemStateChanged
        if (cbAlgo.getSelectedIndex() == 5 || cbAlgo.getSelectedIndex() == 6) {
            btnDecode.setEnabled(true);
        } else {
            btnDecode.setEnabled(false);
        }
    }//GEN-LAST:event_cbAlgoItemStateChanged

    private void btnDecodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDecodeActionPerformed
        switch (cbAlgo.getSelectedIndex()) {
            case 5:
                txtOutput.setText(Base_64.decrypt(txtInput.getText()));
                System.out.println("Base64");
                break;
            case 6:
                txtOutput.setText(Hex.decrypt(txtInput.getText()));
                System.out.println("Hex");
                break;
        }
        
    }//GEN-LAST:event_btnDecodeActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
                Set<String> messageDigest = Security.getAlgorithms("MessageDigest");
                messageDigest.forEach(x -> System.out.println(x));
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDecode;
    private javax.swing.JButton btnEncode;
    private javax.swing.JComboBox<String> cbAlgo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea txtInput;
    private javax.swing.JTextArea txtOutput;
    // End of variables declaration//GEN-END:variables
}
