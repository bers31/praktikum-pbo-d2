/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package praktikum.pkg11.project.pkg4;
import java.util.*;
import javax.swing.DefaultListModel;
/**
 *
 * @author ACER Aspire5
 */
public class GUI extends javax.swing.JFrame {

    DefaultListModel<String> listModel;
    DefaultListModel<String> setListModel = new DefaultListModel<>();
    DefaultListModel<String> mapListModel = new DefaultListModel<>();
    List<String> listItems = new ArrayList<>();
    Set<String> setItems = new HashSet<>();
    Map<String, String> mapItems = new HashMap<>();
    String[] datas = {"buku", "meja", "kursi", "tas", "ac"};
    String[] mapDatas = {"1:buku", "2:meja", "3:kursi", "4:tas", "5:ac"};
    Boolean saveToListPressed = false;
    Boolean saveToSetPressed = false;
    Boolean saveToMapPressed = false;
    
    /**
     * Creates new form GUI
     */
    public GUI() {
        initComponents();
        initializeListTab();
        initializeSetTab();
        initializeMapTab();
    }
    
    private void initializeListTab() {
        listModel = new DefaultListModel<>();
        jListItem.setModel(listModel);
        for (String data : datas) {
            listModel.addElement(data);
            listItems.add(data);
        }
    }

    private void initializeSetTab() {
        for (String data : datas) {
            setItems.add(data);
            setListModel.addElement(data);
        }
    }

    private void initializeMapTab() {
        for (String data : mapDatas) {
            String[] parts = data.split(":");
            String key = parts[0];
            String value = parts[1];
            mapItems.put(key, value);
            mapListModel.addElement(key + ": " + value);
        }
    }

    private void updateJumDataTersimpan() {
        // untuk update jumlah data
        if (saveToListPressed) {
            jLabel2.setText("Data tersimpan: " + listItems.size());
        }
        if (saveToSetPressed) {
            jLabel3.setText("Data tersimpan: " + setItems.size());
        }
        if (saveToMapPressed) {
            jLabel4.setText("Data tersimpan: " + mapItems.size());
        }
    }

    private void addItem(String namaItem) {
        listModel.addElement(namaItem);
        listItems.add(namaItem);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jListItem = new javax.swing.JList<>();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jListItem.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jListItem);

