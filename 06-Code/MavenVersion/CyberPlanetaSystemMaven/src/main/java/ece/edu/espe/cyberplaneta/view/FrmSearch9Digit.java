
package ece.edu.espe.cyberplaneta.view;

import ec.edu.espe.cyberplaneta.controller.C_9thDigitSearchMotor;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import org.bson.Document;
import utils.ChartAndTableUtils;
import utils.MongoDBUtil;

/**
 *
 * @author Andres Cedeno,Code Creators,DCCO-ESPE
 */
public class FrmSearch9Digit extends javax.swing.JFrame {

     private final C_9thDigitSearchMotor controller;
    
    public FrmSearch9Digit() {
        initComponents();
        controller = new C_9thDigitSearchMotor();
        ChartAndTableUtils.customizeTableHeader(tblTaxPayers);
        
    }

    private void search9digit() {
        String ninthDigit = jTextField1.getText().trim();
        if (ninthDigit.length() == 1 && Character.isDigit(ninthDigit.charAt(0))) {
            DefaultTableModel model = (DefaultTableModel) tblTaxPayers.getModel();
            controller.loadTaxPayersByNinthDigit(ninthDigit, model);
            customizeTableRendering();
        } else {
            JOptionPane.showMessageDialog(this, "Por favor, ingrese un solo dígito numérico.");
        }
    }

    private void customizeTableRendering() {
        tblTaxPayers.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
                c.setBackground(Color.WHITE);
                c.setForeground(new Color(0, 0, 102));
                return c;
            }
        });

        tblTaxPayers.getTableHeader().setDefaultRenderer(new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
                c.setBackground(new Color(7, 81, 203));
                c.setForeground(Color.WHITE);
                c.setFont(c.getFont().deriveFont(Font.BOLD));
                return c;
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        txtInvalidIDocumentation = new javax.swing.JLabel();
        txtInvalidId = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblTaxPayers = new javax.swing.JTable();
        btnBuscarAction = new javax.swing.JButton();
        txtInvalidId1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnCancelIncomeCalc = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(7, 81, 203));
        jLabel11.setText("Búsqueda por 9no Dígito");
        jPanel5.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 20, 430, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bg2 - copia.jpg"))); // NOI18N
        jPanel5.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(-200, 0, -1, 100));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtInvalidIDocumentation.setForeground(new java.awt.Color(255, 0, 0));
        jPanel4.add(txtInvalidIDocumentation, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 60, 250, 40));

        txtInvalidId.setForeground(new java.awt.Color(255, 0, 0));
        jPanel4.add(txtInvalidId, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 10, 250, 40));

        jTextField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField1FocusLost(evt);
            }
        });
        jPanel4.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 71, -1));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 255));
        jLabel4.setText("N*:");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 255));
        jLabel5.setText("Lista:");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        tblTaxPayers.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tblTaxPayers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Email", "Nombre", "Contraseña", "Documentacion", "Celular"
            }
        ));
        tblTaxPayers.setFocusable(false);
        tblTaxPayers.setRowHeight(25);
        tblTaxPayers.setSelectionBackground(new java.awt.Color(0, 255, 0));
        tblTaxPayers.setSelectionForeground(new java.awt.Color(0, 0, 153));
        tblTaxPayers.setShowHorizontalLines(true);
        tblTaxPayers.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tblTaxPayers);

        jPanel4.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 840, 180));

        btnBuscarAction.setBackground(new java.awt.Color(159, 246, 70));
        btnBuscarAction.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnBuscarAction.setForeground(new java.awt.Color(65, 109, 155));
        btnBuscarAction.setText("Buscar");
        btnBuscarAction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionActionPerformed(evt);
            }
        });
        jPanel4.add(btnBuscarAction, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, 148, -1));

        txtInvalidId1.setForeground(new java.awt.Color(204, 0, 0));
        jPanel4.add(txtInvalidId1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, 237, 23));

        jPanel3.setBackground(new java.awt.Color(7, 81, 203));

        btnCancelIncomeCalc.setBackground(new java.awt.Color(255, 101, 98));
        btnCancelIncomeCalc.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCancelIncomeCalc.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelIncomeCalc.setText("Regresar");
        btnCancelIncomeCalc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelIncomeCalcActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(361, 361, 361)
                .addComponent(btnCancelIncomeCalc, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnCancelIncomeCalc)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 910, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 313, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelIncomeCalcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelIncomeCalcActionPerformed
        goToMenu();
    }//GEN-LAST:event_btnCancelIncomeCalcActionPerformed

    private void btnBuscarActionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionActionPerformed
        gosearch9digit();
    }//GEN-LAST:event_btnBuscarActionActionPerformed

    private void jTextField1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusLost
        validate9noText();
    }//GEN-LAST:event_jTextField1FocusLost

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
            java.util.logging.Logger.getLogger(FrmSearch9Digit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmSearch9Digit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmSearch9Digit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmSearch9Digit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmSearch9Digit().setVisible(true);
            }
        });
    }
    
    private void goToMenu() {
        FrmMenu frmMenu = new FrmMenu();
        this.setVisible(false);
        frmMenu.setVisible(true);
    }
    private void gosearch9digit() {
    String ninthDigit = jTextField1.getText().trim();
    if (ninthDigit.length() == 1 && Character.isDigit(ninthDigit.charAt(0))) {
        DefaultTableModel model = (DefaultTableModel) tblTaxPayers.getModel(); 
        controller.loadTaxPayersByNinthDigit(ninthDigit, model); 
        customizeTableRendering(); 
    } else {
        JOptionPane.showMessageDialog(this, "Por favor, ingrese un solo dígito numérico.");
    }
}
    private void validate9noText() {
        String PATTERN = "^\\d$"; // Asegurarse de que es un solo dígito numérico
        Pattern patt = Pattern.compile(PATTERN);
        Matcher match = patt.matcher(jTextField1.getText().trim());

        if (!match.matches()) {
            txtInvalidId1.setText("Debe ingresar un solo dígito numérico");
        } else {
            txtInvalidId1.setText(null); 
        }
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarAction;
    private javax.swing.JButton btnCancelIncomeCalc;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable tblTaxPayers;
    private javax.swing.JLabel txtInvalidIDocumentation;
    private javax.swing.JLabel txtInvalidId;
    private javax.swing.JLabel txtInvalidId1;
    // End of variables declaration//GEN-END:variables
}
