/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * over.java
 *
 * Created on Mar 3, 2020, 9:04:15 PM
 */

package gaime;

import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class over extends javax.swing.JFrame implements Runnable {
int s=0;
Thread th;
static int sco=1;
static int scorr;
    /** Creates new form over */
    public over() {
        super("loading");
        initComponents();
        if(sco>=1){
            ImageIcon dv = new ImageIcon(getClass().getResource("/divisionmmr/div1.png"));
            division.setIcon(dv);
            dvv.setText("HERALD");
        }if(sco>=2){
ImageIcon dv = new ImageIcon(getClass().getResource("/divisionmmr/div2.png"));
            division.setIcon(dv);
            dvv.setText("CRUSADER");
        }if(sco>=3){
ImageIcon dv = new ImageIcon(getClass().getResource("/divisionmmr/div3.png"));
            division.setIcon(dv);
            dvv.setText("LEGEND");
        }if(sco>=4){
ImageIcon dv = new ImageIcon(getClass().getResource("/divisionmmr/div4.png"));
            division.setIcon(dv);
            dvv.setText("DIVINE");
        }if(sco>=5){
ImageIcon dv = new ImageIcon(getClass().getResource("/divisionmmr/div5.png"));
            division.setIcon(dv);
            dvv.setText("IMMORTAL");
        }
embl.setText(Integer.toString(scorr));


        th =new Thread((Runnable)this);
        progress.setVisible(false);
    }
    public void setUpLoading(){
         setVisible(false);
    th.start();
    }

    public void run(){
 entr a = new entr();
 try{
       for(int i=2; i<200; i++){
           s=s+2;
           int m= progress.getMaximum();
           int v=progress.getValue();
           if(v<m){
               progress.setValue(progress.getValue()+1);
           }else{

               setVisible(false);
               
               a.show();
           }th.sleep(40);
       }
    }catch (Exception e){
        JOptionPane.showMessageDialog(null,e);
    }
}
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        progress = new javax.swing.JProgressBar();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        embl = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        dvv = new javax.swing.JLabel();
        division = new javax.swing.JLabel();
        embl1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);
        getContentPane().add(progress);
        progress.setBounds(280, 70, 146, 20);

        jPanel1.setBackground(new java.awt.Color(255, 0, 0));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Dimitri Swank", 0, 55));
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("O V E R");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(200, 20, 190, 80);

        jLabel3.setFont(new java.awt.Font("Dimitri Swank", 0, 55));
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("G A M E");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(-10, 30, 230, 60);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(280, 180, 390, 110);

        jPanel3.setBackground(new java.awt.Color(51, 0, 0));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 110, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3);
        jPanel3.setBounds(260, 200, 400, 110);

        embl.setFont(new java.awt.Font("Dimitri Swank", 0, 48)); // NOI18N
        embl.setForeground(new java.awt.Color(255, 255, 0));
        embl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        embl.setText("jLabel4");
        jPanel1.add(embl);
        embl.setBounds(40, 70, 200, 100);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/effects/jinover.gif"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 80, 340, 230);

        dvv.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        dvv.setForeground(new java.awt.Color(255, 255, 0));
        dvv.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dvv.setText("jLabel4");
        jPanel1.add(dvv);
        dvv.setBounds(340, 140, 250, 30);
        jPanel1.add(division);
        division.setBounds(400, 10, 160, 160);

        embl1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        embl1.setForeground(new java.awt.Color(255, 255, 0));
        embl1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        embl1.setText("TOTAL SCORE:");
        jPanel1.add(embl1);
        embl1.setBounds(20, 20, 240, 50);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 680, 330);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-681)/2, (screenSize.height-322)/2, 681, 322);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
      try{
      Font fn=Font.createFont(Font.TRUETYPE_FONT,getClass().getResourceAsStream("DIMIS__.TTF"));
       Font fn2=Font.createFont(Font.TRUETYPE_FONT,getClass().getResourceAsStream("DIMIS__.TTF"));
      fn=fn.deriveFont(Font.PLAIN,48);
        fn2=fn2.deriveFont(Font.PLAIN,30);
   embl.setFont(fn);
  }catch(Exception e){

  }
    }//GEN-LAST:event_formWindowOpened

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new over().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel division;
    private javax.swing.JLabel dvv;
    private javax.swing.JLabel embl;
    public static javax.swing.JLabel embl1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JProgressBar progress;
    // End of variables declaration//GEN-END:variables

}
