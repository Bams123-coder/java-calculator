package calculator;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.border.SoftBevelBorder;

public class CalculatorScientific extends JFrame {
   double angkakesatu;
   double Mem;
   double angkakedua;
   double hasil;
   String operasi;
   int btnTitikClick;
   String Memory = "";
   String answer;
   int angka;
   private JButton CalcA;
   private JButton CalcB;
   private JButton CalcC;
   private JButton CalcD;
   private JButton CalcE;
   private JButton CalcF;
   private JRadioButton Calcbin;
   private JRadioButton Calcdec;
   private JRadioButton Calcdeg;
   private JRadioButton Calchex;
   private JRadioButton Calcoct;
   private JRadioButton Calcrad;
   private JButton M;
   private JButton abs;
   private JButton acos;
   private JButton asin;
   private JButton atan;
   private JButton bagi;
   private JButton btnTitik;
   private JButton btnback;
   private JButton clear;
   private JButton cos;
   private JButton cosec;
   private JButton cot;
   private JButton delapan;
   private JButton dua;
   private JButton empat;
   private JButton enam;
   private JButton exponen;
   private ButtonGroup hexa;
   private JPanel jPanel1;
   private JPanel jPanel2;
   private JPanel jPanel3;
   private JPanel jPanel4;
   private JPanel jPanel5;
   private JPanel jPanel6;
   private JPanel jPanel7;
   private JPanel jPanel8;
   private JPanel jPanel9;
   private JRadioButton jRadioButton1;
   private JTextField jtxtTampilan;
   private JButton kali;
   private JButton kurang;
   private JButton lebihkurang;
   private JButton lima;
   private JButton log;
   private JButton mc;
   private JButton mminus;
   private JButton mod;
   private JButton mplus;
   private JButton mr;
   private JButton mr2;
   private JButton nol;
   private JButton phi;
   private JButton pow;
   private JButton samadengan;
   private JButton satu;
   private JButton satuperx;
   private JButton sec;
   private JButton sembilan;
   private JButton sepuluhpktx;
   private JButton sin;
   private JButton sqrt;
   private JButton tambah;
   private JLabel tampil_M;
   private JButton tan;
   private JButton tiga;
   private JButton tujuh;
   private JButton xpangkaty;

   public CalculatorScientific() {
      this.initComponents();
      this.Desimal();
      this.setLocationRelativeTo(this);
   }

   private void Desimal() {
      if (this.Calcdec.isSelected()) {
         this.nol.setEnabled(true);
         this.satu.setEnabled(true);
         this.dua.setEnabled(true);
         this.tiga.setEnabled(true);
         this.empat.setEnabled(true);
         this.lima.setEnabled(true);
         this.enam.setEnabled(true);
         this.tujuh.setEnabled(true);
         this.delapan.setEnabled(true);
         this.sembilan.setEnabled(true);
         this.lebihkurang.setEnabled(true);
         this.btnTitik.setEnabled(true);
         this.CalcA.setEnabled(false);
         this.CalcB.setEnabled(false);
         this.CalcC.setEnabled(false);
         this.CalcD.setEnabled(false);
         this.CalcE.setEnabled(false);
         this.CalcF.setEnabled(false);
         this.kali.setEnabled(true);
         this.bagi.setEnabled(true);
         this.kurang.setEnabled(true);
         this.tambah.setEnabled(true);
         this.samadengan.setEnabled(true);
      }

   }

   private void Biner() {
      if (this.Calcbin.isSelected()) {
         this.dua.setEnabled(false);
         this.tiga.setEnabled(false);
         this.empat.setEnabled(false);
         this.lima.setEnabled(false);
         this.enam.setEnabled(false);
         this.tujuh.setEnabled(false);
         this.delapan.setEnabled(false);
         this.sembilan.setEnabled(false);
         this.lebihkurang.setEnabled(false);
         this.btnTitik.setEnabled(false);
         this.angka = (int)Float.parseFloat(this.jtxtTampilan.getText());
         this.jtxtTampilan.setText("" + Integer.toBinaryString(this.angka));
      }

   }

   private void Hexa() {
      if (this.Calchex.isSelected()) {
         this.CalcA.setEnabled(true);
         this.CalcB.setEnabled(true);
         this.CalcC.setEnabled(true);
         this.CalcD.setEnabled(true);
         this.CalcE.setEnabled(true);
         this.CalcF.setEnabled(true);
         this.lebihkurang.setEnabled(false);
         this.btnTitik.setEnabled(false);
         this.angka = (int)Float.parseFloat(this.jtxtTampilan.getText());
         this.jtxtTampilan.setText("" + Integer.toHexString(this.angka));
      }

   }

   private void Oktal() {
      if (this.Calcoct.isSelected()) {
         this.CalcA.setEnabled(false);
         this.CalcB.setEnabled(false);
         this.CalcC.setEnabled(false);
         this.CalcD.setEnabled(false);
         this.CalcE.setEnabled(false);
         this.CalcF.setEnabled(false);
         this.delapan.setEnabled(false);
         this.sembilan.setEnabled(false);
         this.lebihkurang.setEnabled(false);
         this.btnTitik.setEnabled(false);
         this.angka = (int)Float.parseFloat(this.jtxtTampilan.getText());
         this.jtxtTampilan.setText("" + Integer.toOctalString(this.angka));
      }

   }

   private void Radian() {
      if (this.Calcrad.isSelected()) {
         this.nol.setEnabled(true);
         this.satu.setEnabled(true);
         this.dua.setEnabled(true);
         this.tiga.setEnabled(true);
         this.empat.setEnabled(true);
         this.lima.setEnabled(true);
         this.enam.setEnabled(true);
         this.tujuh.setEnabled(true);
         this.delapan.setEnabled(true);
         this.sembilan.setEnabled(true);
         this.lebihkurang.setEnabled(true);
         this.btnTitik.setEnabled(true);
         this.CalcA.setEnabled(false);
         this.CalcB.setEnabled(false);
         this.CalcC.setEnabled(false);
         this.CalcD.setEnabled(false);
         this.CalcE.setEnabled(false);
         this.CalcF.setEnabled(false);
         this.lebihkurang.setEnabled(false);
         this.btnTitik.setEnabled(false);
         this.kali.setEnabled(false);
         this.bagi.setEnabled(false);
         this.kurang.setEnabled(false);
         this.tambah.setEnabled(false);
         this.samadengan.setEnabled(false);
      }

   }

   private void Degree() {
      if (this.Calcdeg.isSelected()) {
         this.nol.setEnabled(true);
         this.satu.setEnabled(true);
         this.dua.setEnabled(true);
         this.tiga.setEnabled(true);
         this.empat.setEnabled(true);
         this.lima.setEnabled(true);
         this.enam.setEnabled(true);
         this.tujuh.setEnabled(true);
         this.delapan.setEnabled(true);
         this.sembilan.setEnabled(true);
         this.lebihkurang.setEnabled(true);
         this.btnTitik.setEnabled(true);
         this.CalcA.setEnabled(false);
         this.CalcB.setEnabled(false);
         this.CalcC.setEnabled(false);
         this.CalcD.setEnabled(false);
         this.CalcE.setEnabled(false);
         this.CalcF.setEnabled(false);
         this.lebihkurang.setEnabled(false);
         this.btnTitik.setEnabled(false);
         this.kali.setEnabled(false);
         this.bagi.setEnabled(false);
         this.kurang.setEnabled(false);
         this.tambah.setEnabled(false);
         this.samadengan.setEnabled(false);
      }

   }

