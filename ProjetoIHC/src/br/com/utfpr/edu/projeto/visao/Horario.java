/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.utfpr.edu.projeto.visao;

import com.alee.laf.WebLookAndFeel;
import com.alee.laf.table.renderers.WebTableCellRenderer;
import com.alee.utils.swing.WebDefaultCellEditor;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.TableColumn;

/**
 *
 * @author Tiago Luiz Gomes
 */
public class Horario extends javax.swing.JFrame {

    /**
     * Creates new form Horario
     */
    public Horario() {
        initComponents();
        criaTabelas();
    }

    JPanel painel_6ano = new JPanel();
    JTable tabela_6ano = new JTable();
    JScrollPane jScrollPane1 = new JScrollPane();

    private void criaTabelas() {

        painel_6ano.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "6º ANO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        tabela_6ano.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{
                    {null, null, null, null, null},
                    {null, null, null, null, null},
                    {null, null, null, null, null},
                    {null, null, null, null, null},
                    {null, null, null, null, null}
                },
                new String[]{
                    "SEGUNDA-FEIRA", "TERÇA-FEIRA", "QUARTA-FEIRA", "QUINTA-FEIRA", "SEXTA-FEIRA"
                }
        ));
        jScrollPane1.setViewportView(tabela_6ano);

        javax.swing.GroupLayout painel_6anoLayout = new javax.swing.GroupLayout(painel_6ano);
        painel_6ano.setLayout(painel_6anoLayout);
        painel_6anoLayout.setHorizontalGroup(
                painel_6anoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(painel_6anoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 743, Short.MAX_VALUE)
                        .addContainerGap())
        );
        painel_6anoLayout.setVerticalGroup(
                painel_6anoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(painel_6anoLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(painel_6ano, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(painel_6ano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(255, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Ensino Fundamental", jScrollPane1);
        editarHorario();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 795, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 398, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Ensino Fundamental", jPanel1);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("Horário 2015");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane1)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        SwingUtilities.invokeLater(() -> {
            WebLookAndFeel.install();
            try {
                UIManager.setLookAndFeel(new WebLookAndFeel());
                //UIManager.setLookAndFeel("com.alee.laf.WebLookAndFeel");
                // UIManager.setLookAndFeel ( WebLookAndFeel.class.getCanonicalName () );
            } catch (UnsupportedLookAndFeelException ex) {
                Logger.getLogger(ServidorCadastro.class.getName()).log(Level.SEVERE, null, ex);
            }
            new Horario().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables

    public void editarHorario() {
        // Custom column
        TableColumn coluna1 = this.tabela_6ano.getColumnModel().getColumn(0);
        TableColumn coluna2 = this.tabela_6ano.getColumnModel().getColumn(1);
        TableColumn coluna3 = this.tabela_6ano.getColumnModel().getColumn(2);
        TableColumn coluna4 = this.tabela_6ano.getColumnModel().getColumn(3);
        TableColumn coluna5 = this.tabela_6ano.getColumnModel().getColumn(4);

        // Custom renderer
        WebTableCellRenderer renderer = new WebTableCellRenderer();
        renderer.setToolTipText("Duplo clique para inserir a Disciplina");
        coluna1.setCellRenderer(renderer);
        coluna2.setCellRenderer(renderer);
        coluna3.setCellRenderer(renderer);
        coluna4.setCellRenderer(renderer);
        coluna5.setCellRenderer(renderer);

        // Custom editor
        JComboBox comboBox = new JComboBox();
        comboBox.addItem("Português (Patricia)");
        comboBox.addItem("Matematica (Augusta)");
        comboBox.addItem("Geografia (Cristina)");
        comboBox.addItem("Ciências (Everaldo)");
        comboBox.addItem("História (Solange)");
        comboBox.addItem("Biologia (Augusta)");
        coluna1.setCellEditor(new WebDefaultCellEditor(comboBox));
        coluna2.setCellEditor(new WebDefaultCellEditor(comboBox));
        coluna3.setCellEditor(new WebDefaultCellEditor(comboBox));
        coluna4.setCellEditor(new WebDefaultCellEditor(comboBox));
        coluna5.setCellEditor(new WebDefaultCellEditor(comboBox));
    }

}
