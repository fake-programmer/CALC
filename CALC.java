
package calc;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

class FrameA extends JFrame implements ActionListener {
     private JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,eq,clear,plus,minus,div,mult,exit;
    JFrame b; 
     private String operator;
      double num1, num2;
      private JTextField display;
      private JButton[] operatorButtons;
      
  public FrameA() {
      b = new JFrame("Normal Calculator");
        b.setSize(600, 800);
        b.setVisible(true);
       b. setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
      b.setLayout(null);
      
      display = new JTextField();
        //display.setEditable(false);
        display.setFont(new Font("impact", Font.PLAIN, 40));
      

        b1 = new JButton("1");
    b2 = new JButton("2");
    b3 = new JButton("3");
    b4 = new JButton("4");
    b5 = new JButton("5");
    b6 = new JButton("6");
    b7 = new JButton("7");
    b8 = new JButton("8");
    b9 = new JButton("9");
    b0 = new JButton("0");
   eq = new JButton("=");
    clear = new JButton("clear");
      plus = new JButton("+");
    minus = new JButton("-");
   mult= new JButton("*");
    div = new JButton("/");
    exit = new JButton("BACK");
    
    b1.setBounds(50, 200, 165, 50);
    b2.setBounds(220, 200, 165, 50);
    b3.setBounds(390, 200, 165, 50);
    b4.setBounds(50, 250, 165, 50);
    b5.setBounds(220, 250, 165, 50);
    b6.setBounds(390, 250, 165, 50);
    b7.setBounds(50, 300, 165, 50);
    b8.setBounds(220, 300, 165, 50);
    b9.setBounds(390, 300, 165, 50);
    b0.setBounds(50, 350, 165, 50);
    eq.setBounds(220, 350, 165, 50);
    clear.setBounds(390, 350, 165, 50);
   plus.setBounds(50, 100, 245, 45);
   minus.setBounds(310, 100, 245, 45);
    div.setBounds(50, 150, 245, 45);
    mult.setBounds(310, 150, 245, 45);
     display.setBounds(50, 10, 505, 80);
     exit.setBounds(200, 600, 200, 50);
    
    b.add(b1);
    b.add(b2);
   b. add(b3);
   b. add(b4);
   b. add(b5);
   b. add(b6);
   b. add(b7);
   b. add(b8);
   b. add(b9);
    b.add(b0);
   b. add(eq);
   b. add(clear);
   b. add(plus);
   b. add(minus);
   b. add(mult);
   b. add(div);
   b.add(display);
    b.add(exit);
   
    b1.addActionListener(this);
    b2.addActionListener(this);
    b3.addActionListener(this);
    b4.addActionListener(this);
    b5.addActionListener(this);
    b6.addActionListener(this);
    b7.addActionListener(this);
    b8.addActionListener(this);
    b9.addActionListener(this);
    b0.addActionListener(this);
    eq.addActionListener(this);
    clear.addActionListener(this);
     plus.addActionListener(this);
    minus.addActionListener(this);
    mult.addActionListener(this);
    div.addActionListener(this);
    exit.addActionListener(this);
        
    }

   
  
 @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == exit ){
            b.dispose();
        }
       
       JButton sourceButton = (JButton) e.getSource();
       // display.setText(display.getText()+ sourceButton.getText());
        String buttonText = sourceButton.getText();
          if (sourceButton ==b0||sourceButton ==b1||sourceButton ==b2||sourceButton ==b3||sourceButton ==b4||sourceButton ==b5||sourceButton ==b6||sourceButton ==b7||sourceButton ==b8||sourceButton ==b9){
              display.setText(display.getText()+ sourceButton.getText());
          }
        if(buttonText.equals("+")||buttonText.equals("-")||buttonText.equals("*")||buttonText.equals("/")){
             num1 = Double.parseDouble(display.getText());
             display.setText("");
             operator = buttonText;    
        }else if(buttonText.equals("=")){
             num2 = Double.parseDouble(display.getText());
             double result = calculate(num1, num2, operator);
            display.setText(String.valueOf(result));
        }
          if (e.getSource() == clear) {
            display.setText("");
            num1 = 0;
            num2 = 0;
            operator = "";
        }
          
    }

    private double calculate(double num1, double num2, String operator) {
        switch (operator) {
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            case "*":
                return num1 * num2;
            case "/":
                if (num2 == 0) {
                    return Double.NaN; // Handle division by zero
                } else {
                    return num1 / num2;
                }
            default:
                return 0;
        }
  
  }
}

class FrameB extends JFrame implements ActionListener{
  
  JButton button1, button2, button3, button4, button5, button6;
  JButton button7, button8, button9, button10, button11, button12,back;
  JTextField tf1,tf2,tf3,tf4; 
  JFrame b;