        jButton1.setText("Clear All");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Item Name :");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jButton2.setText("Add");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Update");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Delete");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Save to List ->");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("<- Insert to List");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("Save to Set ->");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("<- Insert to Set");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setText("Save to Map ->");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setText("<- Insert to Map");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jLabel2.setText("Data tersimpan");

        jLabel3.setText("Data tersimpan");

        jLabel4.setText("Data Tersimpan");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton6)
                            .addComponent(jButton8)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton4))
                            .addComponent(jButton10)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jButton9)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jButton5)
                                    .addGap(21, 21, 21)
                                    .addComponent(jLabel2))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jButton7)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel3))))
                        .addContainerGap(39, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton5)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton7)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton8)
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton9)
                            .addComponent(jLabel4))
                        .addGap(4, 4, 4)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(48, 48, 48))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // Save data from JList to list
        if (!listItems.isEmpty()){
            listItems.clear();
        }
        for (int i = 0; i < listModel.getSize(); i++){
            listItems.add(listModel.getElementAt(i));
        }
        saveToListPressed = true;
        saveToSetPressed = false;
        saveToMapPressed = false;
        updateJumDataTersimpan();
        saveToListPressed = false;
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // Membersihkan semua data yang disimpan
        listModel.clear();
        listItems.clear();
        setListModel.clear();
        setItems.clear();
        mapListModel.clear();
        mapItems.clear();
        updateJumDataTersimpan();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
                                 
        // Dapatkan nama item dari TextField
        String itemName = jTextField1.getText().trim();

        if (!itemName.isEmpty()) {
            // Panggil fungsi addItem untuk menambahkan item ke list
            addItem(itemName);

            // Clear TextField setelah penambahan
            jTextField1.setText("");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // Mendapatkan nama item baru dari TextField
        String newItemName = jTextField1.getText().trim();

        // Mendapatkan indeks yang dipilih dalam list
        int selectedIndex = jListItem.getSelectedIndex();

        if (!newItemName.isEmpty() && selectedIndex != -1) {
            // Memperbarui item dalam list
            String oldItemName = listModel.getElementAt(selectedIndex);
            listModel.setElementAt(newItemName, selectedIndex);
            listItems.set(selectedIndex, newItemName);

            // Memperbarui item dalam set
            if (setItems.remove(oldItemName)) {
                setItems.add(newItemName);
                setListModel.removeElement(oldItemName);
                setListModel.addElement(newItemName);
            }

            // Memperbarui item dalam map
            for (Map.Entry<String, String> entry : mapItems.entrySet()) {
                if (entry.getValue().equals(oldItemName)) {
                    entry.setValue(newItemName);
                    int mapIndex = mapListModel.indexOf(entry.getKey() + ": " + oldItemName);
                    mapListModel.setElementAt(entry.getKey() + ": " + newItemName, mapIndex);
                    break;
                }
            }

            // Mengosongkan TextField setelah pembaruan
            jTextField1.setText("");

            // Memperbarui label yang menunjukkan jumlah item yang disimpan
            updateJumDataTersimpan();
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // Mendapatkan indeks yang dipilih dalam list
        int selectedIndex = jListItem.getSelectedIndex();

        if (selectedIndex != -1) {
            // Menghapus item dari list
            String removedItem = listModel.getElementAt(selectedIndex);
            listModel.removeElementAt(selectedIndex);
            listItems.remove(selectedIndex);

            // Menghapus item dari set
            if (setItems.remove(removedItem)) {
                setListModel.removeElement(removedItem);
            }

            // Menghapus item dari map
            for (Iterator<Map.Entry<String, String>> iterator = mapItems.entrySet().iterator(); iterator.hasNext();) {
                Map.Entry<String, String> entry = iterator.next();
                if (entry.getValue().equals(removedItem)) {
                    iterator.remove();
                    mapListModel.removeElement(entry.getKey() + ": " + removedItem);
                    break;
                }
            }

            // Mengosongkan TextField setelah penghapusan
            jTextField1.setText("");

            // Memperbarui label yang menunjukkan jumlah item yang disimpan
            updateJumDataTersimpan();
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // Menyisipkan item dari TextField ke dalam JList
        String itemName = jTextField1.getText().trim();
        if (!itemName.isEmpty()) {
            listModel.addElement(itemName);
            listItems.add(itemName);
            jTextField1.setText(""); // Mengosongkan TextField setelah penyisipan
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        saveToListPressed = false;
        saveToSetPressed = true;
        saveToMapPressed = false;
        updateJumDataTersimpan();
        saveToSetPressed = false; // Reset status saveToSetPressed setelah selesai
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // Memasukkan item dari TextField ke dalam Set
        String itemName = jTextField1.getText().trim();
        if (!itemName.isEmpty()) {
            if (setItems.add(itemName)) {
                setListModel.addElement(itemName);
            }
            jTextField1.setText(""); // Mengosongkan TextField setelah penyisipan
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        saveToListPressed = false;
        saveToSetPressed = false;
        saveToMapPressed = true;
        updateJumDataTersimpan();
        saveToMapPressed = false; // Reset status saveToSetPressed setelah selesai
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // Memasukkan item dari TextField ke dalam Map
        String itemName = jTextField1.getText().trim();
        if (!itemName.isEmpty()) {
            // Format itemName harus "kunci:nilai"
            String[] parts = itemName.split(":");
            if (parts.length == 2) {
                String key = parts[0].trim();
                String value = parts[1].trim();
                mapItems.put(key, value);
                mapListModel.addElement(key + ": " + value);
                jTextField1.setText(""); // Mengosongkan TextField setelah penyisipan
            } 
        }
    }//GEN-LAST:event_jButton10ActionPerformed

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
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JList<String> jListItem;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
