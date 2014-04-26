/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package calculator;

import java.awt.*;//FlowLayout;
import java.awt.event.*;//MouseEvent;
import java.awt.event.MouseListener.*;
//import javax.print.DocFlavor.STRING;
import javax.swing.*;//JFrame;
//import javax.xml.bind.ParseConversionEvent;

/**
 *
 * @author MariaM
 */
public class Main {
    
    public static JTextField text=new JTextField(20);
    public static String text1="";
    public static String text2="";
    public static String text3="";
    public static String operate="",y="";
    public static double first=0,second=0,result=0;
    public static int ID_operate=0,Flag_operate=0,f=0,yy=0;
    public static JButton no1= new JButton("1");
    public static JButton  no2= new JButton("2");
    public static JButton no3= new JButton("3");
    public static JButton no4= new JButton("4"); 
    public static JButton no5= new JButton("5");
    public static JButton no6= new JButton("6");
    public static JButton no7= new JButton("7");
    public static JButton no8= new JButton("8");
    public static JButton no9= new JButton("9");
    public static JButton no0= new JButton("0");
    public static JButton BtAdd= new JButton("+");
    public static JButton BtSub= new JButton("-");
    public static JButton BtMul= new JButton("*");
    public static JButton BtDiv= new JButton("/");
    public static JButton BtPower=new JButton("^");
    public static JButton BtConv=new JButton("1/x");
    public static JButton BtEqual= new JButton("=");
    public static Mymouse_numbers numbers=new Mymouse_numbers();
    public static Mymouse_operates operation=new Mymouse_operates();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        JFrame frame=new JFrame();
        frame.setTitle("Calculator");
        frame.setVisible(true);

       // frame.setResizable(false);
      //  frame.pack();
        frame.setLayout(new FlowLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        no1.setForeground(Color.blue);
        no2.setForeground(Color.blue);
        no3.setForeground(Color.BLUE);
        no4.setForeground(Color.BLUE);
        no5.setForeground(Color.BLUE);
        no6.setForeground(Color.BLUE);
        no7.setForeground(Color.BLUE);
        no8.setForeground(Color.BLUE);
        no9.setForeground(Color.BLUE);
        no0.setForeground(Color.BLUE);

        BtAdd.setForeground(Color.red);
        BtSub.setForeground(Color.red);
        BtMul.setForeground(Color.red);
        BtDiv.setForeground(Color.red);
        BtEqual.setForeground(Color.red);
        BtConv.setForeground(Color.red);
        BtPower.setForeground(Color.red);

        JPanel PanelNum = new JPanel();
        PanelNum.setLayout(new GridLayout(3,3,5,5));

        // ====== add Button to Panel ======
        
        PanelNum.add(no1);
        PanelNum.add(no2);
        PanelNum.add(no3);
        PanelNum.add(no4);
        PanelNum.add(no5);
        PanelNum.add(no6);
        PanelNum.add(no7);
        PanelNum.add(no8);
        PanelNum.add(no9);
        PanelNum.add(no0);
        
        JPanel PanelOperate=new JPanel();
        PanelOperate.setLayout(new GridLayout(2,2,5,5));
        
        PanelOperate.add(BtAdd);
        PanelOperate.add(BtSub);
        PanelOperate.add(BtMul);
        PanelOperate.add(BtDiv);
        PanelOperate.add(BtEqual);
        PanelOperate.add(BtConv);
        PanelOperate.add(BtPower);
        
        frame.add(text);
        frame.add(PanelNum);
        frame.add(PanelOperate);
        
        // ====== Set the Listener =====
        
        no0.addMouseListener(numbers);
        no1.addMouseListener(numbers);
        no2.addMouseListener(numbers);
        no3.addMouseListener(numbers);
        no4.addMouseListener(numbers);
        no5.addMouseListener(numbers);
        no6.addMouseListener(numbers);
        no7.addMouseListener(numbers);
        no8.addMouseListener(numbers);
        no9.addMouseListener(numbers);
        /*text.setText(no1.getText());*/

        BtAdd.addMouseListener(operation);
        BtSub.addMouseListener(operation);
        BtMul.addMouseListener(operation);
        BtDiv.addMouseListener(operation);
        BtEqual.addMouseListener(operation);
        BtConv.addMouseListener(operation);
        BtPower.addMouseListener(operation);

        

        
        
        
        
        // TODO code application logic here
    }
    public static class Mymouse_numbers implements MouseListener{

        public void mouseClicked(MouseEvent e) {
           // throw new UnsupportedOperationException("Not supported yet.");
    //        String text1="";
           // f=ID_operate;
           // if(f!=0){text1="";f=0;}
           // else{text1=(text.getText()).toString();}
            JButton bt=(JButton)e.getSource();
            text2=(bt.getText()).toString();
            if(f==0){
            text3=(text.getText()).toString()+text2;
            }
            else{text3=""+text2;f=0;}
            text.setText(text3);

            if(ID_operate==0){first=Double.parseDouble(text3);}
            else{second=Double.parseDouble(text3);}

        }
        public void mousePressed(MouseEvent e) {
        }
        public void mouseReleased(MouseEvent e) {
        }
        public void mouseEntered(MouseEvent e) {
        }
        public void mouseExited(MouseEvent e) {
        }
    }

    public static class Mymouse_operates implements  MouseListener{

        public void mouseClicked(MouseEvent e) {

            JButton bt=(JButton)e.getSource();
            //text.setText("+");
            operate=bt.getText();

            if(operate.equals("+")){ID_operate=1;f=ID_operate;}
            else if(operate.equals("-")){ ID_operate=2;f=ID_operate;}
            else if(operate.equals("*")){ID_operate=3;f=ID_operate;}
            else if(operate.equals("/")){ID_operate=4;f=ID_operate;}
            else if(operate.equals("^")){ID_operate=5;f=ID_operate;}
            else if(operate.equals("1/x"))
            {
                double x=Double.parseDouble( text.getText());
                x=1/x;
                text.setText(Double.toString(x));
              //  text.setText("GoooooD");

            }
            else if(operate.equals("="))
            {
                
                Flag_operate=1;
  //              text.setText(Integer.toString(ID_operate));
               
                // text.setText("wwwww");
                switch(ID_operate)
                {
                    case 1:
                        text.setText("+");
                        result=first+second;
                        break;
                    case 2:
                        result=first-second;
                        break;
                    case 3:
                        result=first*second;
                        break;
                    case 4:
                        result=first/second;
                        break;
                    case 5:
                        text.setText("wwwww");
                   
                         y=Double.toString(second);
                         yy=Integer.parseInt(y);
                         double p=first;
                        for(int j=1;j<=yy;j++)
                        {
                            p*=first;

                        }
                         result=p;
                    
                        break;
                    default:
                         text.setText(Integer.toString(ID_operate));
                            break;
                }
              text.setText(Double.toString(result));
               ID_operate=0;



            }
          //  if (bt.getText()=="+") {


            }

        public void mousePressed(MouseEvent e) {
        }

        public void mouseReleased(MouseEvent e) {
        }

        public void mouseEntered(MouseEvent e) {
        }

        public void mouseExited(MouseEvent e) {
        }


    }
}






