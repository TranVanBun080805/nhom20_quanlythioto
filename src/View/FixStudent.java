/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Dao.StudentDao;
import Model.Student;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 *
 * @author tranb
 */
public class FixStudent extends javax.swing.JFrame {

    DocumentBuilderFactory dbf;
    DocumentBuilder db;
    Document doc;
    String TEN_FILE = "src/XML/Student.xml";

    /**
     * Creates new form FixStudent
     */
    public FixStudent() {
        initComponents();
    }

    public void writeStudentXML() {
        TransformerFactory tff = TransformerFactory.newInstance();
        try {
            Transformer tf = tff.newTransformer();
            tf.setOutputProperty(OutputKeys.INDENT, "yes");
            tf.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "3");
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult("src/XML/Student.xml");
            try {
                tf.transform(source, result);
            } catch (TransformerException ex) {
                Logger.getLogger(StudentDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (TransformerConfigurationException ex) {
            Logger.getLogger(StudentDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void FixStudent(Student student) {

        HoTen.setText(student.getFullName());
        CCCD.setText(student.getIdentityNumber());
        NgayThi.setText(student.getExamDate());
        LoaiBang.setSelectedItem(student.getRegisteredLicenseType());
        KetQua.setSelectedItem(student.getResult());

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
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        HoTen = new javax.swing.JTextField();
        CCCD = new javax.swing.JTextField();
        LoaiBang = new javax.swing.JComboBox<>();
        KetQua = new javax.swing.JComboBox<>();
        FixButten = new javax.swing.JButton();
        ExitButten = new javax.swing.JButton();
        NgayThi = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel4.setText("Ngày thi :");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel5.setText("Kết quả :");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel1.setText("Họ và Tên :");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel2.setText("CCCD :");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel3.setText("Loại bằng :");

        HoTen.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        CCCD.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        LoaiBang.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        LoaiBang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "B1", "B2", "C", "D" }));

        KetQua.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        KetQua.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Đỗ", "Trượt" }));

        FixButten.setText("Sửa");
        FixButten.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FixButtenActionPerformed(evt);
            }
        });

        ExitButten.setText("Thoát");
        ExitButten.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButtenActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setText("Thông TIn Học Viên");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(FixButten)
                        .addGap(18, 18, 18)
                        .addComponent(ExitButten))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(HoTen)
                        .addComponent(CCCD)
                        .addComponent(LoaiBang, 0, 190, Short.MAX_VALUE)
                        .addComponent(KetQua, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(NgayThi)))
                .addContainerGap(66, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(102, 102, 102))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(HoTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(CCCD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(LoaiBang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(NgayThi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(KetQua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FixButten)
                    .addComponent(ExitButten))
                .addContainerGap(9, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ExitButtenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButtenActionPerformed
        new StudentMenu().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ExitButtenActionPerformed

    private void FixButtenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FixButtenActionPerformed
        try {
            
            dbf = DocumentBuilderFactory.newInstance();
            try {
                db = dbf.newDocumentBuilder();
            } catch (ParserConfigurationException ex) {
                Logger.getLogger(FixStudent.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                doc = db.parse(TEN_FILE);
            } catch (SAXException ex) {
                Logger.getLogger(FixStudent.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(FixStudent.class.getName()).log(Level.SEVERE, null, ex);
            }
            String fullName, identityNumber, registeredLicenseType, examDate, result;
            fullName = HoTen.getText();
            identityNumber = CCCD.getText();
            System.out.println(identityNumber);
            registeredLicenseType = String.valueOf(LoaiBang.getSelectedItem());
            examDate = NgayThi.getText();
            result = String.valueOf(KetQua.getSelectedItem());
            String duongDan = "/Object/Student[identityNumber='" + identityNumber + "']";
            XPathFactory xpf = XPathFactory.newInstance();
            XPath xp = xpf.newXPath();
            Node chon = (Node)xp.evaluate(duongDan, doc, XPathConstants.NODE);
            
            NodeList lStudent = chon.getChildNodes();
            lStudent.item(1).setTextContent(fullName);
            lStudent.item(3).setTextContent(identityNumber);
            lStudent.item(5).setTextContent(registeredLicenseType);
            lStudent.item(7).setTextContent(examDate);
            lStudent.item(9).setTextContent(result);
            
            writeStudentXML();
            
            StudentMenu studentMenu = new StudentMenu();
            
            studentMenu.HienThiStudent();
            studentMenu.setVisible(true);
            this.dispose();
            
            
        } catch (XPathExpressionException ex) {
            Logger.getLogger(FixStudent.class.getName()).log(Level.SEVERE, null, ex);
        }
//        try {
//            dbf = DocumentBuilderFactory.newInstance();
//            db = dbf.newDocumentBuilder();
//            doc = db.parse(TEN_FILE);
//
//            String fullName = HoTen.getText();
//            String identityNumber = CCCD.getText();
//            String registeredLicenseType = String.valueOf(LoaiBang.getSelectedItem());
//            String examDate = NgayThi.getText();
//            String result = String.valueOf(KetQua.getSelectedItem());
//
//            // Điều chỉnh đường dẫn XPath nếu cần
//            String duongDan = "/Object/Student[identityNumber='" + identityNumber + "']";
//            XPathFactory xpf = XPathFactory.newInstance();
//            XPath xp = xpf.newXPath();
//            Node chon = (Node) xp.evaluate(duongDan, doc, XPathConstants.NODE);
//
//            // Kiểm tra chon có phải là null không
//            if (chon == null) {
//                System.out.println("Khong Tim Thay con co CCCD " + identityNumber);
//                return; // Hoặc xử lý khác
//            }
//
//            NodeList lStudent = chon.getChildNodes();
//            // Cập nhật các node con, kiểm tra chỉ số có hợp lệ không
//            if (lStudent.getLength() >= 10) { // Đảm bảo đủ số lượng node
//                lStudent.item(1).setTextContent(fullName);
//                lStudent.item(3).setTextContent(identityNumber);
//                lStudent.item(5).setTextContent(registeredLicenseType);
//                lStudent.item(7).setTextContent(examDate);
//                lStudent.item(9).setTextContent(result);
//            } else {
//                System.out.println("Không đủ node con để cập nhật thông tin sinh viên.");
//            }
//
//            writeStudentXML();
//
//            StudentMenu studentMenu = new StudentMenu();
//            studentMenu.HienThiStudent();
//            studentMenu.setVisible(true);
//            this.dispose();
//
//        } catch (XPathExpressionException ex) {
//            Logger.getLogger(FixStudent.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (ParserConfigurationException | SAXException | IOException ex) {
//            Logger.getLogger(FixStudent.class.getName()).log(Level.SEVERE, null, ex);
//        }

    }//GEN-LAST:event_FixButtenActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CCCD;
    private javax.swing.JButton ExitButten;
    private javax.swing.JButton FixButten;
    private javax.swing.JTextField HoTen;
    private javax.swing.JComboBox<String> KetQua;
    private javax.swing.JComboBox<String> LoaiBang;
    private javax.swing.JTextField NgayThi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
