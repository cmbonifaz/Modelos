package ece.edu.espe.cyberplaneta.view;

import com.itextpdf.text.DocumentException;
import ec.edu.espe.cyberplaneta.controller.C_ExcelReportGenerator;
import ec.edu.espe.cyberplaneta.controller.C_IncomeHandle;
import ec.edu.espe.cyberplaneta.controller.C_PdfReportGenerator;
import java.io.IOException;
import javax.swing.table.DefaultTableModel;
import utils.MongoDBUtil;
import javax.swing.JOptionPane;
import utils.ChartAndTableUtils;


/**
 *
 * @author Saray Cañarte & Christian Bonifaz, Code Creators, DCCO-ESPE
 */
public class FrmIncomes extends javax.swing.JFrame {

    private final ChartAndTableUtils tableUtils = new ChartAndTableUtils();
    private final C_IncomeHandle controller = new C_IncomeHandle();
    

    /**
     * Creates new form FrmIncomes
     */
    public FrmIncomes() {
        initComponents();
        loadIncomes();
        tableUtils.customizeTableHeader(tblTotalIncomes);
    }

    private void loadIncomes() {
        controller.loadDataToTable(tblTotalIncomes);
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
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblTotalIncomes = new javax.swing.JTable();
        cmbNumericalOrder = new javax.swing.JComboBox<>();
        cmbAlphabeticalOrder = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        btnGenerateReportExcel = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        btnGoBackToMain = new javax.swing.JButton();
        btnGenerateReportPdf = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnBuscarActionPerformed = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        tblTotalIncomes.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tblTotalIncomes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nombre del Proceso", "Número de Documentación", "Precio Base ($)", "Impuesto (%)", "Total ($)"
            }
        ));
        tblTotalIncomes.setFocusable(false);
        tblTotalIncomes.setRowHeight(25);
        tblTotalIncomes.setSelectionBackground(new java.awt.Color(0, 255, 0));
        tblTotalIncomes.setSelectionForeground(new java.awt.Color(0, 0, 153));
        tblTotalIncomes.setShowHorizontalLines(true);
        tblTotalIncomes.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tblTotalIncomes);

        cmbNumericalOrder.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Orden Numérico", "Mayor a Menor", "Menor a Mayor" }));
        cmbNumericalOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbNumericalOrderActionPerformed(evt);
            }
        });

        cmbAlphabeticalOrder.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Orden Alfabético", "A-Z", "Z-A" }));
        cmbAlphabeticalOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbAlphabeticalOrderActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(65, 109, 155));
        jLabel2.setText("Ordenar por:");

        btnGenerateReportExcel.setBackground(new java.awt.Color(7, 81, 203));
        btnGenerateReportExcel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnGenerateReportExcel.setForeground(new java.awt.Color(255, 255, 255));
        btnGenerateReportExcel.setText("XML");
        btnGenerateReportExcel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerateReportExcelActionPerformed(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(7, 81, 203));

        btnGoBackToMain.setBackground(new java.awt.Color(255, 101, 98));
        btnGoBackToMain.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnGoBackToMain.setForeground(new java.awt.Color(255, 255, 255));
        btnGoBackToMain.setText("Regresar");
        btnGoBackToMain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGoBackToMainActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnGoBackToMain, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(368, 368, 368))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(btnGoBackToMain)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        btnGenerateReportPdf.setBackground(new java.awt.Color(159, 246, 70));
        btnGenerateReportPdf.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnGenerateReportPdf.setForeground(new java.awt.Color(7, 81, 203));
        btnGenerateReportPdf.setText("PDF");
        btnGenerateReportPdf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerateReportPdfActionPerformed(evt);
            }
        });

        btnBorrar.setBackground(new java.awt.Color(159, 246, 70));
        btnBorrar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnBorrar.setForeground(new java.awt.Color(7, 81, 203));
        btnBorrar.setText("Borrar");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });

        btnEditar.setBackground(new java.awt.Color(159, 246, 70));
        btnEditar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnEditar.setForeground(new java.awt.Color(7, 81, 203));
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnBuscarActionPerformed.setBackground(new java.awt.Color(159, 246, 70));
        btnBuscarActionPerformed.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnBuscarActionPerformed.setForeground(new java.awt.Color(7, 81, 203));
        btnBuscarActionPerformed.setText("Buscar");
        btnBuscarActionPerformed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformedActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap(10, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(cmbAlphabeticalOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmbNumericalOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                                .addComponent(btnBuscarActionPerformed)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEditar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnBorrar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnGenerateReportPdf, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnGenerateReportExcel, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 877, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2)
                                .addComponent(cmbAlphabeticalOrder)
                                .addComponent(cmbNumericalOrder))
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnGenerateReportPdf, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnGenerateReportExcel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(15, 15, 15))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnBuscarActionPerformed, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEditar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnBorrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-5, 104, 920, 400));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(7, 81, 203));
        jLabel1.setText("Ingresos de Cyber Planeta");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 20, 510, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bg2 - copia.jpg"))); // NOI18N
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(-200, 0, -1, 100));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-4, -4, 910, 100));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 910, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGoBackToMainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGoBackToMainActionPerformed
        utils.Validation.goToMenu(this);
    }//GEN-LAST:event_btnGoBackToMainActionPerformed

    private void btnGenerateReportExcelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerateReportExcelActionPerformed
        C_ExcelReportGenerator excelReport = new C_ExcelReportGenerator();
        try {
            excelReport.exportToExcel(tblTotalIncomes);
        } catch (IOException ex) {
            System.err.println("Error: " + ex.getMessage());
        }
    }//GEN-LAST:event_btnGenerateReportExcelActionPerformed

    private void cmbAlphabeticalOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbAlphabeticalOrderActionPerformed
        DefaultTableModel model = (DefaultTableModel) tblTotalIncomes.getModel();
        String selectedOrder = (String) cmbAlphabeticalOrder.getSelectedItem();
        tableUtils.sortTablebyAlphabeticalOrder(model, 1, selectedOrder);

    }//GEN-LAST:event_cmbAlphabeticalOrderActionPerformed

    private void cmbNumericalOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbNumericalOrderActionPerformed
        DefaultTableModel model = (DefaultTableModel) tblTotalIncomes.getModel();
        String selectedOrder = (String) cmbNumericalOrder.getSelectedItem();
        tableUtils.sortTableByNumericalOrder(model, 5, selectedOrder);

    }//GEN-LAST:event_cmbNumericalOrderActionPerformed

    private void btnGenerateReportPdfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerateReportPdfActionPerformed
        C_PdfReportGenerator pdfReport = new C_PdfReportGenerator();
        try {
            pdfReport.exportTableToPDF(tblTotalIncomes);
        } catch (IOException | DocumentException ex) {
            System.err.println("Error: " + ex.getMessage());
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btnGenerateReportPdfActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        controller.deleteSelectedRow(tblTotalIncomes);
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        int selectedRow = tblTotalIncomes.getSelectedRow();

        if (selectedRow >= 0) {
            int processId = (int) tblTotalIncomes.getValueAt(selectedRow, 0);
            String name = (String) tblTotalIncomes.getValueAt(selectedRow, 1);
            int numberOfDocumentation = (int) tblTotalIncomes.getValueAt(selectedRow, 2);
            float priceBase = Float.parseFloat(tblTotalIncomes.getValueAt(selectedRow, 3).toString().replace(",", "."));
            float taxRate = Float.parseFloat(tblTotalIncomes.getValueAt(selectedRow, 4).toString().replace(",", "."));
            float totalPrice = Float.parseFloat(tblTotalIncomes.getValueAt(selectedRow, 5).toString().replace(",", "."));

            String newName = JOptionPane.showInputDialog(this, "Editar nombre:", name);
            String newNumberOfDocumentation = JOptionPane.showInputDialog(this, "Editar número de documentación:", numberOfDocumentation);
            String newPriceBase = JOptionPane.showInputDialog(this, "Editar precio base:", priceBase);
            String newTaxRate = JOptionPane.showInputDialog(this, "Editar tasa de impuesto:", taxRate);

            if (newName != null && newNumberOfDocumentation != null && newPriceBase != null && newTaxRate != null) {
                try {
                    numberOfDocumentation = Integer.parseInt(newNumberOfDocumentation);
                    priceBase = Float.parseFloat(newPriceBase.replace(",", "."));
                    taxRate = Float.parseFloat(newTaxRate.replace(",", "."));

                    DefaultTableModel model = (DefaultTableModel) tblTotalIncomes.getModel();
                    model.setValueAt(newName, selectedRow, 1);
                    model.setValueAt(numberOfDocumentation, selectedRow, 2);
                    model.setValueAt(String.format("%.2f", priceBase), selectedRow, 3);
                    model.setValueAt(String.format("%.2f", taxRate), selectedRow, 4);

                    float newTotalPrice = priceBase + (priceBase * taxRate / 100);
                    model.setValueAt(String.format("%.2f", newTotalPrice), selectedRow, 5);

                    boolean success = MongoDBUtil.updateIncome(processId, newName, numberOfDocumentation, priceBase, taxRate, newTotalPrice);
                    if (success) {
                        JOptionPane.showMessageDialog(this, "Cambios guardados exitosamente.");
                    } else {
                        JOptionPane.showMessageDialog(this, "Error al guardar los cambios.");
                    }
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(this, "Por favor, ingrese valores válidos.");
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Por favor, seleccione una fila para editar.");
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnBuscarActionPerformedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformedActionPerformed
        String searchTerm = JOptionPane.showInputDialog(this, "Ingrese el término de búsqueda:");
        if (searchTerm != null && !searchTerm.trim().isEmpty()) {
            controller.searchInIncomeTable(tblTotalIncomes, searchTerm);
        }
    }//GEN-LAST:event_btnBuscarActionPerformedActionPerformed

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
            java.util.logging.Logger.getLogger(FrmIncomes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmIncomes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmIncomes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmIncomes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmIncomes().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnBuscarActionPerformed;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnGenerateReportExcel;
    private javax.swing.JButton btnGenerateReportPdf;
    private javax.swing.JButton btnGoBackToMain;
    private javax.swing.JComboBox<String> cmbAlphabeticalOrder;
    private javax.swing.JComboBox<String> cmbNumericalOrder;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblTotalIncomes;
    // End of variables declaration//GEN-END:variables
}
