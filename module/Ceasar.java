
package maceasar;


public class Ceasar extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Ceasar.class.getName());

    //phương thức khởi tạo
    public Ceasar() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        PlainText = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        CipherText = new javax.swing.JTextArea();
        keyPlainText = new javax.swing.JTextField();
        KeyCipherText = new javax.swing.JTextField();
        Encrypt = new javax.swing.JButton();
        Decrypt = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Mã Ceasar");
        setBackground(new java.awt.Color(255, 0, 0));

        jLabel1.setText("Key");

        jLabel2.setText("Key");

        PlainText.setColumns(20);
        PlainText.setRows(5);
        jScrollPane1.setViewportView(PlainText);

        CipherText.setColumns(20);
        CipherText.setRows(5);
        jScrollPane2.setViewportView(CipherText);

        keyPlainText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keyPlainTextActionPerformed(evt);
            }
        });

        Encrypt.setText("Encrypt");
        Encrypt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EncryptActionPerformed(evt);
            }
        });

        Decrypt.setText("Decrypt");
        Decrypt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DecryptActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 356, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(KeyCipherText, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Encrypt)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(keyPlainText, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Decrypt))
                .addGap(69, 69, 69))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(keyPlainText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addComponent(Encrypt))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(KeyCipherText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(51, 51, 51)
                        .addComponent(Decrypt))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void keyPlainTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keyPlainTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_keyPlainTextActionPerformed

    private void DecryptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DecryptActionPerformed
        // TODO add your handling code here:
         try {
            // lấy nội dung cần giải mã
            String ct = CipherText.getText();
            // lấy key từ ô nhập chuyển sang số nguyên
            int key = Integer.parseInt(KeyCipherText.getText());
            // gọi hàm giải mã
            String pt = decrypt(ct, key);
            // hiển thị kết quả lên ô plainText
            PlainText.setText(pt);
        } catch (NumberFormatException ex) {
            PlainText.setText("Vui lòng nhập Key là số nguyên");
        }
    }//GEN-LAST:event_DecryptActionPerformed

    private void EncryptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EncryptActionPerformed
        // TODO add your handling code here:
        try {
        // lấy nội dung cần giải mã
        String pt = PlainText.getText();
        //chuyển đổi chuỗi key sang số nguyên
        int key = Integer.parseInt(keyPlainText.getText());
        // gọi hàm mã hóa
        String ct = encrypt(pt, key);
        //hiển thị kết quả lên ô cipherText
        CipherText.setText(ct);
        } catch (NumberFormatException ex) {
            CipherText.setText("Vui lòng nhập Key là số nguyên");
        }
    }//GEN-LAST:event_EncryptActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> new Ceasar().setVisible(true));
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea CipherText;
    private javax.swing.JButton Decrypt;
    private javax.swing.JButton Encrypt;
    private javax.swing.JTextField KeyCipherText;
    private javax.swing.JTextArea PlainText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField keyPlainText;
    // End of variables declaration//GEN-END:variables
}