/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Services.ServiceInterface;
import Table.Books;
import Table.Client;
import java.awt.Image;
import java.awt.print.Book;
import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.rmi.AccessException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

/*private String SerialNumber;
    private String BookName;
    private String AuthorName;
    private String PublicationYear;
    private  String PurchasingPrice;
    private String NumberOfAvailbleBook;*/
/**
 *
 * @author Eng Michael
 */
public class AdminAfterLogIn extends javax.swing.JFrame {

   String path="";
   byte [] photo;
    public AdminAfterLogIn() {
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

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        bname = new javax.swing.JTextField();
        pyear = new javax.swing.JTextField();
        pprice = new javax.swing.JTextField();
        aname = new javax.swing.JTextField();
        nbook = new javax.swing.JTextField();
        sn = new javax.swing.JFormattedTextField();
        save = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        pdate = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        imagePlacerholder = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        bname1 = new javax.swing.JTextField();
        pyear1 = new javax.swing.JTextField();
        pprice1 = new javax.swing.JTextField();
        aname1 = new javax.swing.JTextField();
        nbook1 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        sn1 = new javax.swing.JFormattedTextField();
        save1 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        DisplayBooks = new javax.swing.JTable();
        pdate1 = new javax.swing.JComboBox<>();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 786, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 472, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Home", jPanel1);

        jLabel1.setText("Serial Number");

        jLabel2.setText("Book Name:");

        jLabel3.setText("Author Name:");

        jLabel4.setText("Publication Year:");

        jLabel5.setText("PurchasingPrice:");

        jLabel6.setText("NumberOfAvailbleBook:");

        try {
            sn.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#### #### ####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        save.setText("Add Book");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });

        jLabel7.setText("Category:");

        jLabel16.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel16.setText("Add New Book");

        pdate.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Science", "Bussiness", "Technology", "Archeology" }));

        imagePlacerholder.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imagePlacerholder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imagePlacerholder, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
        );

        jButton2.setText("Add Book Image");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(48, 48, 48)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(pyear, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(aname, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bname, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(sn))))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(save, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(nbook, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pprice, javax.swing.GroupLayout.DEFAULT_SIZE, 267, Short.MAX_VALUE)
                            .addComponent(pdate, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(sn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(jLabel16)))
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(bname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(aname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(pyear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(pdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(pprice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(nbook, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addComponent(save))
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Add New Book", jPanel2);

        jLabel8.setText("Book Name:");

        jLabel9.setText("Author Name:");

        jLabel10.setText("Publication Year:");

        jLabel11.setText("PurchasingPrice:");

        jLabel12.setText("NumberOfAvailbleBook:");

        jLabel13.setText("Serial Number");

        try {
            sn1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#### #### ####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        save1.setText("Update");
        save1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save1ActionPerformed(evt);
            }
        });

        jLabel14.setText("Category");

        jButton1.setText("Remove");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        DisplayBooks.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "S/n", "Book Name", "Author", "Publication Year", "Category", "PurchasingPrice", "Number Of Books"
            }
        ));
        DisplayBooks.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                DisplayBooksAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        DisplayBooks.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DisplayBooksMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(DisplayBooks);

        pdate1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Science", "Bussiness", "Technology", "Archeology" }));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel12)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(nbook1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(pprice1))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(pdate1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel10))
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(sn1, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(19, 19, 19)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(aname1, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                                            .addComponent(bname1)))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(pyear1))))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(save1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 567, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(sn1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(bname1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(aname1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(pyear1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(pdate1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(pprice1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(nbook1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(save1)
                    .addComponent(jButton1))
                .addGap(109, 109, 109))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        jTabbedPane1.addTab("Delete Or Update", jPanel3);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "S/N", "Book Name", "Purchasing Price", "Customer Name"
            }
        ));
        jTable2.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jTable2AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane2.setViewportView(jTable2);

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel15.setText("List of Sold Book");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 766, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(207, 207, 207)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(59, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Soldbook", jPanel5);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        try {
            Registry rmi=LocateRegistry.getRegistry("localhost",1000);
            ServiceInterface sr=(ServiceInterface)rmi.lookup("RegisterBook");
             Books b=new Books();
       b.setAuthorName(aname.getText());
       b.setBookName(bname.getText());
       b.setNumberOfAvailbleBook(Integer.parseInt(nbook.getText()));
       b.setPublicationYear(pyear.getText());
       b.setPurchasingPrice(Integer.parseInt(pprice.getText()));
       b.setSerialNumber(sn.getText());
       b.setPublicationDate(pdate.getSelectedItem().toString());
        FileInputStream imputfile=new FileInputStream(path);
        byte[] img=new byte[imputfile.available()];
         imputfile.read(img);
       b.setProfile(img);   
       b.setProfile(photo);
       String result=sr.SaveBooks(b);
        JOptionPane.showMessageDialog(null, result);
        } catch (RemoteException ex) {
            Logger.getLogger(AdminAfterLogIn.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NotBoundException ex) {
            Logger.getLogger(AdminAfterLogIn.class.getName()).log(Level.SEVERE, null, ex);
        } catch (FileNotFoundException ex) { 
           Logger.getLogger(AdminAfterLogIn.class.getName()).log(Level.SEVERE, null, ex);
       } catch (IOException ex) {
           Logger.getLogger(AdminAfterLogIn.class.getName()).log(Level.SEVERE, null, ex);
       } 
      
    }//GEN-LAST:event_saveActionPerformed

    private void save1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save1ActionPerformed
    try {
            Registry rmi=LocateRegistry.getRegistry("localhost",1000);
            ServiceInterface sr=(ServiceInterface)rmi.lookup("UpdateBook");
             Books b=new Books();
       b.setAuthorName(aname1.getText());
       b.setBookName(bname1.getText());
       b.setNumberOfAvailbleBook(Integer.parseInt(nbook1.getText()));
       b.setPublicationYear(pyear1.getText());
       b.setPurchasingPrice(Integer.parseInt(pprice1.getText()));
       b.setSerialNumber(sn1.getText());
       b.setPublicationDate(pdate1.getSelectedItem().toString());
       String result=sr.UpdateBook(b);
        JOptionPane.showMessageDialog(null, result);
        } catch (RemoteException ex) {
            Logger.getLogger(AdminAfterLogIn.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NotBoundException ex) {
            Logger.getLogger(AdminAfterLogIn.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }//GEN-LAST:event_save1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     try {
            Registry rmi=LocateRegistry.getRegistry("localhost",1000);
            ServiceInterface sr=(ServiceInterface)rmi.lookup("DeleteBook");
             Books b=new Books();
       b.setAuthorName(aname1.getText());
       b.setBookName(bname1.getText());
       b.setNumberOfAvailbleBook(Integer.parseInt(nbook1.getText()));
       b.setPublicationYear(pyear1.getText());
       b.setPurchasingPrice(Integer.parseInt(pprice1.getText()));
       b.setSerialNumber(sn1.getText());
       b.setPublicationDate(pdate1.getSelectedItem().toString());
       String result=sr.DeleteBook(b);
        JOptionPane.showMessageDialog(null, result);
        } catch (RemoteException ex) {
            Logger.getLogger(AdminAfterLogIn.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NotBoundException ex) {
            Logger.getLogger(AdminAfterLogIn.class.getName()).log(Level.SEVERE, null, ex);
        }    // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void DisplayBooksAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_DisplayBooksAncestorAdded
     try {
            Registry rmi=LocateRegistry.getRegistry("localhost",1000);
            ServiceInterface sr=(ServiceInterface)rmi.lookup("DisplayAllAvailableBooks");
       
      List<Books> result=sr.DisplayBooks();
         DefaultTableModel md=(DefaultTableModel)DisplayBooks.getModel();
         md.setRowCount(0);
      for(Books i:result)
      {
          String [] data={i.getSerialNumber(),i.getBookName(),i.getPublicationYear(),i.getPublicationDate(),i.getPurchasingPrice()+"",i.getPurchasingPrice()+"",i.getNumberOfAvailbleBook()+""};
      md.addRow(data);
      }
        } catch (RemoteException ex) {
            JOptionPane.showMessageDialog(null, ex);
        } catch (NotBoundException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_DisplayBooksAncestorAdded

    private void jTable2AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jTable2AncestorAdded
     try {
            Registry rmi=LocateRegistry.getRegistry("localhost",1000);
            ServiceInterface sr=(ServiceInterface)rmi.lookup("DisplayPurchasedBooks");
      List<Client>ls=sr.DisplayPurchasedBooks();
      DefaultTableModel md=(DefaultTableModel)jTable2.getModel();
      md.setRowCount(0);
      for(Client t:ls)
      {
          String [] data={t.getBooks().get(0).getSerialNumber(),t.getBooks().get(0).getBookName(),t.getBooks().get(0).getAuthorName(),t.getBooks().get(0).getClients().get(0).getNames()};
          md.addRow(data);
      }
      }
         catch (RemoteException ex) {
            Logger.getLogger(AdminAfterLogIn.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NotBoundException ex) {
            Logger.getLogger(AdminAfterLogIn.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jTable2AncestorAdded

    private void DisplayBooksMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DisplayBooksMouseClicked
    DefaultTableModel md=(DefaultTableModel)DisplayBooks.getModel();
    
        sn1.setText(md.getValueAt(DisplayBooks.getSelectedRow(), 0).toString());
        bname1.setText(md.getValueAt(DisplayBooks.getSelectedRow(), 1).toString());
        aname1.setText(md.getValueAt(DisplayBooks.getSelectedRow(), 2).toString());
        pyear1.setText(md.getValueAt(DisplayBooks.getSelectedRow(), 3).toString());
        pprice1.setText(md.getValueAt(DisplayBooks.getSelectedRow(), 5).toString());
        nbook1.setText(md.getValueAt(DisplayBooks.getSelectedRow(), 6).toString());
    }//GEN-LAST:event_DisplayBooksMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
JFileChooser chooser = new JFileChooser();
    FileNameExtensionFilter filter = new FileNameExtensionFilter(
        "JPG & GIF Images", "jpg", "gif");
    chooser.setFileFilter(filter);
    int returnVal = chooser.showOpenDialog(imagePlacerholder);
    if(returnVal == JFileChooser.APPROVE_OPTION) {
        path=chooser.getSelectedFile().getAbsolutePath();    
    }
     FileInputStream imputfile;
       try {
           imputfile = new FileInputStream(path);
           photo=new byte[imputfile.available()];
            imputfile.read(photo);
            
             ImageIcon imgIcon=new ImageIcon(path);
          Image image=(imgIcon).getImage().getScaledInstance(this.imagePlacerholder.getWidth(), imagePlacerholder.getHeight(), Image.SCALE_SMOOTH);
          ImageIcon nimgicon=new ImageIcon(image);
          imagePlacerholder.setIcon(nimgicon);
       } catch (FileNotFoundException ex) {
           Logger.getLogger(AdminAfterLogIn.class.getName()).log(Level.SEVERE, null, ex);
       } catch (IOException ex) {
           Logger.getLogger(AdminAfterLogIn.class.getName()).log(Level.SEVERE, null, ex);
       }
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(AdminAfterLogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminAfterLogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminAfterLogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminAfterLogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminAfterLogIn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable DisplayBooks;
    private javax.swing.JTextField aname;
    private javax.swing.JTextField aname1;
    private javax.swing.JTextField bname;
    private javax.swing.JTextField bname1;
    private javax.swing.JLabel imagePlacerholder;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField nbook;
    private javax.swing.JTextField nbook1;
    private javax.swing.JComboBox<String> pdate;
    private javax.swing.JComboBox<String> pdate1;
    private javax.swing.JTextField pprice;
    private javax.swing.JTextField pprice1;
    private javax.swing.JTextField pyear;
    private javax.swing.JTextField pyear1;
    private javax.swing.JButton save;
    private javax.swing.JButton save1;
    private javax.swing.JFormattedTextField sn;
    private javax.swing.JFormattedTextField sn1;
    // End of variables declaration//GEN-END:variables
}
