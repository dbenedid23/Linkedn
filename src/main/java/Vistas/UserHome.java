/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vistas;

import Services.UserService;
import java.util.List;
import javax.swing.DefaultListModel;
import model.*;



/**
 *
 * @author dev
 */
public class UserHome extends javax.swing.JFrame {
    String nombre;
    /**
     * Creates new form UserHome
     */
    public UserHome(String nombre) {
        this.nombre = nombre;
        initComponents();
        
        DefaultListModel modeloLista = new DefaultListModel();
        DefaultListModel modeloListaLab = new DefaultListModel();
        DefaultListModel modeloListaAca = new DefaultListModel();
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Perfil"));
        // Obtén la lista de skills del usuario desde la base de datos
       // String name = "pocholo";
       
        UserService us = new UserService();
        
        List<Skill> userSkills = us.getSkills(nombre);
        modeloLista.addAll(userSkills);
        jListSkills.setModel(modeloLista);
        
        List<LaboralExperience> lab = us.getLaboral(nombre);
        modeloListaLab.addAll(lab);
        jListLabs.setModel(modeloListaLab);
        
        List<AcademicInfo> aca = us.getInfo(nombre);
        modeloListaAca.addAll(aca);
        jListAcas.setModel(modeloListaAca);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabelSkill = new javax.swing.JLabel();
        jButtonAddSkills = new javax.swing.JButton();
        jLabelLabExp = new javax.swing.JLabel();
        jButtonAddLabs = new javax.swing.JButton();
        jLabelAcademic = new javax.swing.JLabel();
        jButtonAddAca = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListSkills = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jListAcas = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        jListLabs = new javax.swing.JList<>();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButtonShowJobs = new javax.swing.JButton();
        jButtonShowCompanies = new javax.swing.JButton();
        jButtonJobApplied = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelSkill.setText("Skills");

        jButtonAddSkills.setText("+");
        jButtonAddSkills.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddSkillsActionPerformed(evt);
            }
        });

        jLabelLabExp.setText("Laboral Experiences");

        jButtonAddLabs.setText("+");
        jButtonAddLabs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddLabsActionPerformed(evt);
            }
        });

        jLabelAcademic.setText("Academic Info");

        jButtonAddAca.setText("+");
        jButtonAddAca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddAcaActionPerformed(evt);
            }
        });

        jListSkills.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jListSkills);

        jListAcas.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jListAcas);

        jListLabs.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(jListLabs);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelSkill)
                                    .addComponent(jLabelAcademic))
                                .addGap(0, 370, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonAddSkills, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonAddAca, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonAddLabs, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabelLabExp)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelSkill)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jButtonAddSkills))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabelLabExp)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelAcademic))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonAddLabs)
                        .addGap(60, 60, 60)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(33, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jButtonAddAca)
                        .addGap(62, 62, 62))))
        );

        jLabel1.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        jLabel1.setText("Home");

        jButtonShowJobs.setText("JobOffers");
        jButtonShowJobs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonShowJobsActionPerformed(evt);
            }
        });

        jButtonShowCompanies.setText("Companies");
        jButtonShowCompanies.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonShowCompaniesActionPerformed(evt);
            }
        });

        jButtonJobApplied.setText("JobOffers applied");
        jButtonJobApplied.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonJobAppliedActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon("/home/dev/NetBeansProjects/punieta/src/main/java/Imagenes/business_application_addmale_useradd_insert_add_user_client_2312.png")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonShowCompanies)
                            .addComponent(jButtonJobApplied)
                            .addComponent(jButtonShowJobs)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jButtonShowJobs)
                .addGap(37, 37, 37)
                .addComponent(jButtonShowCompanies)
                .addGap(37, 37, 37)
                .addComponent(jButtonJobApplied)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(91, 91, 91)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonShowJobsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonShowJobsActionPerformed
        // TODO add your handling code here:
        ListJobOffers ljo = new ListJobOffers();
        
        ljo.setVisible(true);
    }//GEN-LAST:event_jButtonShowJobsActionPerformed

    private void jButtonAddSkillsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddSkillsActionPerformed
        // TODO add your handling code here:
        AddSkillUsers asu = new AddSkillUsers(nombre);
        //dispose();
        asu.setVisible(true);
    }//GEN-LAST:event_jButtonAddSkillsActionPerformed

    private void jButtonAddAcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddAcaActionPerformed
        // TODO add your handling code here:
        AddAcademicUsers aau = new AddAcademicUsers(nombre);
        
        aau.setVisible(true);
    }//GEN-LAST:event_jButtonAddAcaActionPerformed

    private void jButtonAddLabsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddLabsActionPerformed
        // TODO add your handling code here:
        AddLabExperienceUsers ale = new AddLabExperienceUsers(nombre);
        
        ale.setVisible(true);
    }//GEN-LAST:event_jButtonAddLabsActionPerformed

    private void jButtonShowCompaniesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonShowCompaniesActionPerformed
        // TODO add your handling code here:
        ListCompanies lc = new ListCompanies();
        
        lc.setVisible(true);
    }//GEN-LAST:event_jButtonShowCompaniesActionPerformed

    private void jButtonJobAppliedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonJobAppliedActionPerformed
        // TODO add your handling code here:
        ListMyApplies lma = new ListMyApplies();
        
        lma.setVisible(true);
    }//GEN-LAST:event_jButtonJobAppliedActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(UserHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(UserHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(UserHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(UserHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new UserHome().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAddAca;
    private javax.swing.JButton jButtonAddLabs;
    private javax.swing.JButton jButtonAddSkills;
    private javax.swing.JButton jButtonJobApplied;
    private javax.swing.JButton jButtonShowCompanies;
    private javax.swing.JButton jButtonShowJobs;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelAcademic;
    private javax.swing.JLabel jLabelLabExp;
    private javax.swing.JLabel jLabelSkill;
    private javax.swing.JList<String> jListAcas;
    private javax.swing.JList<String> jListLabs;
    private javax.swing.JList<String> jListSkills;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}