  public FrameB() {
    b= new JFrame("SCIENTIFIC CALCULATOR BY DEZMILS");
    b.setSize(600, 800);
    b.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    b.setLayout(null); // Use null layout for manual positioning

   
    button1 = new JButton("sqrt");
    button2 = new JButton("x^2");
    button3 = new JButton("log");
    button4 = new JButton("log10");
    button5 = new JButton("expo");
    button6 = new JButton("sin");
    button7 = new JButton("cos");
    button8 = new JButton("tan");
    button9 = new JButton("arccos");
    button10 = new JButton("arcsin");
    button11 = new JButton("arctan");
    button12 = new JButton("rand");
    back= new JButton( "back");
    tf1 = new JTextField("Enter No:");
    tf1.setEditable(false);
    tf2 = new JTextField();
     tf3 = new JTextField();
      tf3.setEditable(false);
      tf4 = new JTextField("Result: ");
      tf4.setEditable(false);
    
    // Add Action Listeners
    button1.addActionListener(this);
    button2.addActionListener(this);
    button3.addActionListener(this);
    button4.addActionListener(this);
    button5.addActionListener(this);
    button6.addActionListener(this);
    button7.addActionListener(this);
    button8.addActionListener(this);
    button9.addActionListener(this);
    button10.addActionListener(this);
    button11.addActionListener(this);
    button12.addActionListener(this);
     back.addActionListener(this);

    // Position Buttons (using absolute positioning)
    tf1.setBounds(50,50,90,40);
     tf2.setBounds(150,50,250,40);
      tf4.setBounds(50,150,90,40);
     tf3.setBounds(150,150,250,40);
    button1.setBounds(50, 200, 100, 50);
    button2.setBounds(150, 200, 100, 50);
    button3.setBounds(250, 200, 100, 50);
    button4.setBounds(50, 250, 100, 50);
    button5.setBounds(150, 250, 100, 50);
    button6.setBounds(250, 250, 100, 50);
    button7.setBounds(50, 300, 100, 50);
    button8.setBounds(150, 300, 100, 50);
    button9.setBounds(250, 300, 100, 50);
    button10.setBounds(50, 350, 100, 50);
    button11.setBounds(150, 350, 100, 50);
    button12.setBounds(250, 350, 100, 50);
     back.setBounds(100, 450, 200, 50);

    // Add Buttons to JFrame
    b.add(tf1);
    b.add(tf2);
    b.add(tf3);
    b.add(tf4);
    b.add(button1);
    b.add(button2);
   b. add(button3);
   b. add(button4);
   b. add(button5);
   b. add(button6);
   b. add(button7);
   b. add(button8);
   b. add(button9);
    b.add(button10);
   b. add(button11);
   b. add(button12);
     b.add(back);

   b. setVisible(true);
  }

  @Override
  public void actionPerformed(ActionEvent e) {
      String s1 = tf2.getText();
      double a = Double.parseDouble(s1);
      double c = 0;
    if (e.getSource() == button1) {
     c = Math.sqrt(a);
    } else if (e.getSource() == button2) {
      c = Math.pow(a,2);
    } 
    else if (e.getSource() == button3) {
      c = Math.log(a);
    } 
    else if (e.getSource() == button4) {
      c = Math.log10(a);
    } 
     else if (e.getSource() == button5) {
      c = Math.exp(a);
    } 
    else if (e.getSource() == button6) {
      c = Math.sin(a);
  }
    else if (e.getSource() == button7) {
      c = Math.cos(a);
    } 
    else if (e.getSource() == button8) {
      c = Math.tan(a);
    } 
     else if (e.getSource() == button9) {
      c = Math.acos(a);
    } 
    else if (e.getSource() == button10) {
      c = Math.asin(a);
  }
     else if (e.getSource() == button11) {
      c = Math.atan(a);
    } 
    else if (e.getSource() == button12) {
      c = Math.random();
  }
    else if (e.getSource() == back) {
         b. dispose();
  }
    String result = String.valueOf(c);
    tf3.setText(result);
  }
  }



public class CALC extends JFrame implements ActionListener  {
    JButton normal,scientific,exit;
    JLabel intro;
    JFrame f;
    public CALC(){
            f = new JFrame("CALCULATOR BY DEZMILS");
   f.setVisible(true);
   f.setSize(600, 800);
  f.setLayout(null);
   f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   
   normal = new JButton("Normal calculator");
   normal.setBounds(20, 100, 250, 50);
   scientific = new JButton("scientific calculator");
   scientific.setBounds(270, 100,250, 50);
    exit = new JButton("EXIT");
    exit.setBounds(100, 450, 200, 50);
   
   f.add(normal);
   f.add(scientific);
   f.add(exit);
   
   normal.addActionListener(this);
    scientific .addActionListener(this);
      exit .addActionListener(this);
        
    }
    public void actionPerformed(ActionEvent e) {
         if (e.getSource() == normal) {
              new FrameA();
    } else if (e.getSource() == scientific) {
      new FrameB();
    } 
          else if (e.getSource() == exit) {
     f.dispose();
    } 
    
    }

    public static void main(String[] args) {
       new  CALC();
    }
    
}