   private void initComponents() {
      this.hexa = new ButtonGroup();
      this.jRadioButton1 = new JRadioButton();
      this.jPanel1 = new JPanel();
      this.jPanel3 = new JPanel();
      this.jPanel6 = new JPanel();
      this.btnback = new JButton();
      this.mr2 = new JButton();
      this.clear = new JButton();
      this.bagi = new JButton();
      this.kali = new JButton();
      this.kurang = new JButton();
      this.tambah = new JButton();
      this.samadengan = new JButton();
      this.dua = new JButton();
      this.tiga = new JButton();
      this.satu = new JButton();
      this.empat = new JButton();
      this.lima = new JButton();
      this.enam = new JButton();
      this.tujuh = new JButton();
      this.delapan = new JButton();
      this.sembilan = new JButton();
      this.nol = new JButton();
      this.btnTitik = new JButton();
      this.lebihkurang = new JButton();
      this.jPanel8 = new JPanel();
      this.mc = new JButton();
      this.mr = new JButton();
      this.mplus = new JButton();
      this.mminus = new JButton();
      this.M = new JButton();
      this.jPanel5 = new JPanel();
      this.sepuluhpktx = new JButton();
      this.xpangkaty = new JButton();
      this.mod = new JButton();
      this.sqrt = new JButton();
      this.pow = new JButton();
      this.satuperx = new JButton();
      this.jPanel2 = new JPanel();
      this.sin = new JButton();
      this.cos = new JButton();
      this.tan = new JButton();
      this.phi = new JButton();
      this.log = new JButton();
      this.asin = new JButton();
      this.acos = new JButton();
      this.atan = new JButton();
      this.abs = new JButton();
      this.exponen = new JButton();
      this.cosec = new JButton();
      this.sec = new JButton();
      this.cot = new JButton();
      this.jPanel4 = new JPanel();
      this.CalcF = new JButton();
      this.CalcA = new JButton();
      this.CalcC = new JButton();
      this.CalcD = new JButton();
      this.CalcB = new JButton();
      this.CalcE = new JButton();
      this.jPanel7 = new JPanel();
      this.Calcbin = new JRadioButton();
      this.Calchex = new JRadioButton();
      this.Calcoct = new JRadioButton();
      this.Calcdec = new JRadioButton();
      this.Calcrad = new JRadioButton();
      this.Calcdeg = new JRadioButton();
      this.jPanel9 = new JPanel();
      this.jtxtTampilan = new JTextField();
      this.tampil_M = new JLabel();
      this.jRadioButton1.setText("jRadioButton1");
      this.setDefaultCloseOperation(2);
      this.setTitle("Calculator Scientific");
      this.jPanel3.setBorder(BorderFactory.createTitledBorder("Calculator Scientific"));
      this.jPanel6.setBorder(BorderFactory.createTitledBorder(""));

      this.btnback.setFont(new Font("Tahoma", 0, 14));
      this.btnback.setIcon(new ImageIcon("E:\\Aril\\Kuliah\\TPL\\EAS\\EAS\\src\\calculator\\backspace.png"));
      this.btnback.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
      this.btnback.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            CalculatorScientific.this.btnbackActionPerformed(evt);
         }
      });
      
      this.mr2.setFont(new Font("Tahoma", 0, 18));
      this.mr2.setText("CE");
      this.mr2.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
      this.mr2.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            CalculatorScientific.this.mr2ActionPerformed(evt);
         }
      });

      this.clear.setFont(new Font("Tahoma", 0, 18));
      this.clear.setText("C");
      this.clear.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            CalculatorScientific.this.clearActionPerformed(evt);
         }
      });
      
      this.bagi.setFont(new Font("Tahoma", 0, 18));
      this.bagi.setText("÷");
      this.bagi.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            CalculatorScientific.this.bagiActionPerformed(evt);
         }
      });
      
      this.kali.setFont(new Font("Tahoma", 0, 18));
      this.kali.setText("x");
      this.kali.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            CalculatorScientific.this.kaliActionPerformed(evt);
         }
      });
      
      this.kurang.setFont(new Font("Tahoma", 0, 18));
      this.kurang.setText("-");
      this.kurang.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            CalculatorScientific.this.kurangActionPerformed(evt);
         }
      });
      
      this.tambah.setFont(new Font("Tahoma", 0, 18));
      this.tambah.setText("+");
      this.tambah.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            CalculatorScientific.this.tambahActionPerformed(evt);
         }
      });
      
      this.samadengan.setFont(new Font("Tahoma", 0, 18));
      this.samadengan.setText("=");
      this.samadengan.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            CalculatorScientific.this.samadenganActionPerformed(evt);
         }
      });

      this.dua.setFont(new Font("Tahoma", 0, 1));
      this.dua.setIcon(new ImageIcon("E:\\Aril\\Kuliah\\TPL\\EAS\\EAS\\src\\calculator\\dua.png"));
      this.dua.setText("2");
      this.dua.setBorder(BorderFactory.createTitledBorder(""));
      this.dua.setBorderPainted(false);
      this.dua.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            CalculatorScientific.this.duaActionPerformed(evt);
         }
      });
      
      this.tiga.setFont(new Font("Tahoma", 0, 1));
      this.tiga.setIcon(new ImageIcon("E:\\Aril\\Kuliah\\TPL\\EAS\\EAS\\src\\calculator\\tiga.png"));
      this.tiga.setText("3");
      this.tiga.setBorder(BorderFactory.createTitledBorder(""));
      this.tiga.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            CalculatorScientific.this.tigaActionPerformed(evt);
         }
      });
      
      this.satu.setFont(new Font("Tahoma", 0, 3));
      this.satu.setIcon(new ImageIcon("E:\\Aril\\Kuliah\\TPL\\EAS\\EAS\\src\\calculator\\satu.png"));
      this.satu.setText("1");
      this.satu.setBorder(BorderFactory.createTitledBorder(""));
      this.satu.setBorderPainted(false);
      this.satu.setHorizontalTextPosition(0);
      this.satu.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            CalculatorScientific.this.satuActionPerformed(evt);
         }
      });
      
      this.empat.setFont(new Font("Tahoma", 0, 1));
      this.empat.setIcon(new ImageIcon("E:\\Aril\\Kuliah\\TPL\\EAS\\EAS\\src\\calculator\\empat.png"));
      this.empat.setText("4");
      this.empat.setBorder(BorderFactory.createTitledBorder(""));
      this.empat.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            CalculatorScientific.this.empatActionPerformed(evt);
         }
      });
      
      this.lima.setFont(new Font("Tahoma", 0, 1));
      this.lima.setIcon(new ImageIcon("E:\\Aril\\Kuliah\\TPL\\EAS\\EAS\\src\\calculator\\lima.png"));
      this.lima.setText("5");
      this.lima.setBorder(BorderFactory.createTitledBorder(""));
      this.lima.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            CalculatorScientific.this.limaActionPerformed(evt);
         }
      });
      
      this.enam.setFont(new Font("Tahoma", 0, 1));
      this.enam.setIcon(new ImageIcon("E:\\Aril\\Kuliah\\TPL\\EAS\\EAS\\src\\calculator\\enam.png"));
      this.enam.setText("6");
      this.enam.setBorder(BorderFactory.createTitledBorder(""));
      this.enam.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            CalculatorScientific.this.enamActionPerformed(evt);
         }
      });
      
      this.tujuh.setFont(new Font("Tahoma", 0, 1));
      this.tujuh.setIcon(new ImageIcon("E:\\Aril\\Kuliah\\TPL\\EAS\\EAS\\src\\calculator\\tujuh.png"));
      this.tujuh.setText("7");
      this.tujuh.setBorder(BorderFactory.createTitledBorder(""));
      this.tujuh.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            CalculatorScientific.this.tujuhActionPerformed(evt);
         }
      });
      
      this.delapan.setFont(new Font("Tahoma", 0, 1));
      this.delapan.setIcon(new ImageIcon("E:\\Aril\\Kuliah\\TPL\\EAS\\EAS\\src\\calculator\\delapan.png"));
      this.delapan.setText("8");
      this.delapan.setBorder(BorderFactory.createTitledBorder(""));
      this.delapan.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            CalculatorScientific.this.delapanActionPerformed(evt);
         }
      });
      
      this.sembilan.setFont(new Font("Tahoma", 0, 1));
      this.sembilan.setIcon(new ImageIcon("E:\\Aril\\Kuliah\\TPL\\EAS\\EAS\\src\\calculator\\sembilan.png"));
      this.sembilan.setText("9");
      this.sembilan.setBorder(BorderFactory.createTitledBorder(""));
      this.sembilan.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            CalculatorScientific.this.sembilanActionPerformed(evt);
         }
      });
      
      this.nol.setFont(new Font("Tahoma", 0, 1));
      this.nol.setIcon(new ImageIcon("E:\\Aril\\Kuliah\\TPL\\EAS\\EAS\\src\\calculator\\nol.png"));
      this.nol.setText("0");
      this.nol.setBorder(BorderFactory.createTitledBorder(""));
      this.nol.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            CalculatorScientific.this.nolActionPerformed(evt);
         }
      });
      
      this.btnTitik.setFont(new Font("Tahoma", 1, 18));
      this.btnTitik.setText(".");
      this.btnTitik.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            CalculatorScientific.this.btnTitikActionPerformed(evt);
         }
      });
      
      this.lebihkurang.setFont(new Font("Tahoma", 1, 14));
      this.lebihkurang.setText("+/-");
      this.lebihkurang.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            CalculatorScientific.this.lebihkurangActionPerformed(evt);
         }
      });
      GroupLayout jPanel6Layout = new GroupLayout(this.jPanel6);
      this.jPanel6.setLayout(jPanel6Layout);
      jPanel6Layout.setHorizontalGroup(jPanel6Layout.createParallelGroup(Alignment.LEADING).addGroup(Alignment.TRAILING, jPanel6Layout.createSequentialGroup().addGap(0, 0, 32767).addComponent(this.samadengan, -2, 60, -2)).addGroup(jPanel6Layout.createSequentialGroup().addGroup(jPanel6Layout.createParallelGroup(Alignment.TRAILING).addGroup(jPanel6Layout.createSequentialGroup().addGroup(jPanel6Layout.createParallelGroup(Alignment.TRAILING).addGroup(jPanel6Layout.createParallelGroup(Alignment.LEADING).addComponent(this.satu, -2, 60, -2).addComponent(this.lebihkurang, Alignment.TRAILING, -2, 60, -2)).addComponent(this.empat, -2, 60, -2)).addPreferredGap(ComponentPlacement.RELATED).addGroup(jPanel6Layout.createParallelGroup(Alignment.LEADING).addComponent(this.lima, -2, 60, -2).addComponent(this.dua, -2, 60, -2).addComponent(this.nol, -2, 60, -2)).addPreferredGap(ComponentPlacement.RELATED).addGroup(jPanel6Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel6Layout.createParallelGroup(Alignment.LEADING).addComponent(this.tiga, -2, 60, -2).addComponent(this.btnTitik, Alignment.TRAILING, -2, 60, -2)).addComponent(this.enam, -2, 60, -2))).addGroup(jPanel6Layout.createSequentialGroup().addGroup(jPanel6Layout.createParallelGroup(Alignment.TRAILING, false).addComponent(this.mr2, -1, -1, 32767).addComponent(this.tujuh, -2, 60, 32767)).addPreferredGap(ComponentPlacement.RELATED).addGroup(jPanel6Layout.createParallelGroup(Alignment.LEADING).addComponent(this.delapan, -2, 60, 32767).addComponent(this.clear, -1, -1, 32767)).addPreferredGap(ComponentPlacement.RELATED).addGroup(jPanel6Layout.createParallelGroup(Alignment.LEADING, false).addComponent(this.btnback, -1, -1, 32767).addComponent(this.sembilan, -2, 60, 32767)))).addPreferredGap(ComponentPlacement.RELATED, -1, 32767).addGroup(jPanel6Layout.createParallelGroup(Alignment.LEADING).addGroup(Alignment.TRAILING, jPanel6Layout.createParallelGroup(Alignment.LEADING).addComponent(this.kali, -2, 60, -2).addComponent(this.bagi, Alignment.TRAILING, -2, 60, -2)).addComponent(this.tambah, Alignment.TRAILING, -2, 60, -2).addComponent(this.kurang, Alignment.TRAILING, -2, 60, -2))));
      jPanel6Layout.linkSize(0, new Component[]{this.clear, this.delapan, this.dua, this.lima});
      jPanel6Layout.linkSize(0, new Component[]{this.empat, this.mr2, this.satu, this.tujuh});
      jPanel6Layout.linkSize(0, new Component[]{this.btnback, this.enam, this.sembilan, this.tiga});
      jPanel6Layout.linkSize(0, new Component[]{this.bagi, this.kali, this.kurang, this.samadengan, this.tambah});
      jPanel6Layout.setVerticalGroup(jPanel6Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel6Layout.createSequentialGroup().addGroup(jPanel6Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel6Layout.createParallelGroup(Alignment.TRAILING).addComponent(this.btnback, -2, 57, -2).addGroup(Alignment.LEADING, jPanel6Layout.createParallelGroup(Alignment.BASELINE).addComponent(this.mr2, -2, 57, -2).addComponent(this.clear, -2, 57, -2))).addGroup(jPanel6Layout.createSequentialGroup().addGap(1, 1, 1).addComponent(this.bagi, -2, 56, -2))).addPreferredGap(ComponentPlacement.RELATED).addGroup(jPanel6Layout.createParallelGroup(Alignment.LEADING).addComponent(this.kali, -2, 62, -2).addGroup(jPanel6Layout.createParallelGroup(Alignment.BASELINE).addComponent(this.tujuh, -2, 62, -2).addComponent(this.delapan, -2, 62, -2).addComponent(this.sembilan, -2, 62, -2))).addPreferredGap(ComponentPlacement.RELATED).addGroup(jPanel6Layout.createParallelGroup(Alignment.LEADING).addComponent(this.kurang, -2, 62, -2).addGroup(jPanel6Layout.createParallelGroup(Alignment.BASELINE).addComponent(this.empat, -2, 62, -2).addComponent(this.lima, -2, 62, -2).addComponent(this.enam, -2, 62, -2))).addPreferredGap(ComponentPlacement.RELATED).addGroup(jPanel6Layout.createParallelGroup(Alignment.LEADING).addComponent(this.tambah, -2, 62, -2).addGroup(jPanel6Layout.createParallelGroup(Alignment.BASELINE).addComponent(this.satu, -2, 62, -2).addComponent(this.dua, -2, 62, -2).addComponent(this.tiga, -2, 62, -2))).addPreferredGap(ComponentPlacement.RELATED).addGroup(jPanel6Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel6Layout.createParallelGroup(Alignment.BASELINE).addComponent(this.samadengan, -2, 62, -2).addComponent(this.btnTitik, -2, 62, -2).addComponent(this.lebihkurang, -2, 62, -2)).addComponent(this.nol, -2, 62, -2)).addContainerGap(-1, 32767)));
      jPanel6Layout.linkSize(1, new Component[]{this.clear, this.delapan, this.dua, this.lima});
      jPanel6Layout.linkSize(1, new Component[]{this.empat, this.mr2, this.satu, this.tujuh});
      jPanel6Layout.linkSize(1, new Component[]{this.btnback, this.enam, this.sembilan, this.tiga});
      jPanel6Layout.linkSize(1, new Component[]{this.bagi, this.kali, this.kurang, this.samadengan, this.tambah});
      this.mc.setFont(new Font("Tahoma", 0, 14));
      this.mc.setText("MC");
      this.mc.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
      this.mc.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            CalculatorScientific.this.mcActionPerformed(evt);
         }
      });
      this.mr.setFont(new Font("Tahoma", 0, 14));
      this.mr.setText("MR");
      this.mr.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
      this.mr.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            CalculatorScientific.this.mrActionPerformed(evt);
         }
      });
      this.mplus.setFont(new Font("Tahoma", 0, 14));
      this.mplus.setText("M+");
      this.mplus.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
      this.mplus.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            CalculatorScientific.this.mplusActionPerformed(evt);
         }
      });
      this.mminus.setFont(new Font("Tahoma", 0, 14));
      this.mminus.setText("M-");
      this.mminus.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
      this.mminus.addMouseListener(new MouseAdapter() {
         public void mouseClicked(MouseEvent evt) {
            CalculatorScientific.this.mminusMouseClicked(evt);
         }
      });
      this.mminus.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            CalculatorScientific.this.mminusActionPerformed(evt);
         }
      });
      this.M.setFont(new Font("Tahoma", 0, 14));
      this.M.setText("M");
      this.M.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
      this.M.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            CalculatorScientific.this.MActionPerformed(evt);
         }
      });
      GroupLayout jPanel8Layout = new GroupLayout(this.jPanel8);
      this.jPanel8.setLayout(jPanel8Layout);
      jPanel8Layout.setHorizontalGroup(jPanel8Layout.createParallelGroup(Alignment.TRAILING).addGroup(jPanel8Layout.createSequentialGroup().addComponent(this.mc, -2, 44, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.mr, -2, 44, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.mplus, -2, 40, -2).addPreferredGap(ComponentPlacement.UNRELATED).addComponent(this.mminus, -2, 48, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.M, -2, 55, -2).addContainerGap(-1, 32767)));
      jPanel8Layout.linkSize(0, new Component[]{this.mc, this.mplus, this.mr});
      jPanel8Layout.setVerticalGroup(jPanel8Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel8Layout.createParallelGroup(Alignment.BASELINE).addComponent(this.mc, -2, 25, -2).addComponent(this.mr, -2, 25, -2).addComponent(this.mplus, -2, 25, -2).addComponent(this.mminus, -2, 29, -2).addComponent(this.M, -2, 29, -2)));
      jPanel8Layout.linkSize(1, new Component[]{this.M, this.mc, this.mminus, this.mplus, this.mr});
      this.jPanel5.setBorder(BorderFactory.createTitledBorder(""));
      this.sepuluhpktx.setFont(new Font("Tahoma", 0, 14));
      this.sepuluhpktx.setText("10^x");
      this.sepuluhpktx.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
      this.sepuluhpktx.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            CalculatorScientific.this.sepuluhpktxActionPerformed(evt);
         }
      });
      this.xpangkaty.setFont(new Font("Tahoma", 0, 14));
      this.xpangkaty.setText("x^y");
      this.xpangkaty.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
      this.xpangkaty.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            CalculatorScientific.this.xpangkatyActionPerformed(evt);
         }
      });
      this.mod.setFont(new Font("Tahoma", 0, 14));
      this.mod.setText("%");
      this.mod.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
      this.mod.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            CalculatorScientific.this.modActionPerformed(evt);
         }
      });
      this.sqrt.setFont(new Font("Tahoma", 0, 14));
      this.sqrt.setText("√");
      this.sqrt.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
      this.sqrt.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            CalculatorScientific.this.sqrtActionPerformed(evt);
         }
      });
      this.pow.setFont(new Font("Tahoma", 0, 14));
      this.pow.setText("x^2");
      this.pow.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
      this.pow.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            CalculatorScientific.this.powActionPerformed(evt);
         }
      });
      this.satuperx.setFont(new Font("Tahoma", 0, 14));
      this.satuperx.setText("1/x");
      this.satuperx.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
      this.satuperx.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            CalculatorScientific.this.satuperxActionPerformed(evt);
         }
      });
      GroupLayout jPanel5Layout = new GroupLayout(this.jPanel5);
      this.jPanel5.setLayout(jPanel5Layout);
      jPanel5Layout.setHorizontalGroup(jPanel5Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel5Layout.createSequentialGroup().addGroup(jPanel5Layout.createParallelGroup(Alignment.LEADING).addComponent(this.mod, -1, -1, 32767).addComponent(this.sqrt, -1, -1, 32767)).addPreferredGap(ComponentPlacement.UNRELATED).addGroup(jPanel5Layout.createParallelGroup(Alignment.LEADING, false).addComponent(this.xpangkaty, -1, 63, 32767).addComponent(this.pow, -1, -1, 32767)).addPreferredGap(ComponentPlacement.UNRELATED).addGroup(jPanel5Layout.createParallelGroup(Alignment.LEADING).addComponent(this.satuperx, Alignment.TRAILING, -2, 56, -2).addComponent(this.sepuluhpktx, Alignment.TRAILING, -2, 56, -2))));
      jPanel5Layout.setVerticalGroup(jPanel5Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel5Layout.createSequentialGroup().addGroup(jPanel5Layout.createParallelGroup(Alignment.BASELINE).addComponent(this.mod, -1, -1, 32767).addComponent(this.xpangkaty, -1, 43, 32767).addComponent(this.sepuluhpktx, -1, -1, 32767)).addPreferredGap(ComponentPlacement.RELATED).addGroup(jPanel5Layout.createParallelGroup(Alignment.LEADING).addComponent(this.sqrt, Alignment.TRAILING, -1, 46, 32767).addGroup(jPanel5Layout.createParallelGroup(Alignment.BASELINE).addComponent(this.pow).addComponent(this.satuperx))).addGap(0, 0, 0)));
      jPanel5Layout.linkSize(1, new Component[]{this.mod, this.pow, this.satuperx, this.sepuluhpktx, this.sqrt, this.xpangkaty});
      this.jPanel2.setBorder(BorderFactory.createTitledBorder(""));
      this.sin.setFont(new Font("Tahoma", 0, 14));
      this.sin.setText("Sin");
      this.sin.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
      this.sin.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            CalculatorScientific.this.sinActionPerformed(evt);
         }
      });
      this.cos.setFont(new Font("Tahoma", 0, 14));
      this.cos.setText("Cos");
      this.cos.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
      this.cos.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            CalculatorScientific.this.cosActionPerformed(evt);
         }
      });
      this.tan.setFont(new Font("Tahoma", 0, 14));
      this.tan.setText("Tan");
      this.tan.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
      this.tan.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            CalculatorScientific.this.tanActionPerformed(evt);
         }
      });
      this.phi.setFont(new Font("Arial", 0, 14));
      this.phi.setText("π");
      this.phi.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
      this.phi.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            CalculatorScientific.this.phiActionPerformed(evt);
         }
      });
      this.log.setFont(new Font("Tahoma", 0, 14));
      this.log.setText("log");
      this.log.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
      this.log.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            CalculatorScientific.this.logActionPerformed(evt);
         }
      });
      this.asin.setFont(new Font("Tahoma", 0, 14));
      this.asin.setText("ASin");
      this.asin.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
      this.asin.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            CalculatorScientific.this.asinActionPerformed(evt);
         }
      });
      this.acos.setFont(new Font("Tahoma", 0, 14));
      this.acos.setText("ACos");
      this.acos.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
      this.acos.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            CalculatorScientific.this.acosActionPerformed(evt);
         }
      });
      this.atan.setFont(new Font("Tahoma", 0, 14));
      this.atan.setText("ATan");
      this.atan.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
      this.atan.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            CalculatorScientific.this.atanActionPerformed(evt);
         }
      });
      this.abs.setFont(new Font("Tahoma", 0, 14));
      this.abs.setText("Abs");
      this.abs.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
      this.abs.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            CalculatorScientific.this.absActionPerformed(evt);
         }
      });
      this.exponen.setFont(new Font("Tahoma", 0, 14));
      this.exponen.setText("e");
      this.exponen.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
      this.exponen.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            CalculatorScientific.this.exponenActionPerformed(evt);
         }
      });
      this.cosec.setFont(new Font("Tahoma", 0, 14));
      this.cosec.setText("Csc");
      this.cosec.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
      this.cosec.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            CalculatorScientific.this.cosecActionPerformed(evt);
         }
      });
      this.sec.setFont(new Font("Tahoma", 0, 14));
      this.sec.setText("Sec");
      this.sec.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
      this.sec.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            CalculatorScientific.this.secActionPerformed(evt);
         }
      });
      this.cot.setFont(new Font("Tahoma", 0, 14));
      this.cot.setText("Cot");
      this.cot.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
      this.cot.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            CalculatorScientific.this.cotActionPerformed(evt);
         }
      });
      GroupLayout jPanel2Layout = new GroupLayout(this.jPanel2);
      this.jPanel2.setLayout(jPanel2Layout);
      jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addComponent(this.sin, -2, 63, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.cos, -2, 44, -2)).addGroup(jPanel2Layout.createSequentialGroup().addComponent(this.asin, -2, 40, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.acos, -2, 44, -2))).addPreferredGap(ComponentPlacement.RELATED).addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING).addComponent(this.tan, -1, 44, 32767).addComponent(this.atan, -2, 33, -2))).addGroup(jPanel2Layout.createSequentialGroup().addComponent(this.cosec, -2, 40, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.sec, -2, 44, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.cot, -2, 33, -2)).addGroup(jPanel2Layout.createSequentialGroup().addComponent(this.log, -2, 40, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.phi, -2, 44, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.exponen, -2, 44, -2)).addComponent(this.abs, -2, 40, -2));
      jPanel2Layout.linkSize(0, new Component[]{this.abs, this.acos, this.asin, this.atan, this.cos, this.cosec, this.cot, this.exponen, this.log, this.phi, this.sec, this.sin, this.tan});
      jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE).addComponent(this.sin, -2, 48, -2).addComponent(this.cos, -2, 25, -2).addComponent(this.tan, -2, 32, -2)).addPreferredGap(ComponentPlacement.RELATED).addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE).addComponent(this.asin, -2, 25, -2).addComponent(this.acos, -2, 25, -2).addComponent(this.atan, -2, 32, -2)).addPreferredGap(ComponentPlacement.RELATED).addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE).addComponent(this.cosec, -2, 25, -2).addComponent(this.sec, -2, 25, -2).addComponent(this.cot, -2, 32, -2)).addPreferredGap(ComponentPlacement.RELATED).addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE).addComponent(this.log, -2, 27, -2).addComponent(this.phi, -2, 32, -2).addComponent(this.exponen, -2, 32, -2)).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.abs, -2, 27, -2).addContainerGap(-1, 32767)));
      jPanel2Layout.linkSize(1, new Component[]{this.abs, this.acos, this.asin, this.atan, this.cos, this.cosec, this.cot, this.exponen, this.log, this.phi, this.sec, this.sin, this.tan});
      this.jPanel4.setBorder(BorderFactory.createTitledBorder(""));
      this.CalcF.setFont(new Font("Arial", 1, 12));
      this.CalcF.setText("F");
      this.CalcF.setPreferredSize(new Dimension(42, 10));
      this.CalcF.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            CalculatorScientific.this.CalcFActionPerformed(evt);
         }
      });
      this.CalcA.setFont(new Font("Arial", 1, 12));
      this.CalcA.setText("A");
      this.CalcA.setPreferredSize(new Dimension(42, 10));
      this.CalcA.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            CalculatorScientific.this.CalcAActionPerformed(evt);
         }
      });
      this.CalcC.setFont(new Font("Arial", 1, 12));
      this.CalcC.setText("C");
      this.CalcC.setPreferredSize(new Dimension(42, 10));
      this.CalcC.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            CalculatorScientific.this.CalcCActionPerformed(evt);
         }
      });
      this.CalcD.setFont(new Font("Arial", 1, 12));
      this.CalcD.setText("D");
      this.CalcD.setPreferredSize(new Dimension(42, 10));
      this.CalcD.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            CalculatorScientific.this.CalcDActionPerformed(evt);
         }
      });
      this.CalcB.setFont(new Font("Arial", 1, 12));
      this.CalcB.setText("B");
      this.CalcB.setPreferredSize(new Dimension(42, 10));
      this.CalcB.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            CalculatorScientific.this.CalcBActionPerformed(evt);
         }
      });
      this.CalcE.setFont(new Font("Arial", 1, 12));
      this.CalcE.setText("E");
      this.CalcE.setPreferredSize(new Dimension(42, 10));
      this.CalcE.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            CalculatorScientific.this.CalcEActionPerformed(evt);
         }
      });
      GroupLayout jPanel4Layout = new GroupLayout(this.jPanel4);
      this.jPanel4.setLayout(jPanel4Layout);
      jPanel4Layout.setHorizontalGroup(jPanel4Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel4Layout.createSequentialGroup().addGap(2, 2, 2).addComponent(this.CalcA, -2, 71, -2).addGap(10, 10, 10).addComponent(this.CalcB, -1, -1, 32767).addPreferredGap(ComponentPlacement.UNRELATED).addComponent(this.CalcC, -2, 62, -2).addPreferredGap(ComponentPlacement.UNRELATED).addComponent(this.CalcD, -2, 63, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.CalcE, -2, 62, -2).addGap(12, 12, 12).addComponent(this.CalcF, -2, 70, -2)));
      jPanel4Layout.linkSize(0, new Component[]{this.CalcA, this.CalcC, this.CalcD, this.CalcE, this.CalcF});
      jPanel4Layout.setVerticalGroup(jPanel4Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel4Layout.createParallelGroup(Alignment.BASELINE).addComponent(this.CalcA, -2, 32, -2).addComponent(this.CalcB, -2, 32, -2).addComponent(this.CalcC, -2, 32, -2).addComponent(this.CalcD, -2, 32, -2).addComponent(this.CalcE, -2, 32, -2).addComponent(this.CalcF, -2, 32, -2)));
      this.jPanel7.setBorder(BorderFactory.createTitledBorder(""));
      this.hexa.add(this.Calcbin);
      this.Calcbin.setFont(new Font("Arial", 1, 12));
      this.Calcbin.setText("Bin");
      this.Calcbin.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            CalculatorScientific.this.CalcbinActionPerformed(evt);
         }
      });
      this.hexa.add(this.Calchex);
      this.Calchex.setFont(new Font("Arial", 1, 12));
      this.Calchex.setText("Hex");
      this.Calchex.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            CalculatorScientific.this.CalchexActionPerformed(evt);
         }
      });
      this.hexa.add(this.Calcoct);
      this.Calcoct.setFont(new Font("Arial", 1, 12));
      this.Calcoct.setText("Oct");
      this.Calcoct.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            CalculatorScientific.this.CalcoctActionPerformed(evt);
         }
      });
      this.hexa.add(this.Calcdec);
      this.Calcdec.setFont(new Font("Arial", 1, 12));
      this.Calcdec.setSelected(true);
      this.Calcdec.setText("Dec");
      this.Calcdec.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            CalculatorScientific.this.CalcdecActionPerformed(evt);
         }
      });
      this.hexa.add(this.Calcrad);
      this.Calcrad.setFont(new Font("Arial", 1, 12));
      this.Calcrad.setText("Rad");
      this.Calcrad.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            CalculatorScientific.this.CalcradActionPerformed(evt);
         }
      });
      this.hexa.add(this.Calcdeg);
      this.Calcdeg.setFont(new Font("Arial", 1, 12));
      this.Calcdeg.setText("Deg");
      this.Calcdeg.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            CalculatorScientific.this.CalcdegActionPerformed(evt);
         }
      });
      GroupLayout jPanel7Layout = new GroupLayout(this.jPanel7);
      this.jPanel7.setLayout(jPanel7Layout);
      jPanel7Layout.setHorizontalGroup(jPanel7Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel7Layout.createSequentialGroup().addComponent(this.Calcbin).addGap(31, 31, 31).addComponent(this.Calchex).addGap(38, 38, 38).addComponent(this.Calcoct).addGap(46, 46, 46).addComponent(this.Calcdec).addPreferredGap(ComponentPlacement.RELATED, -1, 32767).addComponent(this.Calcrad).addGap(31, 31, 31).addComponent(this.Calcdeg).addContainerGap()));
      jPanel7Layout.setVerticalGroup(jPanel7Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel7Layout.createSequentialGroup().addGroup(jPanel7Layout.createParallelGroup(Alignment.BASELINE).addComponent(this.Calcbin).addComponent(this.Calchex).addComponent(this.Calcoct).addComponent(this.Calcdec).addComponent(this.Calcrad).addComponent(this.Calcdeg)).addGap(0, 0, 32767)));
      this.jtxtTampilan.setFont(new Font("Tahoma", 1, 24));
      this.jtxtTampilan.setHorizontalAlignment(4);
      this.jtxtTampilan.setBorder(new SoftBevelBorder(0, Color.lightGray, Color.lightGray, Color.lightGray, Color.lightGray));
      this.tampil_M.setBorder(BorderFactory.createTitledBorder("Memory"));
      GroupLayout jPanel9Layout = new GroupLayout(this.jPanel9);
      this.jPanel9.setLayout(jPanel9Layout);
      jPanel9Layout.setHorizontalGroup(jPanel9Layout.createParallelGroup(Alignment.LEADING).addComponent(this.jtxtTampilan).addComponent(this.tampil_M, -1, -1, 32767));
      jPanel9Layout.setVerticalGroup(jPanel9Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel9Layout.createSequentialGroup().addComponent(this.jtxtTampilan, -2, 52, -2).addGap(18, 18, 18).addComponent(this.tampil_M, -1, 52, 32767).addContainerGap()));
      GroupLayout jPanel3Layout = new GroupLayout(this.jPanel3);
      this.jPanel3.setLayout(jPanel3Layout);
      jPanel3Layout.setHorizontalGroup(jPanel3Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel3Layout.createSequentialGroup().addContainerGap(-1, 32767).addGroup(jPanel3Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel3Layout.createSequentialGroup().addGroup(jPanel3Layout.createParallelGroup(Alignment.LEADING, false).addComponent(this.jPanel4, -1, -1, 32767).addGroup(jPanel3Layout.createSequentialGroup().addGroup(jPanel3Layout.createParallelGroup(Alignment.LEADING).addComponent(this.jPanel8, -2, -1, -2).addComponent(this.jPanel6, -2, -1, -2)).addPreferredGap(ComponentPlacement.RELATED).addGroup(jPanel3Layout.createParallelGroup(Alignment.LEADING, false).addComponent(this.jPanel2, -1, -1, 32767).addComponent(this.jPanel5, -1, -1, 32767))).addComponent(this.jPanel7, -1, -1, 32767)).addGap(0, 0, 32767)).addComponent(this.jPanel9, -1, -1, 32767)).addContainerGap(-1, 32767)));
      jPanel3Layout.setVerticalGroup(jPanel3Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel3Layout.createSequentialGroup().addComponent(this.jPanel9, -2, -1, -2).addGap(18, 18, 18).addComponent(this.jPanel7, -2, -1, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.jPanel4, -2, -1, -2).addGroup(jPanel3Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel3Layout.createSequentialGroup().addGap(4, 4, 4).addComponent(this.jPanel5, -2, -1, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.jPanel2, -1, -1, 32767)).addGroup(jPanel3Layout.createSequentialGroup().addPreferredGap(ComponentPlacement.RELATED).addComponent(this.jPanel8, -2, -1, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.jPanel6, -1, -1, 32767)))));
      GroupLayout jPanel1Layout = new GroupLayout(this.jPanel1);
      this.jPanel1.setLayout(jPanel1Layout);
      jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING).addGroup(Alignment.TRAILING, jPanel1Layout.createSequentialGroup().addContainerGap(-1, 32767).addComponent(this.jPanel3, -2, -1, -2).addContainerGap()));
      jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addComponent(this.jPanel3, -1, -1, 32767).addContainerGap()));
      GroupLayout layout = new GroupLayout(this.getContentPane());
      this.getContentPane().setLayout(layout);
      layout.setHorizontalGroup(layout.createParallelGroup(Alignment.LEADING).addComponent(this.jPanel1, -2, -1, -2));
      layout.setVerticalGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(Alignment.TRAILING, layout.createSequentialGroup().addContainerGap(-1, 32767).addComponent(this.jPanel1, -2, -1, -2).addContainerGap()));
      this.pack();
   }

   private void duaActionPerformed(ActionEvent evt) {
      String MasukanAngka = this.jtxtTampilan.getText() + this.dua.getText();
      this.jtxtTampilan.setText(MasukanAngka);
   }

   private void tigaActionPerformed(ActionEvent evt) {
      String MasukanAngka = this.jtxtTampilan.getText() + this.tiga.getText();
      this.jtxtTampilan.setText(MasukanAngka);
   }

   private void empatActionPerformed(ActionEvent evt) {
      String MasukanAngka = this.jtxtTampilan.getText() + this.empat.getText();
      this.jtxtTampilan.setText(MasukanAngka);
   }

   private void limaActionPerformed(ActionEvent evt) {
      String MasukanAngka = this.jtxtTampilan.getText() + this.lima.getText();
      this.jtxtTampilan.setText(MasukanAngka);
   }

   private void enamActionPerformed(ActionEvent evt) {
      String MasukanAngka = this.jtxtTampilan.getText() + this.enam.getText();
      this.jtxtTampilan.setText(MasukanAngka);
   }

   private void tujuhActionPerformed(ActionEvent evt) {
      String MasukanAngka = this.jtxtTampilan.getText() + this.tujuh.getText();
      this.jtxtTampilan.setText(MasukanAngka);
   }

   private void delapanActionPerformed(ActionEvent evt) {
      String MasukanAngka = this.jtxtTampilan.getText() + this.delapan.getText();
      this.jtxtTampilan.setText(MasukanAngka);
   }

   private void sembilanActionPerformed(ActionEvent evt) {
      String MasukanAngka = this.jtxtTampilan.getText() + this.sembilan.getText();
      this.jtxtTampilan.setText(MasukanAngka);
   }

   private void tambahActionPerformed(ActionEvent evt) {
      this.angkakesatu = Double.parseDouble(this.jtxtTampilan.getText());
      this.jtxtTampilan.setText("");
      this.operasi = "+";
      this.btnTitikClick = 0;
   }

   private void nolActionPerformed(ActionEvent evt) {
      String MasukanAngka = this.jtxtTampilan.getText() + this.nol.getText();
      this.jtxtTampilan.setText(MasukanAngka);
   }

   private void kurangActionPerformed(ActionEvent evt) {
      this.angkakesatu = Double.parseDouble(this.jtxtTampilan.getText());
      this.jtxtTampilan.setText("");
      this.operasi = "-";
      this.btnTitikClick = 0;
   }

   private void kaliActionPerformed(ActionEvent evt) {
      this.angkakesatu = Double.parseDouble(this.jtxtTampilan.getText());
      this.jtxtTampilan.setText("");
      this.operasi = "*";
      this.btnTitikClick = 0;
   }

   private void bagiActionPerformed(ActionEvent evt) {
      this.angkakesatu = Double.parseDouble(this.jtxtTampilan.getText());
      this.jtxtTampilan.setText("");
      this.operasi = "÷";
      this.btnTitikClick = 0;
   }

   private void lebihkurangActionPerformed(ActionEvent evt) {
      double ops = Double.parseDouble(String.valueOf(this.jtxtTampilan.getText()));
      ops *= -1.0D;
      this.jtxtTampilan.setText(String.valueOf(ops));
      this.btnTitikClick = 0;
   }

   private void btnTitikActionPerformed(ActionEvent evt) {
      if (this.btnTitikClick == 0) {
         this.jtxtTampilan.setText(this.jtxtTampilan.getText() + this.btnTitik.getText());
         this.btnTitikClick = 1;
      }

   }

   private void clearActionPerformed(ActionEvent evt) {
      this.angkakesatu = 0.0D;
      this.hasil = 0.0D;
      this.jtxtTampilan.setText("");
      this.btnTitikClick = 0;
   }

   private void samadenganActionPerformed(ActionEvent evt) {
      this.jtxtTampilan.setText((new Parser()).solve(this.jtxtTampilan.getText(), 0.0D));
      this.angkakedua = Double.parseDouble(this.jtxtTampilan.getText());
      if (this.operasi == "+") {
         this.hasil = this.angkakesatu + this.angkakedua;
         this.answer = String.format(" %,.2f ", this.hasil);
         this.jtxtTampilan.setText(this.answer);
      } else if (this.operasi == "-") {
         this.hasil = this.angkakesatu - this.angkakedua;
         this.answer = String.format("%,.2f", this.hasil);
         this.jtxtTampilan.setText(this.answer);
      } else if (this.operasi == "*") {
         this.hasil = this.angkakesatu * this.angkakedua;
         this.answer = String.format("%,.2f", this.hasil);
         this.jtxtTampilan.setText(this.answer);
      } else if (this.operasi == "÷") {
         this.hasil = this.angkakesatu / this.angkakedua;
         this.answer = String.format("%,.2f", this.hasil);
         this.jtxtTampilan.setText(this.answer);
      } else if (this.operasi == "%") {
         this.hasil = this.angkakesatu % this.angkakedua;
         this.answer = String.format("%,.2f", this.hasil);
         this.jtxtTampilan.setText(this.answer);
      } else if (this.operasi == "sqrt") {
         this.hasil = Math.sqrt(this.angkakesatu);
         this.answer = String.format("%,.2f", this.hasil);
         this.jtxtTampilan.setText(this.answer);
      } else if (this.operasi == "10^x") {
         this.hasil = Math.pow(this.angkakesatu, this.angkakedua);
         String answer = String.format("%,.2f", this.hasil);
         this.jtxtTampilan.setText(answer);
      } else {
         JOptionPane.showMessageDialog((Component)null, " Data yang anda masukan salah. Ulangi lagi!!!");
      }

   }

   private void btnbackActionPerformed(ActionEvent evt) {
      String ops = String.valueOf(this.jtxtTampilan.getText());
      ops = ops.substring(0, ops.length() - 1);
      this.jtxtTampilan.setText(ops);
   }

   private void mr2ActionPerformed(ActionEvent evt) {
      this.jtxtTampilan.setText("");
      this.btnTitikClick = 0;
   }

   private void modActionPerformed(ActionEvent evt) {
      this.angkakesatu = Double.parseDouble(this.jtxtTampilan.getText());
      this.jtxtTampilan.setText("");
      this.operasi = "%";
      this.btnTitikClick = 0;
   }

   private void sqrtActionPerformed(ActionEvent evt) {
      this.angkakesatu = Double.parseDouble(this.jtxtTampilan.getText());
      this.jtxtTampilan.setText("");
      this.operasi = "sqrt";
      this.btnTitikClick = 0;
      if (this.operasi == "sqrt") {
         this.hasil = Math.sqrt(this.angkakesatu);
         String answer = String.format("%,.2f", this.hasil);
         this.jtxtTampilan.setText(answer);
      }

   }

   private void satuperxActionPerformed(ActionEvent evt) {
      this.angkakesatu = Double.parseDouble(this.jtxtTampilan.getText());
      this.jtxtTampilan.setText("");
      this.operasi = "1/x";
      this.btnTitikClick = 0;
      if (this.operasi == "1/x") {
         this.hasil = 1.0D / this.angkakesatu;
         String answer = String.format("%,.12f", this.hasil);
         this.jtxtTampilan.setText(answer);
      }

   }

   private void MActionPerformed(ActionEvent evt) {
      this.Memory = String.format("%,.2f", this.Mem);
      this.tampil_M.setText("M  " + this.Memory);
   }

   private void mcActionPerformed(ActionEvent evt) {
      this.Mem = 0.0D;
      this.tampil_M.setText("");
   }

   private void mrActionPerformed(ActionEvent evt) {
      this.jtxtTampilan.setText(Double.toString(this.Mem));
   }

   private void mminusMouseClicked(MouseEvent evt) {
   }

   private void mplusActionPerformed(ActionEvent evt) {
      double Mem1 = this.hasil;
      this.Mem += Mem1;
      this.tampil_M.setText("M");
      this.jtxtTampilan.setText(Double.toString(Mem1));
   }

   private void mminusActionPerformed(ActionEvent evt) {
      double Mem2 = this.hasil;
      this.Mem -= Mem2;
      this.tampil_M.setText("M");
      this.jtxtTampilan.setText(Double.toString(Mem2));
   }

   private void tanActionPerformed(ActionEvent evt) {
      this.angkakesatu = Double.parseDouble(this.jtxtTampilan.getText());
      this.jtxtTampilan.setText("");
      this.operasi = "tan";
      this.btnTitikClick = 0;
      if (this.operasi == "tan") {
         double angleInDegree = this.angkakesatu;
         double angleInRadian = Math.toRadians(angleInDegree);
         double hasil = Math.tan(angleInRadian);
         String answer = String.format("%,.6f", hasil);
         this.jtxtTampilan.setText(answer);
      }

   }

   private void sepuluhpktxActionPerformed(ActionEvent evt) {
      this.angkakesatu = Double.parseDouble(this.jtxtTampilan.getText());
      this.jtxtTampilan.setText("");
      this.operasi = "10^x";
      this.btnTitikClick = 0;
      if (this.operasi == "10^x") {
         this.hasil = Math.pow(10.0D, this.angkakesatu);
         String answer = String.format("%,.2f", this.hasil);
         this.jtxtTampilan.setText(answer);
      }

   }

   private void xpangkatyActionPerformed(ActionEvent evt) {
      this.angkakesatu = Double.parseDouble(this.jtxtTampilan.getText());
      this.jtxtTampilan.setText("");
      this.operasi = "10^x";
      this.btnTitikClick = 0;
   }

   private void sinActionPerformed(ActionEvent evt) {
      this.angkakesatu = (double)Integer.parseInt(this.jtxtTampilan.getText());
      this.jtxtTampilan.setText("");
      this.operasi = "sin";
      this.btnTitikClick = 0;
      if (this.operasi == "sin") {
         double angleInDegree = this.angkakesatu;
         double angleInRadian = Math.toRadians(angleInDegree);
         double hasil = Math.sin(angleInRadian);
         String answer = String.format("%,.6f", hasil);
         this.jtxtTampilan.setText(answer);
      }

   }

   private void cosActionPerformed(ActionEvent evt) {
      this.angkakesatu = Double.parseDouble(this.jtxtTampilan.getText());
      this.jtxtTampilan.setText("");
      this.operasi = "cos";
      this.btnTitikClick = 0;
      if (this.operasi == "cos") {
         double angleInDegree = this.angkakesatu;
         double angleInRadian = Math.toRadians(angleInDegree);
         double hasil = Math.cos(angleInRadian);
         String answer = String.format("%,.6f", hasil);
         this.jtxtTampilan.setText(answer);
      }

   }

   private void satuActionPerformed(ActionEvent evt) {
      String MasukanAngka = this.jtxtTampilan.getText() + this.satu.getText();
      this.jtxtTampilan.setText(MasukanAngka);
   }

   private void logActionPerformed(ActionEvent evt) {
      this.angkakesatu = Double.parseDouble(this.jtxtTampilan.getText());
      this.jtxtTampilan.setText("");
      this.operasi = "log";
      this.btnTitikClick = 0;
      if (this.operasi == "log") {
         this.hasil = Math.log10(this.angkakesatu);
         String answer = String.format("%,.6f", this.hasil);
         this.jtxtTampilan.setText(answer);
      }

   }

   private void phiActionPerformed(ActionEvent evt) {
      this.hasil = 3.141592653589793D;
      String answer = String.format("%,.15f", this.hasil);
      this.jtxtTampilan.setText(answer);
   }

   private void powActionPerformed(ActionEvent evt) {
      this.angkakesatu = Double.parseDouble(this.jtxtTampilan.getText());
      this.jtxtTampilan.setText("");
      this.operasi = "x^2";
      this.btnTitikClick = 0;
      if (this.operasi == "x^2") {
         this.hasil = Math.pow(this.angkakesatu, 2.0D);
         String answer = String.format("%,.2f", this.hasil);
         this.jtxtTampilan.setText(answer);
      }

   }

   private void asinActionPerformed(ActionEvent evt) {
      this.angkakesatu = Double.parseDouble(this.jtxtTampilan.getText());
      this.jtxtTampilan.setText("");
      this.operasi = "asin";
      this.btnTitikClick = 0;
      if (this.operasi == "asin") {
         double angleInDegree = this.angkakesatu;
         double hasil = Math.asin(angleInDegree);
         String answer = String.format("%,.6f", hasil);
         this.jtxtTampilan.setText(answer);
      }

   }

   private void acosActionPerformed(ActionEvent evt) {
      this.angkakesatu = Double.parseDouble(this.jtxtTampilan.getText());
      this.jtxtTampilan.setText("");
      this.operasi = "acos";
      this.btnTitikClick = 0;
      if (this.operasi == "acos") {
         double angleInDegree = this.angkakesatu;
         double hasil = Math.acos(angleInDegree);
         String answer = String.format("%,.6f", hasil);
         this.jtxtTampilan.setText(answer);
      }

   }

   private void atanActionPerformed(ActionEvent evt) {
      this.angkakesatu = Double.parseDouble(this.jtxtTampilan.getText());
      this.jtxtTampilan.setText("");
      this.operasi = "atan";
      this.btnTitikClick = 0;
      if (this.operasi == "atan") {
         double angleInDegree = this.angkakesatu;
         double hasil = Math.atan(angleInDegree);
         String answer = String.format("%,.6f", hasil);
         this.jtxtTampilan.setText(answer);
      }

   }

   private void absActionPerformed(ActionEvent evt) {
      this.angkakesatu = Double.parseDouble(this.jtxtTampilan.getText());
      this.jtxtTampilan.setText("");
      this.operasi = "abs";
      this.btnTitikClick = 0;
      if (this.operasi == "abs") {
         double angleInDegree = this.angkakesatu;
         double hasil = Math.abs(angleInDegree);
         String answer = String.format("%,.0f", hasil);
         this.jtxtTampilan.setText(answer);
      }

   }

   private void exponenActionPerformed(ActionEvent evt) {
      this.angkakesatu = Double.parseDouble(this.jtxtTampilan.getText());
      this.jtxtTampilan.setText("");
      this.operasi = "exp";
      this.btnTitikClick = 0;
      if (this.operasi == "exp") {
         this.hasil = Math.exp(this.angkakesatu);
         String answer = String.format("%,.12f", this.hasil);
         this.jtxtTampilan.setText(answer);
      }

   }

   private void cosecActionPerformed(ActionEvent evt) {
      this.angkakesatu = Double.parseDouble(this.jtxtTampilan.getText());
      this.jtxtTampilan.setText("");
      this.operasi = "csc";
      this.btnTitikClick = 0;
      if (this.operasi == "csc") {
         double angleInDegree = this.angkakesatu;
         double hasil = 1.0D / Math.sin(angleInDegree);
         String answer = String.format("%,.3f", hasil);
         this.jtxtTampilan.setText(answer);
      }

   }

   private void secActionPerformed(ActionEvent evt) {
      this.angkakesatu = Double.parseDouble(this.jtxtTampilan.getText());
      this.jtxtTampilan.setText("");
      this.operasi = "sec";
      this.btnTitikClick = 0;
      if (this.operasi == "sec") {
         double angleInDegree = this.angkakesatu;
         double hasil = 1.0D / Math.cos(angleInDegree);
         String answer = String.format("%,.3f", hasil);
         this.jtxtTampilan.setText(answer);
      }

   }

   private void cotActionPerformed(ActionEvent evt) {
      this.angkakesatu = Double.parseDouble(this.jtxtTampilan.getText());
      this.jtxtTampilan.setText("");
      this.operasi = "cot";
      this.btnTitikClick = 0;
      if (this.operasi == "cot") {
         double angleInDegree = this.angkakesatu;
         double hasil = 1.0D / Math.tan(angleInDegree);
         String answer = String.format("%,.3f", hasil);
         this.jtxtTampilan.setText(answer);
      }

   }

   private void CalcAActionPerformed(ActionEvent evt) {
      String MasukanAngka = this.jtxtTampilan.getText() + this.CalcA.getText();
      this.jtxtTampilan.setText(MasukanAngka);
   }

   private void CalcBActionPerformed(ActionEvent evt) {
      String MasukanAngka = this.jtxtTampilan.getText() + this.CalcB.getText();
      this.jtxtTampilan.setText(MasukanAngka);
   }

   private void CalcCActionPerformed(ActionEvent evt) {
      String MasukanAngka = this.jtxtTampilan.getText() + this.CalcC.getText();
      this.jtxtTampilan.setText(MasukanAngka);
   }

   private void CalcDActionPerformed(ActionEvent evt) {
      String MasukanAngka = this.jtxtTampilan.getText() + this.CalcD.getText();
      this.jtxtTampilan.setText(MasukanAngka);
   }

   private void CalcEActionPerformed(ActionEvent evt) {
      String MasukanAngka = this.jtxtTampilan.getText() + this.CalcE.getText();
      this.jtxtTampilan.setText(MasukanAngka);
   }

   private void CalcFActionPerformed(ActionEvent evt) {
      String MasukanAngka = this.jtxtTampilan.getText() + this.CalcF.getText();
      this.jtxtTampilan.setText(MasukanAngka);
   }

   private void CalcbinActionPerformed(ActionEvent evt) {
      this.Biner();
   }

   private void CalchexActionPerformed(ActionEvent evt) {
      this.Hexa();
   }

   private void CalcoctActionPerformed(ActionEvent evt) {
      this.Oktal();
   }

   private void CalcdecActionPerformed(ActionEvent evt) {
      this.Desimal();
   }

   private void CalcradActionPerformed(ActionEvent evt) {
      this.Radian();
      this.angkakesatu = (double)((int)Double.parseDouble(this.jtxtTampilan.getText()));
      this.jtxtTampilan.setText("");
      this.operasi = "rad";
      this.btnTitikClick = 0;
      if (this.operasi == "rad") {
         double angleInDegree = this.angkakesatu;
         double hasil = Math.toDegrees(angleInDegree);
         String answer = String.format("%,.6f", hasil);
         this.jtxtTampilan.setText(this.angkakesatu + " Rad" + " = " + answer + " Deg ");
      }

   }

   private void CalcdegActionPerformed(ActionEvent evt) {
      this.Degree();
      this.angkakesatu = (double)((int)Double.parseDouble(this.jtxtTampilan.getText()));
      this.jtxtTampilan.setText("");
      this.operasi = "deg";
      this.btnTitikClick = 0;
      if (this.operasi == "deg") {
         double angleInDegree = this.angkakesatu;
         double hasil = Math.toRadians(angleInDegree);
         String answer = String.format("%,.6f", hasil);
         this.jtxtTampilan.setText(this.angkakesatu + " Deg" + " = " + answer + " Rad ");
      }

   }

   public static void main(String[] args) {
      try {
         LookAndFeelInfo[] var1 = UIManager.getInstalledLookAndFeels();
         int var2 = var1.length;

         for(int var3 = 0; var3 < var2; ++var3) {
            LookAndFeelInfo info = var1[var3];
            if ("Nimbus".equals(info.getName())) {
               UIManager.setLookAndFeel(info.getClassName());
               break;
            }
         }
      } catch (ClassNotFoundException var5) {
         Logger.getLogger(CalculatorScientific.class.getName()).log(Level.SEVERE, (String)null, var5);
      } catch (InstantiationException var6) {
         Logger.getLogger(CalculatorScientific.class.getName()).log(Level.SEVERE, (String)null, var6);
      } catch (IllegalAccessException var7) {
         Logger.getLogger(CalculatorScientific.class.getName()).log(Level.SEVERE, (String)null, var7);
      } catch (UnsupportedLookAndFeelException var8) {
         Logger.getLogger(CalculatorScientific.class.getName()).log(Level.SEVERE, (String)null, var8);
      }

      EventQueue.invokeLater(new Runnable() {
         public void run() {
            (new CalculatorScientific()).setVisible(true);
         }
      });
   }
}
