/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;
import connect.Connect;
import controler.ActEvt;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import model.Student;
import model.StudentList;
/**
 *
 * @author vantu
 */
public class View extends javax.swing.JFrame {
    int cntclck = 0;
     connect.Connect con = new Connect();
        ActEvt act = new ActEvt(this);
        model.StudentList list = new StudentList();
    /**
     * Creates new form View
     */
    public View() {
        initComponents();
        Refreshtable();
        init();
        DefaultTxt();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        concho = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        txtId = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtAge = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Id", "Name", "Age", "Address"
            }
        ));
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        concho.setViewportView(table);

        txtId.setText("jTextField1");
        txtId.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtIdMouseClicked(evt);
            }
        });

        txtName.setText("jTextField1");
        txtName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtNameMouseClicked(evt);
            }
        });

        txtAge.setText("jTextField1");
        txtAge.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtAgeMouseClicked(evt);
            }
        });

        txtAddress.setText("jTextField1");
        txtAddress.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtAddressMouseClicked(evt);
            }
        });

        btnAdd.setText("ADD");

        btnDelete.setText("DELETE");

        btnUpdate.setText("UPDATE");

        btnClear.setText("CLEAR");

        btnLogout.setText("LOGOUT");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(concho, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtId, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                            .addComponent(txtName)
                            .addComponent(txtAge)
                            .addComponent(txtAddress))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnUpdate)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(btnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGap(35, 35, 35)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnDelete)
                                    .addComponent(btnClear, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(btnLogout, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 28, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(concho, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdd)
                    .addComponent(btnDelete))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdate)
                    .addComponent(btnClear))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(btnLogout)))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtIdMouseClicked
        // TODO add your handling code here:
        if (cntclck == 0){
            txtId.setText("");
        }
    }//GEN-LAST:event_txtIdMouseClicked

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        // TODO add your handling code here:
        int row = table.getSelectedRow();
        txtId.setText(table.getValueAt(row,0).toString());
        txtName.setText( table.getValueAt(row,1).toString());
        txtAge.setText( table.getValueAt(row,2).toString());
        txtAddress.setText( table.getValueAt(row,3).toString());
        cntclck++;
    }//GEN-LAST:event_tableMouseClicked

    private void txtNameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNameMouseClicked
        // TODO add your handling code here:
        if (cntclck == 0){
            txtName.setText("");
        }
    }//GEN-LAST:event_txtNameMouseClicked

    private void txtAgeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtAgeMouseClicked
        // TODO add your handling code here:
        if (cntclck == 0){
            txtAge.setText("");
        }
    }//GEN-LAST:event_txtAgeMouseClicked

    private void txtAddressMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtAddressMouseClicked
        // TODO add your handling code here:
        if (cntclck == 0){
            txtAddress.setText("");
        }
    }//GEN-LAST:event_txtAddressMouseClicked

    /**
     * @param args the command line arguments
     */
    public void init(){
        btnAdd.addActionListener(act);
        btnClear.addActionListener(act);
        btnDelete.addActionListener(act);
        btnUpdate.addActionListener(act);
        txtId.addActionListener(act);
        btnLogout.addActionListener(act);
    }
//    public void Refreshtable(){
//        ResultSetMetaData rsmd;
//        int columns;
//        DefaultTableModel model = (DefaultTableModel) table.getModel();
//        model.setRowCount(0);
//        String cmdSQL = "SELECT * FROM thongtinsv";
//        try {
//            ResultSet rs = con.GetSelect(cmdSQL);
//            rsmd = rs.getMetaData();
//            columns = rsmd.getColumnCount();
//        while(rs.next()){
//            Object[] fila = new Object[columns];
//            for(int i = 0;i<columns;i++){
//                fila[i] = rs.getObject(i+1);
//            }
//            model.addRow(fila);
//        }
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(null, e.toString());
//        }
//    }
    
    public void Refreshtable(){
        list.readDb();
        int  n = list.getStudentList().size();
        ArrayList<Student> listu = list.getStudentList();
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0);
        for(int i = 0;i<n;i++){
            Object[] fila = new Object[4];
                fila[0] = listu.get(i).getId();
                fila[1] = listu.get(i).getName();
                fila[2] = listu.get(i).getAge();
                fila[3] = listu.get(i).getAddress();
                System.out.println(fila[0]);
                System.out.println(listu.get(i).getAddress());
            model.addRow(fila);
        }
        listu.removeAll(listu);
            
    }
    public void Addtable(){
        String id = txtId.getText();
        String name = txtName.getText();
        int age = Integer.parseInt(txtAge.getText());
        String address = txtAddress.getText();
        String cmdSQL = "Insert into thongtinsv (Id,Name,Age,Address) values (?,?,?,?)";
        try {
            PreparedStatement prestmt = con.Fix(cmdSQL);
        prestmt.setString(1,id);
        prestmt.setString(2,name);
        prestmt.setInt(3,age);
        prestmt.setString(4,address);
        prestmt.executeUpdate();
      Refreshtable();
      DefaultTxt();
        prestmt.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }
    public void DeleteTable(){
         String id = txtId.getText();
        String cmdSQL = "Delete from thongtinsv WHERE Id = '" + id+"'";
        try {
            PreparedStatement prestmt = con.Fix(cmdSQL);
            prestmt.executeUpdate();
            prestmt.close();
         Refreshtable();
         DefaultTxt();
        } catch (Exception e) {
        }
    }
    public void UpdateTable(){
        String id = txtId.getText();
        String name = txtName.getText();
        int age = Integer.parseInt(txtAge.getText());
        String address = txtAddress.getText();
        String cmdSQL = "UPDATE thongtinsv SET Name = '" + name + "', Age = '" + age + "', Address = '" + address + "' WHERE Id = '" + id +"'";
        try {
            PreparedStatement prestmt = con.Fix(cmdSQL);
            prestmt.executeUpdate();
            prestmt.close();
            Refreshtable();
            DefaultTxt();
        } catch (Exception e) {
        }
    }
    public void cleartxt(){
        txtId.setText("");
        txtName.setText("");
        txtAge.setText( "");
        txtAddress.setText("");
    }
    public void DefaultTxt(){
        txtId.setText("Id");
        txtName.setText("Name");
        txtAge.setText( "Age");
        txtAddress.setText("Address");
        cntclck = 0;
}
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
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new View().setVisible(true);
            }
        });
    }
    public void logout(){
        new Login.LoginForm().setVisible(true);
        this.setVisible(false);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JScrollPane concho;
    private javax.swing.JTable table;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}