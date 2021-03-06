/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.edu.utfpr.views;

import javax.swing.JOptionPane;

/**
 *
 * @author Caroline
 */
public class CadastrarConta extends javax.swing.JFrame {

    /**
     * Creates new form CadastrarConta
     */
    public CadastrarConta() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtCadNovaConta = new javax.swing.JLabel();
        txtClienteC = new javax.swing.JLabel();
        cbClienteConta = new javax.swing.JComboBox<>();
        txtAgencia = new javax.swing.JLabel();
        cxAgencia = new javax.swing.JTextField();
        txtConta = new javax.swing.JLabel();
        cxConta = new javax.swing.JTextField();
        txtSenhaConta = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        cxSenhaConta = new javax.swing.JPasswordField();
        jMenuBar4 = new javax.swing.JMenuBar();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        txtCadNovaConta.setText("Cadastrar Nova Conta");

        txtClienteC.setText("Cliente:");

        txtAgencia.setText("Agência:");

        txtConta.setText("Conta:");

        txtSenhaConta.setText("Senha :");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/edu/utfpr/views/images/notes.png"))); // NOI18N
        jButton1.setText("Cadastrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jMenu4.setText("Menu");

        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/edu/utfpr/views/images/left-arrow.png"))); // NOI18N
        jMenuItem4.setText("Voltar");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem4);

        jMenuBar4.add(jMenu4);

        setJMenuBar(jMenuBar4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(txtSenhaConta)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(cxSenhaConta, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(181, 181, 181)
                                .addComponent(txtCadNovaConta))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtConta)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(cxConta))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtAgencia)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cxAgencia))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtClienteC)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cbClienteConta, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(txtCadNovaConta)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtClienteC)
                    .addComponent(cbClienteConta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAgencia)
                    .addComponent(cxAgencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtConta)
                    .addComponent(cxConta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSenhaConta)
                    .addComponent(cxSenhaConta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        

        if (this.cxAgencia.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Campo Agencia está vazio, preencha-o antes de continuar!");
            return;
        }

        if (this.cxConta.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Campo Conta está vazio, preencha-o antes de continuar!");
            return;
        }

        if (this.cxSenhaConta.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Campo Senha está vazio, preencha-o antes de continuar!");
            return;
        }

        long valor;
        if (this.cxAgencia.getText().length() != 0) {
            try {
                valor = Long.parseLong(this.cxAgencia.getText());
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "O campo Agencia só aceita números", "Informação", JOptionPane.INFORMATION_MESSAGE);
                this.cxAgencia.grabFocus();
                return;
            }
        }

        if (this.cxConta.getText().length() != 0) {
            try {
                valor = Long.parseLong(this.cxConta.getText());
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "O campo Conta só aceita números", "Informação", JOptionPane.INFORMATION_MESSAGE);
                this.cxConta.grabFocus();
                return;
            }
        }
        
        JOptionPane.showMessageDialog(this, "Cadastrado com sucesso!");
        this.setVisible(false);
        new GerenciarConta().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        this.setVisible(false);
        new GerenciarConta().setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbClienteConta;
    private javax.swing.JTextField cxAgencia;
    private javax.swing.JTextField cxConta;
    private javax.swing.JPasswordField cxSenhaConta;
    private javax.swing.JButton jButton1;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar4;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JLabel txtAgencia;
    private javax.swing.JLabel txtCadNovaConta;
    private javax.swing.JLabel txtClienteC;
    private javax.swing.JLabel txtConta;
    private javax.swing.JLabel txtSenhaConta;
    // End of variables declaration//GEN-END:variables
}
