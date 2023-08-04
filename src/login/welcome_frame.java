/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package login;

import controll.Order_Opreations;
import controll.welcome_frame_opreations;
import Modeling.Order_Model;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.sql.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author marke
 */
public class welcome_frame extends javax.swing.JFrame {

    /**
     * Creates new form welcome_frame
     */
    public welcome_frame() {
       
        initComponents();
        dispaly_icon();
       
    }
    public static double total=0;
    int count=100;
    
    private void Balance (){
        double Total = Double.parseDouble(jTextFieldTotal.getText());
        double pay =Float.parseFloat(jTextFieldPay.getText());
      
        float bal=welcome_frame_opreations.get_balance(pay, Total);
        
        if (bal==-1)
        {
              JOptionPane.showMessageDialog(null, "pay must be more than Total  ");
               //handel error by refresh the page
  
        }
        else{     
        jTextFieldBalance.setText(String.valueOf(bal));
        }
    }
    private void Bill(){
            try{
                   String tota =jTextFieldTotal.getText();
                   String pay =jTextFieldPay.getText();
                   String Ballance =jTextFieldBalance.getText();
                   DefaultTableModel model = new DefaultTableModel();
                   model = (DefaultTableModel)jTable1.getModel();
                   
                   jTextAreaBill.setText(jTextAreaBill.getText()+"***********************************************\n");
                   jTextAreaBill.setText(jTextAreaBill.getText()+"                    BILL                       \n");
                   jTextAreaBill.setText(jTextAreaBill.getText()+"***********************************************\n\n");
                   jTextAreaBill.setText(jTextAreaBill.getText()+"              Order Number:"+count+"           \n");

                   //Heading
                   jTextAreaBill.setText(jTextAreaBill.getText()+"\tProduct"+"\t"+"Price"+"\t"+"Qty"+"\t"+"Amount"+"\n");

                   for(int i=0;i<jTable1.getRowCount();i++)
                    {
                       String pname =(String )model.getValueAt(i, 1);
                       String qty =(String )model.getValueAt(i, 2);
                       String price =(String )model.getValueAt(i, 3);
                       String amount =(String )model.getValueAt(i, 4);
                       jTextAreaBill.setText(jTextAreaBill.getText()+"\t"+pname+"\t"+price+"\t"+qty+"\t"+amount+"\n"); 
                    }

                    jTextAreaBill.setText(jTextAreaBill.getText()+"\n\n");
                    jTextAreaBill.setText(jTextAreaBill.getText()+"\t\t"+"\t"+"SubTotal : "+tota+"\n");
                    jTextAreaBill.setText(jTextAreaBill.getText()+"\t\t"+"\t"+"Pay      : "+pay+"\n");
                    jTextAreaBill.setText(jTextAreaBill.getText()+"\t\t"+"\t"+"Balance  : "+Ballance+"\n");
                    jTextAreaBill.setText(jTextAreaBill.getText()+"\n");
                    jTextAreaBill.setText(jTextAreaBill.getText()+"***********************************************\n");
                    jTextAreaBill.setText(jTextAreaBill.getText()+"                    THANK YOU                  \n");
                    jTextAreaBill.setText(jTextAreaBill.getText()+"***********************************************\n");
                     //**************************************************************************************for total bill***********************************************************************************************/
                    try {
                         String tot =jTextFieldTotal.getText();
                         String pay_ =jTextFieldPay.getText();
                         String Balla =jTextFieldBalance.getText();  
                         String filename ="TotalBills.txt";

                         PrintWriter out = new PrintWriter(new FileWriter(filename,true));
                         out.println("***********************************************\n");
                         out.println("                    BILL                       \n");
                         out.println("***********************************************\n\n");
                         out.println("              Order_Number:"+count+"           \n");
                         count++;
                         out.println("Product"+"/"+"Price"+"/"+"Qty"+"/"+"Amount"+"\n");
                         for(int i=0;i<jTable1.getRowCount();i++)
                         {
                             String pname =(String )model.getValueAt(i, 1);
                             String qty =(String )model.getValueAt(i, 2);
                             String price =(String )model.getValueAt(i, 3);
                             String amount =(String )model.getValueAt(i, 4);

                             out.println(pname+"//"+price+"//"+qty+"//"+amount+"\n");

                         }  
                         out.println("\n\n");
                         out.println("\t\t"+"\t"+"SubTotal:"+tot+"\n");
                         out.println("\t\t"+"\t"+"Pay:"+pay_+"\n");
                         out.println("\t\t"+"\t"+"Balance:"+Balla+"\n");
                         out.println("\n");
                         out.println("***********************************************\n");
                         out.println("                    THANK_YOU                  \n");
                         out.println("***********************************************\n");
                         double t=Double.parseDouble(tot);
                         total+=t;
                         out.println("total_till_now:"+total);
                         
                         out.close();
                        }catch (IOException ex) {
                             System.out.println(ex.getMessage());
                        }
                    
                       }catch(Exception e)
                        {System.out.println(e.getMessage());}
                } 
    private void addOrderToDashboard(){
            try
            {

            DefaultTableModel model = new DefaultTableModel();

            model = (DefaultTableModel)jTable1.getModel();
            model.addRow(new Object[]

            {

                jTextFieldP_Code.getText(),
                jTextFieldP_Name.getText(),
                jSpinnerQty.getValue().toString(),
                jTextFieldPrice.getText(),
                jTextFieldAmount.getText(),

            });
            if(jTextFieldAmount.getText().equals(""))
            {
                 JOptionPane.showMessageDialog(null, "Amount is empty  ");
                 //handel error by refresh the page
                  welcome_frame hf=new welcome_frame();
                    hf.setVisible(true);
                    hf.pack();
                    hf.setLocationRelativeTo(null);
                    hf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    this.dispose();

            }   

            else
            {
            double sum=0;
            for(int i=0;i<jTable1.getRowCount();i++)
            {
               sum=welcome_frame_opreations.get_total( Double.parseDouble(jTable1.getValueAt(i, 4).toString()) ,sum);
            }

            

            jTextFieldTotal.setText(Double.toString(sum));
              
                jTextFieldP_Code.setText("");
                jTextFieldP_Name.setText("");
                jTextFieldPrice.setText("");
                jTextFieldAmount.setText("");
            }
            }
            catch(Exception e){
                System.out.println(e.getMessage());
                
            } 
    }
    private void dispaly_icon(){
        ImageIcon user=new ImageIcon("C:\\Users\\marke\\Documents\\NetBeansProjects\\login\\src\\login\\user.png");

        Image login =user.getImage().getScaledInstance(jLabelicone.getWidth(), jLabelicone.getHeight(), Image.SCALE_SMOOTH);
        jLabelicone.setIcon(new ImageIcon(login));
     }
    private void ourProductsFrame(){
       
    }
    private void loginFrame(){
      login_frame login = new login_frame();
      login.setVisible(true);
      login.pack();
      login.setLocationRelativeTo(null);
      login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      this.dispose();
    }
    private void TotalBillsFrame(){
      Total_Bills t = new Total_Bills();
      t.setVisible(true);
      t.pack();
      t.setLocationRelativeTo(null);
      t.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      this.dispose();
    }
    private void newOrder(){
        DefaultTableModel model = new DefaultTableModel();
        model = (DefaultTableModel)jTable1.getModel();
        int rowCount = model.getRowCount();
        //Remove rows one by one from the end of the table
        for (int i = rowCount - 1; i >= 0; i--) {
            model.removeRow(i);
        }
        jTextAreaBill.setText("");
        jTextFieldBalance.setText("");
          jTextFieldTotal.setText("");
             jTextFieldPay.setText("");
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
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabelicone = new javax.swing.JLabel();
        jButtonCancel = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldP_Name = new javax.swing.JTextField();
        jTextFieldPrice = new javax.swing.JTextField();
        jTextFieldP_Code = new javax.swing.JTextField();
        jTextFieldAmount = new javax.swing.JTextField();
        jSpinnerQty = new javax.swing.JSpinner();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldPay = new javax.swing.JTextField();
        jTextFieldTotal = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextFieldBalance = new javax.swing.JTextField();
        jButtonBill = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaBill = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Casher System");

        jPanel1.setBackground(new java.awt.Color(248, 148, 6));

        jLabel1.setFont(new java.awt.Font("Dialog", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Cashier System");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Username");

        jButtonCancel.setBackground(new java.awt.Color(192, 57, 43));
        jButtonCancel.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        jButtonCancel.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCancel.setText("Logout");
        jButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabelicone, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(162, 162, 162)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 431, Short.MAX_VALUE)
                .addComponent(jButtonCancel)
                .addGap(42, 42, 42))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelicone, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addGap(17, 17, 17))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jButtonCancel))
                        .addGap(38, 38, 38))))
        );

        jPanel2.setBackground(new java.awt.Color(44, 62, 80));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Sales", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Product code");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Product Name");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Qty");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Price");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Amount");

        jTextFieldP_Name.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextFieldP_Name.setEditable(false);
        jTextFieldP_Name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldP_NameActionPerformed(evt);
            }
        });

        jTextFieldPrice.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jTextFieldP_Code.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextFieldP_Code.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldP_CodeActionPerformed(evt);
            }
        });
        jTextFieldP_Code.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldP_CodeKeyPressed(evt);
            }
        });

        jTextFieldAmount.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jTextFieldAmount.setEditable(false);
        jTextFieldAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldAmountActionPerformed(evt);
            }
        });

        jSpinnerQty.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jSpinnerQty.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinnerQtyStateChanged(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(34, 167, 240));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("ADD");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(0, 153, 102));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("ADD New Product");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(0, 153, 51));
        jButton5.setText("New Order");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jTextFieldP_Code, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(54, 54, 54)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jTextFieldP_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jSpinnerQty, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jTextFieldPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(57, 57, 57))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(134, 134, 134))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addGap(130, 130, 130)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldP_Code, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldP_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinnerQty, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jPanel8.setBackground(new java.awt.Color(44, 62, 80));
        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Total pay", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Balance");

        jTextFieldPay.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jTextFieldPay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPayActionPerformed(evt);
            }
        });

        jTextFieldTotal.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jTextFieldTotal.setEditable(false);
        jTextFieldTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTotalActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Total");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Pay");

        jTextFieldBalance.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jTextFieldBalance.setEditable(false);
        jTextFieldBalance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldBalanceActionPerformed(evt);
            }
        });

        jButtonBill.setBackground(new java.awt.Color(34, 167, 240));
        jButtonBill.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jButtonBill.setForeground(new java.awt.Color(255, 255, 255));
        jButtonBill.setText("Print Bill");
        jButtonBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBillActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(0, 153, 102));
        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Total Bills of The Day");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonBill, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jTextFieldPay, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 112, Short.MAX_VALUE)
                        .addComponent(jButton4)))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextFieldTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldPay, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextFieldBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jButtonBill, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE))
        );

        jTable1.setBackground(new java.awt.Color(44, 62, 80));
        jTable1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jTable1.setForeground(new java.awt.Color(255, 255, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product_ID", "Product_Name", "Qty", "Price", "Amount"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.setGridColor(new java.awt.Color(255, 255, 255));
        jTable1.setSelectionBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
        }

        jTextAreaBill.setColumns(20);
        jTextAreaBill.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jTextAreaBill.setRows(5);
        jTextAreaBill.setEditable(false);
        jScrollPane2.setViewportView(jTextAreaBill);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 760, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

       addOrderToDashboard();
       
    }//GEN-LAST:event_jButton1ActionPerformed
    
    private void jTextFieldP_CodeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldP_CodeKeyPressed
    
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
            String pcode = jTextFieldP_Code.getText();
            Order_Model item=Order_Opreations.get_order_data(pcode,true);
            jTextFieldP_Name.setText(item.getName());
            jTextFieldPrice.setText(String.valueOf(item.getPrice()));
        }
    }//GEN-LAST:event_jTextFieldP_CodeKeyPressed
 
    private void jSpinnerQtyStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinnerQtyStateChanged
        int qty = Integer.parseInt(jSpinnerQty.getValue().toString());
        float price =Float.parseFloat(jTextFieldPrice.getText());
        
        float amount = welcome_frame_opreations.qtyChange( qty ,price);
        if (amount!=-1)
          jTextFieldAmount.setText(String.valueOf(amount));
      
       
    }//GEN-LAST:event_jSpinnerQtyStateChanged

    private void jTextFieldBalanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldBalanceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldBalanceActionPerformed

    private void jButtonBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBillActionPerformed
            Balance();
            
            //for handeling pay smaller than total
            double Total = Double.parseDouble(jTextFieldTotal.getText());
            double pay =Float.parseFloat(jTextFieldPay.getText());
            
            if(Double.valueOf(pay)>=Double.valueOf(Total))
            {
                Bill();
            }     
          
    }//GEN-LAST:event_jButtonBillActionPerformed

    private void jTextFieldP_NameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldP_NameActionPerformed

    }//GEN-LAST:event_jTextFieldP_NameActionPerformed

    private void jTextFieldAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldAmountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldAmountActionPerformed

    private void jTextFieldPayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPayActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        
        try {
            Our_Products hf=new Our_Products();
            hf.setVisible(true); 
            hf.pack();
            hf.setLocationRelativeTo(null);
            hf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.dispose();
        } catch(Exception e){
                System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelActionPerformed
        loginFrame();
    }//GEN-LAST:event_jButtonCancelActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
      
      TotalBillsFrame();
      
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        
      newOrder();

    }//GEN-LAST:event_jButton5ActionPerformed

    private void jTextFieldP_CodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldP_CodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldP_CodeActionPerformed

    private void jTextFieldTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTotalActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        login_frame f =new login_frame();
                  f.dispose();
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
            java.util.logging.Logger.getLogger(welcome_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(welcome_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(welcome_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(welcome_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                  
       
                new welcome_frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButtonBill;
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelicone;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner jSpinnerQty;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextAreaBill;
    private javax.swing.JTextField jTextFieldAmount;
    private javax.swing.JTextField jTextFieldBalance;
    private javax.swing.JTextField jTextFieldP_Code;
    private javax.swing.JTextField jTextFieldP_Name;
    private javax.swing.JTextField jTextFieldPay;
    private javax.swing.JTextField jTextFieldPrice;
    private javax.swing.JTextField jTextFieldTotal;
    // End of variables declaration//GEN-END:variables
}
